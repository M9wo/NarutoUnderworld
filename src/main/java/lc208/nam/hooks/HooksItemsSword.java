package lc208.nam.hooks;

import cpw.mods.fml.common.eventhandler.Event;
import lc208.nam.hooklib.asm.Hook;
import lc208.nam.hooklib.asm.ReturnCondition;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityMultiPart;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.boss.EntityDragonPart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S0BPacketAnimation;
import net.minecraft.potion.Potion;
import net.minecraft.stats.AchievementList;
import net.minecraft.stats.StatBase;
import net.minecraft.stats.StatList;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.AttackEntityEvent;

public class HooksItemsSword {
  @Hook(returnCondition = ReturnCondition.ALWAYS)
  public static void attackTargetEntityWithCurrentItem(EntityPlayer player, Entity p_71059_1_) {
    if (MinecraftForge.EVENT_BUS.post((Event)new AttackEntityEvent(player, p_71059_1_)))
      return; 
    ItemStack stack = player.getCurrentEquippedItem();
    if (stack != null && stack.getItem().onLeftClickEntity(stack, player, p_71059_1_) && (!stack.getItem().getClass().getCanonicalName().contains("alcoholmod") || !(stack.getItem() instanceof net.minecraft.item.ItemSword)))
      return; 
    if (p_71059_1_.canAttackWithItem())
      if (!p_71059_1_.hitByEntity((Entity)player)) {
        float f = (float)player.getEntityAttribute(SharedMonsterAttributes.attackDamage).getAttributeValue();
        int i = 0;
        float f1 = 0.0F;
        if (p_71059_1_ instanceof EntityLivingBase) {
          f1 = EnchantmentHelper.getEnchantmentModifierLiving((EntityLivingBase)player, (EntityLivingBase)p_71059_1_);
          i += EnchantmentHelper.getKnockbackModifier((EntityLivingBase)player, (EntityLivingBase)p_71059_1_);
        } 
        if (player.isSprinting())
          i++; 
        if (f > 0.0F || f1 > 0.0F) {
          boolean flag = (player.fallDistance > 0.0F && !player.onGround && !player.isOnLadder() && !player.isInWater() && !player.isPotionActive(Potion.blindness) && player.ridingEntity == null && p_71059_1_ instanceof EntityLivingBase);
          if (flag && f > 0.0F)
            f *= 1.5F; 
          f += f1;
          boolean flag1 = false;
          int j = EnchantmentHelper.getFireAspectModifier((EntityLivingBase)player);
          if (p_71059_1_ instanceof EntityLivingBase && j > 0 && !p_71059_1_.isBurning()) {
            flag1 = true;
            p_71059_1_.setFire(1);
          } 
          boolean flag2 = p_71059_1_.attackEntityFrom(DamageSource.causePlayerDamage(player), f);
          if (flag2) {
            if (i > 0) {
              p_71059_1_.addVelocity((-MathHelper.sin(player.rotationYaw * 3.1415927F / 180.0F) * i * 0.5F), 0.1D, (MathHelper.cos(player.rotationYaw * 3.1415927F / 180.0F) * i * 0.5F));
              player.motionX *= 0.6D;
              player.motionZ *= 0.6D;
              player.setSprinting(false);
            } 
            if (flag)
              player.onCriticalHit(p_71059_1_); 
            if (f1 > 0.0F)
              player.onEnchantmentCritical(p_71059_1_); 
            if (f >= 18.0F)
              player.triggerAchievement((StatBase)AchievementList.overkill); 
            player.setLastAttacker(p_71059_1_);
            if (p_71059_1_ instanceof EntityLivingBase)
              EnchantmentHelper.func_151384_a((EntityLivingBase)p_71059_1_, (Entity)player); 
            EnchantmentHelper.func_151385_b((EntityLivingBase)player, p_71059_1_);
            ItemStack itemstack = player.getCurrentEquippedItem();
            Object object = p_71059_1_;
            if (p_71059_1_ instanceof EntityDragonPart) {
              IEntityMultiPart ientitymultipart = ((EntityDragonPart)p_71059_1_).entityDragonObj;
              if (ientitymultipart != null && ientitymultipart instanceof EntityLivingBase)
                object = ientitymultipart; 
            } 
            if (itemstack != null && object instanceof EntityLivingBase) {
              itemstack.hitEntity((EntityLivingBase)object, player);
              if (itemstack.stackSize <= 0)
                player.destroyCurrentEquippedItem(); 
            } 
            if (p_71059_1_ instanceof EntityLivingBase) {
              player.addStat(StatList.damageDealtStat, Math.round(f * 10.0F));
              if (j > 0)
                p_71059_1_.setFire(j * 4); 
            } 
            player.addExhaustion(0.3F);
          } else if (flag1) {
            p_71059_1_.extinguish();
          } 
        } 
      }  
  }
  
  @Hook(returnCondition = ReturnCondition.ALWAYS)
  public static void swingItem(EntityLivingBase elb) {
    ItemStack stack = elb.getHeldItem();
    if (stack != null && stack.getItem() != null) {
      Item item = stack.getItem();
      if (item.onEntitySwing(elb, stack) && stack.getItem().onEntitySwing(elb, stack) && (!stack.getItem().getClass().getCanonicalName().contains("alcoholmod") || !(stack.getItem() instanceof net.minecraft.item.ItemSword)))
        return; 
    } 
    if (!elb.isSwingInProgress || elb.swingProgressInt >= getArmSwingAnimationEnd(elb) / 2 || elb.swingProgressInt < 0) {
      elb.swingProgressInt = -1;
      elb.isSwingInProgress = true;
      if (elb.worldObj instanceof WorldServer)
        ((WorldServer)elb.worldObj).getEntityTracker().func_151247_a((Entity)elb, (Packet)new S0BPacketAnimation((Entity)elb, 0)); 
    } 
  }
  
  public static int getArmSwingAnimationEnd(EntityLivingBase elb) {
    return elb.isPotionActive(Potion.digSpeed) ? (6 - (1 + elb.getActivePotionEffect(Potion.digSpeed).getAmplifier()) * 1) : (elb.isPotionActive(Potion.digSlowdown) ? (6 + (1 + elb.getActivePotionEffect(Potion.digSlowdown).getAmplifier()) * 2) : 6);
  }
}

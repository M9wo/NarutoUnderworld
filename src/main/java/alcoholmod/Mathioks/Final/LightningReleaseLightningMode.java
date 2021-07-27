package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class LightningReleaseLightningMode extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public LightningReleaseLightningMode() {
    setMaxDamage(200);
    isDamageable();
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null) {
      if (par1ItemStack.stackTagCompound == null) {
        par1ItemStack.stackTagCompound = new NBTTagCompound();
        par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
        par1ItemStack.stackTagCompound.setBoolean("EarthMode", false);
        par1ItemStack.stackTagCompound.setInteger("counter", 0);
      } 
      if (par1ItemStack.stackTagCompound != null) {
        EntityPlayer player = (EntityPlayer)par3Entity;
        ExtendedPlayer props = ExtendedPlayer.get(player);
        boolean EarthMode = par1ItemStack.stackTagCompound.getBoolean("EarthMode");
        int counter = par1ItemStack.stackTagCompound.getInteger("counter");
        if (EarthMode) {
          if (((EntityPlayer)par3Entity).isInWater() || ((EntityPlayer)par3Entity).worldObj.getBlock(MathHelper.floor_double(((EntityPlayer)par3Entity).posX), MathHelper.floor_double(((EntityPlayer)par3Entity).posY - 0.2D - ((EntityPlayer)par3Entity).yOffset), MathHelper.floor_double(((EntityPlayer)par3Entity).posZ)) == Blocks.water) {
            List<Entity> list = par2World.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox(((EntityPlayer)par3Entity).posX - 5.0D, ((EntityPlayer)par3Entity).posY - 3.0D, ((EntityPlayer)par3Entity).posZ - 5.0D, ((EntityPlayer)par3Entity).posX + 5.0D, ((EntityPlayer)par3Entity).posY + 3.0D, ((EntityPlayer)par3Entity).posZ + 5.0D));
            if ((EntityPlayer)par3Entity != null)
              for (int k2 = 0; k2 < list.size(); k2++) {
                if (!par2World.isRemote) {
                  Entity entity = list.get(k2);
                  String user = ((EntityPlayer)par3Entity).getUniqueID().toString();
                  entity.getDistance(((EntityPlayer)par3Entity).posX, ((EntityPlayer)par3Entity).posY, ((EntityPlayer)par3Entity).posZ);
                  if (entity instanceof net.minecraft.entity.EntityLiving && entity instanceof EntityLivingBase)
                    ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 10, 1)); 
                  if (entity instanceof EntityPlayer && !entity.getUniqueID().toString().equals(user))
                    ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 10, 1)); 
                } 
              }  
          } 
          for (int i = 0; i < 30; i++)
            par2World.spawnParticle("dripWater", par3Entity.posX, par3Entity.posY - 1.5D, par3Entity.posZ, i, i, i); 
          if (!par2World.isRemote) {
            counter++;
            par1ItemStack.stackTagCompound.setInteger("counter", counter);
            if (counter >= 20) {
              props.consumeMana(4 + props.getNinjutsu() / 600);
              counter = 0;
              par1ItemStack.stackTagCompound.setInteger("counter", counter);
            } 
          } 
          if (!((EntityPlayer)par3Entity).isPotionActive(Potion.moveSpeed.id))
            ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2)); 
          if (!((EntityPlayer)par3Entity).isPotionActive(Potion.jump.id))
            ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.jump.id, 5, 2)); 
          if (!((EntityPlayer)par3Entity).isPotionActive(Potion.damageBoost.id))
            ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0)); 
          if (!((EntityPlayer)par3Entity).isPotionActive(Potion.digSpeed.id))
            ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1)); 
        } 
        if (props.getCurrentMana() < 1 && EarthMode) {
          EarthMode = false;
          par1ItemStack.setItemDamage(0);
          par1ItemStack.stackTagCompound.setBoolean("EarthMode", EarthMode);
          if (!par2World.isRemote)
            ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText("Lightning-Mode de-Activate!")); 
        } 
      } 
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote)
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
        ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
        if (props.getLightningRelease() == 1)
          if (props.getCurrentMana() >= 5 + props.getNinjutsu() / 600) {
            boolean EarthMode = Par1ItemStack.stackTagCompound.getBoolean("EarthMode");
            int counter = Par1ItemStack.stackTagCompound.getInteger("counter");
            if (Par1ItemStack.getItemDamage() == 0) {
              EarthMode = true;
              Par1ItemStack.stackTagCompound.setBoolean("EarthMode", EarthMode);
              Par1ItemStack.setItemDamage(50);
              props.consumeMana(5 + props.getNinjutsu() / 600);
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Lightning-Mode Activate!"));
              return Par1ItemStack;
            } 
            if (Par1ItemStack.getItemDamage() == 50) {
              EarthMode = false;
              Par1ItemStack.stackTagCompound.setBoolean("EarthMode", EarthMode);
              Par1ItemStack.setItemDamage(0);
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Lightning-Mode de-Activate!"));
            } 
          } else {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough chakra!"));
          }  
      } else {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You are not the owner of this jutsu"));
      }  
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "Activate ligthning nature chakra");
    par3List.add(EnumChatFormatting.DARK_AQUA + "mode, increasing speed, jump");
    par3List.add(EnumChatFormatting.DARK_AQUA + "damage and digspeed");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (5 + props.getNinjutsu() / 600));
    par3List.add(EnumChatFormatting.GOLD + "Chakra Upkeep: 2");
  }
}

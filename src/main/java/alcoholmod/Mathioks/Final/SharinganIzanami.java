package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class SharinganIzanami extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public SharinganIzanami() {
    this.maxStackSize = 1;
  }
  
  public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player) {
    return false;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
      par1ItemStack.stackTagCompound.setInteger("Phase", 0);
      par1ItemStack.stackTagCompound.setInteger("Xposition", 0);
      par1ItemStack.stackTagCompound.setInteger("Yposition", 0);
      par1ItemStack.stackTagCompound.setInteger("Zposition", 0);
      par1ItemStack.stackTagCompound.setInteger("XpositionOpp", 0);
      par1ItemStack.stackTagCompound.setInteger("YpositionOpp", 0);
      par1ItemStack.stackTagCompound.setInteger("ZpositionOpp", 0);
    } 
  }
  
  public static MovingObjectPosition checkForImpact(World world, Entity entity, Entity shooter, double hitBox, boolean flag) {
    Vec3 vec3 = Vec3.createVectorHelper(entity.posX, entity.posY, entity.posZ);
    Vec3 vec31 = Vec3.createVectorHelper(entity.posX + entity.motionX, entity.posY + entity.motionY, entity.posZ + entity.motionZ);
    MovingObjectPosition mop = world.func_147447_a(vec3, vec31, false, true, false);
    vec3 = Vec3.createVectorHelper(entity.posX, entity.posY, entity.posZ);
    vec31 = Vec3.createVectorHelper(entity.posX + entity.motionX, entity.posY + entity.motionY, entity.posZ + entity.motionZ);
    if (mop != null)
      vec31 = Vec3.createVectorHelper(mop.hitVec.xCoord, mop.hitVec.yCoord, mop.hitVec.zCoord); 
    Entity target = null;
    List<Entity> list = world.getEntitiesWithinAABBExcludingEntity(entity, entity.boundingBox.addCoord(entity.motionX, entity.motionY, entity.motionZ).expand(1.0D, 1.0D, 1.0D));
    double d0 = 0.0D;
    for (int i = 0; i < list.size(); i++) {
      Entity entity1 = list.get(i);
      if (entity1.canBeCollidedWith() && (entity1 != shooter || flag)) {
        AxisAlignedBB axisalignedbb = entity1.boundingBox.expand(hitBox, hitBox, hitBox);
        MovingObjectPosition mop1 = axisalignedbb.calculateIntercept(vec3, vec31);
        if (mop1 != null) {
          double d1 = vec3.distanceTo(mop1.hitVec);
          if (d1 < d0 || d0 == 0.0D) {
            target = entity1;
            d0 = d1;
          } 
        } 
      } 
    } 
    if (target != null)
      mop = new MovingObjectPosition(target); 
    if (mop != null && mop.entityHit instanceof EntityPlayer) {
      EntityPlayer player = (EntityPlayer)mop.entityHit;
      if (player.capabilities.disableDamage || (shooter instanceof EntityPlayer && !((EntityPlayer)shooter).canAttackPlayer(player)))
        mop = null; 
    } 
    return mop;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
    if (Par1ItemStack.stackTagCompound != null) {
      int Phase = Par1ItemStack.stackTagCompound.getInteger("Phase");
      if (Phase == 0)
        checkForImpact(Par2World, (Entity)Par3EntityPlayer, (Entity)Par3EntityPlayer, 100.0D, false); 
      if (Phase == 1);
      if (Phase == 2 && props.getCurrentMana() < 40 + props.getNinjutsu() / 600)
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough chakra")); 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    if (par1ItemStack.stackTagCompound != null) {
      ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
      int Phase = par1ItemStack.stackTagCompound.getInteger("Phase");
      if (Phase == 0)
        par3List.add(EnumChatFormatting.DARK_AQUA + "Phase: " + Phase); 
      if (Phase == 1) {
        int Yposition = par1ItemStack.stackTagCompound.getInteger("Yposition");
        int Xposition = par1ItemStack.stackTagCompound.getInteger("Xposition");
        int Zposition = par1ItemStack.stackTagCompound.getInteger("Zposition");
        int YpositionOpp = par1ItemStack.stackTagCompound.getInteger("YpositionOpp");
        int XpositionOpp = par1ItemStack.stackTagCompound.getInteger("XpositionOpp");
        int ZpositionOpp = par1ItemStack.stackTagCompound.getInteger("ZpositionOpp");
        par3List.add(EnumChatFormatting.DARK_AQUA + "");
        par3List.add(EnumChatFormatting.DARK_AQUA + "");
        par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (40 + props.getNinjutsu() / 600));
        par3List.add(EnumChatFormatting.DARK_AQUA + "X: " + Xposition);
        par3List.add(EnumChatFormatting.DARK_AQUA + "Y: " + Yposition);
        par3List.add(EnumChatFormatting.DARK_AQUA + "Z: " + Zposition);
        par3List.add(EnumChatFormatting.DARK_AQUA + "X Opponent: " + XpositionOpp);
        par3List.add(EnumChatFormatting.DARK_AQUA + "Y Opponent: " + YpositionOpp);
        par3List.add(EnumChatFormatting.DARK_AQUA + "Z Opponent: " + ZpositionOpp);
        par3List.add(EnumChatFormatting.DARK_AQUA + "Phase: " + Phase);
      } 
      if (Phase == 2) {
        int Yposition = par1ItemStack.stackTagCompound.getInteger("Yposition");
        int Xposition = par1ItemStack.stackTagCompound.getInteger("Xposition");
        int Zposition = par1ItemStack.stackTagCompound.getInteger("Zposition");
        int YpositionOpp = par1ItemStack.stackTagCompound.getInteger("YpositionOpp");
        int XpositionOpp = par1ItemStack.stackTagCompound.getInteger("XpositionOpp");
        int ZpositionOpp = par1ItemStack.stackTagCompound.getInteger("ZpositionOpp");
        par3List.add(EnumChatFormatting.DARK_AQUA + "");
        par3List.add(EnumChatFormatting.DARK_AQUA + "");
        par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (40 + props.getNinjutsu() / 600));
        par3List.add(EnumChatFormatting.DARK_AQUA + "X: " + Xposition);
        par3List.add(EnumChatFormatting.DARK_AQUA + "Y: " + Yposition);
        par3List.add(EnumChatFormatting.DARK_AQUA + "Z: " + Zposition);
        par3List.add(EnumChatFormatting.DARK_AQUA + "X Opponent: " + XpositionOpp);
        par3List.add(EnumChatFormatting.DARK_AQUA + "Y Opponent: " + YpositionOpp);
        par3List.add(EnumChatFormatting.DARK_AQUA + "Z Opponent: " + ZpositionOpp);
        par3List.add(EnumChatFormatting.DARK_AQUA + "Phase: " + Phase);
      } 
    } 
  }
}

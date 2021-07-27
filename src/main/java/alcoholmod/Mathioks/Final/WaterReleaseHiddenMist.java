package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class WaterReleaseHiddenMist extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public WaterReleaseHiddenMist() {
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
      par1ItemStack.stackTagCompound.setInteger("counter", 0);
      par1ItemStack.stackTagCompound.setInteger("stage", 0);
      par1ItemStack.stackTagCompound.setInteger("particles", 0);
      par1ItemStack.stackTagCompound.setBoolean("MistMode", false);
    } 
    boolean MistMode = par1ItemStack.stackTagCompound.getBoolean("MistMode");
    if (MistMode) {
      int counter = par1ItemStack.stackTagCompound.getInteger("counter");
      if (counter > 0) {
        counter--;
        par1ItemStack.stackTagCompound.setInteger("counter", counter);
      } 
      for (int i = 0; i < 10; i++)
        ((EntityPlayer)par3Entity).worldObj.spawnParticle("cloud", par3Entity.posX, par3Entity.posY + par2World.rand.nextDouble() * 1.0D, par3Entity.posZ, par2World.rand.nextGaussian(), 0.0D, par2World.rand.nextGaussian()); 
      List<Entity> list = par2World.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox(((EntityPlayer)par3Entity).posX - 10.0D, ((EntityPlayer)par3Entity).posY - 3.0D, ((EntityPlayer)par3Entity).posZ - 10.0D, ((EntityPlayer)par3Entity).posX + 10.0D, ((EntityPlayer)par3Entity).posY + 3.0D, ((EntityPlayer)par3Entity).posZ + 10.0D));
      if ((EntityPlayer)par3Entity != null)
        for (int k2 = 0; k2 < list.size(); k2++) {
          if (!par2World.isRemote) {
            Entity entity = list.get(k2);
            String user = ((EntityPlayer)par3Entity).getUniqueID().toString();
            entity.getDistance(((EntityPlayer)par3Entity).posX, ((EntityPlayer)par3Entity).posY, ((EntityPlayer)par3Entity).posZ);
            if (entity instanceof net.minecraft.entity.EntityLiving && 
              entity instanceof EntityLivingBase) {
              ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 20, 2));
              ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.blindness.id, 20, 10));
            } 
            if (entity instanceof EntityPlayer && !entity.getUniqueID().toString().equals(user))
              ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.blindness.id, 20, 10)); 
          } 
        }  
      if (counter == 0) {
        MistMode = false;
        par1ItemStack.stackTagCompound.setBoolean("MistMode", MistMode);
      } 
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
        if (props.getCurrentMana() >= 5 + props.getNinjutsu() / 600) {
          int counter = Par1ItemStack.stackTagCompound.getInteger("counter");
          if (counter == 0) {
            counter = 300;
            Par1ItemStack.stackTagCompound.setInteger("counter", counter);
            boolean MistMode = Par1ItemStack.stackTagCompound.getBoolean("MistMode");
            MistMode = true;
            Par1ItemStack.stackTagCompound.setBoolean("MistMode", MistMode);
            props.consumeMana(5 + props.getNinjutsu() / 600);
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Kirigakure Style: Hidden Mist Jutsu!"));
          } 
        } else {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough chakra"));
        } 
      } else {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You are not the owner of this jutsu"));
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "A jutsu known only to Kirigakure-Nin");
    par3List.add(EnumChatFormatting.DARK_AQUA + "Engulfs yourself in mist blinding anyone");
    par3List.add(EnumChatFormatting.DARK_AQUA + "entering it.");
  }
}

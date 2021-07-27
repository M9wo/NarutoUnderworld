package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.CT.IceReleaseIceNeedleseEntity;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class IceReleaseIceNeedles extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public IceReleaseIceNeedles() {
    setMaxDamage(3700);
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
      par1ItemStack.stackTagCompound.setInteger("counter", 0);
      par1ItemStack.stackTagCompound.setBoolean("StartCounting", false);
      par1ItemStack.stackTagCompound.setBoolean("FireMode", false);
      par1ItemStack.stackTagCompound.setInteger("kd", 0);
    } 
    if (par1ItemStack.stackTagCompound != null && par1ItemStack.stackTagCompound.getInteger("kd") > 0) {
      int counter = par1ItemStack.stackTagCompound.getInteger("kd");
      par1ItemStack.stackTagCompound.setInteger("kd", --counter);
    } 
    if (!par2World.isRemote) {
      int counter = par1ItemStack.stackTagCompound.getInteger("counter");
      boolean StartCounting = par1ItemStack.stackTagCompound.getBoolean("StartCounting");
      boolean FireMode = par1ItemStack.stackTagCompound.getBoolean("FireMode");
      if (StartCounting) {
        counter++;
        par1ItemStack.stackTagCompound.setInteger("counter", counter);
        if (counter >= 3) {
          FireMode = true;
          par1ItemStack.stackTagCompound.setBoolean("FireMode", FireMode);
          StartCounting = false;
          par1ItemStack.stackTagCompound.setBoolean("StartCounting", StartCounting);
          counter = 0;
          par1ItemStack.stackTagCompound.setInteger("counter", counter);
        } 
      } 
      if (FireMode)
        for (int c = 0; c <= 20; c++) {
          IceReleaseIceNeedleseEntity fireball1 = new IceReleaseIceNeedleseEntity(par2World, (EntityLivingBase)par3Entity);
          fireball1.setPosition(((EntityPlayer)par3Entity).posX, ((EntityPlayer)par3Entity).posY + 1.0D, ((EntityPlayer)par3Entity).posZ);
          par2World.spawnEntityInWorld((Entity)fireball1);
          IceReleaseIceNeedleseEntity fireball2 = new IceReleaseIceNeedleseEntity(par2World, (EntityLivingBase)par3Entity);
          fireball2.setPosition(((EntityPlayer)par3Entity).posX, ((EntityPlayer)par3Entity).posY + 1.0D, ((EntityPlayer)par3Entity).posZ + 1.0D);
          par2World.spawnEntityInWorld((Entity)fireball2);
          IceReleaseIceNeedleseEntity fireball3 = new IceReleaseIceNeedleseEntity(par2World, (EntityLivingBase)par3Entity);
          fireball3.setPosition(((EntityPlayer)par3Entity).posX + 1.0D, ((EntityPlayer)par3Entity).posY + 1.0D, ((EntityPlayer)par3Entity).posZ);
          par2World.spawnEntityInWorld((Entity)fireball3);
          IceReleaseIceNeedleseEntity fireball4 = new IceReleaseIceNeedleseEntity(par2World, (EntityLivingBase)par3Entity);
          fireball4.setPosition(((EntityPlayer)par3Entity).posX, ((EntityPlayer)par3Entity).posY + 1.0D, ((EntityPlayer)par3Entity).posZ - 1.0D);
          par2World.spawnEntityInWorld((Entity)fireball4);
          IceReleaseIceNeedleseEntity fireball5 = new IceReleaseIceNeedleseEntity(par2World, (EntityLivingBase)par3Entity);
          fireball5.setPosition(((EntityPlayer)par3Entity).posX - 1.0D, ((EntityPlayer)par3Entity).posY + 1.0D, ((EntityPlayer)par3Entity).posZ);
          par2World.spawnEntityInWorld((Entity)fireball5);
          IceReleaseIceNeedleseEntity fireball6 = new IceReleaseIceNeedleseEntity(par2World, (EntityLivingBase)par3Entity);
          fireball6.setPosition(((EntityPlayer)par3Entity).posX + 1.0D, ((EntityPlayer)par3Entity).posY, ((EntityPlayer)par3Entity).posZ);
          par2World.spawnEntityInWorld((Entity)fireball6);
          IceReleaseIceNeedleseEntity fireball7 = new IceReleaseIceNeedleseEntity(par2World, (EntityLivingBase)par3Entity);
          fireball7.setPosition(((EntityPlayer)par3Entity).posX - 1.0D, ((EntityPlayer)par3Entity).posY, ((EntityPlayer)par3Entity).posZ);
          par2World.spawnEntityInWorld((Entity)fireball7);
          IceReleaseIceNeedleseEntity fireball8 = new IceReleaseIceNeedleseEntity(par2World, (EntityLivingBase)par3Entity);
          fireball8.setPosition(((EntityPlayer)par3Entity).posX, ((EntityPlayer)par3Entity).posY, ((EntityPlayer)par3Entity).posZ - 1.0D);
          par2World.spawnEntityInWorld((Entity)fireball8);
          IceReleaseIceNeedleseEntity fireball9 = new IceReleaseIceNeedleseEntity(par2World, (EntityLivingBase)par3Entity);
          fireball9.setPosition(((EntityPlayer)par3Entity).posX, ((EntityPlayer)par3Entity).posY, ((EntityPlayer)par3Entity).posZ + 1.0D);
          par2World.spawnEntityInWorld((Entity)fireball9);
          IceReleaseIceNeedleseEntity fireball16 = new IceReleaseIceNeedleseEntity(par2World, (EntityLivingBase)par3Entity);
          fireball16.setPosition(((EntityPlayer)par3Entity).posX + 1.0D, ((EntityPlayer)par3Entity).posY + 2.0D, ((EntityPlayer)par3Entity).posZ);
          par2World.spawnEntityInWorld((Entity)fireball16);
          IceReleaseIceNeedleseEntity fireball17 = new IceReleaseIceNeedleseEntity(par2World, (EntityLivingBase)par3Entity);
          fireball17.setPosition(((EntityPlayer)par3Entity).posX - 1.0D, ((EntityPlayer)par3Entity).posY + 2.0D, ((EntityPlayer)par3Entity).posZ);
          par2World.spawnEntityInWorld((Entity)fireball17);
          IceReleaseIceNeedleseEntity fireball18 = new IceReleaseIceNeedleseEntity(par2World, (EntityLivingBase)par3Entity);
          fireball18.setPosition(((EntityPlayer)par3Entity).posX, ((EntityPlayer)par3Entity).posY + 2.0D, ((EntityPlayer)par3Entity).posZ - 1.0D);
          par2World.spawnEntityInWorld((Entity)fireball18);
          IceReleaseIceNeedleseEntity fireball19 = new IceReleaseIceNeedleseEntity(par2World, (EntityLivingBase)par3Entity);
          fireball19.setPosition(((EntityPlayer)par3Entity).posX, ((EntityPlayer)par3Entity).posY + 2.0D, ((EntityPlayer)par3Entity).posZ + 1.0D);
          par2World.spawnEntityInWorld((Entity)fireball19);
          if (c == 20) {
            FireMode = false;
            par1ItemStack.stackTagCompound.setBoolean("FireMode", FireMode);
          } 
        }  
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote)
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
        ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
        if (props.geticeRelease() == 1 && Par1ItemStack.stackTagCompound.getInteger("kd") == 0)
          if (props.getCurrentMana() >= 30 + props.getNinjutsu() / 600) {
            boolean StartCounting = Par1ItemStack.stackTagCompound.getBoolean("StartCounting");
            boolean FireMode = Par1ItemStack.stackTagCompound.getBoolean("FireMode");
            if (!StartCounting && !FireMode) {
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Ice Release: Ice Needles!"));
              StartCounting = true;
              Par1ItemStack.stackTagCompound.setBoolean("StartCounting", StartCounting);
              Par1ItemStack.stackTagCompound.setInteger("kd", 30);
              props.consumeMana(30 + props.getNinjutsu() / 600);
            } 
          } else {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough chakra"));
          }  
      } else {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Are not The owner of this Item"));
      }  
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null) {
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner"));
      par3List.add(EnumChatFormatting.AQUA + "Counter: " + par1ItemStack.stackTagCompound.getInteger("counter"));
    } 
    par3List.add(EnumChatFormatting.DARK_AQUA + "Shoot many ice needles");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: 30");
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: 4xhits");
  }
}

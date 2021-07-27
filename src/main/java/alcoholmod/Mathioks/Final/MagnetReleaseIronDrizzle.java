package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.CT.MagnetReleaseIronDrizzleEntity;
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

public class MagnetReleaseIronDrizzle extends JutsuItem {
  private boolean isinair;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public MagnetReleaseIronDrizzle() {
    setMaxDamage(3700);
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null) {
      if (par1ItemStack.stackTagCompound == null) {
        par1ItemStack.stackTagCompound = new NBTTagCompound();
        par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
        par1ItemStack.stackTagCompound.setInteger("counter", 0);
        par1ItemStack.stackTagCompound.setInteger("counter2", 0);
        par1ItemStack.stackTagCompound.setBoolean("StartCounting", false);
        par1ItemStack.stackTagCompound.setBoolean("FireMode", false);
      } 
      if (par1ItemStack.stackTagCompound != null && !par2World.isRemote) {
        int counter = par1ItemStack.stackTagCompound.getInteger("counter");
        int counter2 = par1ItemStack.stackTagCompound.getInteger("counter2");
        boolean StartCounting = par1ItemStack.stackTagCompound.getBoolean("StartCounting");
        boolean FireMode = par1ItemStack.stackTagCompound.getBoolean("FireMode");
        if (StartCounting) {
          counter++;
          par1ItemStack.stackTagCompound.setInteger("counter", counter);
          if (counter >= 100) {
            FireMode = true;
            par1ItemStack.stackTagCompound.setBoolean("FireMode", FireMode);
            StartCounting = false;
            par1ItemStack.stackTagCompound.setBoolean("StartCounting", StartCounting);
            counter = 0;
            par1ItemStack.stackTagCompound.setInteger("counter", counter);
          } 
        } 
        if (FireMode) {
          counter2++;
          par1ItemStack.stackTagCompound.setInteger("counter2", counter2);
          if (counter2 >= 150) {
            FireMode = false;
            par1ItemStack.stackTagCompound.setBoolean("FireMode", FireMode);
            counter2 = 0;
            par1ItemStack.stackTagCompound.setInteger("counter2", counter2);
          } 
          MagnetReleaseIronDrizzleEntity fireball1 = new MagnetReleaseIronDrizzleEntity(par2World, (EntityLivingBase)par3Entity);
          fireball1.setPosition(((EntityPlayer)par3Entity).posX, ((EntityPlayer)par3Entity).posY + 1.0D, ((EntityPlayer)par3Entity).posZ);
          par2World.spawnEntityInWorld((Entity)fireball1);
          MagnetReleaseIronDrizzleEntity fireball2 = new MagnetReleaseIronDrizzleEntity(par2World, (EntityLivingBase)par3Entity);
          fireball2.setPosition(((EntityPlayer)par3Entity).posX, ((EntityPlayer)par3Entity).posY + 1.0D, ((EntityPlayer)par3Entity).posZ + 1.0D);
          par2World.spawnEntityInWorld((Entity)fireball2);
          MagnetReleaseIronDrizzleEntity fireball3 = new MagnetReleaseIronDrizzleEntity(par2World, (EntityLivingBase)par3Entity);
          fireball3.setPosition(((EntityPlayer)par3Entity).posX + 1.0D, ((EntityPlayer)par3Entity).posY + 1.0D, ((EntityPlayer)par3Entity).posZ);
          par2World.spawnEntityInWorld((Entity)fireball3);
          MagnetReleaseIronDrizzleEntity fireball4 = new MagnetReleaseIronDrizzleEntity(par2World, (EntityLivingBase)par3Entity);
          fireball4.setPosition(((EntityPlayer)par3Entity).posX, ((EntityPlayer)par3Entity).posY + 1.0D, ((EntityPlayer)par3Entity).posZ - 1.0D);
          par2World.spawnEntityInWorld((Entity)fireball4);
          MagnetReleaseIronDrizzleEntity fireball5 = new MagnetReleaseIronDrizzleEntity(par2World, (EntityLivingBase)par3Entity);
          fireball5.setPosition(((EntityPlayer)par3Entity).posX - 1.0D, ((EntityPlayer)par3Entity).posY + 1.0D, ((EntityPlayer)par3Entity).posZ);
          par2World.spawnEntityInWorld((Entity)fireball5);
          MagnetReleaseIronDrizzleEntity fireball6 = new MagnetReleaseIronDrizzleEntity(par2World, (EntityLivingBase)par3Entity);
          fireball6.setPosition(((EntityPlayer)par3Entity).posX + 1.0D, ((EntityPlayer)par3Entity).posY, ((EntityPlayer)par3Entity).posZ);
          par2World.spawnEntityInWorld((Entity)fireball6);
          MagnetReleaseIronDrizzleEntity fireball7 = new MagnetReleaseIronDrizzleEntity(par2World, (EntityLivingBase)par3Entity);
          fireball7.setPosition(((EntityPlayer)par3Entity).posX - 1.0D, ((EntityPlayer)par3Entity).posY, ((EntityPlayer)par3Entity).posZ);
          par2World.spawnEntityInWorld((Entity)fireball7);
          MagnetReleaseIronDrizzleEntity fireball8 = new MagnetReleaseIronDrizzleEntity(par2World, (EntityLivingBase)par3Entity);
          fireball8.setPosition(((EntityPlayer)par3Entity).posX, ((EntityPlayer)par3Entity).posY, ((EntityPlayer)par3Entity).posZ - 1.0D);
          par2World.spawnEntityInWorld((Entity)fireball8);
          MagnetReleaseIronDrizzleEntity fireball9 = new MagnetReleaseIronDrizzleEntity(par2World, (EntityLivingBase)par3Entity);
          fireball9.setPosition(((EntityPlayer)par3Entity).posX, ((EntityPlayer)par3Entity).posY, ((EntityPlayer)par3Entity).posZ + 1.0D);
          par2World.spawnEntityInWorld((Entity)fireball9);
          MagnetReleaseIronDrizzleEntity fireball16 = new MagnetReleaseIronDrizzleEntity(par2World, (EntityLivingBase)par3Entity);
          fireball16.setPosition(((EntityPlayer)par3Entity).posX + 1.0D, ((EntityPlayer)par3Entity).posY + 2.0D, ((EntityPlayer)par3Entity).posZ);
          par2World.spawnEntityInWorld((Entity)fireball16);
          MagnetReleaseIronDrizzleEntity fireball17 = new MagnetReleaseIronDrizzleEntity(par2World, (EntityLivingBase)par3Entity);
          fireball17.setPosition(((EntityPlayer)par3Entity).posX - 1.0D, ((EntityPlayer)par3Entity).posY + 2.0D, ((EntityPlayer)par3Entity).posZ);
          par2World.spawnEntityInWorld((Entity)fireball17);
          MagnetReleaseIronDrizzleEntity fireball18 = new MagnetReleaseIronDrizzleEntity(par2World, (EntityLivingBase)par3Entity);
          fireball18.setPosition(((EntityPlayer)par3Entity).posX, ((EntityPlayer)par3Entity).posY + 2.0D, ((EntityPlayer)par3Entity).posZ - 1.0D);
          par2World.spawnEntityInWorld((Entity)fireball18);
          MagnetReleaseIronDrizzleEntity fireball19 = new MagnetReleaseIronDrizzleEntity(par2World, (EntityLivingBase)par3Entity);
          fireball19.setPosition(((EntityPlayer)par3Entity).posX, ((EntityPlayer)par3Entity).posY + 2.0D, ((EntityPlayer)par3Entity).posZ + 1.0D);
          par2World.spawnEntityInWorld((Entity)fireball19);
        } 
      } 
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote)
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
        ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
        if (props.getCurrentMana() >= 35 + props.getNinjutsu() / 600) {
          if (props.getmagnetRelease() == 1) {
            int counter = Par1ItemStack.stackTagCompound.getInteger("counter");
            int counter2 = Par1ItemStack.stackTagCompound.getInteger("counter2");
            boolean StartCounting = Par1ItemStack.stackTagCompound.getBoolean("StartCounting");
            boolean FireMode = Par1ItemStack.stackTagCompound.getBoolean("FireMode");
            if (!StartCounting && !FireMode) {
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Magnet Release: Iron Drizzle!"));
              StartCounting = true;
              Par1ItemStack.stackTagCompound.setBoolean("StartCounting", StartCounting);
              props.consumeMana(35 + props.getNinjutsu() / 600);
            } 
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "Create small sand bullets infused");
    par3List.add(EnumChatFormatting.DARK_AQUA + "with iron, then shoot them off at");
    par3List.add(EnumChatFormatting.DARK_AQUA + "the opponent");
    par3List.add(EnumChatFormatting.DARK_AQUA + "Immobilizes puppets");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (35 + props.getNinjutsu() / 600));
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: 4xhits");
  }
}

package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.Entity.EntityFlowerRepentance;
import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class BoilReleaseFlowerRepentanceTechniqe extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public BoilReleaseFlowerRepentanceTechniqe() {
    setMaxDamage(3700);
    this.maxStackSize = 1;
  }
  
  public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player) {
    return false;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
        boolean FireMode = Par1ItemStack.stackTagCompound.getBoolean("FireMode");
        if (props.getCurrentMana() >= 30 && props.getboilRelease() == 1 && Par1ItemStack.stackTagCompound.getInteger("counter") == 0) {
          Par1ItemStack.stackTagCompound.setInteger("counter", 400);
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Multiple Falling Suns!"));
          EntityFlowerRepentance fireball1 = new EntityFlowerRepentance(Par2World, (EntityLivingBase)Par3EntityPlayer);
          fireball1.setPosition(Par3EntityPlayer.posX + 6.0D, Par3EntityPlayer.posY, Par3EntityPlayer.posZ);
          Par2World.spawnEntityInWorld((Entity)fireball1);
          EntityFlowerRepentance fireball3 = new EntityFlowerRepentance(Par2World, (EntityLivingBase)Par3EntityPlayer);
          fireball3.setPosition(Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ + 6.0D);
          Par2World.spawnEntityInWorld((Entity)fireball3);
          EntityFlowerRepentance fireball4 = new EntityFlowerRepentance(Par2World, (EntityLivingBase)Par3EntityPlayer);
          fireball4.setPosition(Par3EntityPlayer.posX + 6.0D, Par3EntityPlayer.posY, Par3EntityPlayer.posZ + 6.0D);
          Par2World.spawnEntityInWorld((Entity)fireball4);
          EntityFlowerRepentance fireball5 = new EntityFlowerRepentance(Par2World, (EntityLivingBase)Par3EntityPlayer);
          fireball5.setPosition(Par3EntityPlayer.posX - 6.0D, Par3EntityPlayer.posY, Par3EntityPlayer.posZ);
          Par2World.spawnEntityInWorld((Entity)fireball5);
          EntityFlowerRepentance fireball6 = new EntityFlowerRepentance(Par2World, (EntityLivingBase)Par3EntityPlayer);
          fireball6.setPosition(Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ - 6.0D);
          Par2World.spawnEntityInWorld((Entity)fireball6);
          EntityFlowerRepentance fireball7 = new EntityFlowerRepentance(Par2World, (EntityLivingBase)Par3EntityPlayer);
          fireball7.setPosition(Par3EntityPlayer.posX - 6.0D, Par3EntityPlayer.posY, Par3EntityPlayer.posZ - 6.0D);
          Par2World.spawnEntityInWorld((Entity)fireball7);
          EntityFlowerRepentance fireball8 = new EntityFlowerRepentance(Par2World, (EntityLivingBase)Par3EntityPlayer);
          fireball8.setPosition(Par3EntityPlayer.posX + 6.0D, Par3EntityPlayer.posY, Par3EntityPlayer.posZ - 6.0D);
          Par2World.spawnEntityInWorld((Entity)fireball8);
          EntityFlowerRepentance fireball9 = new EntityFlowerRepentance(Par2World, (EntityLivingBase)Par3EntityPlayer);
          fireball9.setPosition(Par3EntityPlayer.posX - 6.0D, Par3EntityPlayer.posY, Par3EntityPlayer.posZ + 6.0D);
          Par2World.spawnEntityInWorld((Entity)fireball9);
          props.consumeMana(30);
        } 
      } else {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "You Are not The owner of this Item"));
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    par3List.add(EnumChatFormatting.DARK_AQUA + "Creates falling suns that set the surroundings ablaze");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: 30");
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: 10");
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.DARK_RED + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
  }
}

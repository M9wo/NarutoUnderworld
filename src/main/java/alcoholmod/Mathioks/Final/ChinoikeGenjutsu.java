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
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class ChinoikeGenjutsu extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public ChinoikeGenjutsu() {
    this.maxStackSize = 1;
  }
  
  public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player) {
    return false;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if (!par2World.isRemote && (EntityPlayer)par3Entity != null) {
      if (par1ItemStack.stackTagCompound == null) {
        par1ItemStack.stackTagCompound = new NBTTagCompound();
        par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
        par1ItemStack.stackTagCompound.setBoolean("Shot", false);
        par1ItemStack.stackTagCompound.setBoolean("Mid", false);
        par1ItemStack.stackTagCompound.setDouble("locX", 0.0D);
        par1ItemStack.stackTagCompound.setDouble("locY", 0.0D);
        par1ItemStack.stackTagCompound.setDouble("locZ", 0.0D);
        par1ItemStack.stackTagCompound.setInteger("counter", 0);
        par1ItemStack.stackTagCompound.setInteger("kd", 0);
      } 
      if (par1ItemStack.stackTagCompound != null && par1ItemStack.stackTagCompound.getInteger("kd") > 0) {
        int counter = par1ItemStack.stackTagCompound.getInteger("kd");
        par1ItemStack.stackTagCompound.setInteger("kd", --counter);
      } 
      if (par1ItemStack.stackTagCompound != null);
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getInteger("kd") == 0) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
        if (!Par1ItemStack.stackTagCompound.getBoolean("Shot") && !Par1ItemStack.stackTagCompound.getBoolean("Mid"))
          if (props.getGenjutsu() >= 80) {
            if (props.getKetsuryuganActive()) {
              if (props.getCurrentMana() >= 100) {
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Ketsuryugan: Genjutsu"));
                Par2World.spawnEntityInWorld((Entity)new ChinoikeGenjutsuEntitySet(Par2World, (EntityLivingBase)Par3EntityPlayer));
                Par1ItemStack.stackTagCompound.setInteger("kd", 300);
                props.consumeMana(100);
              } else {
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough chakra"));
              } 
            } else {
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("The Ketsuryugan needs to be active"));
            } 
          } else {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You need at least 80 Genjutsu"));
          }  
      } else {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You are not the owner of this item"));
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null) {
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner"));
      par3List.add(EnumChatFormatting.DARK_AQUA + "One of the most powerful Genjutsu");
      par3List.add(EnumChatFormatting.DARK_AQUA + "in existence used only by members");
      par3List.add(EnumChatFormatting.DARK_AQUA + "of the Chinoike clan.");
      par3List.add(EnumChatFormatting.DARK_AQUA + "Turns your opponent into an exploding");
      par3List.add(EnumChatFormatting.DARK_AQUA + "zombie");
      par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + 'd');
      if (props.getGenjutsu() < 80)
        par3List.add(EnumChatFormatting.GOLD + "Genjutsu needed: " + 'P'); 
    } 
  }
}

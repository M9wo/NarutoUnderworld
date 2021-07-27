package alcoholmod.Mathioks.Taijutsu;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.JutsuItem;
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

public class DaytimeTigerItem extends JutsuItem {
  private boolean isinair;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public DaytimeTigerItem() {
    setMaxDamage(5100);
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
      par1ItemStack.stackTagCompound.setInteger("counter", 0);
    } 
    if (par1ItemStack.stackTagCompound != null) {
      int counter = par1ItemStack.stackTagCompound.getInteger("counter");
      if (counter > 0) {
        counter--;
        par1ItemStack.stackTagCompound.setInteger("counter", counter);
      } 
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      int counter = Par1ItemStack.stackTagCompound.getInteger("counter");
      if (counter == 0) {
        ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
        if (props.getTaijutsu() >= 9.8D) {
          if (props.getEightGatesStage() >= 5) {
            if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName()) && props.getClanName().contains("Lee")) {
              Par2World.spawnEntityInWorld((Entity)new DaytimeTigerEntity(Par2World, (EntityLivingBase)Par3EntityPlayer));
              counter = 3500;
              Par1ItemStack.stackTagCompound.setInteger("counter", counter);
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Daytime Tiger!"));
            } else {
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Are not The owner of this Item"));
            } 
          } else {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You need to have the Gate of Limit open"));
          } 
        } else {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You need at least 440 Taijutsu"));
        } 
      } 
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "An extremely high-level taijutsu.");
    par3List.add(EnumChatFormatting.DARK_AQUA + "the user punches so fast that the");
    par3List.add(EnumChatFormatting.DARK_AQUA + "wind around him forms the shape of");
    par3List.add(EnumChatFormatting.DARK_AQUA + "a tigers head.");
    par3List.add(EnumChatFormatting.DARK_AQUA + "Explodes on impact");
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: " + (50 + (int)props.getTaijutsu()));
  }
}

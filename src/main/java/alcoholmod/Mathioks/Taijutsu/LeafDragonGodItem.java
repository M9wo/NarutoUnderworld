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

public class LeafDragonGodItem extends JutsuItem {
  private boolean isinair;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public LeafDragonGodItem() {
    setMaxDamage(5100);
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null) {
      if (par1ItemStack.stackTagCompound == null) {
        par1ItemStack.stackTagCompound = new NBTTagCompound();
        par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
        par1ItemStack.stackTagCompound.setInteger("counter", 0);
      } 
      if (par1ItemStack.stackTagCompound != null) {
        int counter = par1ItemStack.stackTagCompound.getInteger("counter");
        if (counter >= 1) {
          counter--;
          par1ItemStack.stackTagCompound.setInteger("counter", counter);
        } 
      } 
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      int counter = Par1ItemStack.stackTagCompound.getInteger("counter");
      if (counter == 0) {
        ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
        if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName()) && props.getClanName().contains("Lee")) {
          if (props.getTaijutsu() >= 10.0D) {
            if (props.getEightGatesStage() >= 7) {
              if (props.getCurrentMana() >= 40 + props.getNinjutsu() / 600) {
                Par2World.spawnEntityInWorld((Entity)new LeafDragonGodEntity(Par2World, (EntityLivingBase)Par3EntityPlayer));
                props.consumeMana(65 + props.getNinjutsu() / 600);
                counter = 3500;
                Par1ItemStack.stackTagCompound.setInteger("counter", counter);
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Taijutsu: Leaf Dragon God!!"));
              } else {
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough chakra"));
              } 
            } else {
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You need to have the Gate of Wonder open"));
            } 
          } else {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You need at least 450 Taijutsu"));
          } 
        } else {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Are not The owner of this Item"));
        } 
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    par3List.add(EnumChatFormatting.DARK_AQUA + "The ultimate Taijutsu created by");
    par3List.add(EnumChatFormatting.DARK_AQUA + "the legendary Taijutsu master Chen");
    par3List.add(EnumChatFormatting.DARK_AQUA + "This Taijutsu creates a dragon through");
    par3List.add(EnumChatFormatting.DARK_AQUA + "a kick that protects the user and harms");
    par3List.add(EnumChatFormatting.DARK_AQUA + "anything else inside of it");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (40 + props.getNinjutsu() / 600));
    par3List.add(EnumChatFormatting.DARK_RED + "Damage/tick: " + '\017');
  }
}

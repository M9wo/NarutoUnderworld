package alcoholmod.Mathioks.Final.ClanJutsu;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.JutsuItem;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class TsuchigumoFury extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World Par2World, Entity Par3EntityPlayer, int par4, boolean par5) {
    if ((EntityPlayer)Par3EntityPlayer != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)Par3EntityPlayer).getCommandSenderName());
      par1ItemStack.stackTagCompound.setBoolean("FireMode", false);
      par1ItemStack.stackTagCompound.setInteger("counter", 0);
    } 
    boolean FireMode = par1ItemStack.stackTagCompound.getBoolean("FireMode");
    int counter = par1ItemStack.stackTagCompound.getInteger("counter");
    if (FireMode && !Par2World.isRemote) {
      boolean flag = Par2World.getGameRules().getGameRuleBooleanValue("mobGriefing");
      counter++;
      par1ItemStack.stackTagCompound.setInteger("counter", counter);
      if (counter == 10)
        Par2World.newExplosion(Par3EntityPlayer, Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ, 4.0F, flag, flag); 
      if (counter == 30)
        Par2World.newExplosion(Par3EntityPlayer, Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ, 10.0F, flag, flag); 
      if (counter == 60)
        Par2World.newExplosion(Par3EntityPlayer, Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ, 20.0F, flag, flag); 
      if (counter == 90)
        Par2World.newExplosion(Par3EntityPlayer, Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ, 40.0F, flag, flag); 
      if (counter >= 100) {
        FireMode = false;
        counter = 0;
        par1ItemStack.stackTagCompound.setBoolean("FireMode", FireMode);
        par1ItemStack.stackTagCompound.setInteger("counter", counter);
      } 
    } 
  }
  
  public TsuchigumoFury() {
    setMaxDamage(3700);
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
        boolean FireMode = Par1ItemStack.stackTagCompound.getBoolean("FireMode");
        int counter = Par1ItemStack.stackTagCompound.getInteger("counter");
        if (props.getCurrentMana() >= 200 && !FireMode) {
          if (Par3EntityPlayer.inventory.hasItem(AlcoholMod.TsuchigumoForbiddenLife) && props.getKinjutsu() >= 85 && props.getClanName().contains("Tsuchigumo")) {
            FireMode = true;
            Par1ItemStack.stackTagCompound.setBoolean("FireMode", FireMode);
            Par2World.newExplosion((Entity)Par3EntityPlayer, Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ, 4.0F, true, false);
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Tsuchigumo Kinjutsu: Fury!!"));
            props.consumeMana(200);
          } 
        } else {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough chakra"));
        } 
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "The ultimate Tsuchigumo Kinjutsu");
    par3List.add(EnumChatFormatting.DARK_AQUA + "creates an explosion so big it can");
    par3List.add(EnumChatFormatting.DARK_AQUA + "wipe out an entire village in one blow!");
    par3List.add(EnumChatFormatting.DARK_AQUA + "Needs Tsuchigumo: Forbidden life in your inventory");
    par3List.add(EnumChatFormatting.GOLD + "Kinjutsu: 85");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: 200");
  }
}

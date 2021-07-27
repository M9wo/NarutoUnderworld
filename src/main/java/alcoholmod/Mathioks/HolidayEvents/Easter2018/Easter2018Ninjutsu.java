package alcoholmod.Mathioks.HolidayEvents.Easter2018;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.JutsuItem;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Calendar;
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

public class Easter2018Ninjutsu extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public Easter2018Ninjutsu() {
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
      par1ItemStack.stackTagCompound.setBoolean("On", false);
      par1ItemStack.stackTagCompound.setInteger("Counter", 0);
      Calendar calendar = par3Entity.worldObj.getCurrentDate();
      if (calendar.get(2) + 1 == 3 && calendar.get(5) >= 30)
        par1ItemStack.stackTagCompound.setInteger("Obtained", 1); 
      if (calendar.get(2) + 1 == 4 && calendar.get(5) >= 1 && calendar.get(5) <= 9)
        par1ItemStack.stackTagCompound.setInteger("Obtained", 1); 
    } 
    if (par1ItemStack.stackTagCompound != null) {
      boolean On = par1ItemStack.stackTagCompound.getBoolean("On");
      int Counter = par1ItemStack.stackTagCompound.getInteger("Counter");
      if (On);
    } 
  }
  
  public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player) {
    return false;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getCurrentMana() >= 35) {
        if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
          if (Par1ItemStack.stackTagCompound.getInteger("Obtained") == 1) {
            Par2World.spawnEntityInWorld((Entity)new Easter2018UnoeufEntity(Par2World, (EntityLivingBase)Par3EntityPlayer));
            Par3EntityPlayer.getFoodStats().addStats(2, 0.1F);
            props.consumeMana(35);
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Ninjutsu: Unoeuf!"));
          } else {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You can only use this jutsu if you obtained it during the Easter Event"));
          } 
        } else {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Are not The owner of this Item"));
        } 
      } else {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough chakra"));
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "A Ninjutsu used by Kurousagi.");
    par3List.add(EnumChatFormatting.DARK_AQUA + "Create an extremely filling easter egg");
    par3List.add(EnumChatFormatting.DARK_AQUA + "that makes the opponent nauseaus and bloated");
    par3List.add(EnumChatFormatting.DARK_AQUA + "while recovering some hunger of the user");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: 35");
    par3List.add(EnumChatFormatting.GOLD + "Damage: 10");
  }
}

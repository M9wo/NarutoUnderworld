package alcoholmod.Mathioks.Final.ClanJutsu;

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

public class InuzukaSpawnAkamaru extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null) {
      if (par1ItemStack.stackTagCompound == null) {
        par1ItemStack.stackTagCompound = new NBTTagCompound();
        par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
        par1ItemStack.stackTagCompound.setString("Pet", "empty");
        par1ItemStack.stackTagCompound.setString("CustomNameTag", "Akamaru");
        par1ItemStack.stackTagCompound.setBoolean("Summoned", false);
        par1ItemStack.stackTagCompound.setBoolean("SummonedE", false);
      } 
      if (par1ItemStack.stackTagCompound != null && !par2World.isRemote) {
        boolean Summoned = par1ItemStack.stackTagCompound.getBoolean("Summoned");
        if (Summoned) {
          if (par2World.getWorldTime() % 6000L == 0L && !par1ItemStack.stackTagCompound.getBoolean("SummonedE") && par1ItemStack.stackTagCompound.getString("Owner").equals(((EntityPlayer)par3Entity).getCommandSenderName())) {
            InuzukaEntityAkamaru fireball2 = new InuzukaEntityAkamaru(par2World);
            fireball2.setPosition(((EntityPlayer)par3Entity).posX, ((EntityPlayer)par3Entity).posY, ((EntityPlayer)par3Entity).posZ);
            fireball2.func_152115_b(((EntityPlayer)par3Entity).getUniqueID().toString());
            fireball2.setTamed(true);
            fireball2.setCustomNameTag(par1ItemStack.stackTagCompound.getString("CustomNameTag"));
            par2World.spawnEntityInWorld((Entity)fireball2);
            ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText("Come " + par1ItemStack.stackTagCompound.getString("CustomNameTag") + "!"));
            par1ItemStack.stackTagCompound.setBoolean("SummonedE", true);
          } 
          if (par2World.getWorldTime() % 6000L != 0L && par1ItemStack.stackTagCompound.getBoolean("SummonedE"))
            par1ItemStack.stackTagCompound.setBoolean("SummonedE", false); 
        } 
      } 
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (Par1ItemStack.getItemDamage() == 0 && !Par2World.isRemote)
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
        boolean Summoned = Par1ItemStack.stackTagCompound.getBoolean("Summoned");
        if (!Summoned) {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(Par1ItemStack.stackTagCompound.getString("CustomNameTag") + " will join you soon"));
          Summoned = true;
          Par1ItemStack.stackTagCompound.setBoolean("Summoned", Summoned);
        } else if (Summoned) {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(Par1ItemStack.stackTagCompound.getString("CustomNameTag") + " will take a rest"));
          Summoned = false;
          Par1ItemStack.stackTagCompound.setBoolean("Summoned", Summoned);
        } 
      } else {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You are not the owner of this Item"));
      }  
    return Par1ItemStack;
  }
  
  public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
    if (entity instanceof InuzukaEntityAkamaru && ((InuzukaEntityAkamaru)entity).hasCustomNameTag()) {
      stack.stackTagCompound.setString("CustomNameTag", ((InuzukaEntityAkamaru)entity).getCustomNameTag());
      player.addChatComponentMessage((IChatComponent)new ChatComponentText("Name set to " + stack.stackTagCompound.getString("CustomNameTag")));
    } 
    return true;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    if (par1ItemStack.stackTagCompound != null) {
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner"));
      par3List.add(EnumChatFormatting.AQUA + "Name: " + par1ItemStack.stackTagCompound.getString("CustomNameTag"));
      par3List.add(EnumChatFormatting.AQUA + "Summonable: " + par1ItemStack.stackTagCompound.getBoolean("Summoned"));
      if (par1ItemStack.stackTagCompound.getString("CustomNameTag") == "Akamaru") {
        par3List.add(EnumChatFormatting.DARK_AQUA + "You can set your companions custom name");
        par3List.add(EnumChatFormatting.DARK_AQUA + "by using a nametag on it and left clicking");
        par3List.add(EnumChatFormatting.DARK_AQUA + "with this item");
      } 
    } 
    par3List.add(EnumChatFormatting.DARK_AQUA + "Summon your trusty dog companion");
  }
}

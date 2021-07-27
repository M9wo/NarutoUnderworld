package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SyncLavaChakraModeMessage;
import alcoholmod.Mathioks.PacketDispatcher;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class LavaReleaseChakraMode extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public LavaReleaseChakraMode() {
    setMaxDamage(200);
    isDamageable();
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null) {
      if (par1ItemStack.stackTagCompound == null) {
        par1ItemStack.stackTagCompound = new NBTTagCompound();
        par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
        par1ItemStack.stackTagCompound.setBoolean("EarthMode", false);
        par1ItemStack.stackTagCompound.setInteger("counter", 0);
      } 
      if (par1ItemStack.stackTagCompound != null) {
        EntityPlayer player = (EntityPlayer)par3Entity;
        ExtendedPlayer props = ExtendedPlayer.get(player);
        boolean EarthMode = par1ItemStack.stackTagCompound.getBoolean("EarthMode");
        int counter = par1ItemStack.stackTagCompound.getInteger("counter");
        if (EarthMode) {
          for (int i = 0; i < 2; i++)
            par2World.spawnParticle("lava", par3Entity.posX, par3Entity.posY - 1.0D, par3Entity.posZ, 0.0D, 0.0D, 0.0D); 
          if (!par2World.isRemote) {
            counter++;
            par1ItemStack.stackTagCompound.setInteger("counter", counter);
            if (counter >= 20) {
              props.consumeMana(4 + props.getNinjutsu() / 600);
              counter = 0;
              par1ItemStack.stackTagCompound.setInteger("counter", counter);
            } 
          } 
          if (!((EntityPlayer)par3Entity).isPotionActive(Potion.damageBoost.id))
            ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0)); 
        } 
        if (props.getCurrentMana() < 1 && EarthMode) {
          EarthMode = false;
          par1ItemStack.setItemDamage(0);
          par1ItemStack.stackTagCompound.setBoolean("EarthMode", EarthMode);
          props.setLavaChakraMode(false);
          if (!par2World.isRemote) {
            PacketDispatcher.sendTo((IMessage)new SyncLavaChakraModeMessage(player), (EntityPlayerMP)player);
            ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText("Lava Cloak de-Activate!"));
          } 
        } 
      } 
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getlavaRelease() == 1) {
        if (props.getCurrentMana() >= 5 + props.getNinjutsu() / 600) {
          boolean EarthMode = Par1ItemStack.stackTagCompound.getBoolean("EarthMode");
          int counter = Par1ItemStack.stackTagCompound.getInteger("counter");
          if (Par1ItemStack.getItemDamage() == 0) {
            EarthMode = true;
            Par1ItemStack.stackTagCompound.setBoolean("EarthMode", EarthMode);
            props.consumeMana(5 + props.getNinjutsu() / 600);
            props.setLavaChakraMode(true);
            PacketDispatcher.sendTo((IMessage)new SyncLavaChakraModeMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
            int i;
            for (i = 0; i < 8; i++)
              Par2World.spawnParticle("lava", Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ, 0.0D, 0.0D, 0.0D); 
            for (i = 0; i < 8; i++)
              Par2World.spawnParticle("lava", Par3EntityPlayer.posX + Par2World.rand.nextGaussian(), Par3EntityPlayer.posY + Par2World.rand.nextGaussian() * 0.25D, Par3EntityPlayer.posZ + Par2World.rand.nextGaussian(), 0.0D, 0.0D, 0.0D); 
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Lava Cloak Activate!"));
            Par1ItemStack.setItemDamage(50);
            return Par1ItemStack;
          } 
          if (Par1ItemStack.getItemDamage() == 50) {
            EarthMode = false;
            Par1ItemStack.stackTagCompound.setBoolean("EarthMode", EarthMode);
            Par1ItemStack.setItemDamage(0);
            props.setLavaChakraMode(false);
            PacketDispatcher.sendTo((IMessage)new SyncLavaChakraModeMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Lava Cloak de-Activate!"));
          } 
        } else {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough chakra!"));
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "Cloaks the user in lava nature chakra");
    par3List.add(EnumChatFormatting.DARK_AQUA + "increasing damage and setting");
    par3List.add(EnumChatFormatting.DARK_AQUA + "opponents ablaze on hit");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (5 + props.getNinjutsu() / 600));
    par3List.add(EnumChatFormatting.GOLD + "Chakra Upkeep: " + (2 + props.getNinjutsu() / 600));
  }
}

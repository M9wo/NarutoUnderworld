package lc208.nam.items.neko;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SynctrackAllMessage;
import alcoholmod.Mathioks.Final.JutsuItem;
import alcoholmod.Mathioks.PacketDispatcher;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import java.util.Iterator;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class NekoSense extends JutsuItem {
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
      par1ItemStack.stackTagCompound.setBoolean("Used", false);
      par1ItemStack.stackTagCompound.setInteger("counter", 0);
    } 
    EntityPlayer player = (EntityPlayer)par3Entity;
    ExtendedPlayer props = ExtendedPlayer.get(player);
    if (par1ItemStack.stackTagCompound.getBoolean("Used")) {
      int counter = par1ItemStack.stackTagCompound.getInteger("counter");
      if (!par2World.isRemote) {
        counter++;
        if (counter == 20)
          if (props.getCurrentMana() >= 10) {
            props.setCurrentMana(props.getCurrentMana() - 10);
          } else {
            par1ItemStack.stackTagCompound.setBoolean("Used", false);
            counter = 0;
          }  
        par1ItemStack.stackTagCompound.setInteger("counter", counter);
      } else if (counter >= 20) {
        int range = 80;
        player.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, AxisAlignedBB.getBoundingBox(player.posX - range, player.posY - range, player.posZ - range, player.posX + range, player.posY + range, player.posZ + range));
        List playerentities = player.worldObj.getEntitiesWithinAABB(EntityPlayer.class, AxisAlignedBB.getBoundingBox(player.posX - range, player.posY - range, player.posZ - range, player.posX + range, player.posY + range, player.posZ + range));
        List<Entity> animalentities = player.worldObj.getEntitiesWithinAABB(EntityAnimal.class, AxisAlignedBB.getBoundingBox(player.posX - range, player.posY - range, player.posZ - range, player.posX + range, player.posY + range, player.posZ + range));
        List<Entity> mobentities = player.worldObj.getEntitiesWithinAABB(EntityMob.class, AxisAlignedBB.getBoundingBox(player.posX - range, player.posY - range, player.posZ - range, player.posX + range, player.posY + range, player.posZ + range));
        Iterator<Entity> var9 = playerentities.iterator();
        while (var9.hasNext()) {
          Entity e = var9.next();
          if (props.trackAll) {
            String user = player.getUniqueID().toString();
            if (!e.getUniqueID().toString().equals(user))
              AlcoholMod.proxy.generateScentParticles(e, 0.0F, 0.0F, 1.0F); 
          } 
        } 
        var9 = animalentities.iterator();
        while (var9.hasNext()) {
          Entity e = var9.next();
          if (props.trackAll)
            AlcoholMod.proxy.generateScentParticles(e, 0.0F, 1.0F, 0.0F); 
        } 
        var9 = mobentities.iterator();
        while (var9.hasNext()) {
          Entity e = var9.next();
          if (props.trackAll)
            AlcoholMod.proxy.generateScentParticles(e, 1.0F, 0.0F, 0.0F); 
        } 
        counter = 0;
        par1ItemStack.stackTagCompound.setInteger("counter", counter);
      } 
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
      if (!Par2World.isRemote) {
        ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
        if (props.getClanName().contains("Neko"))
          if (props.getCurrentMana() >= 10) {
            if (!Par1ItemStack.stackTagCompound.getBoolean("Used")) {
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Neko Sense!"));
              Par1ItemStack.stackTagCompound.setBoolean("Used", true);
              props.settrackAll(true);
              PacketDispatcher.sendTo((IMessage)new SynctrackAllMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
              props.setCurrentMana(props.getCurrentMana() - 10);
            } else {
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("De-Active Neko Sense!"));
              Par1ItemStack.stackTagCompound.setBoolean("Used", false);
              props.settrackAll(false);
              PacketDispatcher.sendTo((IMessage)new SynctrackAllMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
            } 
          } else if (!Par2World.isRemote) {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You don't have enough chakra"));
          }  
      } 
    } else if (!Par2World.isRemote) {
      Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Are not The owner of this Item"));
    } 
    return Par1ItemStack;
  }
  
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_RED + "Chakra Cost: 10 initial then 10 per second");
  }
}

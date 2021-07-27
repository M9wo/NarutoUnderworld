package alcoholmod.Mathioks.FinalBijuu;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SyncBijuuKindMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncBijuuScaleMessage;
import alcoholmod.Mathioks.Final.JutsuItem;
import alcoholmod.Mathioks.PacketDispatcher;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class BijuuLocation extends JutsuItem {
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null) {
      if (par1ItemStack.stackTagCompound == null) {
        par1ItemStack.stackTagCompound = new NBTTagCompound();
        par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
        par1ItemStack.stackTagCompound.setBoolean("Location", false);
        par1ItemStack.stackTagCompound.setDouble("XpositionDestination", 0.0D);
        par1ItemStack.stackTagCompound.setDouble("YpositionDestination", 0.0D);
        par1ItemStack.stackTagCompound.setDouble("ZpositionDestination", 0.0D);
        par1ItemStack.stackTagCompound.setBoolean("start", false);
        par1ItemStack.stackTagCompound.setInteger("BijuuType", 0);
        par1ItemStack.stackTagCompound.setInteger("counter", 0);
      } 
      if (par1ItemStack.stackTagCompound != null && !par2World.isRemote) {
        EntityPlayer player = (EntityPlayer)par3Entity;
        ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)par3Entity);
        int counter = par1ItemStack.stackTagCompound.getInteger("counter");
        if (par1ItemStack.stackTagCompound.getBoolean("start") && !par2World.isRemote && par1ItemStack.getItemDamage() == 50 && counter > 0) {
          double XpositionDestination = par1ItemStack.stackTagCompound.getDouble("XpositionDestination");
          double YpositionDestination = par1ItemStack.stackTagCompound.getDouble("YpositionDestination");
          double ZpositionDestination = par1ItemStack.stackTagCompound.getDouble("ZpositionDestination");
          counter--;
          par1ItemStack.stackTagCompound.setInteger("counter", counter);
          if (counter == 160) {
            par2World.newExplosion((Entity)null, XpositionDestination, YpositionDestination + 4.0D, ZpositionDestination, 5.0F, false, true);
            par2World.newExplosion((Entity)null, XpositionDestination, YpositionDestination, ZpositionDestination, 5.0F, false, true);
          } 
          if (counter == 120) {
            par2World.newExplosion((Entity)null, XpositionDestination, YpositionDestination + 4.0D, ZpositionDestination, 6.0F, false, true);
            par2World.newExplosion((Entity)null, XpositionDestination, YpositionDestination, ZpositionDestination, 6.0F, false, true);
          } 
          if (counter == 80)
            par2World.newExplosion((Entity)null, XpositionDestination, YpositionDestination + 4.0D, ZpositionDestination, 8.0F, false, false); 
          if (counter == 40)
            par2World.newExplosion((Entity)null, XpositionDestination, YpositionDestination + 4.0D, ZpositionDestination, 10.0F, false, false); 
          if (counter == 1) {
            if (par1ItemStack.stackTagCompound.getInteger("BijuuType") == 1) {
              EntityShukaku entitysnowball = new EntityShukaku(par2World);
              entitysnowball.setPosition((int)XpositionDestination, (int)((EntityPlayer)par3Entity).posY, (int)ZpositionDestination);
              par2World.spawnEntityInWorld((Entity)entitysnowball);
            } 
            if (par1ItemStack.stackTagCompound.getInteger("BijuuType") == 2) {
              EntityMatatabi entitysnowball = new EntityMatatabi(par2World);
              entitysnowball.setPosition((int)XpositionDestination, (int)((EntityPlayer)par3Entity).posY, (int)ZpositionDestination);
              par2World.spawnEntityInWorld((Entity)entitysnowball);
            } 
            if (par1ItemStack.stackTagCompound.getInteger("BijuuType") == 3) {
              EntityIsobu entitysnowball = new EntityIsobu(par2World);
              entitysnowball.setPosition((int)XpositionDestination, (int)((EntityPlayer)par3Entity).posY, (int)ZpositionDestination);
              par2World.spawnEntityInWorld((Entity)entitysnowball);
            } 
            if (par1ItemStack.stackTagCompound.getInteger("BijuuType") == 4) {
              EntitySonGoku entitysnowball = new EntitySonGoku(par2World);
              entitysnowball.setPosition((int)XpositionDestination, (int)((EntityPlayer)par3Entity).posY, (int)ZpositionDestination);
              par2World.spawnEntityInWorld((Entity)entitysnowball);
            } 
            if (par1ItemStack.stackTagCompound.getInteger("BijuuType") == 5) {
              EntityKokuo entitysnowball = new EntityKokuo(par2World);
              entitysnowball.setPosition((int)XpositionDestination, (int)((EntityPlayer)par3Entity).posY, (int)ZpositionDestination);
              par2World.spawnEntityInWorld((Entity)entitysnowball);
            } 
            if (par1ItemStack.stackTagCompound.getInteger("BijuuType") == 6) {
              EntitySaiken entitysnowball = new EntitySaiken(par2World);
              entitysnowball.setPosition((int)XpositionDestination, (int)((EntityPlayer)par3Entity).posY, (int)ZpositionDestination);
              par2World.spawnEntityInWorld((Entity)entitysnowball);
            } 
            if (par1ItemStack.stackTagCompound.getInteger("BijuuType") == 7) {
              EntityChomei entitysnowball = new EntityChomei(par2World);
              entitysnowball.setPosition((int)XpositionDestination, (int)((EntityPlayer)par3Entity).posY, (int)ZpositionDestination);
              par2World.spawnEntityInWorld((Entity)entitysnowball);
            } 
            if (par1ItemStack.stackTagCompound.getInteger("BijuuType") == 8) {
              EntityGyuki entitysnowball = new EntityGyuki(par2World);
              entitysnowball.setPosition((int)XpositionDestination, (int)((EntityPlayer)par3Entity).posY, (int)ZpositionDestination);
              par2World.spawnEntityInWorld((Entity)entitysnowball);
            } 
            if (par1ItemStack.stackTagCompound.getInteger("BijuuType") == 9) {
              EntityKyuubi entitysnowball = new EntityKyuubi(par2World);
              entitysnowball.setPosition((int)XpositionDestination, (int)((EntityPlayer)par3Entity).posY, (int)ZpositionDestination);
              par2World.spawnEntityInWorld((Entity)entitysnowball);
            } 
            par1ItemStack.setItemDamage(100);
          } 
        } 
      } 
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer player) {
    if (!par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(player);
      if (!player.capabilities.isCreativeMode) {
        if (par1ItemStack.getItemDamage() == 0) {
          if (props.getIntelligence() >= 60) {
            int randX = player.worldObj.rand.nextInt(1);
            if (randX == 1)
              par1ItemStack.stackTagCompound.setDouble("XpositionDestination", player.posX - 500.0D - player.worldObj.rand.nextInt(1000)); 
            if (randX == 0)
              par1ItemStack.stackTagCompound.setDouble("XpositionDestination", player.posX + 500.0D + player.worldObj.rand.nextInt(1000)); 
            par1ItemStack.stackTagCompound.setDouble("YpositionDestination", player.posY);
            int randZ = player.worldObj.rand.nextInt(2);
            if (randZ == 1)
              par1ItemStack.stackTagCompound.setDouble("ZpositionDestination", player.posZ - 500.0D - player.worldObj.rand.nextInt(1000)); 
            if (randZ == 0)
              par1ItemStack.stackTagCompound.setDouble("ZpositionDestination", player.posZ + 500.0D + player.worldObj.rand.nextInt(1000)); 
            int randType = player.worldObj.rand.nextInt(9) + 1;
            par1ItemStack.stackTagCompound.setInteger("BijuuType", randType);
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("You deciphered the writings, look at the item details for more info."));
            par1ItemStack.setItemDamage(50);
            return par1ItemStack;
          } 
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("You need 60 intelligence to decipher this writing"));
          return par1ItemStack;
        } 
        if (par1ItemStack.getItemDamage() == 50) {
          double XpositionDestination = par1ItemStack.stackTagCompound.getDouble("XpositionDestination");
          double YpositionDestination = par1ItemStack.stackTagCompound.getDouble("YpositionDestination");
          double ZpositionDestination = par1ItemStack.stackTagCompound.getDouble("ZpositionDestination");
          if (Math.abs(player.posX - XpositionDestination) < 10.0D && Math.abs(player.posY - YpositionDestination) < 10.0D && Math.abs(player.posZ - ZpositionDestination) < 10.0D) {
            par1ItemStack.stackTagCompound.setInteger("counter", 200);
            par1ItemStack.stackTagCompound.setBoolean("start", true);
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("A massive chakra presence is approaching, best get some distance!!"));
            return par1ItemStack;
          } 
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("X-Position: " + (int)player.posX + " X-Location: " + (int)XpositionDestination));
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("Y-Position: " + (int)player.posY + " Y-Target: " + (int)YpositionDestination));
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("Z-Position: " + (int)player.posZ + " Z-Location: " + (int)ZpositionDestination));
          return par1ItemStack;
        } 
        if (par1ItemStack.getItemDamage() == 100 && props.getBijuuScale() == 0)
          if (props.getBijuuKind() == 0) {
            if (props.getSize() == 0.0D) {
              if (props.getHealth() >= 300) {
                if (props.getKinjutsu() >= 80) {
                  if (player.inventory.hasItem(AlcoholMod.DefeatShukaku) && par1ItemStack.stackTagCompound.getInteger("BijuuType") == 1) {
                    props.setBijuuScale(1);
                    PacketDispatcher.sendTo((IMessage)new SyncBijuuScaleMessage(player), (EntityPlayerMP)player);
                    props.setBijuuKind(1);
                    PacketDispatcher.sendTo((IMessage)new SyncBijuuKindMessage(player), (EntityPlayerMP)player);
                    player.inventory.consumeInventoryItem(AlcoholMod.DefeatShukaku);
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have become the 1-Tails Jinchuriki"));
                    par1ItemStack.stackSize--;
                    return par1ItemStack;
                  } 
                  if (player.inventory.hasItem(AlcoholMod.DefeatMatatabi) && par1ItemStack.stackTagCompound.getInteger("BijuuType") == 2) {
                    props.setBijuuScale(1);
                    PacketDispatcher.sendTo((IMessage)new SyncBijuuScaleMessage(player), (EntityPlayerMP)player);
                    props.setBijuuKind(2);
                    PacketDispatcher.sendTo((IMessage)new SyncBijuuKindMessage(player), (EntityPlayerMP)player);
                    player.inventory.consumeInventoryItem(AlcoholMod.DefeatMatatabi);
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have become the 2-Tails Jinchuriki"));
                    par1ItemStack.stackSize--;
                    return par1ItemStack;
                  } 
                  if (player.inventory.hasItem(AlcoholMod.DefeatIsobu) && par1ItemStack.stackTagCompound.getInteger("BijuuType") == 3) {
                    props.setBijuuScale(1);
                    PacketDispatcher.sendTo((IMessage)new SyncBijuuScaleMessage(player), (EntityPlayerMP)player);
                    props.setBijuuKind(3);
                    PacketDispatcher.sendTo((IMessage)new SyncBijuuKindMessage(player), (EntityPlayerMP)player);
                    player.inventory.consumeInventoryItem(AlcoholMod.DefeatIsobu);
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have become the 3-Tails Jinchuriki"));
                    par1ItemStack.stackSize--;
                    return par1ItemStack;
                  } 
                  if (player.inventory.hasItem(AlcoholMod.DefeatSonGoku) && par1ItemStack.stackTagCompound.getInteger("BijuuType") == 4) {
                    props.setBijuuScale(1);
                    PacketDispatcher.sendTo((IMessage)new SyncBijuuScaleMessage(player), (EntityPlayerMP)player);
                    props.setBijuuKind(4);
                    PacketDispatcher.sendTo((IMessage)new SyncBijuuKindMessage(player), (EntityPlayerMP)player);
                    player.inventory.consumeInventoryItem(AlcoholMod.DefeatSonGoku);
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have become the 4-Tails Jinchuriki"));
                    par1ItemStack.stackSize--;
                    return par1ItemStack;
                  } 
                  if (player.inventory.hasItem(AlcoholMod.DefeatKokuo) && par1ItemStack.stackTagCompound.getInteger("BijuuType") == 5) {
                    props.setBijuuScale(1);
                    PacketDispatcher.sendTo((IMessage)new SyncBijuuScaleMessage(player), (EntityPlayerMP)player);
                    props.setBijuuKind(5);
                    PacketDispatcher.sendTo((IMessage)new SyncBijuuKindMessage(player), (EntityPlayerMP)player);
                    player.inventory.consumeInventoryItem(AlcoholMod.DefeatKokuo);
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have become the 5-Tails Jinchuriki"));
                    par1ItemStack.stackSize--;
                    return par1ItemStack;
                  } 
                  if (player.inventory.hasItem(AlcoholMod.DefeatSaiken) && par1ItemStack.stackTagCompound.getInteger("BijuuType") == 6) {
                    props.setBijuuScale(1);
                    PacketDispatcher.sendTo((IMessage)new SyncBijuuScaleMessage(player), (EntityPlayerMP)player);
                    props.setBijuuKind(6);
                    PacketDispatcher.sendTo((IMessage)new SyncBijuuKindMessage(player), (EntityPlayerMP)player);
                    player.inventory.consumeInventoryItem(AlcoholMod.DefeatSaiken);
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have become the 6-Tails Jinchuriki"));
                    par1ItemStack.stackSize--;
                    return par1ItemStack;
                  } 
                  if (player.inventory.hasItem(AlcoholMod.DefeatChomei) && par1ItemStack.stackTagCompound.getInteger("BijuuType") == 7) {
                    props.setBijuuScale(1);
                    PacketDispatcher.sendTo((IMessage)new SyncBijuuScaleMessage(player), (EntityPlayerMP)player);
                    props.setBijuuKind(7);
                    PacketDispatcher.sendTo((IMessage)new SyncBijuuKindMessage(player), (EntityPlayerMP)player);
                    player.inventory.consumeInventoryItem(AlcoholMod.DefeatChomei);
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have become the 7-Tails Jinchuriki"));
                    par1ItemStack.stackSize--;
                    return par1ItemStack;
                  } 
                  if (player.inventory.hasItem(AlcoholMod.DefeatGyuki) && par1ItemStack.stackTagCompound.getInteger("BijuuType") == 8) {
                    props.setBijuuScale(1);
                    PacketDispatcher.sendTo((IMessage)new SyncBijuuScaleMessage(player), (EntityPlayerMP)player);
                    props.setBijuuKind(8);
                    PacketDispatcher.sendTo((IMessage)new SyncBijuuKindMessage(player), (EntityPlayerMP)player);
                    player.inventory.consumeInventoryItem(AlcoholMod.DefeatGyuki);
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have become the 8-Tails Jinchuriki"));
                    par1ItemStack.stackSize--;
                    return par1ItemStack;
                  } 
                  if (player.inventory.hasItem(AlcoholMod.DefeatKurama) && par1ItemStack.stackTagCompound.getInteger("BijuuType") == 9) {
                    props.setBijuuScale(1);
                    PacketDispatcher.sendTo((IMessage)new SyncBijuuScaleMessage(player), (EntityPlayerMP)player);
                    props.setBijuuKind(9);
                    PacketDispatcher.sendTo((IMessage)new SyncBijuuKindMessage(player), (EntityPlayerMP)player);
                    player.inventory.consumeInventoryItem(AlcoholMod.DefeatKurama);
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have become the 9-Tails Jinchuriki"));
                    par1ItemStack.stackSize--;
                    return par1ItemStack;
                  } 
                } else {
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText("You need at least 80 Kinjutsu to do the sealing"));
                } 
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You need at least 300 Medical ninjutsu to do the sealing"));
              } 
            } else {
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You are already a jinchuriki"));
            } 
          } else {
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("You are already a jinchuriki"));
          }  
      } 
    } 
    return par1ItemStack;
  }
  
  public boolean onLeftClickEntity(ItemStack par1ItemStack, EntityPlayer playermoi, Entity player1) {
    if (par1ItemStack.getItemDamage() == 100 && !playermoi.worldObj.isRemote && player1 instanceof EntityPlayer) {
      ExtendedPlayer propsme = ExtendedPlayer.get(playermoi);
      EntityPlayer player = (EntityPlayer)player1;
      ExtendedPlayer props = ExtendedPlayer.get(player);
      if (props.getBijuuScale() == 0)
        if (props.getBijuuKind() == 0) {
          if (props.getSize() == 0.0D) {
            if (propsme.getHealth() >= 300) {
              if (propsme.getKinjutsu() >= 80) {
                if (playermoi.inventory.hasItem(AlcoholMod.DefeatShukaku) && par1ItemStack.stackTagCompound.getInteger("BijuuType") == 1) {
                  props.setBijuuScale(1);
                  PacketDispatcher.sendTo((IMessage)new SyncBijuuScaleMessage(player), (EntityPlayerMP)player);
                  props.setBijuuKind(1);
                  PacketDispatcher.sendTo((IMessage)new SyncBijuuKindMessage(player), (EntityPlayerMP)player);
                  playermoi.inventory.consumeInventoryItem(AlcoholMod.DefeatShukaku);
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have become the 1-Tails Jinchuriki"));
                  par1ItemStack.stackSize--;
                } 
                if (playermoi.inventory.hasItem(AlcoholMod.DefeatMatatabi) && par1ItemStack.stackTagCompound.getInteger("BijuuType") == 2) {
                  props.setBijuuScale(1);
                  PacketDispatcher.sendTo((IMessage)new SyncBijuuScaleMessage(player), (EntityPlayerMP)player);
                  props.setBijuuKind(2);
                  PacketDispatcher.sendTo((IMessage)new SyncBijuuKindMessage(player), (EntityPlayerMP)player);
                  playermoi.inventory.consumeInventoryItem(AlcoholMod.DefeatMatatabi);
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have become the 2-Tails Jinchuriki"));
                  par1ItemStack.stackSize--;
                } 
                if (playermoi.inventory.hasItem(AlcoholMod.DefeatIsobu) && par1ItemStack.stackTagCompound.getInteger("BijuuType") == 3) {
                  props.setBijuuScale(1);
                  PacketDispatcher.sendTo((IMessage)new SyncBijuuScaleMessage(player), (EntityPlayerMP)player);
                  props.setBijuuKind(3);
                  PacketDispatcher.sendTo((IMessage)new SyncBijuuKindMessage(player), (EntityPlayerMP)player);
                  playermoi.inventory.consumeInventoryItem(AlcoholMod.DefeatIsobu);
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have become the 3-Tails Jinchuriki"));
                  par1ItemStack.stackSize--;
                } 
                if (playermoi.inventory.hasItem(AlcoholMod.DefeatSonGoku) && par1ItemStack.stackTagCompound.getInteger("BijuuType") == 4) {
                  props.setBijuuScale(1);
                  PacketDispatcher.sendTo((IMessage)new SyncBijuuScaleMessage(player), (EntityPlayerMP)player);
                  props.setBijuuKind(4);
                  PacketDispatcher.sendTo((IMessage)new SyncBijuuKindMessage(player), (EntityPlayerMP)player);
                  playermoi.inventory.consumeInventoryItem(AlcoholMod.DefeatSonGoku);
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have become the 4-Tails Jinchuriki"));
                  par1ItemStack.stackSize--;
                } 
                if (playermoi.inventory.hasItem(AlcoholMod.DefeatKokuo) && par1ItemStack.stackTagCompound.getInteger("BijuuType") == 5) {
                  props.setBijuuScale(1);
                  PacketDispatcher.sendTo((IMessage)new SyncBijuuScaleMessage(player), (EntityPlayerMP)player);
                  props.setBijuuKind(5);
                  PacketDispatcher.sendTo((IMessage)new SyncBijuuKindMessage(player), (EntityPlayerMP)player);
                  playermoi.inventory.consumeInventoryItem(AlcoholMod.DefeatKokuo);
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have become the 5-Tails Jinchuriki"));
                  par1ItemStack.stackSize--;
                } 
                if (playermoi.inventory.hasItem(AlcoholMod.DefeatSaiken) && par1ItemStack.stackTagCompound.getInteger("BijuuType") == 6) {
                  props.setBijuuScale(1);
                  PacketDispatcher.sendTo((IMessage)new SyncBijuuScaleMessage(player), (EntityPlayerMP)player);
                  props.setBijuuKind(6);
                  PacketDispatcher.sendTo((IMessage)new SyncBijuuKindMessage(player), (EntityPlayerMP)player);
                  playermoi.inventory.consumeInventoryItem(AlcoholMod.DefeatSaiken);
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have become the 6-Tails Jinchuriki"));
                  par1ItemStack.stackSize--;
                } 
                if (playermoi.inventory.hasItem(AlcoholMod.DefeatChomei) && par1ItemStack.stackTagCompound.getInteger("BijuuType") == 7) {
                  props.setBijuuScale(1);
                  PacketDispatcher.sendTo((IMessage)new SyncBijuuScaleMessage(player), (EntityPlayerMP)player);
                  props.setBijuuKind(7);
                  PacketDispatcher.sendTo((IMessage)new SyncBijuuKindMessage(player), (EntityPlayerMP)player);
                  playermoi.inventory.consumeInventoryItem(AlcoholMod.DefeatChomei);
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have become the 7-Tails Jinchuriki"));
                  par1ItemStack.stackSize--;
                } 
                if (playermoi.inventory.hasItem(AlcoholMod.DefeatGyuki) && par1ItemStack.stackTagCompound.getInteger("BijuuType") == 8) {
                  props.setBijuuScale(1);
                  PacketDispatcher.sendTo((IMessage)new SyncBijuuScaleMessage(player), (EntityPlayerMP)player);
                  props.setBijuuKind(8);
                  PacketDispatcher.sendTo((IMessage)new SyncBijuuKindMessage(player), (EntityPlayerMP)player);
                  playermoi.inventory.consumeInventoryItem(AlcoholMod.DefeatGyuki);
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have become the 8-Tails Jinchuriki"));
                  par1ItemStack.stackSize--;
                } 
                if (playermoi.inventory.hasItem(AlcoholMod.DefeatKurama) && par1ItemStack.stackTagCompound.getInteger("BijuuType") == 9) {
                  props.setBijuuScale(1);
                  PacketDispatcher.sendTo((IMessage)new SyncBijuuScaleMessage(player), (EntityPlayerMP)player);
                  props.setBijuuKind(9);
                  PacketDispatcher.sendTo((IMessage)new SyncBijuuKindMessage(player), (EntityPlayerMP)player);
                  playermoi.inventory.consumeInventoryItem(AlcoholMod.DefeatKurama);
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have become the 9-Tails Jinchuriki"));
                  par1ItemStack.stackSize--;
                } 
              } else {
                playermoi.addChatComponentMessage((IChatComponent)new ChatComponentText("You need at least 80 Kinjutsu to do the sealing"));
              } 
            } else {
              playermoi.addChatComponentMessage((IChatComponent)new ChatComponentText("You need at least 300 Medical ninjutsu to do the sealing"));
            } 
          } else {
            playermoi.addChatComponentMessage((IChatComponent)new ChatComponentText("This player is already a jinchuriki"));
          } 
        } else {
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("This player is already a jinchuriki"));
        }  
    } 
    return false;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    if (par1ItemStack.stackTagCompound != null) {
      ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
      if (par1ItemStack.getItemDamage() == 0) {
        par3List.add(EnumChatFormatting.RED + "Intelligence needed: 60");
        par3List.add(EnumChatFormatting.AQUA + "A chart containing info about the");
        par3List.add(EnumChatFormatting.AQUA + "wereabouts of a Tailed Beast");
      } 
      if (par1ItemStack.getItemDamage() == 50) {
        par3List.add(EnumChatFormatting.AQUA + "Location X: " + par1ItemStack.stackTagCompound.getDouble("XpositionDestination"));
        par3List.add(EnumChatFormatting.AQUA + "Location Y: " + par1ItemStack.stackTagCompound.getDouble("YpositionDestination"));
        par3List.add(EnumChatFormatting.AQUA + "Location Z: " + par1ItemStack.stackTagCompound.getDouble("ZpositionDestination"));
        if (par1ItemStack.stackTagCompound.getInteger("BijuuType") == 1)
          par3List.add(EnumChatFormatting.AQUA + "Chart leading to: Shukaku"); 
        if (par1ItemStack.stackTagCompound.getInteger("BijuuType") == 2)
          par3List.add(EnumChatFormatting.AQUA + "Chart leading to: Matatabi"); 
        if (par1ItemStack.stackTagCompound.getInteger("BijuuType") == 3)
          par3List.add(EnumChatFormatting.AQUA + "Chart leading to: Isobu"); 
        if (par1ItemStack.stackTagCompound.getInteger("BijuuType") == 4)
          par3List.add(EnumChatFormatting.AQUA + "Chart leading to: Son Goku"); 
        if (par1ItemStack.stackTagCompound.getInteger("BijuuType") == 5)
          par3List.add(EnumChatFormatting.AQUA + "Chart leading to: Kokuo"); 
        if (par1ItemStack.stackTagCompound.getInteger("BijuuType") == 6)
          par3List.add(EnumChatFormatting.AQUA + "Chart leading to: Saiken"); 
        if (par1ItemStack.stackTagCompound.getInteger("BijuuType") == 7)
          par3List.add(EnumChatFormatting.AQUA + "Chart leading to: Chomei"); 
        if (par1ItemStack.stackTagCompound.getInteger("BijuuType") == 8)
          par3List.add(EnumChatFormatting.AQUA + "Chart leading to: Gyuki"); 
        if (par1ItemStack.stackTagCompound.getInteger("BijuuType") == 9)
          par3List.add(EnumChatFormatting.AQUA + "Chart leading to: Kurama"); 
      } 
    } 
  }
}

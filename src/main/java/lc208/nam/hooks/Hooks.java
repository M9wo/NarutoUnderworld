package lc208.nam.hooks;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SyncClanMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncKenjutsuMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncNinjutsuMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncShurikenjutsuMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSpeedMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncWaterReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncWindReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SynciceReleaseMessage;
import alcoholmod.Mathioks.PacketDispatcher;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import java.util.Random;
import lc208.nam.hooklib.asm.Hook;
import lc208.nam.hooklib.asm.ReturnCondition;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFire;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import nhm.coffee.NarutoHelperMod.ExAddedItems;
import nhm.coffee.NarutoHelperMod.items.Clans.SetHozuki;
import nhm.coffee.NarutoHelperMod.items.Clans.SetYuki;
import nhm.coffee.NarutoHelperMod.items.RandomClan;
import nhm.coffee.NarutoHelperMod.libs.EXPacketDispatcher;
import nhm.coffee.NarutoHelperMod.libs.sync.SyncHozukiMessage;
import nhm.coffee.NarutoHelperMod.libs.sync.SyncYukiMessage;
import nhm.coffee.NarutoHelperMod.util.EXExtendedProperties;
import noppes.npcs.blocks.BlockChair;
import noppes.npcs.entity.EntityChairMount;

public class Hooks {
  @Hook(returnCondition = ReturnCondition.ALWAYS)
  public static ItemStack onItemRightClick(SetYuki yuki, ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      EXExtendedProperties props2 = EXExtendedProperties.get(Par3EntityPlayer);
      props.setClan(20);
      PacketDispatcher.sendTo((IMessage)new SyncClanMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
      if (props2.Yuki == 0) {
        props2.setYuki(1);
        EXPacketDispatcher.sendTo((IMessage)new SyncYukiMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
        props.Ninjutsu += 75;
        PacketDispatcher.sendTo((IMessage)new SyncNinjutsuMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
        props.Shurikenjutsu += 15;
        PacketDispatcher.sendTo((IMessage)new SyncShurikenjutsuMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
        props.Speed += 0.125D;
        PacketDispatcher.sendTo((IMessage)new SyncSpeedMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
        int rand7 = Par2World.rand.nextInt(10);
        if (rand7 == 0) {
          PacketDispatcher.sendTo((IMessage)new SyncWindReleaseMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
          PacketDispatcher.sendTo((IMessage)new SyncWaterReleaseMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
          PacketDispatcher.sendTo((IMessage)new SynciceReleaseMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
          Par3EntityPlayer.addChatMessage((IChatComponent)new ChatComponentText("You are part of the Yuki Clan"));
          if (props.WindRelease == 0) {
            props.setWindRelease(1);
            Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWindRelease));
            Par3EntityPlayer.inventoryContainer.detectAndSendChanges();
            Par3EntityPlayer.addChatMessage((IChatComponent)new ChatComponentText("As a Yuki you have natural affinity for Wind Release"));
          } else {
            Par3EntityPlayer.addChatMessage((IChatComponent)new ChatComponentText("You already know Wind Release!"));
          } 
          if (props.WaterRelease == 0) {
            props.setWaterRelease(1);
            Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWaterRelease));
            Par3EntityPlayer.inventoryContainer.detectAndSendChanges();
            Par3EntityPlayer.addChatMessage((IChatComponent)new ChatComponentText("As a Yuki you have natural affinity for Water Release"));
          } else {
            Par3EntityPlayer.addChatMessage((IChatComponent)new ChatComponentText("You already know Water Release!"));
          } 
          if (props.iceRelease == 0) {
            props.seticeRelease(1);
            Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerIceRelease));
            Par3EntityPlayer.inventoryContainer.detectAndSendChanges();
            Par3EntityPlayer.addChatMessage((IChatComponent)new ChatComponentText("As a Yuki with extraordinary strong DNA,"));
            Par3EntityPlayer.addChatMessage((IChatComponent)new ChatComponentText("You are one of the few Shinobi in block"));
            Par3EntityPlayer.addChatMessage((IChatComponent)new ChatComponentText("world to unlock the Ice Release Kekkei genkai!"));
          } else {
            Par3EntityPlayer.addChatMessage((IChatComponent)new ChatComponentText("You already know Ice Release!"));
          } 
        } 
        if (rand7 > 0 && rand7 < 6) {
          PacketDispatcher.sendTo((IMessage)new SyncWindReleaseMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
          PacketDispatcher.sendTo((IMessage)new SyncWaterReleaseMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
          PacketDispatcher.sendTo((IMessage)new SynciceReleaseMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
          Par3EntityPlayer.addChatMessage((IChatComponent)new ChatComponentText("You are part of the Yuki Clan"));
          if (props.WindRelease == 0) {
            props.setWindRelease(1);
            Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWindRelease));
            Par3EntityPlayer.inventoryContainer.detectAndSendChanges();
            Par3EntityPlayer.addChatMessage((IChatComponent)new ChatComponentText("As a Yuki you have natural affinity for Wind Release"));
          } else {
            Par3EntityPlayer.addChatMessage((IChatComponent)new ChatComponentText("You already know Wind Release!"));
          } 
          if (props.WaterRelease == 0) {
            props.setWaterRelease(1);
            Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWaterRelease));
            Par3EntityPlayer.inventoryContainer.detectAndSendChanges();
            Par3EntityPlayer.addChatMessage((IChatComponent)new ChatComponentText("As a Yuki you have natural affinity for Water Release"));
          } else {
            Par3EntityPlayer.addChatMessage((IChatComponent)new ChatComponentText("You already know Water Release!"));
          } 
          if (props.iceRelease == 0) {
            props.seticeRelease(1);
            Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerIceRelease));
            Par3EntityPlayer.inventoryContainer.detectAndSendChanges();
            Par3EntityPlayer.addChatMessage((IChatComponent)new ChatComponentText("As a Yuki with extraordinary strong DNA,"));
            Par3EntityPlayer.addChatMessage((IChatComponent)new ChatComponentText("You are one of the few Shinobi in block"));
            Par3EntityPlayer.addChatMessage((IChatComponent)new ChatComponentText("world to unlock the Ice Release Kekkei genkai!"));
          } else {
            Par3EntityPlayer.addChatMessage((IChatComponent)new ChatComponentText("You already know Ice Release!"));
          } 
        } 
        if (rand7 > 5 && rand7 < 10) {
          PacketDispatcher.sendTo((IMessage)new SyncWindReleaseMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
          PacketDispatcher.sendTo((IMessage)new SyncWaterReleaseMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
          PacketDispatcher.sendTo((IMessage)new SynciceReleaseMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
          Par3EntityPlayer.addChatMessage((IChatComponent)new ChatComponentText("You are part of the Yuki Clan"));
          if (props.WindRelease == 0) {
            props.setWindRelease(1);
            Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWindRelease));
            Par3EntityPlayer.inventoryContainer.detectAndSendChanges();
            Par3EntityPlayer.addChatMessage((IChatComponent)new ChatComponentText("As a Yuki you have natural affinity for Wind Release"));
          } else {
            Par3EntityPlayer.addChatMessage((IChatComponent)new ChatComponentText("You already know Wind Release!"));
          } 
          if (props.WaterRelease == 0) {
            props.setWaterRelease(1);
            Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWaterRelease));
            Par3EntityPlayer.inventoryContainer.detectAndSendChanges();
            Par3EntityPlayer.addChatMessage((IChatComponent)new ChatComponentText("As a Yuki you have natural affinity for Water Release"));
          } else {
            Par3EntityPlayer.addChatMessage((IChatComponent)new ChatComponentText("You already know Water Release!"));
          } 
          if (props.iceRelease == 0) {
            props.seticeRelease(1);
            Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerIceRelease));
            Par3EntityPlayer.inventoryContainer.detectAndSendChanges();
            Par3EntityPlayer.addChatMessage((IChatComponent)new ChatComponentText("As a Yuki with extraordinary strong DNA,"));
            Par3EntityPlayer.addChatMessage((IChatComponent)new ChatComponentText("You are one of the few Shinobi in block"));
            Par3EntityPlayer.addChatMessage((IChatComponent)new ChatComponentText("world to unlock the Ice Release Kekkei genkai!"));
          } else {
            Par3EntityPlayer.addChatMessage((IChatComponent)new ChatComponentText("You already know Ice Release!"));
          } 
        } 
        if (Par3EntityPlayer.inventory.hasItem(ExAddedItems.SetYuki)) {
          Par3EntityPlayer.inventory.consumeInventoryItem(ExAddedItems.SetYuki);
          Par3EntityPlayer.inventoryContainer.detectAndSendChanges();
        } 
      } 
    } else {
      Par3EntityPlayer.addChatMessage((IChatComponent)new ChatComponentText("You are part of the Yuki Clan!"));
    } 
    return Par1ItemStack;
  }
  
  @Hook(returnCondition = ReturnCondition.ALWAYS)
  public static ItemStack onItemRightClick(SetHozuki h, ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      EXExtendedProperties props2 = EXExtendedProperties.get(Par3EntityPlayer);
      props.setClan(6);
      PacketDispatcher.sendTo((IMessage)new SyncClanMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
      Par3EntityPlayer.addChatMessage((IChatComponent)new ChatComponentText("You are part of the Hozuki Clan"));
      if (props2.Hozuki == 0) {
        props2.setHozuki(1);
        props.Ninjutsu += 100;
        PacketDispatcher.sendTo((IMessage)new SyncNinjutsuMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
        props.Kenjutsu++;
        PacketDispatcher.sendTo((IMessage)new SyncKenjutsuMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
        Par3EntityPlayer.addChatMessage((IChatComponent)new ChatComponentText("As a Hozuki you have natural affinity for Water Release"));
        EXPacketDispatcher.sendTo((IMessage)new SyncHozukiMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
        Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerHozuki));
        Par3EntityPlayer.inventoryContainer.detectAndSendChanges();
      } else {
        Par3EntityPlayer.addChatMessage((IChatComponent)new ChatComponentText("You already know the ways to the Hozuki"));
      } 
      if (props.WaterRelease == 0) {
        props.setWaterRelease(1);
        PacketDispatcher.sendTo((IMessage)new SyncWaterReleaseMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
        Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWaterRelease));
        Par3EntityPlayer.inventoryContainer.detectAndSendChanges();
      } else {
        Par3EntityPlayer.addChatMessage((IChatComponent)new ChatComponentText("You already know Water Release!"));
      } 
      if (Par3EntityPlayer.inventory.hasItem(ExAddedItems.SetHozuki)) {
        Par3EntityPlayer.inventory.consumeInventoryItem(ExAddedItems.SetHozuki);
        Par3EntityPlayer.inventoryContainer.detectAndSendChanges();
      } 
    } 
    return Par1ItemStack;
  }
  
  @Hook(returnCondition = ReturnCondition.ALWAYS)
  public static void onBlockExploded(Block block, World world, int x, int y, int z, Explosion explosion) {
    block.onBlockDestroyedByExplosion(world, x, y, z, explosion);
  }
  
  @Hook(returnCondition = ReturnCondition.ALWAYS)
  public static boolean canDropFromExplosion(Block block, Explosion p_149659_1_) {
    return false;
  }
  
  public static int ticksExisted = 0;
  
  @Hook(returnCondition = ReturnCondition.ALWAYS)
  public static void updateTick(BlockFire block, World p_149674_1_, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random p_149674_5_) {
    if (p_149674_1_.getGameRules().getGameRuleBooleanValue("doFireTick")) {
      ticksExisted++;
      if (ticksExisted >= 1) {
        p_149674_1_.setBlockToAir(p_149674_2_, p_149674_3_, p_149674_4_);
        ticksExisted = 0;
      } 
    } 
  }
  
  @Hook(returnCondition = ReturnCondition.ALWAYS)
  public static boolean MountBlock(BlockChair block, World world, int x, int y, int z, EntityPlayer player) {
    if (world.isRemote)
      return true; 
    if (player != null) {
      EntityChairMount mount = new EntityChairMount(world);
      mount.setPosition((x + 0.5F), y, z + 0.5D);
      world.spawnEntityInWorld((Entity)mount);
      player.mountEntity((Entity)mount);
      return true;
    } 
    return false;
  }
  
  @Hook(returnCondition = ReturnCondition.ALWAYS)
  public static ItemStack onItemRightClick(RandomClan item, ItemStack itemStack, World world, EntityPlayer Player) {
    ExtendedPlayer props = ExtendedPlayer.get(Player);
    int rand3 = world.rand.nextInt(22) + 1;
    if (props.getClan() != 0) {
      props.setClan(0);
      Player.addChatMessage((IChatComponent)new ChatComponentText("Reset!"));
    } else {
      if (!world.isRemote) {
        if (rand3 == 1) {
          Player.inventory.addItemStackToInventory(new ItemStack(ExAddedItems.SetUchiha));
          Player.inventoryContainer.detectAndSendChanges();
          Player.addChatMessage((IChatComponent)new ChatComponentText("You got the Uchiha Clan!"));
          Player.addChatMessage((IChatComponent)new ChatComponentText("(Right click the Clan tag to join.)"));
        } 
        if (rand3 == 2) {
          Player.inventory.addItemStackToInventory(new ItemStack(ExAddedItems.SetUzumaki));
          Player.inventoryContainer.detectAndSendChanges();
          Player.addChatMessage((IChatComponent)new ChatComponentText("You got the Uzumaki Clan!"));
          Player.addChatMessage((IChatComponent)new ChatComponentText("(Right click the Clan tag to join.)"));
        } 
        if (rand3 == 3) {
          Player.inventory.addItemStackToInventory(new ItemStack(ExAddedItems.SetAburame));
          Player.inventoryContainer.detectAndSendChanges();
          Player.addChatMessage((IChatComponent)new ChatComponentText("You got the Aburame Clan!"));
          Player.addChatMessage((IChatComponent)new ChatComponentText("(Right click the Clan tag to join.)"));
        } 
        if (rand3 == 4) {
          Player.inventory.addItemStackToInventory(new ItemStack(ExAddedItems.SetHatake));
          Player.inventoryContainer.detectAndSendChanges();
          Player.addChatMessage((IChatComponent)new ChatComponentText("You got the Hatake Clan!"));
          Player.addChatMessage((IChatComponent)new ChatComponentText("(Right click the Clan tag to join.)"));
        } 
        if (rand3 == 5) {
          Player.inventory.addItemStackToInventory(new ItemStack(ExAddedItems.SetHatake));
          Player.inventoryContainer.detectAndSendChanges();
          Player.addChatMessage((IChatComponent)new ChatComponentText("You got the Hatake Clan!"));
          Player.addChatMessage((IChatComponent)new ChatComponentText("(Right click the Clan tag to join.)"));
        } 
        if (rand3 == 6) {
          Player.inventory.addItemStackToInventory(new ItemStack(ExAddedItems.SetHozuki));
          Player.inventoryContainer.detectAndSendChanges();
          Player.addChatMessage((IChatComponent)new ChatComponentText("You got the Hozuki Clan!"));
          Player.addChatMessage((IChatComponent)new ChatComponentText("(Right click the Clan tag to join.)"));
        } 
        if (rand3 == 7) {
          Player.inventory.addItemStackToInventory(new ItemStack(ExAddedItems.SetHyuga));
          Player.inventoryContainer.detectAndSendChanges();
          Player.addChatMessage((IChatComponent)new ChatComponentText("You got the Hyuga Clan!"));
          Player.addChatMessage((IChatComponent)new ChatComponentText("(Right click the Clan tag to join.)"));
        } 
        if (rand3 == 8) {
          Player.inventory.addItemStackToInventory(new ItemStack(ExAddedItems.SetIburi));
          Player.inventoryContainer.detectAndSendChanges();
          Player.addChatMessage((IChatComponent)new ChatComponentText("You got the Iburi Clan!"));
          Player.addChatMessage((IChatComponent)new ChatComponentText("(Right click the Clan tag to join.)"));
        } 
        if (rand3 == 9) {
          Player.inventory.addItemStackToInventory(new ItemStack(ExAddedItems.SetInuzuka));
          Player.inventoryContainer.detectAndSendChanges();
          Player.addChatMessage((IChatComponent)new ChatComponentText("You got the Inuzuka Clan!"));
          Player.addChatMessage((IChatComponent)new ChatComponentText("(Right click the Clan tag to join.)"));
        } 
        if (rand3 == 10) {
          Player.inventory.addItemStackToInventory(new ItemStack(ExAddedItems.SetJugo));
          Player.inventoryContainer.detectAndSendChanges();
          Player.addChatMessage((IChatComponent)new ChatComponentText("You got the Jugo Clan!"));
          Player.addChatMessage((IChatComponent)new ChatComponentText("(Right click the Clan tag to join.)"));
        } 
      } 
      if (rand3 == 11) {
        Player.inventory.addItemStackToInventory(new ItemStack(ExAddedItems.SetKaguya));
        Player.inventoryContainer.detectAndSendChanges();
        Player.addChatMessage((IChatComponent)new ChatComponentText("You got the Kaguya Clan!"));
        Player.addChatMessage((IChatComponent)new ChatComponentText("(Right click the Clan tag to join.)"));
      } 
      if (rand3 == 12) {
        Player.inventory.addItemStackToInventory(new ItemStack(ExAddedItems.SetKurama));
        Player.inventoryContainer.detectAndSendChanges();
        Player.addChatMessage((IChatComponent)new ChatComponentText("You got the Kurama Clan!"));
        Player.addChatMessage((IChatComponent)new ChatComponentText("(Right click the Clan tag to join.)"));
      } 
      if (rand3 == 13) {
        Player.inventory.addItemStackToInventory(new ItemStack(ExAddedItems.SetTsuchigumo));
        Player.inventoryContainer.detectAndSendChanges();
        Player.addChatMessage((IChatComponent)new ChatComponentText("You got the Tsuchigumo Clan!"));
        Player.addChatMessage((IChatComponent)new ChatComponentText("(Right click the Clan tag to join.)"));
      } 
      if (rand3 == 14) {
        Player.inventory.addItemStackToInventory(new ItemStack(ExAddedItems.SetAburame));
        Player.inventoryContainer.detectAndSendChanges();
        Player.addChatMessage((IChatComponent)new ChatComponentText("You got the Aburame Clan!"));
        Player.addChatMessage((IChatComponent)new ChatComponentText("(Right click the Clan tag to join.)"));
      } 
      if (rand3 == 17) {
        Player.inventory.addItemStackToInventory(new ItemStack(ExAddedItems.SetSarutobi));
        Player.inventoryContainer.detectAndSendChanges();
        Player.addChatMessage((IChatComponent)new ChatComponentText("You got the Sarutobi Clan!"));
        Player.addChatMessage((IChatComponent)new ChatComponentText("(Right click the Clan tag to join.)"));
      } 
      if (rand3 == 18) {
        Player.inventory.addItemStackToInventory(new ItemStack(ExAddedItems.SetFuhma));
        Player.inventoryContainer.detectAndSendChanges();
        Player.addChatMessage((IChatComponent)new ChatComponentText("You got the Fuhma Clan!"));
        Player.addChatMessage((IChatComponent)new ChatComponentText("(Right click the Clan tag to join.)"));
      } 
      if (rand3 == 19) {
        Player.inventory.addItemStackToInventory(new ItemStack(ExAddedItems.SetKaguya));
        Player.inventoryContainer.detectAndSendChanges();
        Player.addChatMessage((IChatComponent)new ChatComponentText("You got the Kaguya Clan!"));
        Player.addChatMessage((IChatComponent)new ChatComponentText("(Right click the Clan tag to join.)"));
      } 
      if (rand3 == 16) {
        Player.inventory.addItemStackToInventory(new ItemStack(ExAddedItems.SetYuki));
        Player.inventoryContainer.detectAndSendChanges();
        Player.addChatMessage((IChatComponent)new ChatComponentText("You got the Yuki Clan!"));
        Player.addChatMessage((IChatComponent)new ChatComponentText("(Right click the Clan tag to join.)"));
      } 
      if (rand3 == 15) {
        Player.inventory.addItemStackToInventory(new ItemStack(ExAddedItems.SetYamanaka));
        Player.addChatMessage((IChatComponent)new ChatComponentText("You got the Yamanaka Clan!"));
        Player.addChatMessage((IChatComponent)new ChatComponentText("(Right click the Clan tag to join.)"));
      } 
      if (rand3 == 20) {
        Player.inventory.addItemStackToInventory(new ItemStack(ExAddedItems.SetLee));
        Player.inventoryContainer.detectAndSendChanges();
        Player.addChatMessage((IChatComponent)new ChatComponentText("You got the Lee Clan!"));
        Player.addChatMessage((IChatComponent)new ChatComponentText("(Right click the Clan tag to join.)"));
      } 
      if (rand3 == 21) {
        Player.inventory.addItemStackToInventory(new ItemStack(ExAddedItems.SetChinoike));
        Player.inventoryContainer.detectAndSendChanges();
        Player.addChatMessage((IChatComponent)new ChatComponentText("You got the Chinoike Clan!"));
        Player.addChatMessage((IChatComponent)new ChatComponentText("(Right click the Clan tag to join.)"));
      } 
      if (rand3 == 22) {
        Player.inventory.addItemStackToInventory(new ItemStack(ExAddedItems.SetShirogane));
        Player.inventoryContainer.detectAndSendChanges();
        Player.addChatMessage((IChatComponent)new ChatComponentText("You got the Shirogane Clan!"));
        Player.addChatMessage((IChatComponent)new ChatComponentText("(Right click the Clan tag to join.)"));
      } 
      itemStack.stackSize--;
    } 
    return itemStack;
  }
}

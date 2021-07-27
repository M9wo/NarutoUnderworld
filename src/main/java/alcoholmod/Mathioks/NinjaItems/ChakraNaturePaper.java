package alcoholmod.Mathioks.NinjaItems;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SyncAffiliationMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncByakuganSizeMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncClanMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncCurseSealMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncCurseSizeMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncFireReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncGenjutsuMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncIntelligenceMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncKenjutsuMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncKinjutsuMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncKuramaMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncLandMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncLightningReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncNinjutsuMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncRankMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSenjutsuMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncShurikenjutsuMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSpeedMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSummoningMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncTaijutsuMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncWaterReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncWindReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncboilReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncbyakuganMessage;
import alcoholmod.Mathioks.ExtraFunctions.SynccrystalReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncexplosionReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SynciceReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SynclavaReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncmagnetReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncscorchReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncshikotsumyakuMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncsteelReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncstormReleaseMessage;
import alcoholmod.Mathioks.Final.JutsuItem;
import alcoholmod.Mathioks.PacketDispatcher;
import alcoholmod.Mathioks.TransformationsRealPackage.SyncHealthMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import lc208.tools;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;
import net.narutoswords.item.RegistryItem;

public class ChakraNaturePaper extends JutsuItem {
  public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer player) {
    if (!par2World.isRemote) {
      int EmptySpaces = tools.freeSpace(player.inventory.mainInventory);
      if (EmptySpaces <= 10);
      if (EmptySpaces > 10);
      ExtendedPlayer props = ExtendedPlayer.get(player);
      if (EmptySpaces >= 7) {
        if (!player.capabilities.isCreativeMode) {
          if (props.getLand() == 0 && props.getAffiliation() == 0 && props.getClan() == 0) {
            player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkilllearnerMedical));
            par1ItemStack.stackSize--;
            int rand = par2World.rand.nextInt(80);
            if (rand <= 69 && rand >= 60) {
              props.setLand(1);
              PacketDispatcher.sendTo((IMessage)new SyncLandMessage(player), (EntityPlayerMP)player);
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You were born in the land of Earth"));
              props.setRank(21);
              PacketDispatcher.sendTo((IMessage)new SyncRankMessage(player), (EntityPlayerMP)player);
              int i = par2World.rand.nextInt(3);
              if (i == 0) {
                props.setAffiliation(6);
                PacketDispatcher.sendTo((IMessage)new SyncAffiliationMessage(player), (EntityPlayerMP)player);
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("In the village Iwagakure"));
              } 
              if (i == 1) {
                props.setAffiliation(13);
                PacketDispatcher.sendTo((IMessage)new SyncAffiliationMessage(player), (EntityPlayerMP)player);
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("In the village Otogakure"));
              } 
              if (i == 2) {
                props.setAffiliation(19);
                PacketDispatcher.sendTo((IMessage)new SyncAffiliationMessage(player), (EntityPlayerMP)player);
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("In the village Tanigakure"));
              } 
            } 
            if (rand <= 59 && rand >= 50) {
              props.setLand(2);
              PacketDispatcher.sendTo((IMessage)new SyncLandMessage(player), (EntityPlayerMP)player);
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You were born in the land of Fire"));
              props.setRank(21);
              PacketDispatcher.sendTo((IMessage)new SyncRankMessage(player), (EntityPlayerMP)player);
              int i = par2World.rand.nextInt(3);
              if (i == 0) {
                props.setAffiliation(9);
                PacketDispatcher.sendTo((IMessage)new SyncAffiliationMessage(player), (EntityPlayerMP)player);
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("In the village Konohagakure"));
              } 
              if (i == 1) {
                props.setAffiliation(21);
                PacketDispatcher.sendTo((IMessage)new SyncAffiliationMessage(player), (EntityPlayerMP)player);
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("In the village Yugagakure"));
              } 
              if (i == 2) {
                props.setAffiliation(24);
                PacketDispatcher.sendTo((IMessage)new SyncAffiliationMessage(player), (EntityPlayerMP)player);
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("In the village Shikotsu"));
              } 
            } 
            if (rand <= 49 && rand >= 40) {
              props.setLand(3);
              PacketDispatcher.sendTo((IMessage)new SyncLandMessage(player), (EntityPlayerMP)player);
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You were born in the land of Iron"));
              props.setRank(21);
              PacketDispatcher.sendTo((IMessage)new SyncRankMessage(player), (EntityPlayerMP)player);
              int i = par2World.rand.nextInt(1);
              if (i == 0) {
                props.setAffiliation(4);
                PacketDispatcher.sendTo((IMessage)new SyncAffiliationMessage(player), (EntityPlayerMP)player);
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("In the village Hoshigakure"));
              } 
            } 
            if (rand <= 39 && rand >= 30) {
              props.setLand(4);
              PacketDispatcher.sendTo((IMessage)new SyncLandMessage(player), (EntityPlayerMP)player);
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You were born in the land of Lightning"));
              props.setRank(21);
              PacketDispatcher.sendTo((IMessage)new SyncRankMessage(player), (EntityPlayerMP)player);
              int i = par2World.rand.nextInt(2);
              if (i == 0) {
                props.setAffiliation(8);
                PacketDispatcher.sendTo((IMessage)new SyncAffiliationMessage(player), (EntityPlayerMP)player);
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("In the village Kirigakure"));
              } 
              if (i == 1) {
                props.setAffiliation(10);
                PacketDispatcher.sendTo((IMessage)new SyncAffiliationMessage(player), (EntityPlayerMP)player);
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("In the village Kumogakure"));
              } 
            } 
            if (rand <= 29 && rand >= 20) {
              props.setLand(5);
              PacketDispatcher.sendTo((IMessage)new SyncLandMessage(player), (EntityPlayerMP)player);
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You were born in the land of Sky"));
              props.setRank(21);
              PacketDispatcher.sendTo((IMessage)new SyncRankMessage(player), (EntityPlayerMP)player);
              int i = par2World.rand.nextInt(3);
              if (i == 0) {
                props.setAffiliation(3);
                PacketDispatcher.sendTo((IMessage)new SyncAffiliationMessage(player), (EntityPlayerMP)player);
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("In the village Getsugakure"));
              } 
              if (i == 1) {
                props.setAffiliation(7);
                PacketDispatcher.sendTo((IMessage)new SyncAffiliationMessage(player), (EntityPlayerMP)player);
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("In the village Jomae"));
              } 
              if (i == 2) {
                props.setAffiliation(18);
                PacketDispatcher.sendTo((IMessage)new SyncAffiliationMessage(player), (EntityPlayerMP)player);
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("In the village Takumi"));
              } 
            } 
            if (rand <= 19 && rand >= 10) {
              props.setLand(6);
              PacketDispatcher.sendTo((IMessage)new SyncLandMessage(player), (EntityPlayerMP)player);
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You were born in the land of Snow"));
              props.setRank(21);
              PacketDispatcher.sendTo((IMessage)new SyncRankMessage(player), (EntityPlayerMP)player);
              int i = par2World.rand.nextInt(2);
              if (i == 0) {
                props.setAffiliation(5);
                PacketDispatcher.sendTo((IMessage)new SyncAffiliationMessage(player), (EntityPlayerMP)player);
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("In the village Ishigakure"));
              } 
              if (i == 1) {
                props.setAffiliation(11);
                PacketDispatcher.sendTo((IMessage)new SyncAffiliationMessage(player), (EntityPlayerMP)player);
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("In the village Kusagakure"));
              } 
            } 
            if (rand <= 9 && rand >= 0) {
              props.setLand(8);
              PacketDispatcher.sendTo((IMessage)new SyncLandMessage(player), (EntityPlayerMP)player);
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You were born in the land of Water"));
              props.setRank(21);
              PacketDispatcher.sendTo((IMessage)new SyncRankMessage(player), (EntityPlayerMP)player);
              int i = par2World.rand.nextInt(2);
              if (i == 0) {
                props.setAffiliation(2);
                PacketDispatcher.sendTo((IMessage)new SyncAffiliationMessage(player), (EntityPlayerMP)player);
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("In the village Amegakure"));
              } 
              if (i == 1) {
                props.setAffiliation(17);
                PacketDispatcher.sendTo((IMessage)new SyncAffiliationMessage(player), (EntityPlayerMP)player);
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("In the village Takigakure"));
              } 
            } 
            if (rand <= 79 && rand >= 70) {
              props.setLand(9);
              PacketDispatcher.sendTo((IMessage)new SyncLandMessage(player), (EntityPlayerMP)player);
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You were born in the land of Wind"));
              props.setRank(21);
              PacketDispatcher.sendTo((IMessage)new SyncRankMessage(player), (EntityPlayerMP)player);
              int i = par2World.rand.nextInt(3);
              if (i == 0) {
                props.setAffiliation(16);
                PacketDispatcher.sendTo((IMessage)new SyncAffiliationMessage(player), (EntityPlayerMP)player);
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("In the village Sunagakure"));
              } 
              if (i == 1) {
                props.setAffiliation(23);
                PacketDispatcher.sendTo((IMessage)new SyncAffiliationMessage(player), (EntityPlayerMP)player);
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("In the village Yumegakure"));
              } 
              if (i == 2) {
                props.setAffiliation(12);
                PacketDispatcher.sendTo((IMessage)new SyncAffiliationMessage(player), (EntityPlayerMP)player);
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("In the village Nadeshiko"));
              } 
            } 
            int rand3 = par2World.rand.nextInt(22) + 1;
            if (rand3 == 1) {
              props.setClan(7);
              PacketDispatcher.sendTo((IMessage)new SyncClanMessage(player), (EntityPlayerMP)player);
              props.setNinjutsu(75);
              PacketDispatcher.sendTo((IMessage)new SyncNinjutsuMessage(player), (EntityPlayerMP)player);
              props.setTaijutsu(1.6D);
              PacketDispatcher.sendTo((IMessage)new SyncTaijutsuMessage(player), (EntityPlayerMP)player);
              props.setbyakugan(1);
              PacketDispatcher.sendTo((IMessage)new SyncbyakuganMessage(player), (EntityPlayerMP)player);
              props.setByakuganSize(1);
              props.setTaijutsu(1.8D);
              PacketDispatcher.sendTo((IMessage)new SyncTaijutsuMessage(player), (EntityPlayerMP)player);
              PacketDispatcher.sendTo((IMessage)new SyncByakuganSizeMessage(player), (EntityPlayerMP)player);
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You are part of the Hyuga Clan"));
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Byakugan!"));
              player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerByakugan));
              player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkilllearnerTaijutsu));
              player.inventory.addItemStackToInventory(new ItemStack(RegistryItem.boStaff));
            } 
            if (rand3 == 2) {
              props.setClan(2);
              PacketDispatcher.sendTo((IMessage)new SyncClanMessage(player), (EntityPlayerMP)player);
              props.setKinjutsu(20);
              PacketDispatcher.sendTo((IMessage)new SyncKinjutsuMessage(player), (EntityPlayerMP)player);
              props.setHealth(15);
              PacketDispatcher.sendTo((IMessage)new SyncHealthMessage(player), (EntityPlayerMP)player);
              props.setNinjutsu(100);
              PacketDispatcher.sendTo((IMessage)new SyncNinjutsuMessage(player), (EntityPlayerMP)player);
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You are part of the Uzumaki Clan"));
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("As an Uzumaki you have natural affinity for Kinjutsu"));
              player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerUzumaki));
              player.inventory.addItemStackToInventory(new ItemStack(RegistryItem.sai));
            } 
            if (rand3 == 3) {
              props.setClan(3);
              PacketDispatcher.sendTo((IMessage)new SyncClanMessage(player), (EntityPlayerMP)player);
              props.setNinjutsu(100);
              PacketDispatcher.sendTo((IMessage)new SyncNinjutsuMessage(player), (EntityPlayerMP)player);
              props.setSummoning(10);
              PacketDispatcher.sendTo((IMessage)new SyncSummoningMessage(player), (EntityPlayerMP)player);
              props.setKinjutsu(5);
              PacketDispatcher.sendTo((IMessage)new SyncKinjutsuMessage(player), (EntityPlayerMP)player);
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You are part of the Aburame Clan"));
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("As an Aburame you have access to the Hiden Aburame Jutsu"));
              player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerAburame));
              player.inventory.addItemStackToInventory(new ItemStack(RegistryItem.bladeOfKonohaChakra));
            } 
            if (rand3 == 4) {
              props.setClan(5);
              PacketDispatcher.sendTo((IMessage)new SyncClanMessage(player), (EntityPlayerMP)player);
              props.setKenjutsu(1.7D);
              PacketDispatcher.sendTo((IMessage)new SyncKenjutsuMessage(player), (EntityPlayerMP)player);
              props.setNinjutsu(50);
              PacketDispatcher.sendTo((IMessage)new SyncNinjutsuMessage(player), (EntityPlayerMP)player);
              props.setIntelligence(5);
              PacketDispatcher.sendTo((IMessage)new SyncIntelligenceMessage(player), (EntityPlayerMP)player);
              props.setSpeed(0.125D);
              PacketDispatcher.sendTo((IMessage)new SyncSpeedMessage(player), (EntityPlayerMP)player);
              props.setTaijutsu(1.8D);
              PacketDispatcher.sendTo((IMessage)new SyncTaijutsuMessage(player), (EntityPlayerMP)player);
              player.inventory.addItemStackToInventory(new ItemStack(RegistryItem.wLCS));
              player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkilllearnerTaijutsu));
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You are part of the Hatake Clan"));
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("As a Hatake you have natural affinity for Kenjutsu"));
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You received the Clan Item 'White Light Chakra Sabre'"));
            } 
            if (rand3 == 5) {
              props.setClan(5);
              PacketDispatcher.sendTo((IMessage)new SyncClanMessage(player), (EntityPlayerMP)player);
              props.setKenjutsu(1.7D);
              PacketDispatcher.sendTo((IMessage)new SyncKenjutsuMessage(player), (EntityPlayerMP)player);
              props.setNinjutsu(50);
              PacketDispatcher.sendTo((IMessage)new SyncNinjutsuMessage(player), (EntityPlayerMP)player);
              props.setIntelligence(5);
              PacketDispatcher.sendTo((IMessage)new SyncIntelligenceMessage(player), (EntityPlayerMP)player);
              props.setSpeed(0.125D);
              PacketDispatcher.sendTo((IMessage)new SyncSpeedMessage(player), (EntityPlayerMP)player);
              props.setTaijutsu(1.8D);
              PacketDispatcher.sendTo((IMessage)new SyncTaijutsuMessage(player), (EntityPlayerMP)player);
              player.inventory.addItemStackToInventory(new ItemStack(RegistryItem.wLCS));
              player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkilllearnerTaijutsu));
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You are part of the Hatake Clan"));
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("As a Hatake you have natural affinity for Kenjutsu"));
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You received the Clan Item 'White Light Chakra Sabre'"));
            } 
            if (rand3 == 6) {
              props.setClan(6);
              PacketDispatcher.sendTo((IMessage)new SyncClanMessage(player), (EntityPlayerMP)player);
              props.setNinjutsu(100);
              PacketDispatcher.sendTo((IMessage)new SyncNinjutsuMessage(player), (EntityPlayerMP)player);
              props.setKenjutsu(1.5D);
              PacketDispatcher.sendTo((IMessage)new SyncKenjutsuMessage(player), (EntityPlayerMP)player);
              props.setWaterRelease(1);
              PacketDispatcher.sendTo((IMessage)new SyncWaterReleaseMessage(player), (EntityPlayerMP)player);
              player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWaterRelease));
              player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerHozuki));
              player.inventory.addItemStackToInventory(new ItemStack(RegistryItem.bladeOfKonohaChakra));
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You are part of the Hozuki Clan"));
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("As a Hozuki you have natural affinity for Water Release"));
            } 
            if (rand3 == 7) {
              props.setClan(7);
              PacketDispatcher.sendTo((IMessage)new SyncClanMessage(player), (EntityPlayerMP)player);
              props.setNinjutsu(75);
              PacketDispatcher.sendTo((IMessage)new SyncNinjutsuMessage(player), (EntityPlayerMP)player);
              props.setTaijutsu(1.6D);
              PacketDispatcher.sendTo((IMessage)new SyncTaijutsuMessage(player), (EntityPlayerMP)player);
              props.setbyakugan(1);
              PacketDispatcher.sendTo((IMessage)new SyncbyakuganMessage(player), (EntityPlayerMP)player);
              props.setByakuganSize(1);
              props.setTaijutsu(1.8D);
              PacketDispatcher.sendTo((IMessage)new SyncTaijutsuMessage(player), (EntityPlayerMP)player);
              PacketDispatcher.sendTo((IMessage)new SyncByakuganSizeMessage(player), (EntityPlayerMP)player);
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You are part of the Hyuga Clan"));
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Byakugan!"));
              player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerByakugan));
              player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkilllearnerTaijutsu));
              player.inventory.addItemStackToInventory(new ItemStack(RegistryItem.boStaff));
            } 
            if (rand3 == 8) {
              props.setClan(9);
              PacketDispatcher.sendTo((IMessage)new SyncClanMessage(player), (EntityPlayerMP)player);
              props.setSummoning(15);
              PacketDispatcher.sendTo((IMessage)new SyncSummoningMessage(player), (EntityPlayerMP)player);
              props.setTaijutsu(1.8D);
              PacketDispatcher.sendTo((IMessage)new SyncTaijutsuMessage(player), (EntityPlayerMP)player);
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You are part of the Inuzuka Clan"));
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("As an Inuzuka you have access to the Hiden Inuzuka Jutsu"));
              player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerInuzuka));
              player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkilllearnerTaijutsu));
              player.inventory.addItemStackToInventory(new ItemStack(RegistryItem.syuko));
            } 
            if (rand3 == 9) {
              props.setClan(9);
              PacketDispatcher.sendTo((IMessage)new SyncClanMessage(player), (EntityPlayerMP)player);
              props.setSummoning(15);
              PacketDispatcher.sendTo((IMessage)new SyncSummoningMessage(player), (EntityPlayerMP)player);
              props.setTaijutsu(1.8D);
              PacketDispatcher.sendTo((IMessage)new SyncTaijutsuMessage(player), (EntityPlayerMP)player);
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You are part of the Inuzuka Clan"));
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("As an Inuzuka you have access to the Hiden Inuzuka Jutsu"));
              player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerInuzuka));
              player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkilllearnerTaijutsu));
              player.inventory.addItemStackToInventory(new ItemStack(RegistryItem.syuko));
            } 
            if (rand3 == 10) {
              props.setClan(10);
              PacketDispatcher.sendTo((IMessage)new SyncClanMessage(player), (EntityPlayerMP)player);
              props.setTaijutsu(1.3D);
              PacketDispatcher.sendTo((IMessage)new SyncTaijutsuMessage(player), (EntityPlayerMP)player);
              props.setNinjutsu(75);
              PacketDispatcher.sendTo((IMessage)new SyncNinjutsuMessage(player), (EntityPlayerMP)player);
              props.setSenjutsu(75);
              PacketDispatcher.sendTo((IMessage)new SyncSenjutsuMessage(player), (EntityPlayerMP)player);
              props.setCurseSeal(1);
              PacketDispatcher.sendTo((IMessage)new SyncCurseSealMessage(player), (EntityPlayerMP)player);
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You are part of the Jugo Clan"));
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("As Jugo clan member you have natural affinity for Senjutsu Chakra"));
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("Unlocked the Jugo-Clan Curse Mark!"));
              player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerCurseMark));
              player.inventory.addItemStackToInventory(new ItemStack(RegistryItem.syuko));
              int rand7 = par2World.rand.nextInt(6);
              props.setCurseSize(1);
              PacketDispatcher.sendTo((IMessage)new SyncCurseSizeMessage(player), (EntityPlayerMP)player);
              if (rand7 == 0) {
                props.setCurseSeal(1);
                PacketDispatcher.sendTo((IMessage)new SyncCurseSealMessage(player), (EntityPlayerMP)player);
              } else if (rand7 == 1) {
                props.setCurseSeal(4);
                PacketDispatcher.sendTo((IMessage)new SyncCurseSealMessage(player), (EntityPlayerMP)player);
              } else if (rand7 == 2) {
                props.setCurseSeal(7);
                PacketDispatcher.sendTo((IMessage)new SyncCurseSealMessage(player), (EntityPlayerMP)player);
              } else if (rand7 == 3) {
                props.setCurseSeal(10);
                PacketDispatcher.sendTo((IMessage)new SyncCurseSealMessage(player), (EntityPlayerMP)player);
              } else if (rand7 == 4) {
                props.setCurseSeal(13);
                PacketDispatcher.sendTo((IMessage)new SyncCurseSealMessage(player), (EntityPlayerMP)player);
              } else if (rand7 == 5) {
                props.setCurseSeal(16);
                PacketDispatcher.sendTo((IMessage)new SyncCurseSealMessage(player), (EntityPlayerMP)player);
              } 
            } 
            if (rand3 == 11) {
              props.setClan(11);
              PacketDispatcher.sendTo((IMessage)new SyncClanMessage(player), (EntityPlayerMP)player);
              props.setKenjutsu(1.5D);
              PacketDispatcher.sendTo((IMessage)new SyncKenjutsuMessage(player), (EntityPlayerMP)player);
              props.setNinjutsu(50);
              PacketDispatcher.sendTo((IMessage)new SyncNinjutsuMessage(player), (EntityPlayerMP)player);
              props.setHealth(5);
              PacketDispatcher.sendTo((IMessage)new SyncHealthMessage(player), (EntityPlayerMP)player);
              props.setSpeed(0.125D);
              PacketDispatcher.sendTo((IMessage)new SyncSpeedMessage(player), (EntityPlayerMP)player);
              props.setshikotsumyaku(1);
              props.setTaijutsu(1.8D);
              PacketDispatcher.sendTo((IMessage)new SyncTaijutsuMessage(player), (EntityPlayerMP)player);
              PacketDispatcher.sendTo((IMessage)new SyncshikotsumyakuMessage(player), (EntityPlayerMP)player);
              props.setCurseSize(1);
              PacketDispatcher.sendTo((IMessage)new SyncCurseSizeMessage(player), (EntityPlayerMP)player);
              props.setCurseSeal(4);
              PacketDispatcher.sendTo((IMessage)new SyncCurseSealMessage(player), (EntityPlayerMP)player);
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You are part of the Kaguya Clan"));
              player.addChatMessage((IChatComponent)new ChatComponentText("You unlocked the Kimmimaro Curse Sage!"));
              player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerKaguya));
              player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkilllearnerTaijutsu));
              player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.ItemKaguyaBone2));
            } 
            if (rand3 == 12) {
              props.setClan(12);
              PacketDispatcher.sendTo((IMessage)new SyncClanMessage(player), (EntityPlayerMP)player);
              props.setGenjutsu(25);
              PacketDispatcher.sendTo((IMessage)new SyncGenjutsuMessage(player), (EntityPlayerMP)player);
              props.setNinjutsu(50);
              PacketDispatcher.sendTo((IMessage)new SyncNinjutsuMessage(player), (EntityPlayerMP)player);
              props.setKurama(1);
              PacketDispatcher.sendTo((IMessage)new SyncKuramaMessage(player), (EntityPlayerMP)player);
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You are part of the Kurama Clan"));
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Kurama-Clan Kekkei Genkai!"));
              player.inventory.addItemStackToInventory(new ItemStack(RegistryItem.tanto));
              player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerKurama));
            } 
            if (rand3 == 13) {
              props.setClan(13);
              PacketDispatcher.sendTo((IMessage)new SyncClanMessage(player), (EntityPlayerMP)player);
              props.setKinjutsu(20);
              PacketDispatcher.sendTo((IMessage)new SyncKinjutsuMessage(player), (EntityPlayerMP)player);
              props.setHealth(5);
              PacketDispatcher.sendTo((IMessage)new SyncHealthMessage(player), (EntityPlayerMP)player);
              props.setShurikenjutsu(15);
              PacketDispatcher.sendTo((IMessage)new SyncShurikenjutsuMessage(player), (EntityPlayerMP)player);
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You are part of the Tsuchigumo Clan"));
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("As a Tsuchigumo you have natural affinity for Kinjutsu"));
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("and Shurikenjutsu"));
              player.inventory.addItemStackToInventory(new ItemStack(RegistryItem.tanto));
              player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerTsuchigumo));
            } 
            if (rand3 == 14) {
              props.setClan(3);
              PacketDispatcher.sendTo((IMessage)new SyncClanMessage(player), (EntityPlayerMP)player);
              props.setNinjutsu(100);
              PacketDispatcher.sendTo((IMessage)new SyncNinjutsuMessage(player), (EntityPlayerMP)player);
              props.setSummoning(10);
              PacketDispatcher.sendTo((IMessage)new SyncSummoningMessage(player), (EntityPlayerMP)player);
              props.setKinjutsu(5);
              PacketDispatcher.sendTo((IMessage)new SyncKinjutsuMessage(player), (EntityPlayerMP)player);
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You are part of the Aburame Clan"));
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("As an Aburame you have access to the Hiden Aburame Jutsu"));
              player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerAburame));
              player.inventory.addItemStackToInventory(new ItemStack(RegistryItem.bladeOfKonohaChakra));
            } 
            if (rand3 == 17) {
              props.setClan(17);
              PacketDispatcher.sendTo((IMessage)new SyncClanMessage(player), (EntityPlayerMP)player);
              props.setNinjutsu(100);
              PacketDispatcher.sendTo((IMessage)new SyncNinjutsuMessage(player), (EntityPlayerMP)player);
              props.setKinjutsu(5);
              PacketDispatcher.sendTo((IMessage)new SyncKinjutsuMessage(player), (EntityPlayerMP)player);
              props.setHealth(5);
              PacketDispatcher.sendTo((IMessage)new SyncHealthMessage(player), (EntityPlayerMP)player);
              props.setSummoning(5);
              PacketDispatcher.sendTo((IMessage)new SyncSummoningMessage(player), (EntityPlayerMP)player);
              props.setFireRelease(1);
              PacketDispatcher.sendTo((IMessage)new SyncFireReleaseMessage(player), (EntityPlayerMP)player);
              player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerFireRelease));
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You are part of the Sarutobi Clan"));
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("As a Sarutobi you have natural affinity for Fire Release"));
              player.inventory.addItemStackToInventory(new ItemStack(RegistryItem.bladeOfChakra));
              player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerSarutobi));
            } 
            if (rand3 == 18) {
              props.setClan(18);
              PacketDispatcher.sendTo((IMessage)new SyncClanMessage(player), (EntityPlayerMP)player);
              props.setShurikenjutsu(20);
              PacketDispatcher.sendTo((IMessage)new SyncShurikenjutsuMessage(player), (EntityPlayerMP)player);
              props.setSummoning(10);
              PacketDispatcher.sendTo((IMessage)new SyncSummoningMessage(player), (EntityPlayerMP)player);
              props.setKinjutsu(10);
              PacketDispatcher.sendTo((IMessage)new SyncKinjutsuMessage(player), (EntityPlayerMP)player);
              player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.FuhmaShurikenRedeemToken));
              player.inventory.addItemStackToInventory(new ItemStack(RegistryItem.sai));
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You are part of the Fuhma Clan"));
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("As a Fuhma Clan member you have natural affinity for Shurikenjutsu"));
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You received the Clan Item 'Fuhma Shuriken'"));
            } 
            if (rand3 == 19) {
              props.setClan(19);
              PacketDispatcher.sendTo((IMessage)new SyncClanMessage(player), (EntityPlayerMP)player);
              props.setSummoning(15);
              PacketDispatcher.sendTo((IMessage)new SyncSummoningMessage(player), (EntityPlayerMP)player);
              props.setTaijutsu(1.8D);
              PacketDispatcher.sendTo((IMessage)new SyncTaijutsuMessage(player), (EntityPlayerMP)player);
              player.inventory.addItemStackToInventory(new ItemStack(RegistryItem.syuko));
              player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkilllearnerTaijutsu));
              player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerNeko));
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You are part of the Neko Clan"));
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("As a Neko you have mutation"));
            } 
            if (rand3 == 16) {
              props.setClan(20);
              PacketDispatcher.sendTo((IMessage)new SyncClanMessage(player), (EntityPlayerMP)player);
              props.setNinjutsu(75);
              PacketDispatcher.sendTo((IMessage)new SyncNinjutsuMessage(player), (EntityPlayerMP)player);
              props.setShurikenjutsu(15);
              PacketDispatcher.sendTo((IMessage)new SyncShurikenjutsuMessage(player), (EntityPlayerMP)player);
              props.setSpeed(0.125D);
              PacketDispatcher.sendTo((IMessage)new SyncSpeedMessage(player), (EntityPlayerMP)player);
              int rand7 = par2World.rand.nextInt(10);
              if (rand7 == 0) {
                props.setWindRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncWindReleaseMessage(player), (EntityPlayerMP)player);
                props.setWaterRelease(1);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWindRelease));
                PacketDispatcher.sendTo((IMessage)new SyncWaterReleaseMessage(player), (EntityPlayerMP)player);
                props.seticeRelease(1);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWaterRelease));
                PacketDispatcher.sendTo((IMessage)new SynciceReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerIceRelease));
                player.inventory.addItemStackToInventory(new ItemStack(RegistryItem.bladeOfKonohaChakra));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You are part of the Yuki Clan"));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("As a Yuki you have natural affinity for Water Release"));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("As a Yuki you have natural affinity for Wind Release"));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("As a Yuki with extraordinary strong DNA,"));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You are one of the few Shinobi in block"));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("world to unlock the Ice Release Kekkei genkai!"));
              } 
              if (rand7 > 0 && rand7 < 6) {
                props.setWindRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncWindReleaseMessage(player), (EntityPlayerMP)player);
                props.setWaterRelease(1);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWindRelease));
                PacketDispatcher.sendTo((IMessage)new SyncWaterReleaseMessage(player), (EntityPlayerMP)player);
                props.seticeRelease(1);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWaterRelease));
                PacketDispatcher.sendTo((IMessage)new SynciceReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerIceRelease));
                player.inventory.addItemStackToInventory(new ItemStack(RegistryItem.bladeOfKonohaChakra));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You are part of the Yuki Clan"));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("As a Yuki you have natural affinity for Water Release"));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("As a Yuki you have natural affinity for Wind Release"));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("As a Yuki with extraordinary strong DNA,"));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You are one of the few Shinobi in block"));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("world to unlock the Ice Release Kekkei genkai!"));
              } 
              if (rand7 > 5 && rand7 < 10) {
                props.setWindRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncWindReleaseMessage(player), (EntityPlayerMP)player);
                props.setWaterRelease(1);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWindRelease));
                PacketDispatcher.sendTo((IMessage)new SyncWaterReleaseMessage(player), (EntityPlayerMP)player);
                props.seticeRelease(1);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWaterRelease));
                PacketDispatcher.sendTo((IMessage)new SynciceReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerIceRelease));
                player.inventory.addItemStackToInventory(new ItemStack(RegistryItem.bladeOfKonohaChakra));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You are part of the Yuki Clan"));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("As a Yuki you have natural affinity for Water Release"));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("As a Yuki you have natural affinity for Wind Release"));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("As a Yuki with extraordinary strong DNA,"));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You are one of the few Shinobi in block"));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("world to unlock the Ice Release Kekkei genkai!"));
              } 
            } 
            if (rand3 == 15) {
              props.setClan(3);
              PacketDispatcher.sendTo((IMessage)new SyncClanMessage(player), (EntityPlayerMP)player);
              props.setNinjutsu(100);
              PacketDispatcher.sendTo((IMessage)new SyncNinjutsuMessage(player), (EntityPlayerMP)player);
              props.setSummoning(10);
              PacketDispatcher.sendTo((IMessage)new SyncSummoningMessage(player), (EntityPlayerMP)player);
              props.setKinjutsu(5);
              PacketDispatcher.sendTo((IMessage)new SyncKinjutsuMessage(player), (EntityPlayerMP)player);
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You are part of the Aburame Clan"));
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("As an Aburame you have access to the Hiden Aburame Jutsu"));
              player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerAburame));
              player.inventory.addItemStackToInventory(new ItemStack(RegistryItem.bladeOfKonohaChakra));
            } 
            if (rand3 == 20) {
              props.setClan(23);
              PacketDispatcher.sendTo((IMessage)new SyncClanMessage(player), (EntityPlayerMP)player);
              props.setNinjutsu(50);
              PacketDispatcher.sendTo((IMessage)new SyncNinjutsuMessage(player), (EntityPlayerMP)player);
              props.setGenjutsu(20);
              PacketDispatcher.sendTo((IMessage)new SyncGenjutsuMessage(player), (EntityPlayerMP)player);
              props.setKinjutsu(5);
              PacketDispatcher.sendTo((IMessage)new SyncKinjutsuMessage(player), (EntityPlayerMP)player);
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You are part of the Chinoike Clan"));
              player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerKetsuryugan));
              player.inventory.addItemStackToInventory(new ItemStack(RegistryItem.tanto));
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("As a member of the Chinoike Clan you have access to the Ketsuryugan"));
            } 
            if (rand3 == 21) {
              props.setClan(23);
              PacketDispatcher.sendTo((IMessage)new SyncClanMessage(player), (EntityPlayerMP)player);
              props.setNinjutsu(50);
              PacketDispatcher.sendTo((IMessage)new SyncNinjutsuMessage(player), (EntityPlayerMP)player);
              props.setGenjutsu(20);
              PacketDispatcher.sendTo((IMessage)new SyncGenjutsuMessage(player), (EntityPlayerMP)player);
              props.setKinjutsu(5);
              PacketDispatcher.sendTo((IMessage)new SyncKinjutsuMessage(player), (EntityPlayerMP)player);
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You are part of the Chinoike Clan"));
              player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerKetsuryugan));
              player.inventory.addItemStackToInventory(new ItemStack(RegistryItem.tanto));
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("As a member of the Chinoike Clan you have access to the Ketsuryugan"));
            } 
            if (rand3 == 22) {
              props.setClan(24);
              PacketDispatcher.sendTo((IMessage)new SyncClanMessage(player), (EntityPlayerMP)player);
              props.setNinjutsu(50);
              PacketDispatcher.sendTo((IMessage)new SyncNinjutsuMessage(player), (EntityPlayerMP)player);
              props.setShurikenjutsu(10);
              PacketDispatcher.sendTo((IMessage)new SyncShurikenjutsuMessage(player), (EntityPlayerMP)player);
              props.setKinjutsu(10);
              PacketDispatcher.sendTo((IMessage)new SyncKinjutsuMessage(player), (EntityPlayerMP)player);
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You are part of the Shirogane Clan"));
              player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerShirogane));
              player.inventory.addItemStackToInventory(new ItemStack(RegistryItem.syuko));
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("As a member of the Shirogane Clan you have access to Puppet Jutsu"));
            } 
            rand3 = par2World.rand.nextInt(120) + 1;
            if (rand3 >= 1 && rand3 <= 20) {
              props.setFireRelease(1);
              PacketDispatcher.sendTo((IMessage)new SyncFireReleaseMessage(player), (EntityPlayerMP)player);
              player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerFireRelease));
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have the Fire Release Chakra nature"));
            } 
            if (rand3 >= 21 && rand3 <= 40) {
              props.setWaterRelease(1);
              PacketDispatcher.sendTo((IMessage)new SyncWaterReleaseMessage(player), (EntityPlayerMP)player);
              player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWaterRelease));
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have the Water Release Chakra nature"));
            } 
            if (rand3 >= 41 && rand3 <= 60) {
              props.setLightningRelease(1);
              PacketDispatcher.sendTo((IMessage)new SyncLightningReleaseMessage(player), (EntityPlayerMP)player);
              player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerLightningRelease));
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have the Lightning Release Chakra nature"));
            } 
            if (rand3 >= 61 && rand3 <= 80) {
              props.setWindRelease(1);
              PacketDispatcher.sendTo((IMessage)new SyncWindReleaseMessage(player), (EntityPlayerMP)player);
              player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWindRelease));
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have the Wind Release Chakra nature"));
            } 
            if (rand3 >= 81 && rand3 <= 100) {
              props.setWaterRelease(1);
              PacketDispatcher.sendTo((IMessage)new SyncWaterReleaseMessage(player), (EntityPlayerMP)player);
              player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWaterRelease));
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have the Water Release Chakra nature"));
            } 
            if (rand3 >= 101 && rand3 <= 120) {
              int rand7 = par2World.rand.nextInt(10) + 1;
              int rand92 = par2World.rand.nextInt(5) + 1;
              int rand93 = par2World.rand.nextInt(3) + 1;
              if (rand7 == 1) {
                int rand91 = par2World.rand.nextInt(10) + 1;
                props.setFireRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncFireReleaseMessage(player), (EntityPlayerMP)player);
                props.setWaterRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncWaterReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerFireRelease));
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWaterRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have the Fire & Water Release Chakra nature"));
                if (rand92 == 1) {
                  if (rand93 == 1) {
                    props.setWindRelease(1);
                    PacketDispatcher.sendTo((IMessage)new SyncWindReleaseMessage(player), (EntityPlayerMP)player);
                    player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWindRelease));
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have a third nature release: Wind Release Chakra nature"));
                  } 
                  if (rand93 == 2) {
                    props.setWaterRelease(1);
                    PacketDispatcher.sendTo((IMessage)new SyncWaterReleaseMessage(player), (EntityPlayerMP)player);
                    player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWaterRelease));
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have a third nature release: Water Release Chakra nature"));
                  } 
                  if (rand93 == 3) {
                    props.setLightningRelease(1);
                    PacketDispatcher.sendTo((IMessage)new SyncLightningReleaseMessage(player), (EntityPlayerMP)player);
                    player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerLightningRelease));
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have a third nature release: Lightning Release Chakra nature"));
                  } 
                } 
                if (rand91 == 1) {
                  props.setboilRelease(1);
                  PacketDispatcher.sendTo((IMessage)new SyncboilReleaseMessage(player), (EntityPlayerMP)player);
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText("You are one of the few people"));
                  player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerBoilRelease));
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText("To unlock the Boil Release Kekkei Genkai!"));
                } 
              } 
              if (rand7 == 2) {
                int rand91 = par2World.rand.nextInt(10) + 1;
                props.setFireRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncFireReleaseMessage(player), (EntityPlayerMP)player);
                props.setWindRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncWindReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerFireRelease));
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWindRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have the Fire & Wind Release Chakra nature"));
                if (rand92 == 1) {
                  if (rand93 == 1) {
                    props.setWaterRelease(1);
                    PacketDispatcher.sendTo((IMessage)new SyncWaterReleaseMessage(player), (EntityPlayerMP)player);
                    player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWaterRelease));
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have a third nature release: Water Release Chakra nature"));
                  } 
                  if (rand93 == 2) {
                    props.setWaterRelease(1);
                    PacketDispatcher.sendTo((IMessage)new SyncWaterReleaseMessage(player), (EntityPlayerMP)player);
                    player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWaterRelease));
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have a third nature release: Water Release Chakra nature"));
                    int i = par2World.rand.nextInt(10) + 1;
                  } 
                  if (rand93 == 3) {
                    props.setLightningRelease(1);
                    PacketDispatcher.sendTo((IMessage)new SyncLightningReleaseMessage(player), (EntityPlayerMP)player);
                    player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerLightningRelease));
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have a third nature release: Lightning Release Chakra nature"));
                  } 
                } 
                if (rand91 == 1) {
                  props.setscorchRelease(1);
                  PacketDispatcher.sendTo((IMessage)new SyncscorchReleaseMessage(player), (EntityPlayerMP)player);
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText("You are one of the few people"));
                  player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerScorchRelease));
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText("To unlock the Scorch Release Kekkei Genkai!"));
                } 
              } 
              if (rand7 == 3) {
                int rand91 = par2World.rand.nextInt(10) + 1;
                props.setFireRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncFireReleaseMessage(player), (EntityPlayerMP)player);
                props.setLightningRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncLightningReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerFireRelease));
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerLightningRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have the Fire & Lightning Release Chakra nature"));
                if (rand92 == 1) {
                  if (rand93 == 1) {
                    props.setWindRelease(1);
                    PacketDispatcher.sendTo((IMessage)new SyncWindReleaseMessage(player), (EntityPlayerMP)player);
                    player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWindRelease));
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have a third nature release: Wind Release Chakra nature"));
                  } 
                  if (rand93 == 2) {
                    props.setWaterRelease(1);
                    PacketDispatcher.sendTo((IMessage)new SyncWaterReleaseMessage(player), (EntityPlayerMP)player);
                    player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWaterRelease));
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have a third nature release: Water Release Chakra nature"));
                  } 
                  if (rand93 == 3) {
                    props.setWaterRelease(1);
                    PacketDispatcher.sendTo((IMessage)new SyncWaterReleaseMessage(player), (EntityPlayerMP)player);
                    player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWaterRelease));
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have a third nature release: Water Release Chakra nature"));
                  } 
                } 
                if (rand91 == 1) {
                  props.setexplosionRelease(1);
                  PacketDispatcher.sendTo((IMessage)new SyncexplosionReleaseMessage(player), (EntityPlayerMP)player);
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText("You are one of the few people"));
                  player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerExplosionRelease));
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText("To unlock the Explosion Release Kekkei Genkai!"));
                } 
              } 
              if (rand7 == 4) {
                int rand91 = par2World.rand.nextInt(10) + 1;
                props.setFireRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncFireReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerFireRelease));
                props.setWaterRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncWaterReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWaterRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have the Fire & Water Release Chakra nature"));
                if (rand92 == 1) {
                  if (rand93 == 1) {
                    props.setWindRelease(1);
                    PacketDispatcher.sendTo((IMessage)new SyncWindReleaseMessage(player), (EntityPlayerMP)player);
                    player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWindRelease));
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have a third nature release: Wind Release Chakra nature"));
                    int i = par2World.rand.nextInt(10) + 1;
                  } 
                  if (rand93 == 3) {
                    props.setLightningRelease(1);
                    PacketDispatcher.sendTo((IMessage)new SyncLightningReleaseMessage(player), (EntityPlayerMP)player);
                    player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerLightningRelease));
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have a third nature release: Lightning Release Chakra nature"));
                  } 
                } 
                if (rand91 == 1) {
                  props.setlavaRelease(1);
                  PacketDispatcher.sendTo((IMessage)new SynclavaReleaseMessage(player), (EntityPlayerMP)player);
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText("You are one of the few people"));
                  player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerLavaRelease));
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText("To unlock the Lava Release Kekkei Genkai!"));
                } 
              } 
              if (rand7 == 5) {
                int rand91 = par2World.rand.nextInt(10) + 1;
                props.setWaterRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncWaterReleaseMessage(player), (EntityPlayerMP)player);
                props.setWindRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncWindReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWaterRelease));
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWindRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have the Water & Wind Release Chakra nature"));
                if (rand92 == 1) {
                  if (rand93 == 1) {
                    props.setFireRelease(1);
                    PacketDispatcher.sendTo((IMessage)new SyncFireReleaseMessage(player), (EntityPlayerMP)player);
                    player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerFireRelease));
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have a third nature release: Fire Release Chakra nature"));
                  } 
                  if (rand93 == 3) {
                    props.setLightningRelease(1);
                    PacketDispatcher.sendTo((IMessage)new SyncLightningReleaseMessage(player), (EntityPlayerMP)player);
                    player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerLightningRelease));
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have a third nature release: Lightning Release Chakra nature"));
                  } 
                } 
                if (rand91 == 1) {
                  props.seticeRelease(1);
                  PacketDispatcher.sendTo((IMessage)new SynciceReleaseMessage(player), (EntityPlayerMP)player);
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText("You are one of the few people"));
                  player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerIceRelease));
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText("To unlock the Ice Release Kekkei Genkai!"));
                } 
              } 
              if (rand7 == 6) {
                int rand91 = par2World.rand.nextInt(10) + 1;
                props.setWaterRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncWaterReleaseMessage(player), (EntityPlayerMP)player);
                props.setLightningRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncLightningReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWaterRelease));
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerLightningRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have the Water & Lightning Release Chakra nature"));
                if (rand92 == 1) {
                  if (rand93 == 1) {
                    props.setWindRelease(1);
                    PacketDispatcher.sendTo((IMessage)new SyncWindReleaseMessage(player), (EntityPlayerMP)player);
                    player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWindRelease));
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have a third nature release: Wind Release Chakra nature"));
                  } 
                  if (rand93 == 3) {
                    props.setFireRelease(1);
                    PacketDispatcher.sendTo((IMessage)new SyncFireReleaseMessage(player), (EntityPlayerMP)player);
                    player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerFireRelease));
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have a third nature release: Fire Release Chakra nature"));
                  } 
                } 
                if (rand91 == 1) {
                  props.setstormRelease(1);
                  PacketDispatcher.sendTo((IMessage)new SyncstormReleaseMessage(player), (EntityPlayerMP)player);
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText("You are one of the few people"));
                  player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerStormRelease));
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText("To unlock the Storm Release Kekkei Genkai!"));
                } 
              } 
              if (rand7 == 7) {
                int rand91 = par2World.rand.nextInt(10) + 1;
                props.setWaterRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncWaterReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWaterRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have the Water Release Chakra nature"));
                if (rand92 == 1) {
                  if (rand93 == 1) {
                    props.setWindRelease(1);
                    PacketDispatcher.sendTo((IMessage)new SyncWindReleaseMessage(player), (EntityPlayerMP)player);
                    player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWindRelease));
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have a second nature release: Wind Release Chakra nature"));
                  } 
                  if (rand93 == 2) {
                    props.setFireRelease(1);
                    PacketDispatcher.sendTo((IMessage)new SyncFireReleaseMessage(player), (EntityPlayerMP)player);
                    player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerFireRelease));
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have a second nature release: Fire Release Chakra nature"));
                  } 
                  if (rand93 == 3) {
                    props.setLightningRelease(1);
                    PacketDispatcher.sendTo((IMessage)new SyncLightningReleaseMessage(player), (EntityPlayerMP)player);
                    player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerLightningRelease));
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have a second nature release: Lightning Release Chakra nature"));
                  } 
                } 
              } 
              if (rand7 == 8) {
                int rand91 = par2World.rand.nextInt(10) + 1;
                props.setWindRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncWindReleaseMessage(player), (EntityPlayerMP)player);
                props.setLightningRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncLightningReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWindRelease));
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerLightningRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have the Wind & Lightning Release Chakra nature"));
                if (rand92 == 1) {
                  if (rand93 == 1) {
                    props.setFireRelease(1);
                    PacketDispatcher.sendTo((IMessage)new SyncFireReleaseMessage(player), (EntityPlayerMP)player);
                    player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerFireRelease));
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have a third nature release: Fire Release Chakra nature"));
                  } 
                  if (rand93 == 2) {
                    props.setWaterRelease(1);
                    PacketDispatcher.sendTo((IMessage)new SyncWaterReleaseMessage(player), (EntityPlayerMP)player);
                    player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWaterRelease));
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have a third nature release: Water Release Chakra nature"));
                  } 
                  if (rand93 == 3) {
                    props.setWaterRelease(1);
                    PacketDispatcher.sendTo((IMessage)new SyncWaterReleaseMessage(player), (EntityPlayerMP)player);
                    player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWaterRelease));
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have a third nature release: Water Release Chakra nature"));
                  } 
                } 
                if (rand91 == 1) {
                  props.setcrystalRelease(1);
                  PacketDispatcher.sendTo((IMessage)new SynccrystalReleaseMessage(player), (EntityPlayerMP)player);
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText("You are one of the few people"));
                  player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerCrystalRelease));
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText("To unlock the Crystal Release Kekkei Genkai!"));
                } 
              } 
              if (rand7 == 9) {
                int rand91 = par2World.rand.nextInt(10) + 1;
                props.setWindRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncWindReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWindRelease));
                props.setWaterRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncWaterReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWaterRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have the Water Release Chakra nature"));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have the Wind & Water Release Chakra nature"));
                if (rand92 == 1) {
                  if (rand93 == 2) {
                    int rand94 = par2World.rand.nextInt(10) + 1;
                    props.setFireRelease(1);
                    PacketDispatcher.sendTo((IMessage)new SyncFireReleaseMessage(player), (EntityPlayerMP)player);
                    player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerFireRelease));
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have a third nature release: Fire Release Chakra nature"));
                  } 
                  if (rand93 == 3) {
                    props.setLightningRelease(1);
                    PacketDispatcher.sendTo((IMessage)new SyncLightningReleaseMessage(player), (EntityPlayerMP)player);
                    player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerLightningRelease));
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have a third nature release: Lightning Release Chakra nature"));
                  } 
                } 
                if (rand91 == 1) {
                  props.setmagnetRelease(1);
                  PacketDispatcher.sendTo((IMessage)new SyncmagnetReleaseMessage(player), (EntityPlayerMP)player);
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText("You are one of the few people"));
                  player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerMagnetRelease));
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText("To unlock the Magnet Release Kekkei Genkai!"));
                } 
              } 
              if (rand7 == 10) {
                int rand91 = par2World.rand.nextInt(10) + 1;
                props.setLightningRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncLightningReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerLightningRelease));
                props.setWaterRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncWaterReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWaterRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have the Lightning & Water Release Chakra nature"));
                if (rand92 == 1) {
                  if (rand93 == 1) {
                    props.setWindRelease(1);
                    PacketDispatcher.sendTo((IMessage)new SyncWindReleaseMessage(player), (EntityPlayerMP)player);
                    player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWindRelease));
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have a third nature release: Wind Release Chakra nature"));
                  } 
                  if (rand93 == 2) {
                    props.setFireRelease(1);
                    PacketDispatcher.sendTo((IMessage)new SyncFireReleaseMessage(player), (EntityPlayerMP)player);
                    player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerFireRelease));
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText("You have a third nature release: Fire Release Chakra nature"));
                  } 
                } 
                if (rand91 == 1) {
                  props.setsteelRelease(1);
                  PacketDispatcher.sendTo((IMessage)new SyncsteelReleaseMessage(player), (EntityPlayerMP)player);
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText("You are one of the few people"));
                  player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerSteelRelease));
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText("To unlock the Steel Release Kekkei Genkai!"));
                } 
              } 
            } 
          } 
        } else {
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("You Cannot use block Item in Creative Mode!"));
        } 
      } else {
        player.addChatComponentMessage((IChatComponent)new ChatComponentText("You need 7 empty Spaces in your inventory to use block Item."));
      } 
    } 
    return par1ItemStack;
  }
}

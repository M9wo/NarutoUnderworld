package alcoholmod.Mathioks;

import alcoholmod.Mathioks.ExtraFunctions.SyncBijuuFormActiveMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncBijuuScaleMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncBijuuUnlockMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncByakugouMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncChakraExperienceMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncEarthReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncFireReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncIzanagiMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncKarmaSealActiveMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncNinjutsuMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSharinganActiveMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSharinganMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSharinganSizeMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSharinganUnlockMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSixPathsOrbsMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSizeMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSusanoAMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSusanoMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncWaterReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncWindReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncYangReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncYinReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncboilReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SynclavaReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncmagnetReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncrinneganMessage;
import alcoholmod.Mathioks.block.Blockss;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import lc208.tools;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.event.entity.living.LivingHealEvent;
import net.minecraftforge.event.entity.living.LivingPackSizeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;

public class Events {
  public static float Chakra;
  
  private int IzanagiCounter = 0;
  
  private int ByakugouCounter = 0;
  
  private int KarmaSealCounter = 0;
  
  private int KarmaActiveCounter = 0;
  
  private int SixPathsOrbsCounter = 0;
  
  private int counter = 0;
  
  private int TsunadeCounter = 0;
  
  @SubscribeEvent
  public void onEntityConstructing(EntityEvent.EntityConstructing event) {
    if (event.entity instanceof EntityPlayer && ExtendedPlayer.get((EntityPlayer)event.entity) == null)
      ExtendedPlayer.register((EntityPlayer)event.entity); 
  }
  
  @SubscribeEvent
  public void WoodStyleHealing(LivingHealEvent event) {
    if (event.entity instanceof EntityPlayer) {
      ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)event.entity);
      if (props.getwoodRelease() == 1)
        if (props.getLevel() < 1000) {
          event.amount = 1.0F;
        } else {
          event.amount = 2.0F;
        }  
    } 
  }
  
  @SubscribeEvent
  public void ChangePlayerHeight(LivingPackSizeEvent event) {}
  
  @SubscribeEvent
  public void onTossedItem(ItemTossEvent event) {
    Item item = event.entityItem.getEntityItem().getItem();
    if (item instanceof alcoholmod.Mathioks.Final.BoilReleaseFlowerRepentanceTechniqe || item instanceof alcoholmod.Mathioks.Final.BoilReleaseMeltdown || item instanceof alcoholmod.Mathioks.Final.BoilReleasePropulsionFist) {
      event.setCanceled(true);
      if (event.player instanceof EntityPlayer)
        event.player.inventory.addItemStackToInventory(new ItemStack(item)); 
    } 
  }
  
  @SubscribeEvent
  public void onLivingFallEvent(LivingFallEvent event) {
    if (event.entity instanceof EntityPlayer) {
      ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)event.entity);
      if (event.distance > 3.0F && props.getCurrentMana() > 0) {
        float reduceby = (props.getCurrentMana() < event.distance - 3.0F) ? props.getCurrentMana() : (event.distance - 3.0F);
        event.distance -= reduceby;
      } 
    } 
  }
  
  @SubscribeEvent
  public void onJoinWorld(EntityJoinWorldEvent event) {
    if (event.entity instanceof EntityPlayerMP) {
      ExtendedPlayer.get((EntityPlayer)event.entity).fixStats();
      PacketDispatcher.sendTo(new SyncPlayerPropsMessage((EntityPlayer)event.entity), (EntityPlayerMP)event.entity);
    } 
  }
  
  @SubscribeEvent
  public void onClonePlayer(PlayerEvent.Clone event) {
    ExtendedPlayer.get(event.entityPlayer).copy(ExtendedPlayer.get(event.original));
  }
  
  @SubscribeEvent
  public void onLivingUpdate(LivingEvent.LivingUpdateEvent event) {
    if (event.entity instanceof EntityPlayer) {
      EntityPlayer player = (EntityPlayer)event.entity;
      ExtendedPlayer.get(player).onUpdate();
      if (event.entityLiving instanceof EntityPlayer) {
        ExtendedPlayer props = ExtendedPlayer.get(player);
        if (props.getDrunkenFist() && player.isPotionActive(Potion.confusion.id)) {
          player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
          player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
          player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
        } 
        if (player.getActivePotionEffect(Potion.blindness) != null && player.getActivePotionEffect(Potion.blindness).getDuration() == 0)
          player.removePotionEffect(Potion.blindness.id); 
        if (props.getIzanagi() == 1 && props.getSharingan() >= 3) {
          this.IzanagiCounter++;
          if (this.IzanagiCounter >= 24000) {
            props.setIzanagi(2);
            PacketDispatcher.sendToServer((IMessage)new SyncIzanagiMessage(player));
            this.IzanagiCounter = 0;
            player.addChatMessage((IChatComponent)new ChatComponentText("Your Sharingan Recovered from Izanagi"));
          } 
        } 
        if (props.isNekomode() && !player.isPotionActive(Potion.nightVision.id))
          player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 2147483647, 0)); 
        if (props.getSixPathsOrbs() < 6 && props.getSixPaths() && props.getSixPathsMode() && !props.getSixPathsShield()) {
          this.SixPathsOrbsCounter++;
          if (this.SixPathsOrbsCounter == 600) {
            props.setSixPathsOrbs(props.getSixPathsOrbs() + 1);
            PacketDispatcher.sendToServer((IMessage)new SyncSixPathsOrbsMessage(player));
            this.SixPathsOrbsCounter = 0;
          } 
        } 
        if (props.getSixPathsShield() && props.getSixPathsOrbs() == 0 && props.getSixPathsMode() && props.getSixPaths()) {
          player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
          player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 250));
          player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 5, 6));
          player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 128));
        } 
        if (props.getCurseSize() == 2 && 
          props.getCurseSealActive())
          if (props.getClanName().contains("Jugo")) {
            player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
            player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
            player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
          } else {
            if (props.getCurseSeal() == 3) {
              player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
              player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
            } 
            if (props.getCurseSeal() == 6)
              player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1)); 
            if (props.getCurseSeal() == 9) {
              player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
              player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
              player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
            } 
            if (props.getCurseSeal() == 12) {
              player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));
              player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
            } 
            if (props.getCurseSeal() == 15) {
              player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
              player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
            } 
            if (props.getCurseSeal() == 18) {
              player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
              player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
              player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
            } 
          }  
        if (props.getSageActive() && props.getSageVersion() >= 1 && !props.getSixPathsState()) {
          if (props.getSageVersion() == 1) {
            player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
            player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));
          } 
          if (props.getSageVersion() == 2 || props.getSageVersion() == 4) {
            player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
            player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
          } 
          if (props.getSageVersion() == 3) {
            if (this.TsunadeCounter == 0) {
              player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 2));
              this.TsunadeCounter = 100;
            } 
            if (this.TsunadeCounter > 0)
              this.TsunadeCounter--; 
            player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
          } 
        } 
        if (props.getSixPathsState()) {
          player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 3));
          player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));
          player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 1));
          if (props.getSageActive())
            props.setSageActive(false); 
        } 
        if (props.getByakuganActive())
          if (props.getByakuganSize() == 2) {
            player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 5, 0));
          } else if (props.getByakuganSize() == 3) {
            player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 5, 0));
            player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
            player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
          }  
        if (props.getBijuuScale() == 15) {
          this.counter++;
          if (this.counter == 20) {
            player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 25, 3));
            player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 25, 3));
            player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 25, 0));
            player.addPotionEffect(new PotionEffect(Potion.resistance.id, 25, 1));
            props.consumeMana(18);
            this.counter = 0;
          } 
          if (props.getCurrentMana() <= 17) {
            props.setBijuuScale(1);
            PacketDispatcher.sendToServer((IMessage)new SyncBijuuScaleMessage(player));
            props.setBijuuFormActive(false);
            PacketDispatcher.sendToServer((IMessage)new SyncBijuuFormActiveMessage(player));
            player.removePotionEffect(Potion.damageBoost.id);
            player.removePotionEffect(Potion.regeneration.id);
            player.removePotionEffect(Potion.moveSpeed.id);
            player.removePotionEffect(Potion.resistance.id);
          } 
        } 
        if (props.getByakugou() == 2) {
          if (props.getCurrentMana() >= 1) {
            this.ByakugouCounter++;
            if (this.ByakugouCounter == 20) {
              player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 25, 4));
              props.consumeMana(41 - props.getHealth() / 25);
              this.ByakugouCounter = 0;
            } 
          } 
          if (props.getCurrentMana() <= 17) {
            props.setByakugou(1);
            PacketDispatcher.sendToServer((IMessage)new SyncByakugouMessage(player));
            player.removePotionEffect(Potion.regeneration.id);
          } 
        } 
        if (props.getKarmaSealSize() == 2 && props.getKarmaSealActive()) {
          if (props.getCurrentMana() >= 1) {
            this.KarmaSealCounter++;
            if (this.KarmaSealCounter == 50) {
              props.consumeMana(25);
              this.KarmaSealCounter = 0;
            } 
          } 
          if (props.getCurrentMana() <= 9) {
            props.setKarmaSealActive(false);
            PacketDispatcher.sendToServer((IMessage)new SyncKarmaSealActiveMessage(player));
          } 
          player.addPotionEffect(new PotionEffect(Potion.resistance.id, 25, 2));
          player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 25, 2));
          player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 25, 1));
          player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 25, 1));
        } 
        if (props.getKarmaSealSize() == 1) {
          if (props.getCurrentMana() >= 500 && !props.getKarmaSealActive() && player.getHealth() <= 16.0F) {
            int i = event.entity.worldObj.rand.nextInt(600) * 10;
            if (event.entity.worldObj.getWorldTime() != 0L && i != 0 && event.entity.worldObj.getWorldTime() % i == 0L) {
              this.KarmaActiveCounter++;
              if (this.KarmaActiveCounter > 200) {
                props.setKarmaSealActive(true);
                PacketDispatcher.sendToServer((IMessage)new SyncKarmaSealActiveMessage(player));
                if (props.getKarmaSealType() == 1) {
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.BLUE + "You feel your palm pulsate as the Karma Seal"));
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.BLUE + "starts spreading across your body"));
                } 
                if (props.getKarmaSealType() == 2 || props.getKarmaSealType() == 3) {
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.BLUE + "You feel your palm pulsate as the Karma Seal"));
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.BLUE + "starts spreading across your body"));
                } 
                this.KarmaActiveCounter = 0;
              } 
            } 
          } 
          if (props.getKarmaSealActive()) {
            this.KarmaActiveCounter++;
            this.KarmaSealCounter++;
            if (this.KarmaSealCounter == 28) {
              props.consumeMana(25);
              this.KarmaSealCounter = 0;
            } 
            if (this.KarmaActiveCounter > 900) {
              props.setKarmaSealActive(false);
              PacketDispatcher.sendToServer((IMessage)new SyncKarmaSealActiveMessage(player));
              player.addPotionEffect(new PotionEffect(Potion.confusion.id, 80, 0));
              player.addPotionEffect(new PotionEffect(Potion.blindness.id, 30, 0));
            } 
            if (props.getCurrentMana() <= 34) {
              props.setKarmaSealActive(false);
              PacketDispatcher.sendToServer((IMessage)new SyncKarmaSealActiveMessage(player));
              player.addPotionEffect(new PotionEffect(Potion.confusion.id, 200, 0));
              player.addPotionEffect(new PotionEffect(Potion.blindness.id, 80, 0));
            } 
            player.addPotionEffect(new PotionEffect(Potion.resistance.id, 25, 7));
            player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 25, 2));
            player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 25, 1));
            player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 25, 1));
          } 
        } 
        if (props.getChakraControl()) {
          if (player.isCollidedHorizontally)
            if (player.isSneaking()) {
              player.motionY = -0.1D + ExtendedPlayer.get(player).getSpeed() * 2.0D - 0.2D;
              player.fallDistance = 0.0F;
            } else {
              player.motionY = 0.1D + ExtendedPlayer.get(player).getSpeed() * 2.0D - 0.2D;
              player.fallDistance = 0.0F;
            }  
          if (player.worldObj.getBlock((int)player.posX, (int)player.boundingBox.minY, (int)player.posZ) == Blocks.water && !player.capabilities.isCreativeMode) {
            player.onGround = true;
            if (player.motionY < 0.0D) {
              double Ppos = player.posY += -player.motionY;
              player.motionY = 0.0D;
              player.fallDistance = 0.0F;
            } 
          } 
        } 
        int randTime2 = props.getHealth() + 20;
        double extraSpeed = props.getSpeed();
        double kenjutsu = props.getKenjutsu();
        double taijutsu = props.getTaijutsu();
        int genjutsu = props.getGenjutsu();
        if ((props.getSusanoA() && props.getSharinganActive() && props.getSusanoTransformed() && props.getSusanoActive() == 5 && (props.getSharingan() == 5 || props.getSharingan() == 6 || props.getSharingan() == 4)) || (props.getBijuuKind() == 7 && props.getSize() == 4.0D))
          player.capabilities.allowFlying = true; 
        if (!event.entity.worldObj.isRemote) {
          if (props.getSharingan() == 0 && props.getsharinganicon() == 1 && event.entity.worldObj.getWorldTime() % 100L == 0L) {
            int randTime = event.entity.worldObj.rand.nextInt(1000) * 10;
            if (event.entity.worldObj.getWorldTime() != 0L && randTime != 0 && event.entity.worldObj.getWorldTime() % randTime == 0L) {
              double Unlock = props.getSharinganUnlock();
              Unlock += 0.5D;
              props.setSharinganUnlock(Unlock);
              PacketDispatcher.sendTo((IMessage)new SyncSharinganUnlockMessage(player), (EntityPlayerMP)player);
              if (props.getSharinganUnlock() >= 250.0D) {
                if (props.getmangekyouSharingan() == 50) {
                  props.setSharingan(100);
                } else {
                  props.setSharingan(1);
                } 
                PacketDispatcher.sendTo((IMessage)new SyncSharinganMessage(player), (EntityPlayerMP)player);
                props.setSharinganActive(true);
                PacketDispatcher.sendTo((IMessage)new SyncSharinganActiveMessage(player), (EntityPlayerMP)player);
                props.setSharinganUnlock(0.0D);
                PacketDispatcher.sendTo((IMessage)new SyncSharinganUnlockMessage(player), (EntityPlayerMP)player);
                player.addPotionEffect(new PotionEffect(Potion.blindness.id, 150, 10));
                player.addPotionEffect(new PotionEffect(Potion.confusion.id, 250, 10));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You suddenly feel a surge of power through you as you awaken the Sharingan!"));
              } 
            } 
          } 
          if ((props.getSharingan() == 3 || props.getSharingan() == 102) && props.getSharinganSize() == 0.0D && event.entity.worldObj.getWorldTime() % 100L == 0L) {
            int randTime = event.entity.worldObj.rand.nextInt(1000) * 10;
            if (event.entity.worldObj.getWorldTime() != 0L && randTime != 0 && event.entity.worldObj.getWorldTime() % randTime == 0L) {
              double Unlock = props.getSharinganUnlock();
              Unlock += 0.5D;
              props.setSharinganUnlock(Unlock);
              PacketDispatcher.sendTo((IMessage)new SyncSharinganUnlockMessage(player), (EntityPlayerMP)player);
              if (props.getSharinganUnlock() >= 400.0D && props.getSharinganUnlock() < 800.0D) {
                int EmptySpaces = tools.freeSpace(player.inventory.mainInventory);
                if (EmptySpaces >= 1) {
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText("A pitch black crow gave you a letter!"));
                  player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.UchihaLetter));
                  props.setSharinganUnlock(810.0D);
                  PacketDispatcher.sendTo((IMessage)new SyncSharinganUnlockMessage(player), (EntityPlayerMP)player);
                } 
              } 
            } 
          } 
          if (props.getSharinganSize() == 1.0D && props.getmangekyouSharingan() >= 1 && event.entity.worldObj.getWorldTime() % 100L == 0L) {
            int randTime = event.entity.worldObj.rand.nextInt(1000) * 10;
            if (event.entity.worldObj.getWorldTime() != 0L && randTime != 0 && event.entity.worldObj.getWorldTime() % randTime == 0L) {
              double Unlock = props.getSharinganUnlock();
              Unlock += 0.5D;
              props.setSharinganUnlock(Unlock);
              PacketDispatcher.sendTo((IMessage)new SyncSharinganUnlockMessage(player), (EntityPlayerMP)player);
              if (props.getSharinganUnlock() >= 1300.0D && props.getSharinganUnlock() < 2200.0D) {
                int EmptySpaces = tools.freeSpace(player.inventory.mainInventory);
                if (EmptySpaces >= 1) {
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText("Your brothers crow appeared out of nowhere"));
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText("and handed you a letter before disolving..."));
                  player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.UchihaLetter2));
                  props.setSharinganUnlock(2210.0D);
                  PacketDispatcher.sendTo((IMessage)new SyncSharinganUnlockMessage(player), (EntityPlayerMP)player);
                } 
              } 
            } 
          } 
          if (props.getSharinganSize() == 2.0D && props.getmangekyouSharingan() >= 1 && props.getYinRelease() == 1 && props.getYangRelease() == 1 && props.getFireRelease() == 1 && props.getWindRelease() == 1 && props.getLightningRelease() == 1 && props.getLevel() >= 500 && event.entity.worldObj.getWorldTime() % 100L == 0L) {
            int randTime = event.entity.worldObj.rand.nextInt(1000) * 10;
            if (event.entity.worldObj.getWorldTime() != 0L && randTime != 0 && event.entity.worldObj.getWorldTime() % randTime == 0L) {
              double Unlock = props.getSharinganUnlock();
              Unlock += 0.5D;
              props.setSharinganUnlock(Unlock);
              PacketDispatcher.sendTo((IMessage)new SyncSharinganUnlockMessage(player), (EntityPlayerMP)player);
              if (props.getSharinganUnlock() >= 4000.0D && props.getSharinganUnlock() < 8000.0D) {
                int EmptySpaces = tools.freeSpace(player.inventory.mainInventory);
                if (EmptySpaces >= 1) {
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText("You suddenly start feeling changes in your eyes..."));
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText("It seems like they're going through a mutation..."));
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText("You feel a surge of power flowing through you as you unlock the Rinnegan."));
                  player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerRinnegan));
                  props.setSharinganSize(3.0D);
                  PacketDispatcher.sendTo((IMessage)new SyncSharinganSizeMessage(player), (EntityPlayerMP)player);
                  props.setSharinganUnlock(0.0D);
                  PacketDispatcher.sendTo((IMessage)new SyncSharinganUnlockMessage(player), (EntityPlayerMP)player);
                  props.setrinnegan(1);
                  PacketDispatcher.sendTo((IMessage)new SyncrinneganMessage(player), (EntityPlayerMP)player);
                  if (props.getmangekyouSharingan() == 50) {
                    props.setSharingan(151);
                    PacketDispatcher.sendTo((IMessage)new SyncSharinganMessage(player), (EntityPlayerMP)player);
                  } else if (props.getmangekyouSharingan() == 7) {
                    props.setSharingan(161);
                    PacketDispatcher.sendTo((IMessage)new SyncSharinganMessage(player), (EntityPlayerMP)player);
                  } else if (props.getmangekyouSharingan() == 10) {
                    props.setSharingan(165);
                    PacketDispatcher.sendTo((IMessage)new SyncSharinganMessage(player), (EntityPlayerMP)player);
                  } else {
                    props.setSharingan(150);
                    PacketDispatcher.sendTo((IMessage)new SyncSharinganMessage(player), (EntityPlayerMP)player);
                  } 
                } 
              } 
            } 
          } 
          String name = "Tailed Beast: ";
          if (props.getBijuuKind() == 1)
            name = "Shukaku: "; 
          if (props.getBijuuKind() == 2)
            name = "Matatabi: "; 
          if (props.getBijuuKind() == 3)
            name = "Isobu: "; 
          if (props.getBijuuKind() == 4)
            name = "Son Goku: "; 
          if (props.getBijuuKind() == 5)
            name = "Kokuo: "; 
          if (props.getBijuuKind() == 6)
            name = "Saiken: "; 
          if (props.getBijuuKind() == 7)
            name = "Chomei: "; 
          if (props.getBijuuKind() == 8)
            name = "Gyuki: "; 
          if (props.getBijuuKind() == 9)
            name = "Kurama: "; 
          String name2 = "Tailed Beast";
          if (props.getBijuuKind() == 1)
            name2 = "Shukaku"; 
          if (props.getBijuuKind() == 2)
            name2 = "Matatabi"; 
          if (props.getBijuuKind() == 3)
            name2 = "Isobu"; 
          if (props.getBijuuKind() == 4)
            name2 = "Son Goku"; 
          if (props.getBijuuKind() == 5)
            name2 = "Kokuo"; 
          if (props.getBijuuKind() == 6)
            name2 = "Saiken"; 
          if (props.getBijuuKind() == 7)
            name2 = "Chomei"; 
          if (props.getBijuuKind() == 8)
            name2 = "Gyuki"; 
          if (props.getBijuuKind() == 9)
            name2 = "Kurama"; 
          if (props.getBijuuScale() != 0 && props.getBijuuKind() != 0) {
            if (props.getBijuuUnlock() >= 30.0D && player.getHealth() <= 10.0F)
              if (props.getSize() == 0.0D) {
                if (props.getJutsuPoints() >= 20) {
                  props.setSize(1.0D);
                  PacketDispatcher.sendTo((IMessage)new SyncSizeMessage(player), (EntityPlayerMP)player);
                  player.addPotionEffect(new PotionEffect(Potion.confusion.id, 250, 10));
                  if (props.getBijuuKind() != 10) {
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + name + "WEAKLING!! I'll grant you a piece of my chakra"));
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + name + "You best be grateful!!"));
                  } 
                  props.setBijuuScale(2);
                  PacketDispatcher.sendTo((IMessage)new SyncBijuuScaleMessage(player), (EntityPlayerMP)player);
                  props.setBijuuFormActive(true);
                  PacketDispatcher.sendTo((IMessage)new SyncBijuuFormActiveMessage(player), (EntityPlayerMP)player);
                  player.addPotionEffect(new PotionEffect(Potion.confusion.id, 250, 10));
                  player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 700, 1));
                  player.addPotionEffect(new PotionEffect(Potion.jump.id, 700, 1));
                  player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 700, 1));
                  player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 700, 0));
                  player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 350, 0));
                  player.addPotionEffect(new PotionEffect(Potion.resistance.id, 700, 1));
                  props.setNinjutsu(props.getNinjutsu() + 50);
                  PacketDispatcher.sendTo((IMessage)new SyncNinjutsuMessage(player), (EntityPlayerMP)player);
                  props.setBijuuUnlock(0.0D);
                  PacketDispatcher.sendTo((IMessage)new SyncBijuuUnlockMessage(player), (EntityPlayerMP)player);
                } 
              } else if (props.getSize() == 1.0D) {
                if (props.getJutsuPoints() >= 30) {
                  props.setSize(2.0D);
                  PacketDispatcher.sendTo((IMessage)new SyncSizeMessage(player), (EntityPlayerMP)player);
                  player.addPotionEffect(new PotionEffect(Potion.confusion.id, 250, 10));
                  if (props.getBijuuKind() != 10) {
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + name + "GROAAAH!! LET ME OUT!!!"));
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText("You suddenly feel " + name2 + " Taking over!"));
                  } 
                  props.setBijuuScale(3);
                  PacketDispatcher.sendTo((IMessage)new SyncBijuuScaleMessage(player), (EntityPlayerMP)player);
                  props.setBijuuFormActive(true);
                  PacketDispatcher.sendTo((IMessage)new SyncBijuuFormActiveMessage(player), (EntityPlayerMP)player);
                  player.addPotionEffect(new PotionEffect(Potion.confusion.id, 250, 10));
                  player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 700, 1));
                  player.addPotionEffect(new PotionEffect(Potion.jump.id, 700, 1));
                  player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 700, 1));
                  player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 700, 0));
                  player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 350, 0));
                  player.addPotionEffect(new PotionEffect(Potion.resistance.id, 700, 1));
                  if (props.getBijuuKind() != 10)
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + name + "You're too weak!!")); 
                  props.setNinjutsu(props.getNinjutsu() + 150);
                  PacketDispatcher.sendTo((IMessage)new SyncNinjutsuMessage(player), (EntityPlayerMP)player);
                  props.setBijuuUnlock(0.0D);
                  PacketDispatcher.sendTo((IMessage)new SyncBijuuUnlockMessage(player), (EntityPlayerMP)player);
                } 
              } else if (props.getSize() == 2.0D) {
                if (props.getJutsuPoints() >= 40) {
                  props.setSize(3.0D);
                  PacketDispatcher.sendTo((IMessage)new SyncSizeMessage(player), (EntityPlayerMP)player);
                  player.addPotionEffect(new PotionEffect(Potion.confusion.id, 250, 10));
                  if (props.getBijuuKind() != 10) {
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + name + "I'll take it from here!"));
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText("You suddenly feel " + name2 + " Taking over!"));
                  } 
                  props.setBijuuScale(4);
                  PacketDispatcher.sendTo((IMessage)new SyncBijuuScaleMessage(player), (EntityPlayerMP)player);
                  props.setBijuuFormActive(true);
                  PacketDispatcher.sendTo((IMessage)new SyncBijuuFormActiveMessage(player), (EntityPlayerMP)player);
                  player.addPotionEffect(new PotionEffect(Potion.confusion.id, 250, 10));
                  player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 700, 1));
                  player.addPotionEffect(new PotionEffect(Potion.jump.id, 700, 1));
                  player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 700, 1));
                  player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 700, 0));
                  player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 350, 0));
                  player.addPotionEffect(new PotionEffect(Potion.resistance.id, 700, 1));
                  if (props.getBijuuKind() != 10)
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + name + "You still don't have what it takes!!")); 
                  props.setNinjutsu(props.getNinjutsu() + 300);
                  PacketDispatcher.sendTo((IMessage)new SyncNinjutsuMessage(player), (EntityPlayerMP)player);
                  props.setBijuuUnlock(0.0D);
                  PacketDispatcher.sendTo((IMessage)new SyncBijuuUnlockMessage(player), (EntityPlayerMP)player);
                } 
              } else if (props.getSize() == 3.0D && props.getJutsuPoints() >= 50) {
                int EmptySpaces = tools.freeSpace(player.inventory.mainInventory);
                if (EmptySpaces >= 3) {
                  props.setSize(4.0D);
                  PacketDispatcher.sendTo((IMessage)new SyncSizeMessage(player), (EntityPlayerMP)player);
                  player.addPotionEffect(new PotionEffect(Potion.confusion.id, 250, 10));
                  if (props.getBijuuKind() != 10) {
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + name + "Heh.. To think I could become friends with"));
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + name + "a mere human..."));
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText("You suddenly feel a surge of chakra through your body"));
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + name + "Show me what you can do " + player.getCommandSenderName()));
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + name + "We'll make a good team!"));
                  } 
                  props.setNinjutsu(props.getNinjutsu() + 500);
                  PacketDispatcher.sendTo((IMessage)new SyncNinjutsuMessage(player), (EntityPlayerMP)player);
                  player.addPotionEffect(new PotionEffect(Potion.confusion.id, 250, 10));
                  player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 700, 1));
                  player.addPotionEffect(new PotionEffect(Potion.jump.id, 700, 1));
                  player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 700, 1));
                  player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 700, 0));
                  player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 350, 0));
                  player.addPotionEffect(new PotionEffect(Potion.resistance.id, 700, 1));
                  props.setBijuuUnlock(0.0D);
                  PacketDispatcher.sendTo((IMessage)new SyncBijuuUnlockMessage(player), (EntityPlayerMP)player);
                  if (props.getBijuuKind() == 1) {
                    if (props.getWindRelease() == 0) {
                      player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "You have acquired " + name2 + "'s Wind nature release!"));
                      props.setWindRelease(1);
                      PacketDispatcher.sendTo((IMessage)new SyncWindReleaseMessage(player), (EntityPlayerMP)player);
                      player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWindRelease));
                    } 
                    if (props.getEarthRelease() == 0) {
                      player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "You have acquired " + name2 + "'s Earth nature release!"));
                      props.setEarthRelease(1);
                      PacketDispatcher.sendTo((IMessage)new SyncEarthReleaseMessage(player), (EntityPlayerMP)player);
                      player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerEarthRelease));
                    } 
                    if (props.getmagnetRelease() == 0) {
                      player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "You have acquired " + name2 + "'s Magnet nature release!"));
                      props.setmagnetRelease(1);
                      PacketDispatcher.sendTo((IMessage)new SyncmagnetReleaseMessage(player), (EntityPlayerMP)player);
                      player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerMagnetRelease));
                    } 
                  } 
                  if (props.getBijuuKind() == 2 && props.getFireRelease() == 0) {
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "You have acquired Matatabi's Fire nature release!"));
                    props.setFireRelease(1);
                    PacketDispatcher.sendTo((IMessage)new SyncFireReleaseMessage(player), (EntityPlayerMP)player);
                    player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerMatatabiFireRelease));
                  } 
                  if (props.getBijuuKind() == 3 && props.getWaterRelease() == 0) {
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "You have acquired Isobu's Water nature release!"));
                    props.setWaterRelease(1);
                    PacketDispatcher.sendTo((IMessage)new SyncWaterReleaseMessage(player), (EntityPlayerMP)player);
                    player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWaterRelease));
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + "Isobu: I'll also allow you to breath underwater!"));
                  } 
                  if (props.getBijuuKind() == 4) {
                    if (props.getFireRelease() == 0) {
                      player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "You have acquired Son Goku's Fire nature release!"));
                      props.setFireRelease(1);
                      PacketDispatcher.sendTo((IMessage)new SyncFireReleaseMessage(player), (EntityPlayerMP)player);
                      player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerFireRelease));
                    } 
                    if (props.getEarthRelease() == 0) {
                      player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "You have acquired Son Goku's Earth nature release!"));
                      props.setEarthRelease(1);
                      PacketDispatcher.sendTo((IMessage)new SyncEarthReleaseMessage(player), (EntityPlayerMP)player);
                      player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerEarthRelease));
                    } 
                    if (props.getlavaRelease() == 0) {
                      player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "You have acquired Son Goku's Lava nature release!"));
                      props.setlavaRelease(1);
                      PacketDispatcher.sendTo((IMessage)new SynclavaReleaseMessage(player), (EntityPlayerMP)player);
                      player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerLavaRelease));
                    } 
                  } 
                  if (props.getBijuuKind() == 5) {
                    if (props.getWaterRelease() == 0) {
                      player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "You have acquired Kokuo's Water nature release!"));
                      props.setWaterRelease(1);
                      PacketDispatcher.sendTo((IMessage)new SyncWaterReleaseMessage(player), (EntityPlayerMP)player);
                      player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWaterRelease));
                    } 
                    if (props.getFireRelease() == 0) {
                      player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "You have acquired Kokuo's Fire nature release!"));
                      props.setFireRelease(1);
                      PacketDispatcher.sendTo((IMessage)new SyncFireReleaseMessage(player), (EntityPlayerMP)player);
                      player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerFireRelease));
                    } 
                    if (props.getboilRelease() == 0) {
                      player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "You have acquired Kokuo's Boil nature release!"));
                      props.setboilRelease(1);
                      PacketDispatcher.sendTo((IMessage)new SyncboilReleaseMessage(player), (EntityPlayerMP)player);
                      player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerBoilRelease));
                    } 
                  } 
                  if (props.getBijuuKind() == 6 && props.getWaterRelease() == 0) {
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "You have acquired Saiken's Water nature release!"));
                    props.setWaterRelease(1);
                    PacketDispatcher.sendTo((IMessage)new SyncWaterReleaseMessage(player), (EntityPlayerMP)player);
                    player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWaterRelease));
                  } 
                  if (props.getBijuuKind() == 7 && props.getWindRelease() == 0) {
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "You have acquired Chomei's Wind nature release!"));
                    props.setWindRelease(1);
                    PacketDispatcher.sendTo((IMessage)new SyncWindReleaseMessage(player), (EntityPlayerMP)player);
                    player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWindRelease));
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + "Chomei: I'll also allow you to fly!"));
                  } 
                  if (props.getBijuuKind() == 8 && props.getWaterRelease() == 0) {
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "You have acquired Gyuki's Water nature release!"));
                    props.setWaterRelease(1);
                    PacketDispatcher.sendTo((IMessage)new SyncWaterReleaseMessage(player), (EntityPlayerMP)player);
                    player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWaterRelease));
                  } 
                  if (props.getBijuuKind() == 9) {
                    if (props.getWindRelease() == 0) {
                      player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "You have acquired " + name2 + "'s Wind nature release!"));
                      props.setWindRelease(1);
                      PacketDispatcher.sendTo((IMessage)new SyncWindReleaseMessage(player), (EntityPlayerMP)player);
                      player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWindRelease));
                    } 
                    if (props.getYinRelease() == 0) {
                      player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "You have acquired " + name2 + "'s Yin nature release!"));
                      props.setYinRelease(1);
                      PacketDispatcher.sendTo((IMessage)new SyncYinReleaseMessage(player), (EntityPlayerMP)player);
                      player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerYinRelease));
                    } 
                    if (props.getYangRelease() == 0) {
                      player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "You have acquired " + name2 + "'s Yang nature release!"));
                      props.setYangRelease(1);
                      PacketDispatcher.sendTo((IMessage)new SyncYangReleaseMessage(player), (EntityPlayerMP)player);
                      player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerYangRelease));
                    } 
                  } 
                } 
              }  
            if (props.getSize() == 0.0D && props.getBijuuUnlock() <= 30.0D) {
              if (event.entity.worldObj.getWorldTime() % 100L == 0L) {
                randTime2 = event.entity.worldObj.rand.nextInt(4000) * 10;
                if (event.entity.worldObj.getWorldTime() != 0L && randTime2 != 0 && event.entity.worldObj.getWorldTime() % randTime2 == 0L) {
                  double Unlock = props.getBijuuUnlock();
                  double UnlockAdditional = Unlock + 0.5D;
                  props.setBijuuUnlock(UnlockAdditional);
                  PacketDispatcher.sendTo((IMessage)new SyncBijuuUnlockMessage(player), (EntityPlayerMP)player);
                } 
              } 
              if (player.getHealth() <= 10.0F) {
                randTime2 = event.entity.worldObj.rand.nextInt(2000) * 10;
                if (event.entity.worldObj.getWorldTime() != 0L && randTime2 != 0 && event.entity.worldObj.getWorldTime() % randTime2 == 0L) {
                  player.addPotionEffect(new PotionEffect(Potion.confusion.id, 250, 10));
                  player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 700, 1));
                  player.addPotionEffect(new PotionEffect(Potion.jump.id, 700, 1));
                  player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 700, 1));
                  player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 700, 0));
                  player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 350, 0));
                  player.addPotionEffect(new PotionEffect(Potion.resistance.id, 700, 1));
                  props.regenMana(50);
                  if (props.getBijuuKind() != 10) {
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + name + "Don't die on me kid!"));
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + name + "I'll grant you some of my power for this once!"));
                  } 
                } 
              } 
            } 
            if (props.getSize() == 1.0D && props.getBijuuUnlock() <= 30.0D) {
              if (event.entity.worldObj.getWorldTime() % 100L == 0L) {
                randTime2 = event.entity.worldObj.rand.nextInt(4000) * 10;
                if (event.entity.worldObj.getWorldTime() != 0L && randTime2 != 0 && event.entity.worldObj.getWorldTime() % randTime2 == 0L) {
                  double Unlock = props.getBijuuUnlock();
                  double UnlockAdditional = Unlock + 0.5D;
                  props.setBijuuUnlock(UnlockAdditional);
                  PacketDispatcher.sendTo((IMessage)new SyncBijuuUnlockMessage(player), (EntityPlayerMP)player);
                } 
              } 
              if (player.getHealth() <= 10.0F) {
                randTime2 = event.entity.worldObj.rand.nextInt(2000) * 10;
                if (event.entity.worldObj.getWorldTime() != 0L && randTime2 != 0 && event.entity.worldObj.getWorldTime() % randTime2 == 0L) {
                  player.addPotionEffect(new PotionEffect(Potion.confusion.id, 250, 10));
                  player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 700, 1));
                  player.addPotionEffect(new PotionEffect(Potion.jump.id, 700, 1));
                  player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 700, 1));
                  player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 700, 0));
                  player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 350, 0));
                  player.addPotionEffect(new PotionEffect(Potion.resistance.id, 700, 1));
                  props.regenMana(50);
                  if (props.getBijuuKind() != 10) {
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + name + "Hey! I told you not to die!"));
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + name + "Guess you really can't do it without my help!"));
                  } 
                } 
              } 
            } 
            if (props.getSize() == 2.0D && props.getBijuuUnlock() <= 30.0D) {
              if (event.entity.worldObj.getWorldTime() % 100L == 0L) {
                randTime2 = event.entity.worldObj.rand.nextInt(4000) * 10;
                if (event.entity.worldObj.getWorldTime() != 0L && randTime2 != 0 && event.entity.worldObj.getWorldTime() % randTime2 == 0L) {
                  double Unlock = props.getBijuuUnlock();
                  double UnlockAdditional = Unlock + 0.5D;
                  props.setBijuuUnlock(UnlockAdditional);
                  PacketDispatcher.sendTo((IMessage)new SyncBijuuUnlockMessage(player), (EntityPlayerMP)player);
                } 
              } 
              if (player.getHealth() <= 10.0F) {
                randTime2 = event.entity.worldObj.rand.nextInt(2000) * 10;
                if (event.entity.worldObj.getWorldTime() != 0L && randTime2 != 0 && event.entity.worldObj.getWorldTime() % randTime2 == 0L) {
                  player.addPotionEffect(new PotionEffect(Potion.confusion.id, 250, 10));
                  player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 700, 1));
                  player.addPotionEffect(new PotionEffect(Potion.jump.id, 700, 1));
                  player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 700, 1));
                  player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 700, 0));
                  player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 350, 0));
                  player.addPotionEffect(new PotionEffect(Potion.resistance.id, 700, 1));
                  props.regenMana(50);
                  if (props.getBijuuKind() != 10) {
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + name + "You got this much of my chakra but still can't"));
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + name + "survive on your own?.. Pathetic Jinchuuriki..."));
                  } 
                } 
              } 
            } 
            if (props.getSize() == 3.0D && props.getBijuuUnlock() <= 30.0D) {
              if (event.entity.worldObj.getWorldTime() % 100L == 0L) {
                randTime2 = event.entity.worldObj.rand.nextInt(4000) * 10;
                if (event.entity.worldObj.getWorldTime() != 0L && randTime2 != 0 && event.entity.worldObj.getWorldTime() % randTime2 == 0L) {
                  double Unlock = props.getBijuuUnlock();
                  double UnlockAdditional = Unlock + 0.5D;
                  props.setBijuuUnlock(UnlockAdditional);
                  PacketDispatcher.sendTo((IMessage)new SyncBijuuUnlockMessage(player), (EntityPlayerMP)player);
                } 
              } 
              if (player.getHealth() <= 10.0F) {
                randTime2 = event.entity.worldObj.rand.nextInt(2000) * 10;
                if (event.entity.worldObj.getWorldTime() != 0L && randTime2 != 0 && event.entity.worldObj.getWorldTime() % randTime2 == 0L) {
                  player.addPotionEffect(new PotionEffect(Potion.confusion.id, 250, 10));
                  player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 700, 1));
                  player.addPotionEffect(new PotionEffect(Potion.jump.id, 700, 1));
                  player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 700, 1));
                  player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 700, 0));
                  player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 350, 0));
                  player.addPotionEffect(new PotionEffect(Potion.resistance.id, 700, 1));
                  props.regenMana(50);
                  if (props.getBijuuKind() != 10) {
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + name + "You're in danger, here!"));
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + name + "Put that chakra to good use!"));
                  } 
                } 
              } 
            } 
          } 
          if (props.getBijuuScale() != 0 && props.getBijuuKind() != 0 && props.getBijuuKind() != 10 && props.getSize() >= 1.0D && player.worldObj.getWorldTime() % 1500L == 0L) {
            randTime2 = player.worldObj.rand.nextInt(1000) * 500;
            if (player.worldObj.getWorldTime() != 0L && randTime2 != 0 && player.worldObj.getWorldTime() % randTime2 == 0L) {
              if (props.getBijuuKind() == 1)
                name = "Shukaku: "; 
              if (props.getBijuuKind() == 2)
                name = "Matatabi: "; 
              if (props.getBijuuKind() == 3)
                name = "Isobu: "; 
              if (props.getBijuuKind() == 4)
                name = "Son Goku: "; 
              if (props.getBijuuKind() == 5)
                name = "Kokuo: "; 
              if (props.getBijuuKind() == 6)
                name = "Saiken: "; 
              if (props.getBijuuKind() == 7)
                name = "Chomei: "; 
              if (props.getBijuuKind() == 8)
                name = "Gyuki: "; 
              if (props.getBijuuKind() == 9)
                name = "Kurama: "; 
              if (props.getSize() == 1.0D) {
                int rand = player.worldObj.rand.nextInt(3);
                if (rand == 0) {
                  player.addChatMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + name + "I suppose I can't kill you, can I? After all, you die,"));
                  player.addChatMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + name + "I die. Your courage is impressive, little kid..."));
                } 
                if (rand == 1) {
                  player.addChatMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + name + "You runt, you really are weak!"));
                  player.addChatMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + name + "You better be grateful to me... "));
                } 
                if (rand == 2) {
                  player.addChatMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + name + "Destroy everything... Erase everything that"));
                  player.addChatMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + name + "hurts you... Entrust your heart to me... "));
                  player.addChatMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + name + "I will save you from your pain..."));
                } 
              } 
              if (props.getSize() == 2.0D) {
                int rand = player.worldObj.rand.nextInt(3);
                if (rand == 0)
                  player.addChatMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + name + "You don't have what it takes to control my power!")); 
                if (rand == 1)
                  player.addChatMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + name + "You're nothing more than a mere fragment of my hatred!")); 
                if (rand == 2) {
                  player.addChatMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + name + "Destroy everything... Erase everything that"));
                  player.addChatMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + name + "hurts you... Entrust your heart to me... "));
                  player.addChatMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + name + "I will save you from your pain..."));
                } 
              } 
              if (props.getSize() == 3.0D) {
                int rand = player.worldObj.rand.nextInt(3);
                if (rand == 0) {
                  player.addChatMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + name + "You have no idea what it's like being"));
                  player.addChatMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + name + "Sealed inside you all the time..."));
                } 
                if (rand == 1) {
                  player.addChatMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + name + "No matter what words they use..."));
                  player.addChatMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + name + "Humans will always say the same thing!"));
                } 
                if (rand == 2) {
                  player.addChatMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + name + "You know... Maybe you really are different"));
                  player.addChatMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + name + "Than the other ones...."));
                } 
              } 
              if (props.getSize() == 4.0D) {
                int rand = player.worldObj.rand.nextInt(5);
                if (rand == 0) {
                  player.addChatMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + name + player.getCommandSenderName() + "... If you really"));
                  player.addChatMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + name + "want to do something for this world..."));
                  player.addChatMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + name + "then do what you've always done... "));
                  player.addChatMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + name + "Prove it to us with your actions!"));
                  player.addChatMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + name + "That's who you are!"));
                } 
                if (rand == 1)
                  player.addChatMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + name + "Man, I'm hungry!")); 
                if (rand == 2) {
                  player.addChatMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + name + "I think we should take a day off.."));
                  player.addChatMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + name + "Even tailed beasts and jinchuuriki"));
                  player.addChatMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + name + "Deserve some rest!"));
                } 
                if (rand == 3) {
                  if (!player.worldObj.isDaytime())
                    player.addChatMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + name + "What a nice starry night!")); 
                  if (player.worldObj.isDaytime())
                    player.addChatMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + name + "What a beautiful day it is today!")); 
                } 
                if (rand == 4) {
                  player.addChatMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + name + "Destroy everything... and let me out!!"));
                  player.addChatMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + name + "Haha got you! the good old times!"));
                } 
              } 
            } 
          } 
        } 
      } 
      if (player.worldObj.getBlock((int)player.posX, (int)player.posY - 1, (int)player.posZ) == Blockss.naraShadowBlock && !player.capabilities.isCreativeMode) {
        player.setSprinting(false);
        player.motionY = 0.0D;
        player.fallDistance = 0.0F;
      } 
    } 
  }
  
  @SubscribeEvent
  public void onLivingJumpEvent(LivingEvent.LivingJumpEvent event) {
    if (event.entity instanceof EntityPlayer) {
      EntityPlayer player = (EntityPlayer)event.entity;
      ExtendedPlayer props = ExtendedPlayer.get(player);
      if (player.isSprinting() && props.ChakraControl) {
        Entity var10000 = event.entity;
        var10000.motionY += 0.1D + ExtendedPlayer.get(player).getSpeed() * 1.0D - 0.2D;
      } else if (props.getBijuuFormActive() && props.getBijuuScale() >= 5) {
        Entity var10000 = event.entity;
        var10000.motionY += 1.0D + ExtendedPlayer.get(player).getSpeed() * 2.0D - 0.2D;
      } else if (props.getCurseSealActive() && (props.getCurseSeal() == 3 || props.getCurseSeal() == 6)) {
        Entity var10000 = event.entity;
        var10000.motionY += 0.3D + ExtendedPlayer.get(player).getSpeed() * 2.0D - 0.2D;
      } 
      if (player.worldObj.getBlock((int)player.posX, (int)player.posY - 1, (int)player.posZ) != Blockss.naraShadowBlock || player.capabilities.isCreativeMode);
    } 
  }
  
  @SubscribeEvent
  public void onChakraKill(LivingDeathEvent event) {
    if (!event.entity.worldObj.isRemote)
      if (event.source.getSourceOfDamage() instanceof EntityPlayer && event.source.getEntity() instanceof EntityPlayer) {
        EntityPlayer player = (EntityPlayer)event.source.getEntity();
        ExtendedPlayer props = ExtendedPlayer.get(player);
      } else if (event.entity instanceof EntityPlayer) {
        EntityPlayer player = (EntityPlayer)event.entityLiving;
        ExtendedPlayer props = ExtendedPlayer.get(player);
        if (props.getIzanagi() == 2) {
          event.setCanceled(true);
          player.setHealth(20.0F);
          props.setIzanagi(1);
          PacketDispatcher.sendTo((IMessage)new SyncChakraExperienceMessage(player), (EntityPlayerMP)player);
          PacketDispatcher.sendTo((IMessage)new SyncIzanagiMessage(player), (EntityPlayerMP)player);
          player.addChatMessage((IChatComponent)new ChatComponentText("Izanagi!!"));
          if (props.getSusanoA()) {
            props.setSusanoActive(0);
            props.setSusanoA(false);
            PacketDispatcher.sendTo((IMessage)new SyncSusanoAMessage(player), (EntityPlayerMP)player);
            PacketDispatcher.sendTo((IMessage)new SyncSusanoMessage(player), (EntityPlayerMP)player);
          } 
        } 
        if (props.getDeathPossession() == 2) {
          event.setCanceled(true);
          player.setHealth(10.0F);
        } 
      }  
  }
}

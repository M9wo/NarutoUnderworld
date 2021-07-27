package alcoholmod.Mathioks.item;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SyncSharinganActiveMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSharinganMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSharinganSizeMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSharinganUnlockMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncmangekyouSharinganMessage;
import alcoholmod.Mathioks.PacketDispatcher;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import lc208.tools;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class UchihaLetter extends Item {
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
      par1ItemStack.stackTagCompound.setBoolean("start", false);
      par1ItemStack.stackTagCompound.setInteger("counter", 0);
    } 
    if (par1ItemStack.stackTagCompound != null) {
      EntityPlayer player = (EntityPlayer)par3Entity;
      ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)par3Entity);
      int counter = par1ItemStack.stackTagCompound.getInteger("counter");
      if (par1ItemStack.stackTagCompound.getBoolean("start") && par1ItemStack.stackTagCompound.getBoolean("start") && !par2World.isRemote && props.getSharinganSize() == 0.0D) {
        if (props.getSharinganUnlock() >= 400.0D) {
          if (props.getSharingan() != 3 && props.getSharingan() != 102) {
            if (props.getSharingan() == 1 || props.getSharingan() == 2)
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText("Вам нужно иметь шаринган 3 томое")); 
          } else if (par1ItemStack.getItemDamage() == 0 && counter > 0) {
            int EmptySpaces = tools.freeSpace(player.inventory.mainInventory);
            if (EmptySpaces > 0) {
              counter--;
              par1ItemStack.stackTagCompound.setInteger("counter", counter);
              if (counter == 1650)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "Дорогой  " + ((EntityPlayer)par3Entity).getCommandSenderName())); 
              if (counter == 1600)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "Пожалуйста, внимательно прочитайте то, что я пишу здесь")); 
              if (counter == 1550)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "Как это мои последние слова...")); 
              if (counter == 1500)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "Ты, вероятно, не будешь знать, кто я")); 
              if (counter == 1450)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "но я знаю тебя лучше, чем кто-либо другой...")); 
              if (counter == 1400)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "Я такой же, как и ты, да")); 
              if (counter == 1350)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "я тоже Учиха!")); 
              if (counter == 1300)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "Я пишу это письмо, скрываясь")); 
              if (counter == 1250)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "от группы шиноби...")); 
              if (counter == 1200)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "Они охотятся за моими глазами...")); 
              if (counter == 1150)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "Шаринган!")); 
              if (counter == 1100)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "....")); 
              if (counter == 1050)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "Я что-то слышу...")); 
              if (counter == 1000)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "Они уже нашли меня!")); 
              if (counter == 950)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "Мне нужно сделать это быстро")); 
              if (counter == 900)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "Причина, по которой я посылаю тебе это")); 
              if (counter == 850)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "потому что я хочу предупредить тебя")); 
              if (counter == 800)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "Никому не доверяй, люди хотят власти")); 
              if (counter == 750)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "они пойдут на всё ради")); 
              if (counter == 700)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "того чтобы приобрести наши глаза!")); 
              if (counter == 650)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "...")); 
              if (counter == 600)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "Они здесь, это конец для меня")); 
              if (counter == 550)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "Я заставлю моего спутника ворона доставить")); 
              if (counter == 500)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "это письмо к тебе")); 
              if (counter == 450)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "Пожалуйста.. ")); 
              if (counter == 400)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "будь в безопасности!")); 
              if (counter == 350)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "...")); 
              if (counter == 300)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "Я буду смотреть на тебя из вечности" + ((EntityPlayer)par3Entity).getCommandSenderName())); 
              if (counter == 250)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "мой младший брат...")); 
              if (counter == 200)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.BOLD + "пятна крови по всей бумаге...")); 
              if (counter == 150)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Вы чувствуете большое количество")); 
              if (counter == 100)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "эмоциональной боли...")); 
              if (counter == 50)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Ваш шаринган начинает меняться...")); 
              if (counter == 1) {
                props.setSharinganActive(true);
                PacketDispatcher.sendTo((IMessage)new SyncSharinganActiveMessage((EntityPlayer)par3Entity), (EntityPlayerMP)par3Entity);
                int rand = par2World.rand.nextInt(6);
                if (rand == 1) {
                  props.setmangekyouSharingan(3);
                  PacketDispatcher.sendTo((IMessage)new SyncmangekyouSharinganMessage((EntityPlayer)par3Entity), (EntityPlayerMP)par3Entity);
                  props.setSharingan(4);
                  PacketDispatcher.sendTo((IMessage)new SyncSharinganMessage((EntityPlayer)par3Entity), (EntityPlayerMP)par3Entity);
                  props.setSharinganSize(1.0D);
                  PacketDispatcher.sendTo((IMessage)new SyncSharinganSizeMessage((EntityPlayer)par3Entity), (EntityPlayerMP)par3Entity);
                  ((EntityPlayer)par3Entity).inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerMangekyouKagutsuchi));
                  ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText("Вы разбудили Мангекьё Шаринган!"));
                  props.setSharinganUnlock(0.0D);
                  PacketDispatcher.sendTo((IMessage)new SyncSharinganUnlockMessage((EntityPlayer)par3Entity), (EntityPlayerMP)par3Entity);
                  par1ItemStack.stackSize--;
                } 
                if (rand == 2) {
                  props.setmangekyouSharingan(4);
                  props.setSharingan(7);
                  props.setSharinganSize(1.0D);
                  PacketDispatcher.sendTo((IMessage)new SyncmangekyouSharinganMessage((EntityPlayer)par3Entity), (EntityPlayerMP)par3Entity);
                  PacketDispatcher.sendTo((IMessage)new SyncSharinganMessage((EntityPlayer)par3Entity), (EntityPlayerMP)par3Entity);
                  PacketDispatcher.sendTo((IMessage)new SyncSharinganSizeMessage((EntityPlayer)par3Entity), (EntityPlayerMP)par3Entity);
                  ((EntityPlayer)par3Entity).inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerMangekyouKagutsuchi));
                  ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText("Вы разбудили Мангекьё Шаринган!"));
                  props.setSharinganUnlock(0.0D);
                  PacketDispatcher.sendTo((IMessage)new SyncSharinganUnlockMessage((EntityPlayer)par3Entity), (EntityPlayerMP)par3Entity);
                  par1ItemStack.stackSize--;
                } 
                if (rand == 3) {
                  props.setmangekyouSharingan(5);
                  props.setSharingan(10);
                  props.setSharinganSize(1.0D);
                  PacketDispatcher.sendTo((IMessage)new SyncmangekyouSharinganMessage((EntityPlayer)par3Entity), (EntityPlayerMP)par3Entity);
                  PacketDispatcher.sendTo((IMessage)new SyncSharinganMessage((EntityPlayer)par3Entity), (EntityPlayerMP)par3Entity);
                  PacketDispatcher.sendTo((IMessage)new SyncSharinganSizeMessage((EntityPlayer)par3Entity), (EntityPlayerMP)par3Entity);
                  ((EntityPlayer)par3Entity).inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerMangekyouKagutsuchi));
                  ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText("Вы разбудили Мангекьё Шаринган!"));
                  props.setSharinganUnlock(0.0D);
                  PacketDispatcher.sendTo((IMessage)new SyncSharinganUnlockMessage((EntityPlayer)par3Entity), (EntityPlayerMP)par3Entity);
                  par1ItemStack.stackSize--;
                } 
                if (rand == 4) {
                  props.setmangekyouSharingan(6);
                  props.setSharingan(13);
                  props.setSharinganSize(1.0D);
                  PacketDispatcher.sendTo((IMessage)new SyncmangekyouSharinganMessage((EntityPlayer)par3Entity), (EntityPlayerMP)par3Entity);
                  PacketDispatcher.sendTo((IMessage)new SyncSharinganMessage((EntityPlayer)par3Entity), (EntityPlayerMP)par3Entity);
                  PacketDispatcher.sendTo((IMessage)new SyncSharinganSizeMessage((EntityPlayer)par3Entity), (EntityPlayerMP)par3Entity);
                  ((EntityPlayer)par3Entity).inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerMangekyouKagutsuchi));
                  ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText("Вы разбудили Мангекьё Шаринган!"));
                  props.setSharinganUnlock(0.0D);
                  PacketDispatcher.sendTo((IMessage)new SyncSharinganUnlockMessage((EntityPlayer)par3Entity), (EntityPlayerMP)par3Entity);
                  par1ItemStack.stackSize--;
                } 
                if (rand == 5) {
                  props.setmangekyouSharingan(10);
                  props.setSharingan(16);
                  props.setSharinganSize(1.0D);
                  PacketDispatcher.sendTo((IMessage)new SyncmangekyouSharinganMessage((EntityPlayer)par3Entity), (EntityPlayerMP)par3Entity);
                  PacketDispatcher.sendTo((IMessage)new SyncSharinganMessage((EntityPlayer)par3Entity), (EntityPlayerMP)par3Entity);
                  PacketDispatcher.sendTo((IMessage)new SyncSharinganSizeMessage((EntityPlayer)par3Entity), (EntityPlayerMP)par3Entity);
                  ((EntityPlayer)par3Entity).inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerMangekyouKagutsuchi));
                  ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText("Вы разбудили Мангекьё Шаринган!"));
                  props.setSharinganUnlock(0.0D);
                  PacketDispatcher.sendTo((IMessage)new SyncSharinganUnlockMessage((EntityPlayer)par3Entity), (EntityPlayerMP)par3Entity);
                  par1ItemStack.stackSize--;
                } 
              } 
            } 
          } 
        } else {
          ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText("You shouldn't cheat this item in, ONLY!! if you didn't then please let me know about this bug in a private message on the mc forums"));
        } 
        if (props.getSharingan() == 0)
          ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText("You need to activate the sharingan")); 
      } 
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer player) {
    if (!par2World.isRemote) {
      int EmptySpaces = tools.freeSpace(player.inventory.mainInventory);
      if (EmptySpaces > 0 && par1ItemStack.stackTagCompound.getString("Owner").equals(player.getCommandSenderName()) && !player.capabilities.isCreativeMode && par1ItemStack.stackTagCompound != null) {
        ExtendedPlayer props = ExtendedPlayer.get(player);
        if (props.getmangekyouSharingan() == 0) {
          player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.BOLD + "Вы читаете письмо: "));
          par1ItemStack.stackTagCompound.setBoolean("start", true);
          par1ItemStack.stackTagCompound.setInteger("counter", 1700);
          return par1ItemStack;
        } 
      } 
    } 
    return par1ItemStack;
  }
}

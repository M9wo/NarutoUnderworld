package alcoholmod.Mathioks.item;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SyncSharinganActiveMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSharinganMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSharinganSizeMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSharinganUnlockMessage;
import alcoholmod.Mathioks.NPC.UchihaBrotherEntity;
import alcoholmod.Mathioks.PacketDispatcher;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import lc208.tools;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class UchihaLetter2 extends Item {
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
      par1ItemStack.stackTagCompound.setBoolean("start", false);
      par1ItemStack.stackTagCompound.setInteger("counter", 0);
      par1ItemStack.stackTagCompound.setDouble("XpositionDestination", 0.0D);
      par1ItemStack.stackTagCompound.setDouble("YpositionDestination", 0.0D);
      par1ItemStack.stackTagCompound.setDouble("ZpositionDestination", 0.0D);
    } 
    if (par1ItemStack.stackTagCompound != null) {
      EntityPlayer player = (EntityPlayer)par3Entity;
      ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)par3Entity);
      int counter = par1ItemStack.stackTagCompound.getInteger("counter");
      if (par1ItemStack.stackTagCompound.getBoolean("start") && par1ItemStack.stackTagCompound.getBoolean("start") && !par2World.isRemote && props.getSharinganSize() == 1.0D)
        if (props.getSharinganUnlock() >= 1300.0D) {
          if (par1ItemStack.getItemDamage() == 0 && counter > 0) {
            int EmptySpaces = tools.freeSpace(player.inventory.mainInventory);
            if (EmptySpaces > 0 && par1ItemStack.getItemDamage() == 0) {
              counter--;
              par1ItemStack.stackTagCompound.setInteger("counter", counter);
              if (counter == 1400)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "Дорогой " + ((EntityPlayer)par3Entity).getCommandSenderName())); 
              if (counter == 1350)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "К тому времени как вы читаете это, меня уже давно нашли...")); 
              if (counter == 1300)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "Они меня поймали...")); 
              if (counter == 1250)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "Но я не позволю им забрать мои глаза!")); 
              if (counter == 1200)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "У вас, наверное, много вопросов обо мне...")); 
              if (counter == 1150)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "Я сделал много ошибок в своей жизни,")); 
              if (counter == 1100)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "к тому времени, как ты родился, я уже давно ушёл.")); 
              if (counter == 1050)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "на мою собственную миссию... В поисках силы...")); 
              if (counter == 1000)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "Теперь, когда я нахожусь в свои последние минуты..")); 
              if (counter == 950)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "Я вижу, насколько я ошибался...")); 
              if (counter == 900)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "Семья, друзья, независимо от того, сколько власти у тебя есть")); 
              if (counter == 850)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "Ничто не заменит эти облигации...")); 
              if (counter == 800)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "Хотел бы я рассказать вам больше,")); 
              if (counter == 750)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "Но мне нужно идти прямо сейчас...")); 
              if (counter == 700)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "Я оценил свои глаза и спрятал их")); 
              if (counter == 650)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "где-то по пути.")); 
              if (counter == 600)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "Иди к месту на этом письме")); 
              if (counter == 550)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "Это приведет вас к ним")); 
              if (counter == 500)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "Эти глаза будут твоими запасными, брат.")); 
              if (counter == 450)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "Они не дадут тебе ослепнуть,")); 
              if (counter == 400)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "И позвольте вам пробудить")); 
              if (counter == 350)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "Вечный Мангекьё Шаринган!")); 
              if (counter == 300)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "Спешите!")); 
              if (counter == 250)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "Неизвестно, когда они его найдут!")); 
              if (counter == 200)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "Прощайте,")); 
              if (counter == 150)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "Подпись, твой старший брат")); 
              if (counter == 100)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "...")); 
              if (counter == 50)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.BOLD + "На карте есть координаты")); 
              if (counter == 1) {
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.BOLD + "Там должны быть его глаза..."));
                par1ItemStack.setItemDamage(50);
                int randX = ((EntityPlayer)par3Entity).worldObj.rand.nextInt(1);
                if (randX == 1)
                  par1ItemStack.stackTagCompound.setDouble("XpositionDestination", ((EntityPlayer)par3Entity).posX - 500.0D - ((EntityPlayer)par3Entity).worldObj.rand.nextInt(1000)); 
                if (randX == 0)
                  par1ItemStack.stackTagCompound.setDouble("XpositionDestination", ((EntityPlayer)par3Entity).posX + 500.0D + ((EntityPlayer)par3Entity).worldObj.rand.nextInt(1000)); 
                par1ItemStack.stackTagCompound.setDouble("YpositionDestination", ((EntityPlayer)par3Entity).posY);
                int randZ = ((EntityPlayer)par3Entity).worldObj.rand.nextInt(2);
                if (randZ == 1)
                  par1ItemStack.stackTagCompound.setDouble("ZpositionDestination", ((EntityPlayer)par3Entity).posZ - 500.0D - ((EntityPlayer)par3Entity).worldObj.rand.nextInt(1000)); 
                if (randZ == 0)
                  par1ItemStack.stackTagCompound.setDouble("ZpositionDestination", ((EntityPlayer)par3Entity).posZ + 500.0D + ((EntityPlayer)par3Entity).worldObj.rand.nextInt(1000)); 
              } 
            } 
          } 
          if (par1ItemStack.getItemDamage() == 100) {
            counter--;
            par1ItemStack.stackTagCompound.setInteger("counter", counter);
            if (counter == 50)
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "???: Как раз вовремя ты пришёл!")); 
            if (counter == 1) {
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "???: Теперь дай мне эти глаза!!!"));
              UchihaBrotherEntity fireball2 = new UchihaBrotherEntity(par2World);
              fireball2.setPosition(par1ItemStack.stackTagCompound.getDouble("XpositionDestination"), 150.0D, par1ItemStack.stackTagCompound.getDouble("ZpositionDestination"));
              par2World.spawnEntityInWorld((Entity)fireball2);
            } 
            if (counter == -24000)
              par1ItemStack.stackTagCompound.setBoolean("start", false); 
          } 
          if (par1ItemStack.getItemDamage() == 150) {
            int EmptySpaces = tools.freeSpace(player.inventory.mainInventory);
            if (EmptySpaces > 0 && par1ItemStack.getItemDamage() == 150) {
              counter--;
              par1ItemStack.stackTagCompound.setInteger("counter", counter);
              if (counter == 1400)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + ((EntityPlayer)par3Entity).getCommandSenderName() + "!!!")); 
              if (counter == 1350)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Как...")); 
              if (counter == 1300)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Как ты стал таким сильным??!")); 
              if (counter == 1250)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "...")); 
              if (counter == 1200)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "* Кашель * еще раз... У меня не получилось...")); 
              if (counter == 1150)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "...")); 
              if (counter == 1100)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Прости за то, через что я заставил тебя пройти всё это...")); 
              if (counter == 1050)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Я хочу сказать, что это было эгоистично с моей стороны,")); 
              if (counter == 1000)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Но это всего лишь реальность нашего клана...")); 
              if (counter == 950)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Мы становимся сильнее через эмоциональную боль")); 
              if (counter == 900)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "и если этого недостаточно, как только мы достигнем")); 
              if (counter == 850)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "эта сила, она медленно забирается у нас..")); 
              if (counter == 800)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Если только мы не заберем его у наших братьев и сестер...")); 
              if (counter == 750)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Я никогда не был частью твоей жизни,")); 
              if (counter == 700)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "еще я твой старший брат...")); 
              if (counter == 650)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Как ты уже, наверное, понял,")); 
              if (counter == 600)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Письма, которые я тебе посылал, были фальшивыми.")); 
              if (counter == 550)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Я ослеп и не смог тебя обыскать..")); 
              if (counter == 500)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "не с такими глазами, так что мне нужен был способ ")); 
              if (counter == 450)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "чтобы ты пришёл ко мне....")); 
              if (counter == 400)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Эти слова, вероятно, ничего не значат после всего, что я сделал")); 
              if (counter == 350)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Но на этот раз я действительно вижу, где я ошибся.")); 
              if (counter == 300)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Как старший брат, я должен взять")); 
              if (counter == 250)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "ответственность смотреть на тебя...")); 
              if (counter == 200)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "** Кашель * Я... своей последней волей я...")); 
              if (counter == 150) {
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.BOLD + "Твой брат вдруг потянулся к твоим глазам"));
                ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.blindness.id, 25, 10));
              } 
              if (counter == 110)
                ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.blindness.id, 30, 10)); 
              if (counter == 100)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Я имплантировал тебе * кашель* мои глаза...")); 
              if (counter == 50)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Прощай..." + ((EntityPlayer)par3Entity).getCommandSenderName())); 
              if (counter == 1) {
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "Несмотря ни на что... Я всегда буду любить тебя.."));
                props.setSharinganActive(true);
                PacketDispatcher.sendTo((IMessage)new SyncSharinganActiveMessage((EntityPlayer)par3Entity), (EntityPlayerMP)par3Entity);
                props.setSharinganSize(2.0D);
                PacketDispatcher.sendTo((IMessage)new SyncSharinganSizeMessage(player), (EntityPlayerMP)player);
                if (props.getmangekyouSharingan() == 1) {
                  props.setSharingan(49);
                  PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
                } 
                if (props.getmangekyouSharingan() == 2) {
                  props.setSharingan(53);
                  PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
                } 
                if (props.getmangekyouSharingan() == 3) {
                  props.setSharingan(5);
                  PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
                } 
                if (props.getmangekyouSharingan() == 4) {
                  props.setSharingan(8);
                  PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
                } 
                if (props.getmangekyouSharingan() == 5) {
                  props.setSharingan(11);
                  PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
                } 
                if (props.getmangekyouSharingan() == 6) {
                  props.setSharingan(14);
                  PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
                } 
                if (props.getmangekyouSharingan() == 7) {
                  props.setSharingan(19);
                  PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
                } 
                if (props.getmangekyouSharingan() == 8) {
                  props.setSharingan(25);
                  PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
                } 
                if (props.getmangekyouSharingan() == 9) {
                  props.setSharingan(21);
                  PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
                } 
                if (props.getmangekyouSharingan() == 10) {
                  props.setSharingan(17);
                  PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
                } 
                if (props.getmangekyouSharingan() == 11) {
                  props.setSharingan(27);
                  PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
                } 
                if (props.getmangekyouSharingan() == 12) {
                  props.setSharingan(29);
                  PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
                } 
                if (props.getmangekyouSharingan() == 13) {
                  props.setSharingan(31);
                  PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
                } 
                if (props.getmangekyouSharingan() == 14) {
                  props.setSharingan(0);
                  PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
                } 
                if (props.getmangekyouSharingan() == 15) {
                  props.setSharingan(23);
                  PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
                } 
                if (props.getmangekyouSharingan() == 16) {
                  props.setSharingan(33);
                  PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
                } 
                if (props.getmangekyouSharingan() == 17) {
                  props.setSharingan(36);
                  PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
                } 
                if (props.getmangekyouSharingan() == 20) {
                  props.setSharingan(61);
                  PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
                } 
                if (props.getmangekyouSharingan() == 21) {
                  props.setSharingan(63);
                  PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
                } 
                if (props.getmangekyouSharingan() == 22) {
                  props.setSharingan(65);
                  PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
                } 
                if (props.getmangekyouSharingan() == 23) {
                  props.setSharingan(67);
                  PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
                } 
                if (props.getmangekyouSharingan() == 24) {
                  props.setSharingan(69);
                  PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
                } 
                if (props.getmangekyouSharingan() == 25) {
                  props.setSharingan(71);
                  PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
                } 
                if (props.getmangekyouSharingan() == 26) {
                  props.setSharingan(73);
                  PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
                } 
                if (props.getmangekyouSharingan() == 27) {
                  props.setSharingan(75);
                  PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
                } 
                if (props.getmangekyouSharingan() == 28) {
                  props.setSharingan(77);
                  PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
                } 
                if (props.getmangekyouSharingan() == 29) {
                  props.setSharingan(79);
                  PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
                } 
                if (props.getmangekyouSharingan() == 30) {
                  props.setSharingan(81);
                  PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
                } 
                if (props.getmangekyouSharingan() == 31)
                  props.setSharingan(83); 
                if (props.getmangekyouSharingan() == 32)
                  props.setSharingan(85); 
                if (props.getmangekyouSharingan() == 33)
                  props.setSharingan(87); 
                if (props.getmangekyouSharingan() == 34)
                  props.setSharingan(89); 
                if (props.getmangekyouSharingan() == 35)
                  props.setSharingan(91); 
                if (props.getmangekyouSharingan() == 50) {
                  props.setSharingan(104);
                  PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
                } 
                props.setSharinganActive(true);
                PacketDispatcher.sendTo((IMessage)new SyncSharinganActiveMessage((EntityPlayer)par3Entity), (EntityPlayerMP)par3Entity);
                props.setSharinganUnlock(0.0D);
                PacketDispatcher.sendTo((IMessage)new SyncSharinganUnlockMessage((EntityPlayer)par3Entity), (EntityPlayerMP)par3Entity);
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText("Вы открыли Вечный Мангекьё Шаринган!"));
                par1ItemStack.stackSize--;
              } 
            } 
          } 
        } else {
          ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText("Вы не должны использовать читы на этом предмете"));
        }  
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer player) {
    if (!par2World.isRemote) {
      int EmptySpaces = tools.freeSpace(player.inventory.mainInventory);
      if (EmptySpaces > 0 && par1ItemStack.stackTagCompound.getString("Owner").equals(player.getCommandSenderName()) && !player.capabilities.isCreativeMode && par1ItemStack.stackTagCompound != null) {
        ExtendedPlayer props = ExtendedPlayer.get(player);
        if (props.getSharinganSize() == 1.0D) {
          if (par1ItemStack.getItemDamage() == 0) {
            player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.BOLD + "Вы читаете письмо:"));
            par1ItemStack.stackTagCompound.setBoolean("start", true);
            par1ItemStack.stackTagCompound.setInteger("counter", 1450);
            return par1ItemStack;
          } 
          if (par1ItemStack.getItemDamage() == 50) {
            double XpositionDestination = par1ItemStack.stackTagCompound.getDouble("XpositionDestination");
            double YpositionDestination = par1ItemStack.stackTagCompound.getDouble("YpositionDestination");
            double ZpositionDestination = par1ItemStack.stackTagCompound.getDouble("ZpositionDestination");
            if (Math.abs(player.posX - XpositionDestination) <= 10.0D && Math.abs(player.posZ - ZpositionDestination) <= 10.0D) {
              player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.BOLD + "You arrived at the location...'"));
              par1ItemStack.stackTagCompound.setBoolean("start", true);
              par1ItemStack.stackTagCompound.setInteger("counter", 130);
              par1ItemStack.setItemDamage(100);
              return par1ItemStack;
            } 
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("X-Position: " + (int)player.posX + " X-Location: " + (int)XpositionDestination));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("Z-Position: " + (int)player.posZ + " Z-Location: " + (int)ZpositionDestination));
            return par1ItemStack;
          } 
          if (par1ItemStack.getItemDamage() == 100) {
            double XpositionDestination = par1ItemStack.stackTagCompound.getDouble("XpositionDestination");
            double YpositionDestination = par1ItemStack.stackTagCompound.getDouble("YpositionDestination");
            double ZpositionDestination = par1ItemStack.stackTagCompound.getDouble("ZpositionDestination");
            if (Math.abs(player.posX - XpositionDestination) <= 10.0D && Math.abs(player.posZ - ZpositionDestination) <= 10.0D) {
              if (player.inventory.hasItem(AlcoholMod.DefeatUchihaBrother)) {
                player.inventory.consumeInventoryItem(AlcoholMod.DefeatUchihaBrother);
                player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Brother: UWAAAGHH!!..."));
                par1ItemStack.stackTagCompound.setBoolean("start", true);
                par1ItemStack.stackTagCompound.setInteger("counter", 1450);
                par1ItemStack.setItemDamage(150);
                return par1ItemStack;
              } 
              if (!par1ItemStack.stackTagCompound.getBoolean("start")) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.BOLD + "You arrived at the location...'"));
                par1ItemStack.stackTagCompound.setBoolean("start", true);
                par1ItemStack.stackTagCompound.setInteger("counter", 130);
                par1ItemStack.setItemDamage(100);
                return par1ItemStack;
              } 
              player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.ITALIC + "Defeat your brother!"));
              return par1ItemStack;
            } 
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("X-Position: " + (int)player.posX + " X-Location: " + (int)XpositionDestination));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("Z-Position: " + (int)player.posZ + " Z-Location: " + (int)ZpositionDestination));
            return par1ItemStack;
          } 
        } 
      } 
    } 
    return par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null) {
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner"));
      par3List.add(EnumChatFormatting.AQUA + "Location X: " + par1ItemStack.stackTagCompound.getDouble("XpositionDestination"));
      par3List.add(EnumChatFormatting.AQUA + "Location Z: " + par1ItemStack.stackTagCompound.getDouble("ZpositionDestination"));
    } 
  }
}

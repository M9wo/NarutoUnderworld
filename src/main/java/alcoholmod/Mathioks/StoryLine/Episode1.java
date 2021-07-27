package alcoholmod.Mathioks.StoryLine;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SyncChakraExperienceMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncJutsuPointsMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncStorylineMessage;
import alcoholmod.Mathioks.Final.JutsuItem;
import alcoholmod.Mathioks.PacketDispatcher;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import lc208.tools;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class Episode1 extends JutsuItem {
  private boolean isinair;
  
  public Episode1() {
    setMaxDamage(500);
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null) {
      if (par1ItemStack.stackTagCompound == null) {
        par1ItemStack.stackTagCompound = new NBTTagCompound();
        par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
        par1ItemStack.stackTagCompound.setBoolean("start", false);
        par1ItemStack.stackTagCompound.setInteger("counter", 0);
        par1ItemStack.stackTagCompound.setDouble("Xposition", par3Entity.posX);
        par1ItemStack.stackTagCompound.setDouble("Yposition", par3Entity.posY);
        par1ItemStack.stackTagCompound.setDouble("Zposition", par3Entity.posZ);
        int randX = par2World.rand.nextInt(1);
        if (randX == 1)
          par1ItemStack.stackTagCompound.setDouble("XpositionDestination", par3Entity.posX - 1000.0D - par2World.rand.nextInt(2000)); 
        if (randX == 0)
          par1ItemStack.stackTagCompound.setDouble("XpositionDestination", par3Entity.posX + 1000.0D + par2World.rand.nextInt(2000)); 
        par1ItemStack.stackTagCompound.setDouble("YpositionDestination", par3Entity.posY);
        int counter = par2World.rand.nextInt(2);
        if (counter == 1)
          par1ItemStack.stackTagCompound.setDouble("ZpositionDestination", par3Entity.posZ - 1000.0D - par2World.rand.nextInt(2000)); 
        if (counter == 0)
          par1ItemStack.stackTagCompound.setDouble("ZpositionDestination", par3Entity.posZ + 1000.0D + par2World.rand.nextInt(2000)); 
      } 
      if (par1ItemStack.stackTagCompound != null) {
        ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)par3Entity);
        int counter = par1ItemStack.stackTagCompound.getInteger("counter");
        if (par1ItemStack.stackTagCompound.getBoolean("start") && !par2World.isRemote) {
          if (props.getStoryline() == 0) {
            if (par1ItemStack.getItemDamage() == 0 && counter > 0) {
              counter--;
              par1ItemStack.stackTagCompound.setInteger("counter", counter);
              if (counter == 550)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.BOLD + "Давным давно жил дух лисы...")); 
              if (counter == 500)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.BOLD + "Девяти хвостый лис!")); 
              if (counter == 450)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.BOLD + "Он разрушал горы и вызывал цунами....")); 
              if (counter == 400) {
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.BOLD + "В результате ниндзя были вынуждены держаться"));
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.BOLD + "вместе"));
              } 
              if (counter == 350)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.BOLD + "и чтобы запечать его")); 
              if (counter == 300)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.BOLD + "один ниндзя пожертвовал собой")); 
              if (counter == 250)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.BOLD + "это ниндзя был четвёртый хокаге....")); 
              if (counter == 200)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "Ирука: Эй, " + ((EntityPlayer)par3Entity).getCommandSenderName() + "! вы опоздали в класс!")); 
              if (counter == 150) {
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "Ирука: В настоящие время все здесь,"));
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "Ирука: и по этому начнём с первого урока сегодня!"));
              } 
              if (counter == 100)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "Ирука: Теневое Клонирования (Каге Буншин но Дзюцу)")); 
              if (counter == 50)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.YELLOW + "Наруто: Ха ха ха, это очень супер легко, ПОВЕРЬТЕ МНЕ!")); 
              if (counter == 1) {
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "Ирука: Наруто! Тихо! Теперь все,"));
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "Ирука: Теневое Клонирования (Каге Буншин но Дзюцу)!"));
                par1ItemStack.stackTagCompound.setBoolean("start", false);
                par1ItemStack.setItemDamage(50);
                par1ItemStack.stackTagCompound.setInteger("counter", 0);
              } 
            } 
            if (par1ItemStack.getItemDamage() == 50 && counter > 0) {
              counter--;
              par1ItemStack.stackTagCompound.setInteger("counter", counter);
              if (counter == 250) {
                ((EntityPlayer)par3Entity).inventory.addItemStackToInventory(new ItemStack(AlcoholMod.KageBunshin));
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "Ирука: Пусть теперь сделает каждый! Ожидай Наруто...."));
              } 
              if (counter == 200)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.YELLOW + "Наруто: ВАААААААААУ!..")); 
              if (counter == 150)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.UNDERLINE + "Класс: *Смех* То, что ты идиот!")); 
              if (counter == 100) {
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "Ирука: Класс достаточно на сегодня!"));
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "Ирука: Увидемся завтра"));
              } 
              if (counter == 50) {
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.YELLOW + "Наруто: Я покажу им всем!..."));
                par1ItemStack.stackTagCompound.setBoolean("start", false);
                par1ItemStack.setItemDamage(100);
                par1ItemStack.stackTagCompound.setInteger("counter", 0);
              } 
            } 
          } 
          if (props.getStoryline() == 1) {
            if (par1ItemStack.getItemDamage() == 0 && counter > 0) {
              counter--;
              par1ItemStack.stackTagCompound.setInteger("counter", counter);
              if (counter == 280)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "Ирука: Хорошо класс, сегодня мы будем практиковаться с §bСюрикендзюцу")); 
              if (counter == 250)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "Ирука: Все, возьмите сюрикены")); 
              if (counter == 200) {
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "Ирука: Сейчас вы узнате как ими пользоваться!"));
                par1ItemStack.stackTagCompound.setBoolean("start", false);
                par1ItemStack.setItemDamage(50);
                ((EntityPlayer)par3Entity).inventory.addItemStackToInventory(new ItemStack(AlcoholMod.ShurikenSmallItem));
                ((EntityPlayer)par3Entity).inventory.addItemStackToInventory(new ItemStack(AlcoholMod.ShurikenSmallItem));
                ((EntityPlayer)par3Entity).inventory.addItemStackToInventory(new ItemStack(AlcoholMod.ShurikenSmallItem));
                ((EntityPlayer)par3Entity).inventory.addItemStackToInventory(new ItemStack(AlcoholMod.ShurikenSmallItem));
                ((EntityPlayer)par3Entity).inventory.addItemStackToInventory(new ItemStack(AlcoholMod.ShurikenSmallItem));
                counter = 0;
                par1ItemStack.stackTagCompound.setInteger("counter", counter);
              } 
            } 
            if (par1ItemStack.getItemDamage() == 50 && counter > 0) {
              counter--;
              par1ItemStack.stackTagCompound.setInteger("counter", counter);
              if (counter == 280)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "Ирука: Хорошо! Кажется вы все хорошо метаете сюрикены!")); 
              if (counter == 250)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "Ирука: Саске, это было отлично!")); 
              if (counter == 225)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Саске: Хм..")); 
              if (counter == 200)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.LIGHT_PURPLE + "Девушки: АААААХХ он Крутоооой!")); 
              if (counter == 150)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.YELLOW + "Наруто: Я не понимаю, что в нём такого крутого?!")); 
              if (counter == 100)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.YELLOW + "Наруто: " + ((EntityPlayer)par3Entity).getCommandSenderName() + " Ты со мной согласен?")); 
              if (counter == 50) {
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "Ирука: Хорошо дети, на сегодня достаточно, увидемся §bзавтра!"));
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "Ирука: Убедитесь, что вы хорошо отдохнули, так как завтра §bбудет экзамен на Генина!"));
              } 
              if (counter == 10) {
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.YELLOW + "Наруто: " + ((EntityPlayer)par3Entity).getCommandSenderName() + " я поговорю с тобой по позже!"));
                par1ItemStack.stackTagCompound.setBoolean("start", false);
                par1ItemStack.setItemDamage(100);
                counter = 0;
                par1ItemStack.stackTagCompound.setInteger("counter", counter);
              } 
            } 
          } 
          if (props.getStoryline() == 2) {
            if (par1ItemStack.getItemDamage() == 0 && counter > 0) {
              counter--;
              par1ItemStack.stackTagCompound.setInteger("counter", counter);
              if (counter == 560)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "Ирука: Сегодня наступает особый день")); 
              if (counter == 500)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "Ирука: Вы будете все участвовать в экзамене на Генина")); 
              if (counter == 450)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.YELLOW + "Наруто: ХОРОШО! Я буду на один шаг ближе к становлению §eХокаге!")); 
              if (counter == 400)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + "Киба: Ты? Хокаге?! Если кто то станет Хокаге, то только я!")); 
              if (counter == 350)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_PURPLE + "Хината: Ох.. Наруто... Я.. Я Ве-... Верю что ты..")); 
              if (counter == 300)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.YELLOW + "Наруто: Что ты сказал Киба?!")); 
              if (counter == 250)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "Ирука: УСПОКОЙТЕСЬ ПАРНИ!")); 
              if (counter == 200)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "Ирука: Экзамен сейчас вот-вот начнётся")); 
              if (counter == 150) {
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "Ирука: Удачи вам ребята!"));
                ((EntityPlayer)par3Entity).inventory.addItemStackToInventory(new ItemStack(AlcoholMod.GeninExam));
                par1ItemStack.stackTagCompound.setBoolean("start", false);
                par1ItemStack.setItemDamage(50);
                counter = 0;
                par1ItemStack.stackTagCompound.setInteger("counter", counter);
              } 
            } 
            if (par1ItemStack.getItemDamage() == 50 && counter > 0) {
              counter--;
              par1ItemStack.stackTagCompound.setInteger("counter", counter);
              if (counter == 580)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "Ирука: Экзамен на Генина закончен")); 
              if (counter == 520) {
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "Ирука: Вот список людей, которые прошли экзамен!"));
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "Ирука: §e*Начинает читать*"));
              } 
              if (counter == 460)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "Ирука: Саске Учиха")); 
              if (counter == 440)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "Ирука: Неджи Хьюга")); 
              if (counter == 420)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "Ирука: " + ((EntityPlayer)par3Entity).getCommandSenderName() + " " + props.getClanLastname())); 
              if (counter == 400)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "Ирука: Сакура Харуно")); 
              if (counter == 380)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "Ирука: Шикамару Нара")); 
              if (counter == 360)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "Ирука: ТенТен")); 
              if (counter == 340)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "Ирука: Ино Яманака")); 
              if (counter == 320)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "Ирука: Киба Инзука")); 
              if (counter == 300)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "Ирука: Шино Абураме")); 
              if (counter == 280)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "Ирука: Хината Хьюга")); 
              if (counter == 260)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "Ирука: Рок Ли")); 
              if (counter == 240)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "Ирука: Чоджи Акимичи")); 
              if (counter == 200)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "Ирука: Теперь вы Генины, а это значит,")); 
              if (counter == 150)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "Ирука: что вам можно вручить повязку Генина!")); 
              if (counter == 100)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.YELLOW + "Наруто: ЧТО! А МНЕ ? ")); 
              if (counter == 50)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "Ирука: Мне жаль Наруто, но ты не прошёл экзамен")); 
              if (counter == 20) {
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "Ирука: Всех остальных, поздравляю с становлением §bГенинами!"));
                ((EntityPlayer)par3Entity).inventory.addItemStackToInventory(new ItemStack(AlcoholMod.helmetGenin));
                par1ItemStack.stackTagCompound.setBoolean("start", false);
                par1ItemStack.setItemDamage(100);
                counter = 0;
                par1ItemStack.stackTagCompound.setInteger("counter", counter);
              } 
            } 
          } 
          if (props.getStoryline() == 3) {
            if (par1ItemStack.getItemDamage() == 0 && counter > 0) {
              counter--;
              par1ItemStack.stackTagCompound.setInteger("counter", counter);
              if (counter == 1360) {
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_AQUA + "Хирузен: Мы собрались здесь, чтобы "));
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_AQUA + "Хирузен: разделить Генинов, по командам"));
              } 
              if (counter == 1300)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_AQUA + "Хирузен: Команда 10")); 
              if (counter == 1260)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_AQUA + "Хирузен: Чоджи Акимичи, Ино Яманака и Шикамару Нара")); 
              if (counter == 1200)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_AQUA + "Хирузен: Ваш предводитель Асума Сарутоби")); 
              if (counter == 1180)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_BLUE + "Асума: Йоу!")); 
              if (counter == 1120)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_AQUA + "Хирузен: Команда 9")); 
              if (counter == 1080)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_AQUA + "Хирузен: Неджи Хьюга, Рок Ли и ТенТен")); 
              if (counter == 1040)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_AQUA + "Хирузен: Ваш предводитель Майто Гай")); 
              if (counter == 1000)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_GREEN + "Майто Гай: Я готов начать, покажите мне всю вашу силу §2ЮНОСТИ!!")); 
              if (counter == 960)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Неджи & ТенТен: Боже мой, что за дичь!!")); 
              if (counter == 920)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + "Ли: Да Гай Сенсей! Мы вас не подведём!")); 
              if (counter == 860)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_AQUA + "Хирузен: Команда 8")); 
              if (counter == 820)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_AQUA + "Хирузен: Киба Инзука, Шино Абураме и Хината Хьюга")); 
              if (counter == 780)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_AQUA + "Хирузен: Ваш предводитель Куренай Юхи")); 
              if (counter == 740)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_PURPLE + "Куренай: Я очень рада с вами познакомиться!")); 
              if (counter == 680)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_AQUA + "Хирузен: И последняя Команда номер 7")); 
              if (counter == 640)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_AQUA + "Хирузен: Саске Учиха, " + ((EntityPlayer)par3Entity).getCommandSenderName() + " " + props.getClanLastname() + " и Сакура Харуно")); 
              if (counter == 600)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.LIGHT_PURPLE + "Сакура: *Визжит* Саскееееее")); 
              if (counter == 560)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.YELLOW + "Ино: ЧТОООО??!! С тобой Саске??!!")); 
              if (counter == 500) {
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "Ирука: Так как один ученик, закночил позже "));
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "Ирука: остальных, он попадает в Команду 7"));
              } 
              if (counter == 440)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_AQUA + "Хирузен: Точно, Этот человек Наруто Удзумаки!")); 
              if (counter == 400)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.YELLOW + "Наурто: Сакураааа!")); 
              if (counter == 360)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.LIGHT_PURPLE + "Сакура: Боже только не это....!")); 
              if (counter == 320)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.YELLOW + "Наруто: Саске! Я докажу, что я лучше тебя!")); 
              if (counter == 280)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Саске: Хмм.. Закрой свой рот, лузер!")); 
              if (counter == 240)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.YELLOW + "Наруто: КАК ТЫ МЕНЯ НАЗВАЛ ?!")); 
              if (counter == 200) {
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.LIGHT_PURPLE + "Сакура: НАРУТОО!! Оставь Саске в покоя! " + ((EntityPlayer)par3Entity).getCommandSenderName() + " Помоги мне"));
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.LIGHT_PURPLE + "Сакура: здесь!"));
              } 
              if (counter == 160)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_AQUA + "Хирузен: Успокойтесь дети!")); 
              if (counter == 120) {
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.YELLOW + "Наруто: Пфф!"));
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Саске: Хмм!"));
              } 
              if (counter == 80)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_AQUA + "Хирузен: Ваш предводитель Какаши Хатаке")); 
              if (counter == 40)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GRAY + "Какаши: Хмм.. *Вздыхает* Это будет трудно..")); 
              if (counter == 5) {
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_AQUA + "Хирузен: Ваша первая миссия начнётся завтра"));
                par1ItemStack.stackTagCompound.setBoolean("start", false);
                par1ItemStack.setItemDamage(50);
                counter = 0;
                par1ItemStack.stackTagCompound.setInteger("counter", counter);
              } 
            } 
            if (par1ItemStack.getItemDamage() == 50 && counter > 0) {
              counter--;
              par1ItemStack.stackTagCompound.setInteger("counter", counter);
              if (counter == 2100)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GRAY + "Какаши: И так, теперь, когда мы все здесь")); 
              if (counter == 2060)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GRAY + "Какаши: Скажите мне немного о себе!")); 
              if (counter == 2020)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.YELLOW + "Наруто: Что мы должны сказать? Как насчёт вас!")); 
              if (counter == 1980)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GRAY + "Какаши: Хмм.. Хорошо..!")); 
              if (counter == 1940) {
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GRAY + "Какаши: Я Какаши Хатаке и у меня нет намерения "));
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GRAY + "Какаши: рассказывать вам, что мне нравиться и не §7нравиться"));
              } 
              if (counter == 1900)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GRAY + "Какаши: Что касается моей мечты...")); 
              if (counter == 1870)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GRAY + "Какаши: *Смотрит на небо*")); 
              if (counter == 1700)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GRAY + "Какаши: У меня есть несколько хобби")); 
              if (counter == 1640)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.LIGHT_PURPLE + "Сакура: Так что, все мы узнали его имя....")); 
              if (counter == 1600)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.YELLOW + "Наруто: *Кивает* Да...")); 
              if (counter == 1520)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GRAY + "Какаши: Теперь начнём с вас!")); 
              if (counter == 1480)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.YELLOW + "Наруто: Меня зовут Наруто Удзумаки")); 
              if (counter == 1450)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.YELLOW + "Наруто: Я люблю Рамен")); 
              if (counter == 1420)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.YELLOW + "Наруто: Но для меня самым лучшим является")); 
              if (counter == 1380)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.YELLOW + "Наруто: Ичираку, которым меня угостил Ирука Сенсей!")); 
              if (counter == 1340)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.YELLOW + "Наруто: Я не люблю ждать ")); 
              if (counter == 1300)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.YELLOW + "Наруто: 3 минуты, когда рамен запариться!")); 
              if (counter == 1260)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.YELLOW + "Наруто: И моя мечта стать лучшим Хокаге!")); 
              if (counter == 1220)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.YELLOW + "Наруто: более того")); 
              if (counter == 1180)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.YELLOW + "Наруто: все жители деревни признают меня!")); 
              if (counter == 1140)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GRAY + "Какаши: Да, Интересно, следующий")); 
              if (counter == 1100)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Саске: Я ненавижу много чего")); 
              if (counter == 1020)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Саске: и мне многое не нравиться ")); 
              if (counter == 980)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Саске: И у меня нет никакой мечты")); 
              if (counter == 940)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Саске: Потому, что я сделаю её реальной")); 
              if (counter == 900)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Саске: Я собираюсь восстановить мой клан")); 
              if (counter == 840)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Саске: И уничтожить.. Определённого.. человека..")); 
              if (counter == 800)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GRAY + "Какаши: Хмм.. Я думаю теперь вы, девочка с розовыми §7волосами")); 
              if (counter == 760)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.LIGHT_PURPLE + "Сакура: Меня зовут Сакура Харуно")); 
              if (counter == 720)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.LIGHT_PURPLE + "Сакура: Что мне нравиться.. Точнее..")); 
              if (counter == 680)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.LIGHT_PURPLE + "Сакура: КТО нравиться.... *визг* ")); 
              if (counter == 640)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.LIGHT_PURPLE + "Сакура: Кроме того, кто мне не нравиться *Смотрит на §dНаруто* ....")); 
              if (counter == 600)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.YELLOW + "Наруто: ЧТОООО??!")); 
              if (counter == 560)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.LIGHT_PURPLE + "Сакура: И мои мечты..... *Смотрит на Саске(Визг)*")); 
              if (counter == 520)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GRAY + "Какаши: Понятно.... Хорошо, следующий!")); 
              if (counter == 480)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(((EntityPlayer)par3Entity).getCommandSenderName() + ": Меня Зовут " + ((EntityPlayer)par3Entity).getCommandSenderName() + " " + props.getClanLastname())); 
              if (counter == 440)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(((EntityPlayer)par3Entity).getCommandSenderName() + ": Что мне нравиться... Ну ... Я не очень мыслил об этом")); 
              if (counter == 400)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(((EntityPlayer)par3Entity).getCommandSenderName() + ": Что мне не нравиться.. Я не думаю, что я должен это рассказывать")); 
              if (counter == 360) {
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(((EntityPlayer)par3Entity).getCommandSenderName() + ": И моя мечта... Мечты предназначены для того"));
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(((EntityPlayer)par3Entity).getCommandSenderName() + ": чтобы быть в секрете."));
              } 
              if (counter == 320)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GRAY + "Какаши: Очень хорошо.. Встретимся завт-..")); 
              if (counter == 280)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.YELLOW + "Наруто: Чтооо??! Завтра?!")); 
              if (counter == 240)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.LIGHT_PURPLE + "Сакура: Замолчи! Пусть сенсей говорит!")); 
              if (counter == 200) {
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GRAY + "Какаши: Как я уже говорил, завтра мы должны приступить"));
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GRAY + "Какаши: к первой миссии!"));
              } 
              if (counter == 160)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GRAY + "Какаши: Те кто опоздают, будут исключены ")); 
              if (counter == 120)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.YELLOW + "Наруто: Подождите что??!")); 
              if (counter == 80)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.LIGHT_PURPLE + "Сакура: Саске, мы должны успеть..")); 
              if (counter == 40)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Саске: Я поеду на поезде")); 
              if (counter == 2) {
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.YELLOW + "Наруто: Эй, подождите меня!" + ((EntityPlayer)par3Entity).getCommandSenderName() + " поговорим завтра!"));
                par1ItemStack.stackTagCompound.setBoolean("start", false);
                par1ItemStack.setItemDamage(100);
                counter = 0;
                par1ItemStack.stackTagCompound.setInteger("counter", counter);
              } 
            } 
          } 
        } 
      } 
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer player) {
    if (!par2World.isRemote) {
      int EmptySpaces = tools.freeSpace(player.inventory.mainInventory);
      if (EmptySpaces > 0)
        if (par1ItemStack.stackTagCompound.getString("Owner").equals(player.getCommandSenderName())) {
          if (!player.capabilities.isCreativeMode) {
            if (par1ItemStack.stackTagCompound != null) {
              ExtendedPlayer props = ExtendedPlayer.get(player);
              if (par1ItemStack.getItemDamage() == 0) {
                if (props.getStoryline() == 0) {
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.BOLD + "§nЭпизод 1: 'Встречайте: Наруто Удзумаки!'"));
                  par1ItemStack.stackTagCompound.setBoolean("start", true);
                  par1ItemStack.stackTagCompound.setInteger("counter", 600);
                  return par1ItemStack;
                } 
                if (props.getStoryline() == 1) {
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.BOLD + "§nЭпизод 2: 'Практика Сюрикенов!'"));
                  par1ItemStack.stackTagCompound.setBoolean("start", true);
                  par1ItemStack.stackTagCompound.setInteger("counter", 300);
                  return par1ItemStack;
                } 
                if (props.getStoryline() == 2) {
                  if (props.getLevel() >= 25) {
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.BOLD + "§nЭпизод 3: 'Экзамен на Генина!'"));
                    par1ItemStack.stackTagCompound.setBoolean("start", true);
                    par1ItemStack.stackTagCompound.setInteger("counter", 600);
                    return par1ItemStack;
                  } 
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText("Вам нужно иметь 25 Level, что бы начать Эпизод 3"));
                } else if (props.getStoryline() == 3) {
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.BOLD + "§nЭпизод 4: 'Формирования Команды 7!'"));
                  par1ItemStack.stackTagCompound.setBoolean("start", true);
                  par1ItemStack.stackTagCompound.setInteger("counter", 1400);
                  return par1ItemStack;
                } 
              } else if (par1ItemStack.getItemDamage() == 50) {
                if (props.getStoryline() == 0) {
                  if (props.getJutsuPoints() >= 1) {
                    if (par1ItemStack.stackTagCompound.getInteger("counter") == 0) {
                      props.setJutsuPoints(props.getJutsuPoints() - 1);
                      PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(player), (EntityPlayerMP)player);
                      par1ItemStack.stackTagCompound.setBoolean("start", true);
                      par1ItemStack.stackTagCompound.setInteger("counter", 300);
                      return par1ItemStack;
                    } 
                  } else {
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText("У вас не хватает Jutsu Points (JP) хотя бы 1 "));
                  } 
                } else if (props.getStoryline() == 1) {
                  if (props.getShurikenjutsu() >= 5) {
                    if (par1ItemStack.stackTagCompound.getInteger("counter") == 0) {
                      par1ItemStack.stackTagCompound.setBoolean("start", true);
                      par1ItemStack.stackTagCompound.setInteger("counter", 300);
                    } 
                  } else {
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText("§6Прокачай Сюрикендзюцу Lvl 5"));
                  } 
                } else if (props.getStoryline() == 2) {
                  if (props.getRank() >= 1 && props.getRank() != 21) {
                    if (par1ItemStack.stackTagCompound.getInteger("counter") == 0) {
                      par1ItemStack.stackTagCompound.setBoolean("start", true);
                      par1ItemStack.stackTagCompound.setInteger("counter", 600);
                    } 
                  } else {
                    player.addChatComponentMessage((IChatComponent)new ChatComponentText("Ты ещё не прошёл экзамен на Генина!"));
                  } 
                } else if (props.getStoryline() == 3 && 
                  par1ItemStack.stackTagCompound.getInteger("counter") == 0) {
                  par1ItemStack.stackTagCompound.setBoolean("start", true);
                  par1ItemStack.stackTagCompound.setInteger("counter", 2120);
                } 
              } else if (par1ItemStack.getItemDamage() == 100) {
                if (props.getStoryline() == 0) {
                  props.setStoryline(1);
                  PacketDispatcher.sendTo((IMessage)new SyncStorylineMessage(player), (EntityPlayerMP)player);
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText("§6Эпизод 1 §rЗавершён"));
                  props.setChakraExperience(props.getChakraExperience() + 5);
                  PacketDispatcher.sendTo((IMessage)new SyncChakraExperienceMessage(player), (EntityPlayerMP)player);
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText("Вы получили §b5 §5Exp"));
                  par1ItemStack.setItemDamage(0);
                  return par1ItemStack;
                } 
                if (props.getStoryline() == 1) {
                  props.setStoryline(2);
                  PacketDispatcher.sendTo((IMessage)new SyncStorylineMessage(player), (EntityPlayerMP)player);
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText("§6Эпизод 2 §rЗавершён"));
                  props.setChakraExperience(props.getChakraExperience() + 10);
                  PacketDispatcher.sendTo((IMessage)new SyncChakraExperienceMessage(player), (EntityPlayerMP)player);
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText("Вы получили §b10 §5Exp"));
                  par1ItemStack.setItemDamage(0);
                  return par1ItemStack;
                } 
                if (props.getStoryline() == 2) {
                  props.setStoryline(3);
                  PacketDispatcher.sendTo((IMessage)new SyncStorylineMessage(player), (EntityPlayerMP)player);
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText("§6Эпизод 3 §rЗавершён"));
                  props.setChakraExperience(props.getChakraExperience() + 20);
                  PacketDispatcher.sendTo((IMessage)new SyncChakraExperienceMessage(player), (EntityPlayerMP)player);
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText("Вы получили §b20 §5Exp"));
                  par1ItemStack.setItemDamage(0);
                  return par1ItemStack;
                } 
                if (props.getStoryline() == 3) {
                  props.setStoryline(4);
                  PacketDispatcher.sendTo((IMessage)new SyncStorylineMessage(player), (EntityPlayerMP)player);
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText("§6Эпизод 4 §rЗавершён"));
                  props.setChakraExperience(props.getChakraExperience() + 25);
                  PacketDispatcher.sendTo((IMessage)new SyncChakraExperienceMessage(player), (EntityPlayerMP)player);
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText("Вы получили §b25 §5Exp"));
                  par1ItemStack.setItemDamage(0);
                  return par1ItemStack;
                } 
              } else if (par1ItemStack.getItemDamage() == 75) {
                if (props.getStoryline() == 5) {
                  par1ItemStack.stackTagCompound.setBoolean("start", true);
                  par1ItemStack.setItemDamage(80);
                  int counter = par1ItemStack.stackTagCompound.getInteger("counter");
                  counter = 2000;
                  props.setStoryline(4);
                  PacketDispatcher.sendTo((IMessage)new SyncStorylineMessage(player), (EntityPlayerMP)player);
                  par1ItemStack.stackTagCompound.setInteger("counter", counter);
                } 
              } 
            } 
          } else {
            player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "You cannot use this item in Creative Mode"));
          } 
        } else {
          player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "You Are not The owner of this Item"));
        }  
    } 
    return par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null) {
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner"));
      par3List.add(EnumChatFormatting.AQUA + "Counter: " + par1ItemStack.stackTagCompound.getInteger("counter"));
    } 
    if (props.getStoryline() == 0) {
      if (par1ItemStack.getItemDamage() == 0)
        par3List.add(EnumChatFormatting.AQUA + "Начать Эпизод 1"); 
      if (par1ItemStack.getItemDamage() == 50) {
        par3List.add(EnumChatFormatting.AQUA + "Выучить Теневое Клонирование");
        par3List.add(EnumChatFormatting.AQUA + "Стоит 1 Джутсу поинт");
      } 
      if (par1ItemStack.getItemDamage() == 100)
        par3List.add(EnumChatFormatting.AQUA + "Правая кнопка мыши для Завершения Эпизода 1"); 
    } 
    if (props.getStoryline() == 1) {
      if (par1ItemStack.getItemDamage() == 0)
        par3List.add(EnumChatFormatting.AQUA + "Начать Эпизод 2"); 
      if (par1ItemStack.getItemDamage() == 50)
        par3List.add(EnumChatFormatting.AQUA + "Прокачать Сюрикендзюцу до 5"); 
      if (par1ItemStack.getItemDamage() == 100)
        par3List.add(EnumChatFormatting.AQUA + "Правая кнопка мыши для Завершения Эпизода 2"); 
    } 
    if (props.getStoryline() == 2) {
      if (par1ItemStack.getItemDamage() == 0)
        par3List.add(EnumChatFormatting.AQUA + "Начать Эпизод 3"); 
      if (par1ItemStack.getItemDamage() == 50)
        par3List.add(EnumChatFormatting.AQUA + "Стать Генином"); 
      if (par1ItemStack.getItemDamage() == 100)
        par3List.add(EnumChatFormatting.AQUA + "Правая кнопка мыши для Завершения Эпизода 3"); 
    } 
    if (props.getStoryline() == 3) {
      if (par1ItemStack.getItemDamage() == 0)
        par3List.add(EnumChatFormatting.AQUA + "Начать Эпизод 4"); 
      if (par1ItemStack.getItemDamage() == 50)
        par3List.add(EnumChatFormatting.AQUA + "Продолжить Эпизод 4"); 
      if (par1ItemStack.getItemDamage() == 100)
        par3List.add(EnumChatFormatting.AQUA + "Правая кнопка мыши для Завершения Эпизода 4"); 
    } 
    if (props.getStoryline() == 4)
      par3List.add(EnumChatFormatting.AQUA + "Конец Режима Истории"); 
  }
}

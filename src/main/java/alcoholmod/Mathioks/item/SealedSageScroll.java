package alcoholmod.Mathioks.item;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SyncJutsuPointsMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSageActiveMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSageVersionMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSenjutsuMessage;
import alcoholmod.Mathioks.Final.JutsuItem;
import alcoholmod.Mathioks.Final.Summons.Entity.SummonGamabuntaEntity;
import alcoholmod.Mathioks.Final.Summons.Entity.SummonKatsuyuEntity;
import alcoholmod.Mathioks.Final.Summons.Entity.SummonMandaEntity;
import alcoholmod.Mathioks.NPC.EntitySage;
import alcoholmod.Mathioks.PacketDispatcher;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import lc208.tools;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

public class SealedSageScroll extends JutsuItem {
  public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player) {
    return false;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null) {
      if (par1ItemStack.stackTagCompound == null) {
        par1ItemStack.stackTagCompound = new NBTTagCompound();
        par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
        par1ItemStack.stackTagCompound.setBoolean("Location", false);
        par1ItemStack.stackTagCompound.setInteger("SageType", 0);
        par1ItemStack.stackTagCompound.setInteger("Stage", 0);
        par1ItemStack.stackTagCompound.setInteger("LocX", 0);
        par1ItemStack.stackTagCompound.setDouble("XpositionDestination", 0.0D);
        par1ItemStack.stackTagCompound.setDouble("YpositionDestination", 0.0D);
        par1ItemStack.stackTagCompound.setDouble("ZpositionDestination", 0.0D);
        par1ItemStack.stackTagCompound.setBoolean("start", false);
        par1ItemStack.stackTagCompound.setInteger("counter", 0);
        par1ItemStack.stackTagCompound.setInteger("beef", 0);
        par1ItemStack.stackTagCompound.setInteger("fish", 0);
        par1ItemStack.stackTagCompound.setInteger("slime", 0);
        par1ItemStack.stackTagCompound.setInteger("meditationCounter", 12000);
        par1ItemStack.stackTagCompound.setBoolean("meditationStart", false);
        par1ItemStack.stackTagCompound.setBoolean("Boss", false);
        par1ItemStack.stackTagCompound.setBoolean("Failed", false);
        par1ItemStack.stackTagCompound.setString("Name", "");
      } 
      if (par1ItemStack.stackTagCompound != null && !par2World.isRemote) {
        ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)par3Entity);
        int counter = par1ItemStack.stackTagCompound.getInteger("counter");
        if (par1ItemStack.stackTagCompound.getInteger("Stage") == 4 && par1ItemStack.getItemDamage() == 50)
          if (((EntityPlayer)par3Entity).posY >= 200.0D) {
            int meditationCounter = par1ItemStack.stackTagCompound.getInteger("meditationCounter");
            if (!par1ItemStack.stackTagCompound.getBoolean("start")) {
              par1ItemStack.stackTagCompound.setBoolean("start", true);
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + "Вы достигли высшей точки, начав медитацию"));
            } 
            if (par1ItemStack.stackTagCompound.getBoolean("start")) {
              meditationCounter--;
              par1ItemStack.stackTagCompound.setInteger("meditationCounter", meditationCounter);
            } 
            if (meditationCounter == 0) {
              par1ItemStack.stackTagCompound.setBoolean("start", false);
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + "Медитации, вы чувствуете, как будто вы стали одно целое с ветром"));
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + "возвращайся к Мудрецу"));
              par1ItemStack.setItemDamage(100);
            } 
          } else if (par1ItemStack.stackTagCompound.getBoolean("start")) {
            par1ItemStack.stackTagCompound.setBoolean("start", false);
            ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + "Вы покинули высшую точку, медитация провалилась"));
            par1ItemStack.stackTagCompound.setInteger("meditationCounter", 12000);
          }  
        if (par1ItemStack.stackTagCompound.getInteger("Stage") == 6 && par1ItemStack.getItemDamage() == 0) {
          int meditationCounter = par1ItemStack.stackTagCompound.getInteger("meditationCounter");
          if (par2World.getBiomeGenForCoords((((EntityPlayer)par3Entity).getPlayerCoordinates()).posX, (((EntityPlayer)par3Entity).getPlayerCoordinates()).posZ) != BiomeGenBase.coldBeach && par2World.getBiomeGenForCoords((((EntityPlayer)par3Entity).getPlayerCoordinates()).posX, (((EntityPlayer)par3Entity).getPlayerCoordinates()).posZ) != BiomeGenBase.coldTaiga && par2World.getBiomeGenForCoords((((EntityPlayer)par3Entity).getPlayerCoordinates()).posX, (((EntityPlayer)par3Entity).getPlayerCoordinates()).posZ) != BiomeGenBase.coldTaigaHills && par2World.getBiomeGenForCoords((((EntityPlayer)par3Entity).getPlayerCoordinates()).posX, (((EntityPlayer)par3Entity).getPlayerCoordinates()).posZ) != BiomeGenBase.frozenOcean && par2World.getBiomeGenForCoords((((EntityPlayer)par3Entity).getPlayerCoordinates()).posX, (((EntityPlayer)par3Entity).getPlayerCoordinates()).posZ) != BiomeGenBase.frozenRiver && par2World.getBiomeGenForCoords((((EntityPlayer)par3Entity).getPlayerCoordinates()).posX, (((EntityPlayer)par3Entity).getPlayerCoordinates()).posZ) != BiomeGenBase.iceMountains && par2World.getBiomeGenForCoords((((EntityPlayer)par3Entity).getPlayerCoordinates()).posX, (((EntityPlayer)par3Entity).getPlayerCoordinates()).posZ) != BiomeGenBase.icePlains && par2World.getBiomeGenForCoords((((EntityPlayer)par3Entity).getPlayerCoordinates()).posX, (((EntityPlayer)par3Entity).getPlayerCoordinates()).posZ) != BiomeGenBase.iceMountains) {
            if (par1ItemStack.stackTagCompound.getBoolean("start")) {
              par1ItemStack.stackTagCompound.setBoolean("start", false);
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + "Вы покинули холодную зону, медитация провалилась"));
              par1ItemStack.stackTagCompound.setInteger("meditationCounter", 48000);
            } 
          } else {
            if (!par1ItemStack.stackTagCompound.getBoolean("start")) {
              par1ItemStack.stackTagCompound.setBoolean("start", true);
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + "Вы достигли холодной области, начало медитации"));
            } 
            if (par1ItemStack.stackTagCompound.getBoolean("start")) {
              meditationCounter--;
              par1ItemStack.stackTagCompound.setInteger("meditationCounter", meditationCounter);
            } 
            if (meditationCounter == 0) {
              par1ItemStack.stackTagCompound.setBoolean("start", false);
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + "Медитации, вы чувствуете, как будто вы стали устойчивы к холоду"));
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + "возвращайся к Мудрецу"));
              par1ItemStack.setItemDamage(50);
            } 
          } 
        } 
        if (par1ItemStack.stackTagCompound.getInteger("Stage") == 7 && par1ItemStack.getItemDamage() == 0) {
          int meditationCounter = par1ItemStack.stackTagCompound.getInteger("meditationCounter");
          if (par2World.getBiomeGenForCoords((((EntityPlayer)par3Entity).getPlayerCoordinates()).posX, (((EntityPlayer)par3Entity).getPlayerCoordinates()).posZ) == BiomeGenBase.hell) {
            if (!par1ItemStack.stackTagCompound.getBoolean("start")) {
              par1ItemStack.stackTagCompound.setBoolean("start", true);
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + "Вы достигли Ада, медитация начинается"));
            } 
            if (par1ItemStack.stackTagCompound.getBoolean("start")) {
              meditationCounter--;
              par1ItemStack.stackTagCompound.setInteger("meditationCounter", meditationCounter);
            } 
            if (meditationCounter == 0) {
              par1ItemStack.stackTagCompound.setBoolean("start", false);
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + "Медитация сделана, вы чувствуете, как будто вы стали устойчивы к жаре"));
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + "возвращайся к Мудрецу"));
              par1ItemStack.setItemDamage(50);
            } 
          } else if (par1ItemStack.stackTagCompound.getBoolean("start")) {
            par1ItemStack.stackTagCompound.setBoolean("start", false);
            ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + "Ты ушел из Ада, медитация провалилась"));
            par1ItemStack.stackTagCompound.setInteger("meditationCounter", 24000);
          } 
        } 
        if (par1ItemStack.stackTagCompound.getBoolean("start")) {
          if (par1ItemStack.stackTagCompound.getInteger("Stage") == 0 && par1ItemStack.getItemDamage() == 0 && counter > 0) {
            counter--;
            par1ItemStack.stackTagCompound.setInteger("counter", counter);
            if (counter == 375)
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": Кто смеет беспокоить меня?!")); 
            if (counter == 300)
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(((EntityPlayer)par3Entity).getCommandSenderName() + ": Я ищу вашу мудрость, чтобы узнать Режим Отшельника")); 
            if (counter == 200)
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": Изучить Режим Отшельника хм!")); 
            if (counter == 100) {
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": Хм.. Очень хорошо... Принеси мне"));
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": Око Эндера"));
            } 
            if (counter == 1) {
              par1ItemStack.stackTagCompound.setBoolean("start", false);
              par1ItemStack.setItemDamage(50);
              par1ItemStack.stackTagCompound.setInteger("counter", 0);
            } 
          } 
          if (par1ItemStack.stackTagCompound.getInteger("Stage") == 0 && par1ItemStack.getItemDamage() == 50 && counter > 0) {
            par1ItemStack.stackTagCompound.setBoolean("start", false);
            par1ItemStack.setItemDamage(0);
            par1ItemStack.stackTagCompound.setInteger("counter", 0);
            par1ItemStack.stackTagCompound.setInteger("Stage", 2);
          } 
          if (par1ItemStack.stackTagCompound.getInteger("Stage") == 2 && par1ItemStack.getItemDamage() == 100 && counter > 0) {
            counter--;
            par1ItemStack.stackTagCompound.setInteger("counter", counter);
            if (counter == 525)
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(((EntityPlayer)par3Entity).getCommandSenderName() + ": Вот вам око эндера, о котором вы просили, " + par1ItemStack.stackTagCompound.getString("Name"))); 
            if (counter == 450)
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": Замечательно! Ещё кое-что...")); 
            if (counter == 375)
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": Мне нужно ведро лавы и воды!")); 
            if (counter == 300)
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(((EntityPlayer)par3Entity).getCommandSenderName() + ": Ох.. Я очень сожалею, " + par1ItemStack.stackTagCompound.getString("Name") + "...")); 
            if (counter == 225)
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(((EntityPlayer)par3Entity).getCommandSenderName() + ": Но какое отношение все это имеет к моим тренировкам?")); 
            if (counter == 150)
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": Вы скоро поймете, как овладеть Режимом Мудреца!")); 
            if (counter == 75)
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": Нужно уметь практиковать высшую форму терпения.")); 
            if (counter == 1) {
              par1ItemStack.stackTagCompound.setBoolean("start", false);
              par1ItemStack.setItemDamage(0);
              par1ItemStack.stackTagCompound.setInteger("counter", 0);
              par1ItemStack.stackTagCompound.setInteger("Stage", 3);
            } 
          } 
          if (par1ItemStack.stackTagCompound.getInteger("Stage") == 3 && par1ItemStack.getItemDamage() == 100 && counter > 0) {
            counter--;
            par1ItemStack.stackTagCompound.setInteger("counter", counter);
            if (counter == 825)
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(((EntityPlayer)par3Entity).getCommandSenderName() + ": У меня с собой ведро лавы и воды, которое вы просили..")); 
            if (counter == 750)
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": Отлично! Наконец-то все ингредиенты здесь!")); 
            if (counter == 675)
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": Теперь, я использую эту лаву вместе с водой, чтобы довести воду до кипения, ")); 
            if (counter == 600)
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": далее, мы добавляем насекомое мудреца вместе с говядиной, рыбой и шариками слизи.")); 
            if (counter == 525)
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": Наконец, мы добавляем око эндера.. Теперь все перемешайте и...")); 
            if (counter == 450)
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": АААаа... Суп готов! Вот, миска! ")); 
            if (counter == 375)
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(((EntityPlayer)par3Entity).getCommandSenderName() + ": Эй... Я сделал все это только ради супа??!")); 
            if (counter == 300)
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": Это не просто какой-то там суп.. Это суп мудреца!")); 
            if (counter == 225)
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": Такой вид супа, может приготовить только мудрец!")); 
            if (counter == 150)
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": Выпей... Это первая часть посвящения!")); 
            if (counter == 75)
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(((EntityPlayer)par3Entity).getCommandSenderName() + ": (В нём... Это отвратительное насекомое. )")); 
            if (counter == 1) {
              par1ItemStack.stackTagCompound.setBoolean("start", false);
              ((EntityPlayer)par3Entity).inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SageInsectSoup));
              par1ItemStack.setItemDamage(0);
              par1ItemStack.stackTagCompound.setInteger("counter", 0);
              par1ItemStack.stackTagCompound.setInteger("Stage", 4);
              return;
            } 
          } 
          if (par1ItemStack.stackTagCompound.getInteger("Stage") == 4) {
            if (par1ItemStack.getItemDamage() == 0 && counter > 0) {
              counter--;
              par1ItemStack.stackTagCompound.setInteger("counter", counter);
              if (counter == 450)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": А теперь... Да начнется обучение! ")); 
              if (counter == 400)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": Чтобы быть с природой одним целым,")); 
              if (counter == 350)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": тебе нужно столкнуться с разными элементами...")); 
              if (counter == 300)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": Для твоего первого испытания, отправляйся на самую высокую вершину..")); 
              if (counter == 250)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": ..мира, и стань одним целым с ветром, который..")); 
              if (counter == 200)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": ..будет пытаться подтолкнуть тебя, провести полдня в медитации, а затем вернуться, чтобы увидеть меня.")); 
              if (counter == 150)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(((EntityPlayer)par3Entity).getCommandSenderName() + ": Самая высокая вершина мира?")); 
              if (counter == 100)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": Да, найди свой путь наверх, который никто не сможет..")); 
              if (counter == 50)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": ...построить, удачи!")); 
              if (counter == 1) {
                par1ItemStack.stackTagCompound.setBoolean("start", false);
                par1ItemStack.setItemDamage(50);
                par1ItemStack.stackTagCompound.setInteger("counter", 0);
                par1ItemStack.stackTagCompound.setInteger("Stage", 4);
                return;
              } 
            } 
            if (par1ItemStack.getItemDamage() == 100 && counter > 0) {
              par1ItemStack.stackTagCompound.setInteger("counter", 0);
              par1ItemStack.stackTagCompound.setInteger("Stage", 5);
              par1ItemStack.stackTagCompound.setBoolean("start", false);
              par1ItemStack.setItemDamage(50);
              return;
            } 
          } 
          if (par1ItemStack.stackTagCompound.getInteger("Stage") == 5 && par1ItemStack.getItemDamage() == 50 && counter > 0) {
            counter--;
            par1ItemStack.stackTagCompound.setInteger("counter", counter);
            if (counter == 150)
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": Аааа.. вот и ты, самый выносливый! ")); 
            if (counter == 100)
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": Хорошо, твое следующее испытание - преодолеть холод... ")); 
            if (counter == 50)
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": Отправляйся в холодный биом и проведи там 2 дня!")); 
            if (counter == 1) {
              par1ItemStack.stackTagCompound.setBoolean("start", false);
              par1ItemStack.setItemDamage(0);
              par1ItemStack.stackTagCompound.setInteger("counter", 0);
              par1ItemStack.stackTagCompound.setInteger("Stage", 6);
              par1ItemStack.stackTagCompound.setInteger("meditationCounter", 48000);
              return;
            } 
          } 
          if (par1ItemStack.stackTagCompound.getInteger("Stage") == 6 && par1ItemStack.getItemDamage() == 50 && counter > 0) {
            counter--;
            par1ItemStack.stackTagCompound.setInteger("counter", counter);
            if (counter == 150)
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(((EntityPlayer)par3Entity).getCommandSenderName() + ": Я.. вернулся.. что делать дальше?")); 
            if (counter == 100)
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": Оо?.. Всё ещё хватает сил, чтобы продолжать?")); 
            if (counter == 50)
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": очень хорошо... Твое следующее испытание - научиться переносить жару.")); 
            if (counter == 1) {
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": Отправляйся в нижний мир и проведи там целый день."));
              par1ItemStack.stackTagCompound.setBoolean("start", false);
              par1ItemStack.setItemDamage(0);
              par1ItemStack.stackTagCompound.setInteger("counter", 0);
              par1ItemStack.stackTagCompound.setInteger("Stage", 7);
              par1ItemStack.stackTagCompound.setInteger("meditationCounter", 24000);
              return;
            } 
          } 
          if (par1ItemStack.stackTagCompound.getInteger("Stage") == 7 && par1ItemStack.getItemDamage() == 50 && counter > 0) {
            counter--;
            par1ItemStack.stackTagCompound.setInteger("counter", counter);
            if (counter == 400)
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(((EntityPlayer)par3Entity).getCommandSenderName() + ": Я сделал это... Я пережил жару...")); 
            if (counter == 350)
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": ... Хмм...")); 
            if (counter == 300)
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": Ты доказал свою терпеливость..")); 
            if (counter == 250)
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": ..а также настойчивость...")); 
            if (counter == 200)
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": Ты готов к последнему испытанию!")); 
            if (counter == 150)
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(((EntityPlayer)par3Entity).getCommandSenderName() + ": Спасибо, мудрейший " + par1ItemStack.stackTagCompound.getString("Name") + "...")); 
            if (counter == 100)
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": Для твоего последнего испытания, ты должен доказать свою..")); 
            if (counter == 50)
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": ..грубую силу или умную тактику, как полагает шиноби!")); 
            if (counter == 1) {
              if (par1ItemStack.stackTagCompound.getInteger("SageType") == 1) {
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": Приготовься к бою с Мандой!!!"));
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": Ты должен победить его в течении одного дня."));
              } 
              if (par1ItemStack.stackTagCompound.getInteger("SageType") == 2) {
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": Приготовься к бою с Гамабунтой!!!"));
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": Ты должен победить его в течении одного дня."));
              } 
              if (par1ItemStack.stackTagCompound.getInteger("SageType") == 3) {
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": Приготовься к бою со мной!!!"));
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": Ты должен победить меня за один день."));
              } 
              par1ItemStack.setItemDamage(0);
              par1ItemStack.stackTagCompound.setInteger("counter", 0);
              par1ItemStack.stackTagCompound.setInteger("Stage", 8);
              par1ItemStack.stackTagCompound.setBoolean("Boss", true);
              return;
            } 
          } 
          if (par1ItemStack.stackTagCompound.getInteger("Stage") == 8) {
            if (par1ItemStack.getItemDamage() == 0) {
              if (par1ItemStack.stackTagCompound.getBoolean("Boss") && !par1ItemStack.stackTagCompound.getBoolean("Failed")) {
                if (par1ItemStack.stackTagCompound.getInteger("SageType") == 1) {
                  SummonMandaEntity fireball2 = new SummonMandaEntity(par2World);
                  fireball2.setPosition(par1ItemStack.stackTagCompound.getDouble("XpositionDestination"), par1ItemStack.stackTagCompound.getDouble("YpositionDestination"), par1ItemStack.stackTagCompound.getDouble("ZpositionDestination"));
                  fireball2.Boss = true;
                  par2World.spawnEntityInWorld((Entity)fireball2);
                } 
                if (par1ItemStack.stackTagCompound.getInteger("SageType") == 2) {
                  SummonGamabuntaEntity fireball2 = new SummonGamabuntaEntity(par2World);
                  fireball2.setPosition(par1ItemStack.stackTagCompound.getDouble("XpositionDestination"), par1ItemStack.stackTagCompound.getDouble("YpositionDestination"), par1ItemStack.stackTagCompound.getDouble("ZpositionDestination"));
                  fireball2.Boss = true;
                  par2World.spawnEntityInWorld((Entity)fireball2);
                } 
                if (par1ItemStack.stackTagCompound.getInteger("SageType") == 3) {
                  SummonKatsuyuEntity fireball2 = new SummonKatsuyuEntity(par2World);
                  fireball2.setPosition(par1ItemStack.stackTagCompound.getDouble("XpositionDestination"), par1ItemStack.stackTagCompound.getDouble("YpositionDestination"), par1ItemStack.stackTagCompound.getDouble("ZpositionDestination"));
                  fireball2.Boss = true;
                  par2World.spawnEntityInWorld((Entity)fireball2);
                } 
                par1ItemStack.stackTagCompound.setBoolean("Boss", false);
              } 
              if (!par1ItemStack.stackTagCompound.getBoolean("Boss")) {
                counter++;
                par1ItemStack.stackTagCompound.setInteger("counter", counter);
                if (counter >= 24000) {
                  par1ItemStack.stackTagCompound.setInteger("counter", 0);
                  par1ItemStack.stackTagCompound.setBoolean("Boss", true);
                  par1ItemStack.stackTagCompound.setBoolean("Failed", true);
                  par1ItemStack.stackTagCompound.setBoolean("start", false);
                } 
              } 
            } 
            if (par1ItemStack.getItemDamage() == 50 && counter > 0) {
              counter--;
              par1ItemStack.stackTagCompound.setInteger("counter", counter);
              if (counter == 400)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": Отличная работа...")); 
              if (counter == 350)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": Ты доказал свою ценность как шиноби!")); 
              if (counter == 300)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": Я дарую тебе силу...")); 
              if (counter == 250) {
                if (par1ItemStack.stackTagCompound.getInteger("SageType") == 1)
                  ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": Змеиного Режима Мудреца!")); 
                if (par1ItemStack.stackTagCompound.getInteger("SageType") == 2)
                  ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": Жабьего Режима Мудреца!")); 
                if (par1ItemStack.stackTagCompound.getInteger("SageType") == 3)
                  ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": Слизневого Режима Мудреца!")); 
              } 
              if (counter == 200) {
                if (par1ItemStack.stackTagCompound.getInteger("SageType") == 1)
                  ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.WHITE + "Вы внезапно чувствуете, как будто два гигантских клыка..")); 
                if (par1ItemStack.stackTagCompound.getInteger("SageType") == 2)
                  ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.WHITE + "Вы внезапно чувствуете, как будто две гигантские руки..")); 
                if (par1ItemStack.stackTagCompound.getInteger("SageType") == 3)
                  ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.WHITE + "Вы внезапно чувствуете, как будто два гигантских щупальца..")); 
              } 
              if (counter == 150) {
                if (par1ItemStack.stackTagCompound.getInteger("SageType") == 1)
                  ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.WHITE + "..пронзают ваше тело...")); 
                if (par1ItemStack.stackTagCompound.getInteger("SageType") == 2)
                  ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.WHITE + "..проталкивают силу в ваше тело...")); 
                if (par1ItemStack.stackTagCompound.getInteger("SageType") == 3)
                  ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.WHITE + "..передают энергию вашему телу...")); 
              } 
              if (counter == 100)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.WHITE + "Вы также чувствуете, как ваша естественная энергия невероятно растет!")); 
              if (counter == 50)
                ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": Теперь ты мудрец...")); 
              if (counter == 1) {
                if (props.getSageVersion() == 0) {
                  if (par1ItemStack.stackTagCompound.getInteger("SageType") == 2) {
                    props.setJutsuPoints(props.getJutsuPoints() - 100);
                    PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage((EntityPlayer)par3Entity), (EntityPlayerMP)par3Entity);
                    props.setSageVersion(2);
                    PacketDispatcher.sendTo((IMessage)new SyncSageVersionMessage((EntityPlayer)par3Entity), (EntityPlayerMP)par3Entity);
                    props.setSageActive(true);
                    PacketDispatcher.sendTo((IMessage)new SyncSageActiveMessage((EntityPlayer)par3Entity), (EntityPlayerMP)par3Entity);
                    props.setSenjutsu(props.getSenjutsu() + 75);
                    PacketDispatcher.sendTo((IMessage)new SyncSenjutsuMessage((EntityPlayer)par3Entity), (EntityPlayerMP)par3Entity);
                    props.replenishSenjutsu();
                    ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": Поздравляем!"));
                    ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + "Режим мудреца активирован."));
                    par1ItemStack.setItemDamage(0);
                    par1ItemStack.stackTagCompound.setInteger("counter", 0);
                    par1ItemStack.stackTagCompound.setInteger("Stage", 10);
                    par1ItemStack.stackTagCompound.setBoolean("start", false);
                  } 
                  if (par1ItemStack.stackTagCompound.getInteger("SageType") == 1) {
                    props.setJutsuPoints(props.getJutsuPoints() - 100);
                    PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage((EntityPlayer)par3Entity), (EntityPlayerMP)par3Entity);
                    props.setSageVersion(1);
                    PacketDispatcher.sendTo((IMessage)new SyncSageVersionMessage((EntityPlayer)par3Entity), (EntityPlayerMP)par3Entity);
                    props.setSageActive(true);
                    PacketDispatcher.sendTo((IMessage)new SyncSageActiveMessage((EntityPlayer)par3Entity), (EntityPlayerMP)par3Entity);
                    props.setSenjutsu(props.getSenjutsu() + 75);
                    PacketDispatcher.sendTo((IMessage)new SyncSenjutsuMessage((EntityPlayer)par3Entity), (EntityPlayerMP)par3Entity);
                    props.replenishSenjutsu();
                    ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": Поздравляем!"));
                    ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + "Режим мудреца активирован."));
                    par1ItemStack.setItemDamage(0);
                    par1ItemStack.stackTagCompound.setInteger("counter", 0);
                    par1ItemStack.stackTagCompound.setInteger("Stage", 10);
                    par1ItemStack.stackTagCompound.setBoolean("start", false);
                  } 
                  if (par1ItemStack.stackTagCompound.getInteger("SageType") == 3) {
                    props.setJutsuPoints(props.getJutsuPoints() - 100);
                    PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage((EntityPlayer)par3Entity), (EntityPlayerMP)par3Entity);
                    props.setSageVersion(3);
                    PacketDispatcher.sendTo((IMessage)new SyncSageVersionMessage((EntityPlayer)par3Entity), (EntityPlayerMP)par3Entity);
                    props.setSageActive(true);
                    PacketDispatcher.sendTo((IMessage)new SyncSageActiveMessage((EntityPlayer)par3Entity), (EntityPlayerMP)par3Entity);
                    props.setSenjutsu(props.getSenjutsu() + 75);
                    PacketDispatcher.sendTo((IMessage)new SyncSenjutsuMessage((EntityPlayer)par3Entity), (EntityPlayerMP)par3Entity);
                    props.replenishSenjutsu();
                    ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Name") + ": Поздравляем!"));
                    ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + "Режим мудреца активирован."));
                    par1ItemStack.setItemDamage(0);
                    par1ItemStack.stackTagCompound.setInteger("counter", 0);
                    par1ItemStack.stackTagCompound.setInteger("Stage", 10);
                    par1ItemStack.stackTagCompound.setBoolean("start", false);
                  } 
                } 
                return;
              } 
            } 
          } 
        } 
      } 
    } 
  }
  
  public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
    if (!player.worldObj.isRemote && 
      entity instanceof EntitySage)
      if (((EntitySage)entity).getHealth() == 5.0F) {
        if (!stack.stackTagCompound.getBoolean("Location")) {
          stack.stackTagCompound.setBoolean("Location", true);
          if (entity instanceof alcoholmod.Mathioks.NPC.EntityOrochimaru) {
            stack.stackTagCompound.setInteger("SageType", 1);
            stack.stackTagCompound.setString("Name", "White Snake Sage");
            player.addChatMessage((IChatComponent)new ChatComponentText("Орочимару: Хорошо, очень хорошо!!"));
            player.addChatMessage((IChatComponent)new ChatComponentText("Орочимару: Я обновлю твое местоположение свитка."));
            player.addChatMessage((IChatComponent)new ChatComponentText("Орочимару: Под стать пещере Рьючи!"));
          } else if (entity instanceof alcoholmod.Mathioks.NPC.EntityJiraiya) {
            stack.stackTagCompound.setInteger("SageType", 2);
            stack.stackTagCompound.setString("Name", "Gamamaru");
            player.addChatMessage((IChatComponent)new ChatComponentText("Джирайя: Очень хорошо!"));
            player.addChatMessage((IChatComponent)new ChatComponentText("Джирайя: Я обновлю твое местоположение свитка."));
            player.addChatMessage((IChatComponent)new ChatComponentText("Джирайя: Под стать горе Мьёбоку!"));
          } else if (entity instanceof alcoholmod.Mathioks.NPC.EntityTsunade) {
            stack.stackTagCompound.setInteger("SageType", 3);
            stack.stackTagCompound.setString("Name", "Katsuyu");
            player.addChatMessage((IChatComponent)new ChatComponentText("Цунаде: Очень хорошо!"));
            player.addChatMessage((IChatComponent)new ChatComponentText("Цунаде: Я обновлю твое местоположение свитка."));
            player.addChatMessage((IChatComponent)new ChatComponentText("Цунаде: Под стать лесу Шиккоцу!"));
          } 
          boolean xPositive = player.posX > 0;
          if (xPositive)
            stack.stackTagCompound.setDouble("XpositionDestination", player.posX - 500.0D - player.worldObj.rand.nextInt(1000)); 
          if (xPositive)
            stack.stackTagCompound.setDouble("XpositionDestination", player.posX + 500.0D + player.worldObj.rand.nextInt(1000)); 
          stack.stackTagCompound.setDouble("YpositionDestination", player.posY);
          boolean zPositive = player.posZ > 0;
          if (zPositive)
            stack.stackTagCompound.setDouble("ZpositionDestination", player.posZ - 500.0D - player.worldObj.rand.nextInt(1000)); 
          if (zPositive)
            stack.stackTagCompound.setDouble("ZpositionDestination", player.posZ + 500.0D + player.worldObj.rand.nextInt(1000)); 
        } 
      } else if (!stack.stackTagCompound.getBoolean("Location")) {
        if (entity instanceof alcoholmod.Mathioks.NPC.EntityOrochimaru) {
          player.addChatMessage((IChatComponent)new ChatComponentText("Орочимару: Ах.. Ты хочешь узнать секреты.."));
          player.addChatMessage((IChatComponent)new ChatComponentText("Орочимару: ..Змеиного Режима Мудреца?"));
          player.addChatMessage((IChatComponent)new ChatComponentText("Орочимару: Сначала докажи мне свою силу!"));
        } else if (entity instanceof alcoholmod.Mathioks.NPC.EntityJiraiya) {
          player.addChatMessage((IChatComponent)new ChatComponentText("Джирайя: Итак, ты хочешь узнать все.."));
          player.addChatMessage((IChatComponent)new ChatComponentText("Джирайя: ..о Жабьем Режиме Мудреца, а?"));
          player.addChatMessage((IChatComponent)new ChatComponentText("Джирайя: Тогда докажи мне, что ты достоин!"));
        } else if (entity instanceof alcoholmod.Mathioks.NPC.EntityTsunade) {
          player.addChatMessage((IChatComponent)new ChatComponentText("Цунаде: Хм... Ты хочешь узнать все.."));
          player.addChatMessage((IChatComponent)new ChatComponentText("Цунаде: ..о Слизневом Режиме Мудреца?"));
          player.addChatMessage((IChatComponent)new ChatComponentText("Цунаде: Хорошо, сначала покажи мне, что ты умеешь!"));
        } 
      }  
    return true;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      int EmptySpaces = tools.freeSpace(Par3EntityPlayer.inventory.mainInventory);
      if (!Par3EntityPlayer.capabilities.isCreativeMode) {
        if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
          ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
          if (Par1ItemStack.stackTagCompound.getBoolean("Location"))
            if (props.getSummoning() >= 50) {
              double XpositionDestination = Par1ItemStack.stackTagCompound.getDouble("XpositionDestination");
              double YpositionDestination = Par1ItemStack.stackTagCompound.getDouble("YpositionDestination");
              double ZpositionDestination = Par1ItemStack.stackTagCompound.getDouble("ZpositionDestination");
              if (Par1ItemStack.stackTagCompound.getInteger("Stage") == 0)
                if (Par1ItemStack.getItemDamage() == 0) {
                  if (Math.abs(Par3EntityPlayer.posX - XpositionDestination) < 10.0D && Math.abs(Par3EntityPlayer.posY - YpositionDestination) < 60.0D && Math.abs(Par3EntityPlayer.posZ - ZpositionDestination) < 10.0D) {
                    Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + "Ты устанавливаешь связь между собой и регионом мудрецов..."));
                    Par1ItemStack.stackTagCompound.setBoolean("start", true);
                    Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.blindness.id, 400, 10));
                    Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.confusion.id, 400, 10));
                    Par1ItemStack.stackTagCompound.setInteger("counter", 400);
                    return Par1ItemStack;
                  } 
                  Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Ты недостаточно близко."));
                } else if (Par1ItemStack.stackTagCompound.getInteger("beef") == 10 && Par1ItemStack.stackTagCompound.getInteger("slime") == 10 && Par1ItemStack.stackTagCompound.getInteger("fish") == 10) {
                  if (Math.abs(Par3EntityPlayer.posX - XpositionDestination) < 10.0D && Math.abs(Par3EntityPlayer.posY - YpositionDestination) < 60.0D && Math.abs(Par3EntityPlayer.posZ - ZpositionDestination) < 10.0D) {
                    Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + "Ты устанавливаешь связь между собой и регионом мудрецов..."));
                    Par1ItemStack.stackTagCompound.setBoolean("start", true);
                    Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.blindness.id, 400, 10));
                    Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.confusion.id, 400, 10));
                    Par1ItemStack.stackTagCompound.setInteger("counter", 400);
                    return Par1ItemStack;
                  } 
                  Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Ты недостаточно близко."));
                } else {
                  if (Par1ItemStack.getItemDamage() == 50) {
                    if (Par3EntityPlayer.inventory.hasItem(Items.beef) && Par1ItemStack.stackTagCompound.getInteger("beef") < 10) {
                      Par3EntityPlayer.inventory.consumeInventoryItem(Items.beef);
                      Par1ItemStack.stackTagCompound.setInteger("beef", Par1ItemStack.stackTagCompound.getInteger("beef") + 1);
                      Par1ItemStack.setItemDamage(100);
                      return Par1ItemStack;
                    } 
                    if (Par3EntityPlayer.inventory.hasItem(Items.slime_ball) && Par1ItemStack.stackTagCompound.getInteger("slime") < 10) {
                      Par3EntityPlayer.inventory.consumeInventoryItem(Items.slime_ball);
                      Par1ItemStack.stackTagCompound.setInteger("slime", Par1ItemStack.stackTagCompound.getInteger("slime") + 1);
                      Par1ItemStack.setItemDamage(100);
                      return Par1ItemStack;
                    } 
                    if (Par3EntityPlayer.inventory.hasItem(Items.fish) && Par1ItemStack.stackTagCompound.getInteger("fish") < 10) {
                      Par3EntityPlayer.inventory.consumeInventoryItem(Items.fish);
                      Par1ItemStack.stackTagCompound.setInteger("fish", Par1ItemStack.stackTagCompound.getInteger("fish") + 1);
                      Par1ItemStack.setItemDamage(100);
                      return Par1ItemStack;
                    } 
                  } 
                  if (Par1ItemStack.getItemDamage() == 100) {
                    if (Par3EntityPlayer.inventory.hasItem(Items.beef) && Par1ItemStack.stackTagCompound.getInteger("beef") < 10) {
                      Par3EntityPlayer.inventory.consumeInventoryItem(Items.beef);
                      Par1ItemStack.stackTagCompound.setInteger("beef", Par1ItemStack.stackTagCompound.getInteger("beef") + 1);
                      Par1ItemStack.setItemDamage(50);
                      return Par1ItemStack;
                    } 
                    if (Par3EntityPlayer.inventory.hasItem(Items.slime_ball) && Par1ItemStack.stackTagCompound.getInteger("slime") < 10) {
                      Par3EntityPlayer.inventory.consumeInventoryItem(Items.slime_ball);
                      Par1ItemStack.stackTagCompound.setInteger("slime", Par1ItemStack.stackTagCompound.getInteger("slime") + 1);
                      Par1ItemStack.setItemDamage(50);
                      return Par1ItemStack;
                    } 
                    if (Par3EntityPlayer.inventory.hasItem(Items.fish) && Par1ItemStack.stackTagCompound.getInteger("fish") < 10) {
                      Par3EntityPlayer.inventory.consumeInventoryItem(Items.fish);
                      Par1ItemStack.stackTagCompound.setInteger("fish", Par1ItemStack.stackTagCompound.getInteger("fish") + 1);
                      Par1ItemStack.setItemDamage(50);
                      return Par1ItemStack;
                    } 
                  } 
                }  
              if (Par1ItemStack.stackTagCompound.getInteger("Stage") == 1 && Par1ItemStack.getItemDamage() == 0) {
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + "Ты устанавливаешь связь между собой и регионом мудрецов..."));
                Par1ItemStack.setItemDamage(150);
                Par1ItemStack.stackTagCompound.setBoolean("start", true);
                Par1ItemStack.stackTagCompound.setInteger("counter", 300);
                return Par1ItemStack;
              } 
              if (Par1ItemStack.stackTagCompound.getInteger("Stage") == 2 && Par1ItemStack.getItemDamage() == 0)
                if (Math.abs(Par3EntityPlayer.posX - XpositionDestination) < 10.0D && Math.abs(Par3EntityPlayer.posY - YpositionDestination) < 60.0D && Math.abs(Par3EntityPlayer.posZ - ZpositionDestination) < 10.0D) {
                  if (Par3EntityPlayer.inventory.hasItem(Items.ender_eye)) {
                    Par3EntityPlayer.inventory.consumeInventoryItem(Items.ender_eye);
                    Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + "Ты устанавливаешь связь между собой и регионом мудрецов..."));
                    Par1ItemStack.setItemDamage(100);
                    Par1ItemStack.stackTagCompound.setBoolean("start", true);
                    Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.blindness.id, 550, 10));
                    Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.confusion.id, 550, 10));
                    Par1ItemStack.stackTagCompound.setInteger("counter", 550);
                    return Par1ItemStack;
                  } 
                } else {
                  Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Ты недостаточно близко."));
                }  
              if (Par1ItemStack.stackTagCompound.getInteger("Stage") == 3 && Par1ItemStack.getItemDamage() == 0)
                if (Math.abs(Par3EntityPlayer.posX - XpositionDestination) < 10.0D && Math.abs(Par3EntityPlayer.posY - YpositionDestination) < 60.0D && Math.abs(Par3EntityPlayer.posZ - ZpositionDestination) < 10.0D) {
                  if (Par3EntityPlayer.inventory.hasItem(Items.lava_bucket) && Par3EntityPlayer.inventory.hasItem(Items.water_bucket)) {
                    if (EmptySpaces > 0) {
                      Par3EntityPlayer.inventory.consumeInventoryItem(Items.lava_bucket);
                      Par3EntityPlayer.inventory.consumeInventoryItem(Items.water_bucket);
                      Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + "Ты устанавливаешь связь между собой и регионом мудрецов..."));
                      Par1ItemStack.setItemDamage(100);
                      Par1ItemStack.stackTagCompound.setBoolean("start", true);
                      Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.blindness.id, 850, 10));
                      Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.confusion.id, 850, 10));
                      Par1ItemStack.stackTagCompound.setInteger("counter", 850);
                      return Par1ItemStack;
                    } 
                    Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("У тебя в инвентаре должно быть как минимум 1 свободное место."));
                  } 
                } else {
                  Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Ты недостаточно близко."));
                }  
              if (Par1ItemStack.stackTagCompound.getInteger("Stage") == 4) {
                if (Par1ItemStack.getItemDamage() == 0) {
                  if (Math.abs(Par3EntityPlayer.posX - XpositionDestination) < 10.0D && Math.abs(Par3EntityPlayer.posY - YpositionDestination) < 60.0D && Math.abs(Par3EntityPlayer.posZ - ZpositionDestination) < 10.0D) {
                    Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + "Ты устанавливаешь связь между собой и регионом мудрецов..."));
                    Par1ItemStack.setItemDamage(0);
                    Par1ItemStack.stackTagCompound.setBoolean("start", true);
                    Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.blindness.id, 475, 10));
                    Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.confusion.id, 475, 10));
                    Par1ItemStack.stackTagCompound.setInteger("counter", 475);
                    return Par1ItemStack;
                  } 
                  Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Ты недостаточно близко."));
                } 
                if (Par1ItemStack.getItemDamage() == 50) {
                  if (Math.abs(Par3EntityPlayer.posX - XpositionDestination) < 10.0D && Math.abs(Par3EntityPlayer.posY - YpositionDestination) < 60.0D && Math.abs(Par3EntityPlayer.posZ - ZpositionDestination) < 10.0D) {
                    Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + "Ты устанавливаешь связь между собой и регионом мудрецов..."));
                    Par1ItemStack.setItemDamage(50);
                    Par1ItemStack.stackTagCompound.setBoolean("start", true);
                    Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.blindness.id, 475, 10));
                    Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.confusion.id, 475, 10));
                    Par1ItemStack.stackTagCompound.setInteger("counter", 475);
                    return Par1ItemStack;
                  } 
                  Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Ты недостаточно близко."));
                } 
                if (Par1ItemStack.getItemDamage() == 100) {
                  if (Math.abs(Par3EntityPlayer.posX - XpositionDestination) < 10.0D && Math.abs(Par3EntityPlayer.posY - YpositionDestination) < 60.0D && Math.abs(Par3EntityPlayer.posZ - ZpositionDestination) < 10.0D) {
                    Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + "Ты устанавливаешь связь между собой и регионом мудрецов..."));
                    Par1ItemStack.setItemDamage(100);
                    Par1ItemStack.stackTagCompound.setBoolean("start", true);
                    Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.blindness.id, 225, 10));
                    Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.confusion.id, 225, 10));
                    Par1ItemStack.stackTagCompound.setInteger("counter", 225);
                    return Par1ItemStack;
                  } 
                  Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Ты недостаточно близко."));
                } 
              } 
              if (Par1ItemStack.stackTagCompound.getInteger("Stage") == 5 && Par1ItemStack.getItemDamage() == 50) {
                if (Math.abs(Par3EntityPlayer.posX - XpositionDestination) < 10.0D && Math.abs(Par3EntityPlayer.posY - YpositionDestination) < 60.0D && Math.abs(Par3EntityPlayer.posZ - ZpositionDestination) < 10.0D) {
                  Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + "Ты устанавливаешь связь между собой и регионом мудрецов..."));
                  Par1ItemStack.setItemDamage(50);
                  Par1ItemStack.stackTagCompound.setBoolean("start", true);
                  Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.blindness.id, 175, 10));
                  Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.confusion.id, 175, 10));
                  Par1ItemStack.stackTagCompound.setInteger("counter", 175);
                  return Par1ItemStack;
                } 
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Ты недостаточно близко."));
              } 
              if (Par1ItemStack.stackTagCompound.getInteger("Stage") == 6 && Par1ItemStack.getItemDamage() == 50) {
                if (Math.abs(Par3EntityPlayer.posX - XpositionDestination) < 10.0D && Math.abs(Par3EntityPlayer.posY - YpositionDestination) < 60.0D && Math.abs(Par3EntityPlayer.posZ - ZpositionDestination) < 10.0D) {
                  Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + "Ты устанавливаешь связь между собой и регионом мудрецов..."));
                  Par1ItemStack.setItemDamage(50);
                  Par1ItemStack.stackTagCompound.setBoolean("start", true);
                  Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.blindness.id, 175, 10));
                  Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.confusion.id, 175, 10));
                  Par1ItemStack.stackTagCompound.setInteger("counter", 175);
                  return Par1ItemStack;
                } 
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Ты недостаточно близко."));
              } 
              if (Par1ItemStack.stackTagCompound.getInteger("Stage") == 7 && Par1ItemStack.getItemDamage() == 50) {
                if (Math.abs(Par3EntityPlayer.posX - XpositionDestination) < 10.0D && Math.abs(Par3EntityPlayer.posY - YpositionDestination) < 60.0D && Math.abs(Par3EntityPlayer.posZ - ZpositionDestination) < 10.0D) {
                  Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + "Ты устанавливаешь связь между собой и регионом мудрецов..."));
                  Par1ItemStack.setItemDamage(50);
                  Par1ItemStack.stackTagCompound.setBoolean("start", true);
                  Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.blindness.id, 400, 10));
                  Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.confusion.id, 400, 10));
                  Par1ItemStack.stackTagCompound.setInteger("counter", 400);
                  return Par1ItemStack;
                } 
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Ты недостаточно близко."));
              } 
              if (Par1ItemStack.stackTagCompound.getInteger("Stage") == 8)
                if (Math.abs(Par3EntityPlayer.posX - XpositionDestination) < 10.0D && Math.abs(Par3EntityPlayer.posY - YpositionDestination) < 60.0D && Math.abs(Par3EntityPlayer.posZ - ZpositionDestination) < 10.0D && props.getJutsuPoints() >= 100) {
                  if (Par3EntityPlayer.inventory.hasItem(AlcoholMod.DefeatManda) && Par1ItemStack.stackTagCompound.getInteger("SageType") == 1) {
                    Par3EntityPlayer.inventory.consumeInventoryItem(AlcoholMod.DefeatManda);
                    Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + "Ты устанавливаешь связь между собой и регионом мудрецов..."));
                    Par1ItemStack.setItemDamage(50);
                    Par1ItemStack.stackTagCompound.setBoolean("start", true);
                    Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.blindness.id, 400, 10));
                    Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.confusion.id, 400, 10));
                    Par1ItemStack.stackTagCompound.setInteger("counter", 400);
                    return Par1ItemStack;
                  } 
                  if (Par3EntityPlayer.inventory.hasItem(AlcoholMod.DefeatGamakichi) && Par1ItemStack.stackTagCompound.getInteger("SageType") == 2) {
                    Par3EntityPlayer.inventory.consumeInventoryItem(AlcoholMod.DefeatGamakichi);
                    Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + "Ты устанавливаешь связь между собой и регионом мудрецов..."));
                    Par1ItemStack.setItemDamage(50);
                    Par1ItemStack.stackTagCompound.setBoolean("start", true);
                    Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.blindness.id, 400, 10));
                    Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.confusion.id, 400, 10));
                    Par1ItemStack.stackTagCompound.setInteger("counter", 400);
                    return Par1ItemStack;
                  } 
                  if (Par3EntityPlayer.inventory.hasItem(AlcoholMod.DefeatKatsuyu)) {
                    if (Par1ItemStack.stackTagCompound.getInteger("SageType") == 3) {
                      Par3EntityPlayer.inventory.consumeInventoryItem(AlcoholMod.DefeatKatsuyu);
                      Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + "Ты устанавливаешь связь между собой и регионом мудрецов..."));
                      Par1ItemStack.setItemDamage(50);
                      Par1ItemStack.stackTagCompound.setBoolean("start", true);
                      Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.blindness.id, 400, 10));
                      Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.confusion.id, 400, 10));
                      Par1ItemStack.stackTagCompound.setInteger("counter", 400);
                      return Par1ItemStack;
                    } 
                  } else if (Par1ItemStack.stackTagCompound.getBoolean("Failed") && Par1ItemStack.getItemDamage() == 0) {
                    Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + "Ты устанавливаешь связь между собой и регионом мудрецов..."));
                    Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + Par1ItemStack.stackTagCompound.getString("Name") + ": Тебе не удалось победить! Брось свиток.."));
                    Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + Par1ItemStack.stackTagCompound.getString("Name") + ": ..или приготовься попробовать ещё раз!"));
                    Par1ItemStack.setItemDamage(0);
                    Par1ItemStack.stackTagCompound.setBoolean("Failed", false);
                    Par1ItemStack.stackTagCompound.setBoolean("start", true);
                    return Par1ItemStack;
                  } 
                } else {
                  Par1ItemStack.setItemDamage(0);
                  Par1ItemStack.stackTagCompound.setInteger("Stage", 8);
                  if (props.getJutsuPoints() < 100) {
                    Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_RED + "Недостаточно Джутсу Поинтов"));
                  } else {
                    Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_RED + "Ты недостаточно близко."));
                  } 
                }  
              if (Par1ItemStack.stackTagCompound.getInteger("Stage") == 9 && Par1ItemStack.getItemDamage() == 0) {
                if (Math.abs(Par3EntityPlayer.posX - XpositionDestination) < 10.0D && Math.abs(Par3EntityPlayer.posY - YpositionDestination) < 60.0D && Math.abs(Par3EntityPlayer.posZ - ZpositionDestination) < 10.0D) {
                  Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + "Ты устанавливаешь связь между собой и регионом мудрецов..."));
                  Par1ItemStack.setItemDamage(50);
                  Par1ItemStack.stackTagCompound.setBoolean("start", true);
                  Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.blindness.id, 400, 10));
                  Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.confusion.id, 400, 10));
                  Par1ItemStack.stackTagCompound.setInteger("counter", 400);
                  return Par1ItemStack;
                } 
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Ты недостаточно близко."));
              } 
            } else {
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Твой уровень призыва недостаточно высок!"));
            }  
        } else {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Ты не владелец этого дзюцу."));
        } 
      } else {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Ты не можешь использовать это в творческом режиме!"));
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null) {
      par3List.add(EnumChatFormatting.AQUA + "Владелец: " + par1ItemStack.stackTagCompound.getString("Owner"));
      par3List.add(EnumChatFormatting.DARK_RED + "ВНИМАНИЕ: У тебя может быть только 1 тип Режима Мудреца!");
      if (!par1ItemStack.stackTagCompound.getBoolean("Location")) {
        par3List.add(EnumChatFormatting.DARK_GREEN + "Свиток, содержащий информацию..");
        par3List.add(EnumChatFormatting.DARK_GREEN + "..о землях Мудрецов. Кажется, он запечатан...");
        par3List.add(EnumChatFormatting.DARK_GREEN + "Может быть, если показать это Саннину..");
        par3List.add(EnumChatFormatting.DARK_GREEN + "..это может привести к ответам...");
        par3List.add(EnumChatFormatting.DARK_RED + "(Щелкни левой кнопкой мыши по Саннину этим предметом.)");
      } else if (par1ItemStack.stackTagCompound.getBoolean("Location")) {
        if (props.getSummoning() < 50)
          par3List.add(EnumChatFormatting.DARK_RED + "Требуется призыв: 50"); 
        if (par1ItemStack.stackTagCompound.getInteger("SageType") == 1) {
          if (par1ItemStack.stackTagCompound.getInteger("Stage") == 0)
            if (par1ItemStack.getItemDamage() == 0) {
              par3List.add(EnumChatFormatting.DARK_GREEN + "Свиток, содержащий информацию..");
              par3List.add(EnumChatFormatting.DARK_GREEN + "..о пещере Рьючи. Использование этого свитка..");
              par3List.add(EnumChatFormatting.DARK_GREEN + "..должно помочь мне перейти в режим Змеи-Мудреца!");
              par3List.add(EnumChatFormatting.RED + "Требуется призыв: 50");
            } else {
              par3List.add(EnumChatFormatting.DARK_GREEN + "Принеси Белому Змеиному Мудрецу 10 сырой говядины,");
              par3List.add(EnumChatFormatting.DARK_GREEN + "..рыбу и шарики слизи.");
              par3List.add(EnumChatFormatting.AQUA + "Говядина: " + par1ItemStack.stackTagCompound.getInteger("beef"));
              par3List.add(EnumChatFormatting.AQUA + "Рыба: " + par1ItemStack.stackTagCompound.getInteger("fish"));
              par3List.add(EnumChatFormatting.AQUA + "Слайм: " + par1ItemStack.stackTagCompound.getInteger("slime"));
            }  
          if (par1ItemStack.stackTagCompound.getInteger("Stage") == 1);
          if (par1ItemStack.stackTagCompound.getInteger("Stage") == 2) {
            par3List.add(EnumChatFormatting.DARK_GREEN + "Собери око эндера..");
            par3List.add(EnumChatFormatting.DARK_GREEN + "..и принеси его Белому..");
            par3List.add(EnumChatFormatting.DARK_GREEN + "..Змеиному Мудрецу.");
          } 
          if (par1ItemStack.stackTagCompound.getInteger("Stage") == 3) {
            par3List.add(EnumChatFormatting.DARK_GREEN + "Собери ведро с лавой и водой..");
            par3List.add(EnumChatFormatting.DARK_GREEN + "..и принеси его Белому Змеиному Мудрецу.");
          } 
          if (par1ItemStack.stackTagCompound.getInteger("Stage") == 4) {
            if (par1ItemStack.getItemDamage() == 0)
              par3List.add(EnumChatFormatting.DARK_GREEN + "Сообщи об этом " + par1ItemStack.stackTagCompound.getString("Name")); 
            if (par1ItemStack.getItemDamage() == 50) {
              par3List.add(EnumChatFormatting.DARK_GREEN + "Поднимись на самую высокую вершину мира..");
              par3List.add(EnumChatFormatting.DARK_GREEN + "..чтобы полдня помедитировать..");
              par3List.add(EnumChatFormatting.DARK_GREEN + "..при сильнейшем из ветров.");
              par3List.add(EnumChatFormatting.AQUA + "Время: " + (par1ItemStack.stackTagCompound.getInteger("meditationCounter") / 1200) + ":" + (par1ItemStack.stackTagCompound.getInteger("meditationCounter") / 20 % 60));
            } 
            if (par1ItemStack.getItemDamage() == 100)
              par3List.add(EnumChatFormatting.DARK_GREEN + "Сообщи об этом " + par1ItemStack.stackTagCompound.getString("Name")); 
          } 
          if (par1ItemStack.stackTagCompound.getInteger("Stage") == 6) {
            if (par1ItemStack.getItemDamage() == 0) {
              par3List.add(EnumChatFormatting.DARK_GREEN + "Отправляйся в холодный биом..");
              par3List.add(EnumChatFormatting.DARK_GREEN + "..и проведи там два дня.");
              par3List.add(EnumChatFormatting.AQUA + "Время: " + (par1ItemStack.stackTagCompound.getInteger("meditationCounter") / 1200) + ":" + (par1ItemStack.stackTagCompound.getInteger("meditationCounter") / 20 % 60));
            } 
            if (par1ItemStack.getItemDamage() == 50)
              par3List.add(EnumChatFormatting.DARK_GREEN + "Сообщи об этом " + par1ItemStack.stackTagCompound.getString("Name")); 
          } 
          if (par1ItemStack.stackTagCompound.getInteger("Stage") == 7) {
            if (par1ItemStack.getItemDamage() == 0) {
              par3List.add(EnumChatFormatting.DARK_GREEN + "Отправляйся в нижний мир..");
              par3List.add(EnumChatFormatting.DARK_GREEN + "..и проведи там целый день.");
              par3List.add(EnumChatFormatting.AQUA + "Время: " + (par1ItemStack.stackTagCompound.getInteger("meditationCounter") / 1200) + ":" + (par1ItemStack.stackTagCompound.getInteger("meditationCounter") / 20 % 60));
            } 
            if (par1ItemStack.getItemDamage() == 50)
              par3List.add(EnumChatFormatting.DARK_GREEN + "Сообщи об этом " + par1ItemStack.stackTagCompound.getString("Name")); 
          } 
          if (par1ItemStack.stackTagCompound.getInteger("Stage") == 8) {
            if (par1ItemStack.getItemDamage() == 0) {
              par3List.add(EnumChatFormatting.DARK_GREEN + "Победи Манду и получи..");
              par3List.add(EnumChatFormatting.DARK_GREEN + "..амулет Манды.");
            } 
            if (par1ItemStack.getItemDamage() == 50)
              par3List.add(EnumChatFormatting.DARK_GREEN + "Сообщи об этом " + par1ItemStack.stackTagCompound.getString("Name")); 
          } 
          if (par1ItemStack.stackTagCompound.getInteger("Stage") == 9) {
            if (par1ItemStack.getItemDamage() == 0) {
              par3List.add(EnumChatFormatting.DARK_GREEN + "");
              par3List.add(EnumChatFormatting.DARK_GREEN + "");
              par3List.add(EnumChatFormatting.AQUA + "Время: " + (par1ItemStack.stackTagCompound.getInteger("meditationCounter") / 1200) + ":" + (par1ItemStack.stackTagCompound.getInteger("meditationCounter") / 20 % 60));
            } 
            if (par1ItemStack.getItemDamage() == 50)
              par3List.add(EnumChatFormatting.DARK_GREEN + "Сообщи об этом " + par1ItemStack.stackTagCompound.getString("Name")); 
          } 
          if (par1ItemStack.stackTagCompound.getInteger("Stage") == 10) {
            if (par1ItemStack.getItemDamage() == 0) {
              par3List.add(EnumChatFormatting.DARK_GREEN + "Теперь ты мудрец.");
              par3List.add(EnumChatFormatting.DARK_GREEN + "Сохрани этот свиток для последующего обновления.");
              par3List.add(EnumChatFormatting.AQUA + "Время: " + (par1ItemStack.stackTagCompound.getInteger("meditationCounter") / 1200) + ":" + (par1ItemStack.stackTagCompound.getInteger("meditationCounter") / 20 % 60));
            } 
            if (par1ItemStack.getItemDamage() == 50)
              par3List.add(EnumChatFormatting.DARK_GREEN + "Сообщи об этом " + par1ItemStack.stackTagCompound.getString("Name")); 
          } 
          par3List.add(EnumChatFormatting.AQUA + "Координаты X: " + par1ItemStack.stackTagCompound.getDouble("XpositionDestination"));
          par3List.add(EnumChatFormatting.AQUA + "Координаты Y: " + par1ItemStack.stackTagCompound.getDouble("YpositionDestination"));
          par3List.add(EnumChatFormatting.AQUA + "Координаты Z: " + par1ItemStack.stackTagCompound.getDouble("ZpositionDestination"));
        } else if (par1ItemStack.stackTagCompound.getInteger("SageType") == 2) {
          if (par1ItemStack.stackTagCompound.getInteger("Stage") == 0)
            if (par1ItemStack.getItemDamage() == 0) {
              par3List.add(EnumChatFormatting.DARK_GREEN + "Свиток, содержащий информацию..");
              par3List.add(EnumChatFormatting.DARK_GREEN + "..о горе Мьёбоку. Использование этого свитка..");
              par3List.add(EnumChatFormatting.DARK_GREEN + "..должно помочь мне перейти в режим Жабьего-Мудреца!");
              par3List.add(EnumChatFormatting.RED + "Требуется призыв: 50");
            } else {
              par3List.add(EnumChatFormatting.DARK_GREEN + "Принеси Гамамару 10 сырой говядины,");
              par3List.add(EnumChatFormatting.DARK_GREEN + "рыбу и шарики слизи.");
              par3List.add(EnumChatFormatting.AQUA + "Говядина: " + par1ItemStack.stackTagCompound.getInteger("beef"));
              par3List.add(EnumChatFormatting.AQUA + "Рыба: " + par1ItemStack.stackTagCompound.getInteger("fish"));
              par3List.add(EnumChatFormatting.AQUA + "Слайм: " + par1ItemStack.stackTagCompound.getInteger("slime"));
            }  
          if (par1ItemStack.stackTagCompound.getInteger("Stage") == 1);
          if (par1ItemStack.stackTagCompound.getInteger("Stage") == 2) {
            par3List.add(EnumChatFormatting.DARK_GREEN + "Собери око эндера..");
            par3List.add(EnumChatFormatting.DARK_GREEN + "..и принеси его Гамамару.");
          } 
          if (par1ItemStack.stackTagCompound.getInteger("Stage") == 3) {
            par3List.add(EnumChatFormatting.DARK_GREEN + "Собери ведро с лавой и водой..");
            par3List.add(EnumChatFormatting.DARK_GREEN + "..и принеси его Гамамару.");
          } 
          if (par1ItemStack.stackTagCompound.getInteger("Stage") == 4) {
            if (par1ItemStack.getItemDamage() == 0)
              par3List.add(EnumChatFormatting.DARK_GREEN + "Сообщи об этом " + par1ItemStack.stackTagCompound.getString("Name")); 
            if (par1ItemStack.getItemDamage() == 50) {
              par3List.add(EnumChatFormatting.DARK_GREEN + "Поднимись на самую высокую вершину мира..");
              par3List.add(EnumChatFormatting.DARK_GREEN + "..чтобы полдня помедитировать..");
              par3List.add(EnumChatFormatting.DARK_GREEN + "..при сильнейшем из ветров.");
              par3List.add(EnumChatFormatting.AQUA + "Время: " + (par1ItemStack.stackTagCompound.getInteger("meditationCounter") / 1200) + ":" + (par1ItemStack.stackTagCompound.getInteger("meditationCounter") / 20 % 60));
            } 
            if (par1ItemStack.getItemDamage() == 100)
              par3List.add(EnumChatFormatting.DARK_GREEN + "Сообщи об этом " + par1ItemStack.stackTagCompound.getString("Name")); 
          } 
          if (par1ItemStack.stackTagCompound.getInteger("Stage") == 6) {
            if (par1ItemStack.getItemDamage() == 0) {
              par3List.add(EnumChatFormatting.DARK_GREEN + "Отправляйся в холодный биом..");
              par3List.add(EnumChatFormatting.DARK_GREEN + "..и проведи там два дня.");
              par3List.add(EnumChatFormatting.AQUA + "Время: " + (par1ItemStack.stackTagCompound.getInteger("meditationCounter") / 1200) + ":" + (par1ItemStack.stackTagCompound.getInteger("meditationCounter") / 20 % 60));
            } 
            if (par1ItemStack.getItemDamage() == 50)
              par3List.add(EnumChatFormatting.DARK_GREEN + "Сообщи об этом " + par1ItemStack.stackTagCompound.getString("Name")); 
          } 
          if (par1ItemStack.stackTagCompound.getInteger("Stage") == 7) {
            if (par1ItemStack.getItemDamage() == 0) {
              par3List.add(EnumChatFormatting.DARK_GREEN + "Отправляйся в нижний мир..");
              par3List.add(EnumChatFormatting.DARK_GREEN + "..и проведи там целый день.");
              par3List.add(EnumChatFormatting.AQUA + "Время: " + (par1ItemStack.stackTagCompound.getInteger("meditationCounter") / 1200) + ":" + (par1ItemStack.stackTagCompound.getInteger("meditationCounter") / 20 % 60));
            } 
            if (par1ItemStack.getItemDamage() == 50)
              par3List.add(EnumChatFormatting.DARK_GREEN + "Сообщи об этом " + par1ItemStack.stackTagCompound.getString("Name")); 
          } 
          if (par1ItemStack.stackTagCompound.getInteger("Stage") == 8) {
            if (par1ItemStack.getItemDamage() == 0) {
              par3List.add(EnumChatFormatting.DARK_GREEN + "Победи Гамабунту и получи..");
              par3List.add(EnumChatFormatting.DARK_GREEN + "..амулет Гамабунты.");
            } 
            if (par1ItemStack.getItemDamage() == 50)
              par3List.add(EnumChatFormatting.DARK_GREEN + "Сообщи об этом " + par1ItemStack.stackTagCompound.getString("Name")); 
          } 
          if (par1ItemStack.stackTagCompound.getInteger("Stage") == 9) {
            if (par1ItemStack.getItemDamage() == 0) {
              par3List.add(EnumChatFormatting.DARK_GREEN + "");
              par3List.add(EnumChatFormatting.DARK_GREEN + "");
              par3List.add(EnumChatFormatting.AQUA + "Время: " + (par1ItemStack.stackTagCompound.getInteger("meditationCounter") / 1200) + ":" + (par1ItemStack.stackTagCompound.getInteger("meditationCounter") / 20 % 60));
            } 
            if (par1ItemStack.getItemDamage() == 50)
              par3List.add(EnumChatFormatting.DARK_GREEN + "Сообщи об этом " + par1ItemStack.stackTagCompound.getString("Name")); 
          } 
          if (par1ItemStack.stackTagCompound.getInteger("Stage") == 10) {
            if (par1ItemStack.getItemDamage() == 0) {
              par3List.add(EnumChatFormatting.DARK_GREEN + "Теперь ты мудрец.");
              par3List.add(EnumChatFormatting.DARK_GREEN + "Сохрани этот свиток для последующего обновления.");
              par3List.add(EnumChatFormatting.AQUA + "Время: " + (par1ItemStack.stackTagCompound.getInteger("meditationCounter") / 1200) + ":" + (par1ItemStack.stackTagCompound.getInteger("meditationCounter") / 20 % 60));
            } 
            if (par1ItemStack.getItemDamage() == 50)
              par3List.add(EnumChatFormatting.DARK_GREEN + "Сообщи об этом " + par1ItemStack.stackTagCompound.getString("Name")); 
          } 
          par3List.add(EnumChatFormatting.AQUA + "Координаты X: " + par1ItemStack.stackTagCompound.getDouble("XpositionDestination"));
          par3List.add(EnumChatFormatting.AQUA + "Координаты Y: " + par1ItemStack.stackTagCompound.getDouble("YpositionDestination"));
          par3List.add(EnumChatFormatting.AQUA + "Координаты Z: " + par1ItemStack.stackTagCompound.getDouble("ZpositionDestination"));
        } else if (par1ItemStack.stackTagCompound.getInteger("SageType") == 3) {
          if (par1ItemStack.stackTagCompound.getInteger("Stage") == 0)
            if (par1ItemStack.getItemDamage() == 0) {
              par3List.add(EnumChatFormatting.DARK_GREEN + "Свиток, содержащий информацию..");
              par3List.add(EnumChatFormatting.DARK_GREEN + "..о лесе Шиккоцу. Использование этого свитка..");
              par3List.add(EnumChatFormatting.DARK_GREEN + "..должно помочь мне перейти в режим Слизневого-Мудреца!");
              par3List.add(EnumChatFormatting.RED + "Требуется призыв: 50");
            } else {
              par3List.add(EnumChatFormatting.DARK_GREEN + "Принеси Кацуи 10 сырой говядины,");
              par3List.add(EnumChatFormatting.DARK_GREEN + "рыбу и шарики слизи.");
              par3List.add(EnumChatFormatting.AQUA + "Говядина: " + par1ItemStack.stackTagCompound.getInteger("beef"));
              par3List.add(EnumChatFormatting.AQUA + "Рыба: " + par1ItemStack.stackTagCompound.getInteger("fish"));
              par3List.add(EnumChatFormatting.AQUA + "Слайм: " + par1ItemStack.stackTagCompound.getInteger("slime"));
            }  
          if (par1ItemStack.stackTagCompound.getInteger("Stage") == 1);
          if (par1ItemStack.stackTagCompound.getInteger("Stage") == 2) {
            par3List.add(EnumChatFormatting.DARK_GREEN + "Собери око эндера..");
            par3List.add(EnumChatFormatting.DARK_GREEN + "..и принеси его Кацуи.");
          } 
          if (par1ItemStack.stackTagCompound.getInteger("Stage") == 3) {
            par3List.add(EnumChatFormatting.DARK_GREEN + "Собери ведро с лавой и водой..");
            par3List.add(EnumChatFormatting.DARK_GREEN + "..и принеси его Кацуи.");
          } 
          if (par1ItemStack.stackTagCompound.getInteger("Stage") == 4) {
            if (par1ItemStack.getItemDamage() == 0)
              par3List.add(EnumChatFormatting.DARK_GREEN + "Сообщи об этом " + par1ItemStack.stackTagCompound.getString("Name")); 
            if (par1ItemStack.getItemDamage() == 50) {
              par3List.add(EnumChatFormatting.DARK_GREEN + "Поднимись на самую высокую вершину мира..");
              par3List.add(EnumChatFormatting.DARK_GREEN + "..чтобы полдня помедитировать..");
              par3List.add(EnumChatFormatting.DARK_GREEN + "..при сильнейшем из ветров.");
              par3List.add(EnumChatFormatting.AQUA + "Время: " + (par1ItemStack.stackTagCompound.getInteger("meditationCounter") / 1200) + ":" + (par1ItemStack.stackTagCompound.getInteger("meditationCounter") / 20 % 60));
            } 
            if (par1ItemStack.getItemDamage() == 100)
              par3List.add(EnumChatFormatting.DARK_GREEN + "Сообщи об этом " + par1ItemStack.stackTagCompound.getString("Name")); 
          } 
          if (par1ItemStack.stackTagCompound.getInteger("Stage") == 6) {
            if (par1ItemStack.getItemDamage() == 0) {
              par3List.add(EnumChatFormatting.DARK_GREEN + "Отправляйся в холодный биом..");
              par3List.add(EnumChatFormatting.DARK_GREEN + "..и проведи там два дня.");
              par3List.add(EnumChatFormatting.AQUA + "Время: " + (par1ItemStack.stackTagCompound.getInteger("meditationCounter") / 1200) + ":" + (par1ItemStack.stackTagCompound.getInteger("meditationCounter") / 20 % 60));
            } 
            if (par1ItemStack.getItemDamage() == 50)
              par3List.add(EnumChatFormatting.DARK_GREEN + "Сообщи об этом " + par1ItemStack.stackTagCompound.getString("Name")); 
          } 
          if (par1ItemStack.stackTagCompound.getInteger("Stage") == 7) {
            if (par1ItemStack.getItemDamage() == 0) {
              par3List.add(EnumChatFormatting.DARK_GREEN + "Отправляйся в нижний мир..");
              par3List.add(EnumChatFormatting.DARK_GREEN + "..и проведи там целый день.");
              par3List.add(EnumChatFormatting.AQUA + "Время: " + (par1ItemStack.stackTagCompound.getInteger("meditationCounter") / 1200) + ":" + (par1ItemStack.stackTagCompound.getInteger("meditationCounter") / 20 % 60));
            } 
            if (par1ItemStack.getItemDamage() == 50)
              par3List.add(EnumChatFormatting.DARK_GREEN + "Сообщи об этом " + par1ItemStack.stackTagCompound.getString("Name")); 
          } 
          if (par1ItemStack.stackTagCompound.getInteger("Stage") == 8) {
            if (par1ItemStack.getItemDamage() == 0) {
              par3List.add(EnumChatFormatting.DARK_GREEN + "Победи Кацую и получи..");
              par3List.add(EnumChatFormatting.DARK_GREEN + "..амулет Кацуи.");
            } 
            if (par1ItemStack.getItemDamage() == 50)
              par3List.add(EnumChatFormatting.DARK_GREEN + "Сообщи об этом " + par1ItemStack.stackTagCompound.getString("Name")); 
          } 
          if (par1ItemStack.stackTagCompound.getInteger("Stage") == 9) {
            if (par1ItemStack.getItemDamage() == 0) {
              par3List.add(EnumChatFormatting.DARK_GREEN + "");
              par3List.add(EnumChatFormatting.DARK_GREEN + "");
              par3List.add(EnumChatFormatting.AQUA + "Время: " + (par1ItemStack.stackTagCompound.getInteger("meditationCounter") / 1200) + ":" + (par1ItemStack.stackTagCompound.getInteger("meditationCounter") / 20 % 60));
            } 
            if (par1ItemStack.getItemDamage() == 50)
              par3List.add(EnumChatFormatting.DARK_GREEN + "Сообщи об этом " + par1ItemStack.stackTagCompound.getString("Name")); 
          } 
          if (par1ItemStack.stackTagCompound.getInteger("Stage") == 10) {
            if (par1ItemStack.getItemDamage() == 0) {
              par3List.add(EnumChatFormatting.DARK_GREEN + "Теперь ты мудрец.");
              par3List.add(EnumChatFormatting.DARK_GREEN + "Сохрани этот свиток для последующего обновления.");
              par3List.add(EnumChatFormatting.AQUA + "Время: " + (par1ItemStack.stackTagCompound.getInteger("meditationCounter") / 1200) + ":" + (par1ItemStack.stackTagCompound.getInteger("meditationCounter") / 20 % 60));
            } 
            if (par1ItemStack.getItemDamage() == 50)
              par3List.add(EnumChatFormatting.DARK_GREEN + "Сообщи об этом " + par1ItemStack.stackTagCompound.getString("Name")); 
          } 
          par3List.add(EnumChatFormatting.AQUA + "Координаты X: " + par1ItemStack.stackTagCompound.getDouble("XpositionDestination"));
          par3List.add(EnumChatFormatting.AQUA + "Координаты Y: " + par1ItemStack.stackTagCompound.getDouble("YpositionDestination"));
          par3List.add(EnumChatFormatting.AQUA + "Координаты Z: " + par1ItemStack.stackTagCompound.getDouble("ZpositionDestination"));
        } 
        if (par1ItemStack.stackTagCompound.getInteger("Stage") == 8 && 
          par1ItemStack.getItemDamage() == 50)
          par3List.add(EnumChatFormatting.DARK_RED + "Нужно 100 JP"); 
      } 
    } 
  }
}

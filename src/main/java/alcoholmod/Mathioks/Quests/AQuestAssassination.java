package alcoholmod.Mathioks.Quests;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SyncAQuestsMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncChakraExperienceMessage;
import alcoholmod.Mathioks.NPC.EntityChunin;
import alcoholmod.Mathioks.PacketDispatcher;
import alcoholmod.Mathioks.SevenSwordsmen.Zabuza;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class AQuestAssassination extends Item {
  public AQuestAssassination() {
    setMaxDamage(500);
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setInteger("Owner", par2World.rand.nextInt(17));
      par1ItemStack.stackTagCompound.setInteger("Time", 7000);
      par1ItemStack.stackTagCompound.setDouble("Xposition", par3Entity.posX);
      par1ItemStack.stackTagCompound.setDouble("Yposition", par3Entity.posY);
      par1ItemStack.stackTagCompound.setDouble("Zposition", par3Entity.posZ);
      int randX = par3Entity.worldObj.rand.nextInt(1);
      if (randX == 1) {
        par1ItemStack.stackTagCompound.setDouble("XpositionDestination", par3Entity.posX - 10.0D - par3Entity.worldObj.rand.nextInt(20));
        par1ItemStack.stackTagCompound.setBoolean("DirectionX", true);
      } 
      if (randX == 0) {
        par1ItemStack.stackTagCompound.setDouble("XpositionDestination", par3Entity.posX + 10.0D + par3Entity.worldObj.rand.nextInt(20));
        par1ItemStack.stackTagCompound.setBoolean("DirectionX", false);
      } 
      par1ItemStack.stackTagCompound.setDouble("YpositionDestination", par3Entity.posY);
      int randZ = par3Entity.worldObj.rand.nextInt(2);
      if (randZ == 1) {
        par1ItemStack.stackTagCompound.setDouble("ZpositionDestination", par3Entity.posZ - 10.0D - par3Entity.worldObj.rand.nextInt(20));
        par1ItemStack.stackTagCompound.setBoolean("DirectionZ", true);
      } 
      if (randZ == 0) {
        par1ItemStack.stackTagCompound.setDouble("ZpositionDestination", par3Entity.posZ + 10.0D + par3Entity.worldObj.rand.nextInt(20));
        par1ItemStack.stackTagCompound.setBoolean("DirectionZ", false);
      } 
      par1ItemStack.stackTagCompound.setInteger("rand1", par2World.rand.nextInt(2000));
      par1ItemStack.stackTagCompound.setInteger("rand2", par2World.rand.nextInt(2000) + 2000);
      par1ItemStack.stackTagCompound.setInteger("rand3", par2World.rand.nextInt(2000) + 4000);
      par1ItemStack.stackTagCompound.setInteger("rand4", par2World.rand.nextInt(2000) + 6000);
      par1ItemStack.stackTagCompound.setInteger("rand5", par2World.rand.nextInt(2000) + 8000);
    } 
    if (!par2World.isRemote && par1ItemStack.stackTagCompound != null) {
      double Xposition = par1ItemStack.stackTagCompound.getDouble("Xposition");
      double Yposition = par1ItemStack.stackTagCompound.getDouble("Yposition");
      double Zposition = par1ItemStack.stackTagCompound.getDouble("Zposition");
      double NewXpositionDestination = par1ItemStack.stackTagCompound.getDouble("XpositionDestination");
      double NewYpositionDestination = par1ItemStack.stackTagCompound.getDouble("YpositionDestination");
      double NewZpositionDestination = par1ItemStack.stackTagCompound.getDouble("ZpositionDestination");
      if (par1ItemStack.getItemDamage() == 0) {
        int randdis = par3Entity.worldObj.rand.nextInt(50);
        if (randdis == 1) {
          if (par1ItemStack.stackTagCompound.getBoolean("DirectionX"))
            par1ItemStack.stackTagCompound.setDouble("XpositionDestination", NewXpositionDestination - par3Entity.worldObj.rand.nextInt(20)); 
          if (!par1ItemStack.stackTagCompound.getBoolean("DirectionX"))
            par1ItemStack.stackTagCompound.setDouble("XpositionDestination", NewXpositionDestination + par3Entity.worldObj.rand.nextInt(20)); 
          if (par1ItemStack.stackTagCompound.getBoolean("DirectionZ"))
            par1ItemStack.stackTagCompound.setDouble("ZpositionDestination", NewZpositionDestination - par3Entity.worldObj.rand.nextInt(20)); 
          if (!par1ItemStack.stackTagCompound.getBoolean("DirectionZ"))
            par1ItemStack.stackTagCompound.setDouble("ZpositionDestination", NewZpositionDestination + par3Entity.worldObj.rand.nextInt(20)); 
        } 
        int timeremaining = par1ItemStack.stackTagCompound.getInteger("Time");
        timeremaining--;
        par1ItemStack.stackTagCompound.setInteger("Time", timeremaining);
        if (Math.abs(par3Entity.posX - NewXpositionDestination) < 15.0D && Math.abs(par3Entity.posY - NewYpositionDestination) < 60.0D && Math.abs(par3Entity.posZ - NewZpositionDestination) < 15.0D && par1ItemStack.getItemDamage() == 0) {
          ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText("Location Reached!"));
          Zabuza entitysnowball = new Zabuza(par2World);
          if (par2World.isAirBlock((int)NewXpositionDestination, (int)((EntityPlayer)par3Entity).posY, (int)NewZpositionDestination) && par2World.isAirBlock((int)NewXpositionDestination, (int)((EntityPlayer)par3Entity).posY + 1, (int)NewZpositionDestination)) {
            entitysnowball.setPosition((int)NewXpositionDestination, (int)((EntityPlayer)par3Entity).posY, (int)NewZpositionDestination);
          } else {
            par2World.setBlock((int)NewXpositionDestination, (int)((EntityPlayer)par3Entity).posY, (int)NewZpositionDestination, Blocks.air);
            par2World.setBlock((int)NewXpositionDestination, (int)((EntityPlayer)par3Entity).posY + 1, (int)NewZpositionDestination, Blocks.air);
            entitysnowball.setPosition((int)NewXpositionDestination, (int)((EntityPlayer)par3Entity).posY, (int)NewZpositionDestination);
          } 
          par2World.spawnEntityInWorld((Entity)entitysnowball);
          par1ItemStack.setItemDamage(100);
        } 
        if (timeremaining == par1ItemStack.stackTagCompound.getInteger("rand1")) {
          int rand = par2World.rand.nextInt(4);
          if (rand == 1) {
            int a = par3Entity.worldObj.rand.nextInt(3) + 1;
            for (int b = 0; b < a; b++) {
              double i, j;
              int rand2 = par2World.rand.nextInt(1);
              int rand3 = par2World.rand.nextInt(1);
              if (rand2 == 1) {
                i = par3Entity.posX + par2World.rand.nextInt(12) + 8.0D;
              } else {
                i = par3Entity.posX + par2World.rand.nextInt(12) - 20.0D;
              } 
              if (rand2 == 1) {
                j = par3Entity.posZ + par2World.rand.nextInt(12) + 8.0D;
              } else {
                j = par3Entity.posZ + par2World.rand.nextInt(12) - 20.0D;
              } 
              EntityChunin entitysnowball = new EntityChunin(par2World);
              entitysnowball.setPosition(i, par3Entity.posY + par2World.rand.nextInt(12) + 8.0D, j);
              par2World.spawnEntityInWorld((Entity)entitysnowball);
            } 
          } 
        } 
        if (timeremaining == par1ItemStack.stackTagCompound.getInteger("rand2")) {
          int rand = par2World.rand.nextInt(4);
          if (rand == 1) {
            int a = par3Entity.worldObj.rand.nextInt(3) + 1;
            for (int b = 0; b < a; b++) {
              double i, j;
              int rand2 = par2World.rand.nextInt(1);
              int rand3 = par2World.rand.nextInt(1);
              if (rand2 == 1) {
                i = par3Entity.posX + par2World.rand.nextInt(12) + 8.0D;
              } else {
                i = par3Entity.posX + par2World.rand.nextInt(12) - 20.0D;
              } 
              if (rand2 == 1) {
                j = par3Entity.posZ + par2World.rand.nextInt(12) + 8.0D;
              } else {
                j = par3Entity.posZ + par2World.rand.nextInt(12) - 20.0D;
              } 
              EntityChunin entitysnowball = new EntityChunin(par2World);
              entitysnowball.setPosition(i, par3Entity.posY + par2World.rand.nextInt(12) + 8.0D, j);
              par2World.spawnEntityInWorld((Entity)entitysnowball);
            } 
          } 
        } 
        if (timeremaining == par1ItemStack.stackTagCompound.getInteger("rand3")) {
          int rand = par2World.rand.nextInt(4);
          if (rand == 1) {
            int a = par3Entity.worldObj.rand.nextInt(3) + 1;
            for (int b = 0; b < a; b++) {
              double i, j;
              int rand2 = par2World.rand.nextInt(1);
              int rand3 = par2World.rand.nextInt(1);
              if (rand2 == 1) {
                i = par3Entity.posX + par2World.rand.nextInt(12) + 8.0D;
              } else {
                i = par3Entity.posX + par2World.rand.nextInt(12) - 20.0D;
              } 
              if (rand2 == 1) {
                j = par3Entity.posZ + par2World.rand.nextInt(12) + 8.0D;
              } else {
                j = par3Entity.posZ + par2World.rand.nextInt(12) - 20.0D;
              } 
              EntityChunin entitysnowball = new EntityChunin(par2World);
              entitysnowball.setPosition(i, par3Entity.posY + 5.0D, j);
              par2World.spawnEntityInWorld((Entity)entitysnowball);
            } 
          } 
        } 
        if (timeremaining == par1ItemStack.stackTagCompound.getInteger("rand4")) {
          int rand = par2World.rand.nextInt(4);
          if (rand == 1) {
            int a = par3Entity.worldObj.rand.nextInt(3) + 1;
            for (int b = 0; b < a; b++) {
              double i, j;
              int rand2 = par2World.rand.nextInt(1);
              int rand3 = par2World.rand.nextInt(1);
              if (rand2 == 1) {
                i = par3Entity.posX + par2World.rand.nextInt(12) + 8.0D;
              } else {
                i = par3Entity.posX + par2World.rand.nextInt(12) - 20.0D;
              } 
              if (rand2 == 1) {
                j = par3Entity.posZ + par2World.rand.nextInt(12) + 8.0D;
              } else {
                j = par3Entity.posZ + par2World.rand.nextInt(12) - 20.0D;
              } 
              EntityChunin entitysnowball = new EntityChunin(par2World);
              entitysnowball.setPosition(i, par3Entity.posY + par2World.rand.nextInt(12) + 8.0D, j);
              par2World.spawnEntityInWorld((Entity)entitysnowball);
            } 
          } 
        } 
        if (timeremaining == par1ItemStack.stackTagCompound.getInteger("rand5")) {
          int rand = par2World.rand.nextInt(4);
          if (rand == 1) {
            int a = par3Entity.worldObj.rand.nextInt(3) + 1;
            for (int b = 0; b < a; b++) {
              double i, j;
              int rand2 = par2World.rand.nextInt(1);
              int rand3 = par2World.rand.nextInt(1);
              if (rand2 == 1) {
                i = par3Entity.posX + par2World.rand.nextInt(12) + 8.0D;
              } else {
                i = par3Entity.posX + par2World.rand.nextInt(12) - 20.0D;
              } 
              if (rand2 == 1) {
                j = par3Entity.posZ + par2World.rand.nextInt(12) + 8.0D;
              } else {
                j = par3Entity.posZ + par2World.rand.nextInt(12) - 20.0D;
              } 
              EntityChunin entitysnowball = new EntityChunin(par2World);
              entitysnowball.setPosition(i, par3Entity.posY + par2World.rand.nextInt(12) + 8.0D, j);
              par2World.spawnEntityInWorld((Entity)entitysnowball);
            } 
          } 
        } 
        if (timeremaining == 0) {
          ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText("Time is up, Mission Failed!"));
          par1ItemStack.stackSize--;
        } 
      } 
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer player) {
    if (!par2World.isRemote && par1ItemStack.stackTagCompound != null) {
      if (par1ItemStack.getItemDamage() == 0) {
        double NewXpositionDestination = par1ItemStack.stackTagCompound.getDouble("XpositionDestination");
        double NewYpositionDestination = par1ItemStack.stackTagCompound.getDouble("YpositionDestination");
        double NewZpositionDestination = par1ItemStack.stackTagCompound.getDouble("ZpositionDestination");
        player.addChatComponentMessage((IChatComponent)new ChatComponentText("X-Position: " + (int)player.posX + " X-Target: " + (int)NewXpositionDestination));
        player.addChatComponentMessage((IChatComponent)new ChatComponentText("Y-Position: " + (int)player.posY + " Y-Target: " + (int)NewYpositionDestination));
        player.addChatComponentMessage((IChatComponent)new ChatComponentText("Z-Position: " + (int)player.posZ + " Z-Target: " + (int)NewZpositionDestination));
      } 
      if (par1ItemStack.getItemDamage() == 100) {
        Item item = AlcoholMod.DQuest;
        if (player.inventory.hasItem(item)) {
          player.inventory.consumeInventoryItem(item);
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("A-Mission Completed"));
          par1ItemStack.stackSize--;
          int c = par2World.rand.nextInt(100) + 25;
          int a = par2World.rand.nextInt(13) + 5;
          for (int b = 0; b < a; b++)
            player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.RyoSilver)); 
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("Received " + a + " Silver Ryo"));
          ExtendedPlayer props = ExtendedPlayer.get(player);
          props.setAQuests(props.getAQuests() + 1);
          PacketDispatcher.sendTo((IMessage)new SyncAQuestsMessage(player), (EntityPlayerMP)player);
          props.setChakraExperience(props.getChakraExperience() + 4);
          PacketDispatcher.sendTo((IMessage)new SyncChakraExperienceMessage(player), (EntityPlayerMP)player);
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("Gained " + c + " Experience"));
          return par1ItemStack;
        } 
      } 
    } 
    return par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    if (par1ItemStack.stackTagCompound != null) {
      if (par1ItemStack.getItemDamage() == 0 || par1ItemStack.getItemDamage() == 50) {
        int Time = par1ItemStack.stackTagCompound.getInteger("Time");
        int XpositionDestination = (int)par1ItemStack.stackTagCompound.getDouble("XpositionDestination");
        int YpositionDestination = (int)par1ItemStack.stackTagCompound.getDouble("YpositionDestination");
        int ZpositionDestination = (int)par1ItemStack.stackTagCompound.getDouble("ZpositionDestination");
        par3List.add(EnumChatFormatting.DARK_AQUA + "Time: " + (Time / 1200) + ":" + (Time / 20 % 100));
        par3List.add(EnumChatFormatting.DARK_AQUA + "X Destination: " + XpositionDestination);
        par3List.add(EnumChatFormatting.DARK_AQUA + "Y Destination: " + YpositionDestination);
        par3List.add(EnumChatFormatting.DARK_AQUA + "Z Destination: " + ZpositionDestination);
      } 
      if (par1ItemStack.getItemDamage() == 100) {
        par3List.add(EnumChatFormatting.DARK_AQUA + "Right click with the head in your inventory");
        par3List.add(EnumChatFormatting.DARK_AQUA + "to complete the mission");
      } 
    } 
  }
}

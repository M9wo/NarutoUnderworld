package alcoholmod.Mathioks.Final.UtilityItems;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SyncJutsuPointsMessage;
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
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class UltimateJutsuItem extends Item {
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null) {
      if (par1ItemStack.stackTagCompound == null) {
        ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)par3Entity);
        if (props.getLightningRelease() == 0 && props.getWindRelease() == 0) {
          int rand = par2World.rand.nextInt(16);
          par1ItemStack.stackTagCompound = new NBTTagCompound();
          if (rand == 0 || rand == 1 || rand == 2 || rand == 3)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Toad Oil Bullet"); 
          if (rand == 4 || rand == 5 || rand == 6 || rand == 7)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Body Flicker Technique"); 
          if (rand == 8 || rand == 9 || rand == 10)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Spiraling Ring"); 
          if (rand == 15)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Bringer of Darkness"); 
        } else if (props.getLightningRelease() == 1 && props.getWindRelease() == 0) {
          int rand = par2World.rand.nextInt(18);
          par1ItemStack.stackTagCompound = new NBTTagCompound();
          if (rand == 0 || rand == 1 || rand == 2 || rand == 3)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Toad Oil Bullet"); 
          if (rand == 4 || rand == 5 || rand == 6 || rand == 7)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Body Flicker Technique"); 
          if (rand == 8 || rand == 9 || rand == 10)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Spiraling Ring"); 
          if (rand == 15)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Bringer of Darkness"); 
          if (rand == 16)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Chidori Nagashi"); 
          if (rand == 17)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Chidori Sharp Spear"); 
        } else if (props.getWindRelease() == 1 && props.getLightningRelease() == 0) {
          int rand = par2World.rand.nextInt(17);
          par1ItemStack.stackTagCompound = new NBTTagCompound();
          if (rand == 0 || rand == 1 || rand == 2 || rand == 3)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Toad Oil Bullet"); 
          if (rand == 4 || rand == 5 || rand == 6 || rand == 7)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Body Flicker Technique"); 
          if (rand == 8 || rand == 9 || rand == 10)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Spiraling Ring"); 
          if (rand == 15)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Bringer of Darkness"); 
          if (rand == 16)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Wind Release: RasenShuriken"); 
        } else if (props.getLightningRelease() == 1 && props.getWindRelease() == 1) {
          int rand = par2World.rand.nextInt(19);
          par1ItemStack.stackTagCompound = new NBTTagCompound();
          if (rand == 0 || rand == 1 || rand == 2 || rand == 3)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Toad Oil Bullet"); 
          if (rand == 4 || rand == 5 || rand == 6 || rand == 7)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Body Flicker Technique"); 
          if (rand == 8 || rand == 9 || rand == 10)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Spiraling Ring"); 
          if (rand == 15)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Bringer of Darkness"); 
          if (rand == 16)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Chidori Nagashi"); 
          if (rand == 17)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Chidori Sharp Spear"); 
          if (rand == 18)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Wind Release: RasenShuriken"); 
        } 
      } 
      if (par1ItemStack.stackTagCompound != null && par1ItemStack.stackTagCompound.getString("Jutsu").equals("")) {
        ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)par3Entity);
        if (props.getLightningRelease() == 0 && props.getWindRelease() == 0) {
          int rand = par2World.rand.nextInt(16);
          par1ItemStack.stackTagCompound = new NBTTagCompound();
          if (rand == 0 || rand == 1 || rand == 2 || rand == 3)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Toad Oil Bullet"); 
          if (rand == 4 || rand == 5 || rand == 6 || rand == 7)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Body Flicker Technique"); 
          if (rand == 8 || rand == 9 || rand == 10)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Spiraling Ring"); 
          if (rand == 15)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Bringer of Darkness"); 
        } else if (props.getLightningRelease() == 1 && props.getWindRelease() == 0) {
          int rand = par2World.rand.nextInt(18);
          par1ItemStack.stackTagCompound = new NBTTagCompound();
          if (rand == 0 || rand == 1 || rand == 2 || rand == 3)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Toad Oil Bullet"); 
          if (rand == 4 || rand == 5 || rand == 6 || rand == 7)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Body Flicker Technique"); 
          if (rand == 8 || rand == 9 || rand == 10)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Spiraling Ring"); 
          if (rand == 15)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Bringer of Darkness"); 
          if (rand == 16)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Chidori Nagashi"); 
          if (rand == 17)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Chidori Sharp Spear"); 
        } else if (props.getWindRelease() == 1 && props.getLightningRelease() == 0) {
          int rand = par2World.rand.nextInt(17);
          par1ItemStack.stackTagCompound = new NBTTagCompound();
          if (rand == 0 || rand == 1 || rand == 2 || rand == 3)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Toad Oil Bullet"); 
          if (rand == 4 || rand == 5 || rand == 6 || rand == 7)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Body Flicker Technique"); 
          if (rand == 8 || rand == 9 || rand == 10)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Spiraling Ring"); 
          if (rand == 15)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Bringer of Darkness"); 
          if (rand == 16)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Wind Release: RasenShuriken"); 
        } else if (props.getLightningRelease() == 1 && props.getWindRelease() == 1) {
          int rand = par2World.rand.nextInt(19);
          par1ItemStack.stackTagCompound = new NBTTagCompound();
          if (rand == 0 || rand == 1 || rand == 2 || rand == 3)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Toad Oil Bullet"); 
          if (rand == 4 || rand == 5 || rand == 6 || rand == 7)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Body Flicker Technique"); 
          if (rand == 8 || rand == 9 || rand == 10)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Spiraling Ring"); 
          if (rand == 15)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Bringer of Darkness"); 
          if (rand == 16)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Chidori Nagashi"); 
          if (rand == 17)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Chidori Sharp Spear"); 
          if (rand == 18)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Wind Release: RasenShuriken"); 
        } 
      } 
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer player) {
    if (!par2World.isRemote && !player.capabilities.isCreativeMode && tools.freeSpace(player.inventory.mainInventory) > 0) {
      ExtendedPlayer props = ExtendedPlayer.get(player);
      if (props.getJutsuPoints() >= 35) {
        if (par1ItemStack.stackTagCompound.getString("Jutsu").equals("Toad Oil Bullet")) {
          player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.ToadOilBullet, 1, 0));
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("You learned the Toad Oil Bullet Technique!"));
        } 
        if (par1ItemStack.stackTagCompound.getString("Jutsu").equals("Body Flicker Technique")) {
          player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.ItemBodyFlickerTechnique, 1, 0));
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("You learned the Body Flicker Technique Technique!"));
        } 
        if (par1ItemStack.stackTagCompound.getString("Jutsu").equals("Spiraling Ring")) {
          player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SpirallingRingItem, 1, 0));
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("You learned the Spiraling Ring Technique!"));
        } 
        if (par1ItemStack.stackTagCompound.getString("Jutsu").equals("Tajuun Kage Bunshin")) {
          player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.KageBunshinMultiMax, 1, 0));
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned the Chakra for Tajuun Kage Bunshin Technique!"));
        } 
        if (par1ItemStack.stackTagCompound.getString("Jutsu").equals("Bringer of Darkness")) {
          player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.BringerOfDarknessTechnique, 1, 0));
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("You learned the Bringer of Darkness Technique!"));
        } 
        if (par1ItemStack.stackTagCompound.getString("Jutsu").equals("Chidori Nagashi")) {
          if (props.getLightningRelease() != 1) {
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("You cannot learn this jutsu as you do not"));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("have the Lightning chakra nature type!"));
            return par1ItemStack;
          } 
          player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.LightningReleaseChidoriNagashi, 1, 0));
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned the Chidori Nagashi!"));
        } 
        if (par1ItemStack.stackTagCompound.getString("Jutsu").equals("Chidori Sharp Spear")) {
          if (props.getLightningRelease() != 1) {
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("You cannot learn this jutsu as you do not"));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("have the Lightning chakra nature type!"));
            return par1ItemStack;
          } 
          player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.LightningReleaseChidoriSharpSpear, 1, 0));
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned the Chidori Sharp Spear!"));
        } 
        if (par1ItemStack.stackTagCompound.getString("Jutsu").equals("Wind Release: RasenShuriken")) {
          if (props.getWindRelease() != 1) {
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("You cannot learn this jutsu as you do not"));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("have the Wind chakra nature type!"));
            return par1ItemStack;
          } 
          player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.RasenShurikenItem, 1, 0));
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned the Wind Release: RasenShuriken!"));
        } 
        props.setJutsuPoints(props.getJutsuPoints() - 35);
        PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(player), (EntityPlayerMP)player);
        par1ItemStack.stackSize--;
      } else {
        player.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough Jutsu Points!"));
      } 
    } else if (tools.freeSpace(player.inventory.mainInventory) <= 0) {
      player.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough free space"));
    } 
    return par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    par3List.add(EnumChatFormatting.RED + "Learn an S rank Jutsu");
    par3List.add(EnumChatFormatting.RED + "JP Cost: 35");
    if (par1ItemStack.stackTagCompound == null) {
      ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
      par3List.add(EnumChatFormatting.GREEN + "Possible Jutsu:");
      par3List.add(EnumChatFormatting.BLUE + "- Toad Oil Bullet");
      par3List.add(EnumChatFormatting.BLUE + "- Body Flicker Technique");
      par3List.add(EnumChatFormatting.DARK_PURPLE + "- Spiraling Ring");
      par3List.add(EnumChatFormatting.RED + "- Tajuun Kage Bunshin");
      par3List.add(EnumChatFormatting.RED + "- Bringer of Darkness");
      if (props.getLightningRelease() == 1) {
        par3List.add(EnumChatFormatting.RED + "- Chidori Nagashi");
        par3List.add(EnumChatFormatting.RED + "- Chidori Sharp Spear");
      } 
      if (props.getWindRelease() == 1)
        par3List.add(EnumChatFormatting.RED + "- RasenShuriken"); 
    } 
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Jutsu")); 
  }
}

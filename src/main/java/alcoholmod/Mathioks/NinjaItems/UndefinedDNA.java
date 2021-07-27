package alcoholmod.Mathioks.NinjaItems;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SyncEarthReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncFireReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncLightningReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncWaterReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncWindReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncYangReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncYinReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncboilReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SynccrystalReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncexplosionReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SynciceReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SynclavaReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncmagnetReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncscorchReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncsteelReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncstormReleaseMessage;
import alcoholmod.Mathioks.PacketDispatcher;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class UndefinedDNA extends Item {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public UndefinedDNA() {
    setMaxDamage(12001);
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null) {
      if (par1ItemStack.stackTagCompound == null) {
        par1ItemStack.stackTagCompound = new NBTTagCompound();
        par1ItemStack.stackTagCompound.setBoolean("Identified", false);
        par1ItemStack.stackTagCompound.setString("Nature", "nothing");
      } 
      if (par1ItemStack.stackTagCompound == null || !par2World.isRemote);
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer player) {
    if (par1ItemStack.getItemDamage() == 0 && !par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(player);
      if (!par1ItemStack.stackTagCompound.getBoolean("Identified")) {
        if (props.getIntelligence() < 20)
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("You need more intelligence to identify DNA")); 
        if (props.getIntelligence() >= 20 && props.getIntelligence() < 40) {
          int rand = par2World.rand.nextInt(99);
          if (rand == 1) {
            int randWhat = par2World.rand.nextInt(100);
            if (randWhat >= 0 && randWhat < 95) {
              int randKekkeiGenkai = par2World.rand.nextInt(5);
              if (randKekkeiGenkai == 0) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Wind Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Wind");
              } 
              if (randKekkeiGenkai == 1) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Fire Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Fire");
              } 
              if (randKekkeiGenkai == 2) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Water Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Water");
              } 
              if (randKekkeiGenkai == 3) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Earth Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Earth");
              } 
              if (randKekkeiGenkai == 4) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Lightning Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Lightning");
              } 
            } 
            if (randWhat >= 95 && randWhat < 101) {
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as a Kekkei Genkai!"));
              int randKekkeiGenkai = par2World.rand.nextInt(18);
              if (randKekkeiGenkai == 0) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Boil Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Boil");
              } 
              if (randKekkeiGenkai == 2) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Crystal Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Crystal");
              } 
              if (randKekkeiGenkai == 3) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Earth Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Earth");
              } 
              if (randKekkeiGenkai == 4) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Explosion Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Explosion");
              } 
              if (randKekkeiGenkai == 6) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Ice Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Ice");
              } 
              if (randKekkeiGenkai == 8) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Lava Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Lava");
              } 
              if (randKekkeiGenkai == 9) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Magnet Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Magnet");
              } 
              if (randKekkeiGenkai == 11) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Scorch Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Scorch");
              } 
              if (randKekkeiGenkai == 13) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Steel Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Steel");
              } 
              if (randKekkeiGenkai == 14) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Storm Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Storm");
              } 
              if (randKekkeiGenkai == 15) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Water Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Water");
              } 
              if (randKekkeiGenkai == 16) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Yang Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Yang");
              } 
              if (randKekkeiGenkai == 17) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Yin Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Yin");
              } 
            } 
          } else {
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("You failed examining the DNA and it became useless"));
            par1ItemStack.stackSize--;
          } 
        } 
        if (props.getIntelligence() >= 40 && props.getIntelligence() < 60) {
          int rand = par2World.rand.nextInt(100);
          if (rand <= 4) {
            int randWhat = par2World.rand.nextInt(99);
            if (randWhat >= 0 && randWhat < 95) {
              int randKekkeiGenkai = par2World.rand.nextInt(5);
              if (randKekkeiGenkai == 0) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Wind Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Wind");
              } 
              if (randKekkeiGenkai == 1) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Fire Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Fire");
              } 
              if (randKekkeiGenkai == 2) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Water Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Water");
              } 
              if (randKekkeiGenkai == 3) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Earth Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Earth");
              } 
              if (randKekkeiGenkai == 4) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Lightning Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Lightning");
              } 
            } 
            if (randWhat >= 95 && randWhat < 101) {
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as a Kekkei Genkai!"));
              int randKekkeiGenkai = par2World.rand.nextInt(18);
              if (randKekkeiGenkai == 0) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Boil Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Boil");
              } 
              if (randKekkeiGenkai == 2) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Crystal Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Crystal");
              } 
              if (randKekkeiGenkai == 3) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Earth Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Earth");
              } 
              if (randKekkeiGenkai == 4) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Explosion Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Explosion");
              } 
              if (randKekkeiGenkai == 6) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Ice Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Ice");
              } 
              if (randKekkeiGenkai == 8) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Lava Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Lava");
              } 
              if (randKekkeiGenkai == 9) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Magnet Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Magnet");
              } 
              if (randKekkeiGenkai == 11) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Scorch Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Scorch");
              } 
              if (randKekkeiGenkai == 13) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Steel Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Steel");
              } 
              if (randKekkeiGenkai == 14) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Storm Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Storm");
              } 
              if (randKekkeiGenkai == 15) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Water Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Water");
              } 
              if (randKekkeiGenkai == 16) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Yang Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Yang");
              } 
              if (randKekkeiGenkai == 17) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Yin Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Yin");
              } 
            } 
          } else {
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("You failed examining the DNA and it became useless"));
            par1ItemStack.stackSize--;
          } 
        } 
        if (props.getIntelligence() >= 60 && props.getIntelligence() < 80) {
          int rand = par2World.rand.nextInt(99);
          if (rand <= 14) {
            int randWhat = par2World.rand.nextInt(100);
            if (randWhat >= 0 && randWhat < 95) {
              int randKekkeiGenkai = par2World.rand.nextInt(5);
              if (randKekkeiGenkai == 0) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Wind Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Wind");
              } 
              if (randKekkeiGenkai == 1) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Fire Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Fire");
              } 
              if (randKekkeiGenkai == 2) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Water Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Water");
              } 
              if (randKekkeiGenkai == 3) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Earth Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Earth");
              } 
              if (randKekkeiGenkai == 4) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Lightning Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Lightning");
              } 
            } 
            if (randWhat >= 95 && randWhat < 101) {
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as a Kekkei Genkai!"));
              int randKekkeiGenkai = par2World.rand.nextInt(18);
              if (randKekkeiGenkai == 0) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Boil Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Boil");
              } 
              if (randKekkeiGenkai == 2) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Crystal Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Crystal");
              } 
              if (randKekkeiGenkai == 3) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Earth Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Earth");
              } 
              if (randKekkeiGenkai == 4) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Explosion Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Explosion");
              } 
              if (randKekkeiGenkai == 6) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Ice Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Ice");
              } 
              if (randKekkeiGenkai == 8) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Lava Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Lava");
              } 
              if (randKekkeiGenkai == 9) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Magnet Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Magnet");
              } 
              if (randKekkeiGenkai == 11) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Scorch Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Scorch");
              } 
              if (randKekkeiGenkai == 13) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Steel Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Steel");
              } 
              if (randKekkeiGenkai == 14) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Storm Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Storm");
              } 
              if (randKekkeiGenkai == 15) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Water Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Water");
              } 
              if (randKekkeiGenkai == 16) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Yang Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Yang");
              } 
              if (randKekkeiGenkai == 17) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Yin Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Yin");
              } 
            } 
          } else {
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("You failed examining the DNA and it became useless"));
            par1ItemStack.stackSize--;
          } 
        } 
        if (props.getIntelligence() >= 80 && props.getIntelligence() < 90) {
          int rand = par2World.rand.nextInt(99);
          if (rand <= 25) {
            int randWhat = par2World.rand.nextInt(100);
            if (randWhat >= 0 && randWhat < 95) {
              int randKekkeiGenkai = par2World.rand.nextInt(5);
              if (randKekkeiGenkai == 0) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Wind Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Wind");
              } 
              if (randKekkeiGenkai == 1) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Fire Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Fire");
              } 
              if (randKekkeiGenkai == 2) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Water Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Water");
              } 
              if (randKekkeiGenkai == 3) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Earth Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Earth");
              } 
              if (randKekkeiGenkai == 4) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Lightning Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Lightning");
              } 
            } 
            if (randWhat >= 95 && randWhat < 101) {
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as a Kekkei Genkai!"));
              int randKekkeiGenkai = par2World.rand.nextInt(18);
              if (randKekkeiGenkai == 0) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Boil Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Boil");
              } 
              if (randKekkeiGenkai == 2) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Crystal Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Crystal");
              } 
              if (randKekkeiGenkai == 3) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Earth Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Earth");
              } 
              if (randKekkeiGenkai == 4) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Explosion Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Explosion");
              } 
              if (randKekkeiGenkai == 6) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Ice Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Ice");
              } 
              if (randKekkeiGenkai == 8) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Lava Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Lava");
              } 
              if (randKekkeiGenkai == 9) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Magnet Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Magnet");
              } 
              if (randKekkeiGenkai == 11) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Scorch Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Scorch");
              } 
              if (randKekkeiGenkai == 13) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Steel Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Steel");
              } 
              if (randKekkeiGenkai == 14) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Storm Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Storm");
              } 
              if (randKekkeiGenkai == 15) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Water Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Water");
              } 
              if (randKekkeiGenkai == 16) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Yang Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Yang");
              } 
              if (randKekkeiGenkai == 17) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Yin Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Yin");
              } 
            } 
          } else {
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("You failed examining the DNA and it became useless"));
            par1ItemStack.stackSize--;
          } 
        } 
        if (props.getIntelligence() >= 90 && props.getIntelligence() <= 99) {
          int rand = par2World.rand.nextInt(99);
          if (rand <= 50) {
            int randWhat = par2World.rand.nextInt(100);
            if (randWhat >= 0 && randWhat < 95) {
              int randKekkeiGenkai = par2World.rand.nextInt(5);
              if (randKekkeiGenkai == 0) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Wind Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Wind");
              } 
              if (randKekkeiGenkai == 1) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Fire Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Fire");
              } 
              if (randKekkeiGenkai == 2) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Water Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Water");
              } 
              if (randKekkeiGenkai == 3) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Earth Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Earth");
              } 
              if (randKekkeiGenkai == 4) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Lightning Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Lightning");
              } 
            } 
            if (randWhat >= 95 && randWhat < 101) {
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as a Kekkei Genkai!"));
              int randKekkeiGenkai = par2World.rand.nextInt(18);
              if (randKekkeiGenkai == 0) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Boil Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Boil");
              } 
              if (randKekkeiGenkai == 2) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Crystal Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Crystal");
              } 
              if (randKekkeiGenkai == 3) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Earth Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Earth");
              } 
              if (randKekkeiGenkai == 4) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Explosion Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Explosion");
              } 
              if (randKekkeiGenkai == 6) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Ice Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Ice");
              } 
              if (randKekkeiGenkai == 8) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Lava Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Lava");
              } 
              if (randKekkeiGenkai == 9) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Magnet Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Magnet");
              } 
              if (randKekkeiGenkai == 11) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Scorch Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Scorch");
              } 
              if (randKekkeiGenkai == 13) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Steel Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Steel");
              } 
              if (randKekkeiGenkai == 14) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Storm Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Storm");
              } 
              if (randKekkeiGenkai == 15) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Water Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Water");
              } 
              if (randKekkeiGenkai == 16) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Yang Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Yang");
              } 
              if (randKekkeiGenkai == 17) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Yin Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Yin");
              } 
            } 
          } else {
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("You failed examining the DNA and it became useless"));
            par1ItemStack.stackSize--;
          } 
        } 
        if (props.getIntelligence() == 100) {
          int rand = par2World.rand.nextInt(99);
          if (rand <= 70) {
            int randWhat = par2World.rand.nextInt(100);
            if (randWhat >= 0 && randWhat < 95) {
              int randKekkeiGenkai = par2World.rand.nextInt(5);
              if (randKekkeiGenkai == 0) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Wind Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Wind");
              } 
              if (randKekkeiGenkai == 1) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Fire Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Fire");
              } 
              if (randKekkeiGenkai == 2) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Water Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Water");
              } 
              if (randKekkeiGenkai == 3) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Earth Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Earth");
              } 
              if (randKekkeiGenkai == 4) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Lightning Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Lightning");
              } 
            } 
            if (randWhat >= 95 && randWhat < 101) {
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as a Kekkei Genkai!"));
              int randKekkeiGenkai = par2World.rand.nextInt(18);
              if (randKekkeiGenkai == 0) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Boil Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Boil");
              } 
              if (randKekkeiGenkai == 2) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Crystal Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Crystal");
              } 
              if (randKekkeiGenkai == 3) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Earth Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Earth");
              } 
              if (randKekkeiGenkai == 4) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Explosion Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Explosion");
              } 
              if (randKekkeiGenkai == 6) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Ice Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Ice");
              } 
              if (randKekkeiGenkai == 8) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Lava Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Lava");
              } 
              if (randKekkeiGenkai == 9) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Magnet Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Magnet");
              } 
              if (randKekkeiGenkai == 11) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Scorch Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Scorch");
              } 
              if (randKekkeiGenkai == 13) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Steel Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Steel");
              } 
              if (randKekkeiGenkai == 14) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Storm Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Storm");
              } 
              if (randKekkeiGenkai == 15) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Water Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Water");
              } 
              if (randKekkeiGenkai == 16) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Yang Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Yang");
              } 
              if (randKekkeiGenkai == 17) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You identified the DNA as Yin Release Nature DNA"));
                par1ItemStack.stackTagCompound.setBoolean("Identified", true);
                par1ItemStack.stackTagCompound.setString("Nature", "Yin");
              } 
            } 
          } else {
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("You failed examining the DNA and it became useless"));
            par1ItemStack.stackSize--;
          } 
        } 
      } else if (par1ItemStack.stackTagCompound.getBoolean("Identified")) {
        if (props.getHealth() < 300)
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("You need at least 300 Medical to implant DNA")); 
        if (props.getHealth() >= 300 && props.getHealth() < 400) {
          int rand = par2World.rand.nextInt(99);
          if (rand <= 19) {
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("You succesfully implanted the DNA into yourself!"));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("You still feel weak because of the effects"));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("You'll need a full day of rest"));
            player.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 24000, 5));
            player.addPotionEffect(new PotionEffect(Potion.confusion.id, 1200, 50));
            player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 24000, 5));
            player.addPotionEffect(new PotionEffect(Potion.weakness.id, 24000, 50));
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Wind"))
              if (props.getWindRelease() == 0) {
                props.setWindRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncWindReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWindRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Wind Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Earth"))
              if (props.getEarthRelease() == 0) {
                props.setEarthRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncEarthReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerEarthRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Earth Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Fire"))
              if (props.getFireRelease() == 0) {
                props.setFireRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncFireReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerFireRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Fire Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Water"))
              if (props.getWaterRelease() == 0) {
                props.setWaterRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncWaterReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWaterRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Water Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Lightning"))
              if (props.getLightningRelease() == 0) {
                props.setLightningRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncLightningReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerLightningRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Lightning Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Boil"))
              if (props.getboilRelease() == 0) {
                props.setboilRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncboilReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerBoilRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Boil Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Crystal"))
              if (props.getcrystalRelease() == 0) {
                props.setcrystalRelease(1);
                PacketDispatcher.sendTo((IMessage)new SynccrystalReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerCrystalRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Crystal Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Earth"))
              if (props.getEarthRelease() == 0) {
                props.setEarthRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncEarthReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerEarthRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Earth Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Explosion"))
              if (props.getexplosionRelease() == 0) {
                props.setexplosionRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncexplosionReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerExplosionRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Explosion Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Ice"))
              if (props.geticeRelease() == 0) {
                props.seticeRelease(1);
                PacketDispatcher.sendTo((IMessage)new SynciceReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerIceRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Ice Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Lava"))
              if (props.getlavaRelease() == 0) {
                props.setlavaRelease(1);
                PacketDispatcher.sendTo((IMessage)new SynclavaReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerLavaRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Lava Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Magnet"))
              if (props.getmagnetRelease() == 0) {
                props.setmagnetRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncmagnetReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerMagnetRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Magnet Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Scorch"))
              if (props.getscorchRelease() == 0) {
                props.setscorchRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncscorchReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerScorchRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Scorch Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Steel"))
              if (props.getsteelRelease() == 0) {
                props.setsteelRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncsteelReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerSteelRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Steel Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Storm"))
              if (props.getstormRelease() == 0) {
                props.setstormRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncstormReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerStormRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Storm Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Water"))
              if (props.getWaterRelease() == 0) {
                props.setWaterRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncWaterReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWaterRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Water Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Yin"))
              if (props.getYinRelease() == 0) {
                props.setYinRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncYinReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerYinRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Yin Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Yang"))
              if (props.getYangRelease() == 0) {
                props.setYangRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncYangReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerYangRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Yang Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
          } 
          if (rand >= 20 && rand < 80) {
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("The DNA implant went wrong!"));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("Your body cannot handle the"));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("sudden injection of DNA and is"));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("rejecting it"));
            player.setHealth(0.0F);
            par1ItemStack.stackSize--;
          } 
          if (rand >= 80) {
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("The DNA implant failed.."));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("You still feel weak because of the effects"));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("and your blood is poisoned!"));
            player.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 2400, 5));
            player.addPotionEffect(new PotionEffect(Potion.confusion.id, 600, 50));
            player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 2400, 5));
            player.addPotionEffect(new PotionEffect(Potion.weakness.id, 2400, 50));
            player.addPotionEffect(new PotionEffect(Potion.poison.id, 2400, 1));
            par1ItemStack.stackSize--;
          } 
        } 
        if (props.getHealth() >= 400 && props.getHealth() < 500) {
          int rand = par2World.rand.nextInt(99);
          if (rand <= 39) {
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("You succesfully implanted the DNA into yourself!"));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("You still feel weak because of the effects"));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("You'll need a full day of rest"));
            player.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 24000, 5));
            player.addPotionEffect(new PotionEffect(Potion.confusion.id, 1200, 50));
            player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 24000, 5));
            player.addPotionEffect(new PotionEffect(Potion.weakness.id, 24000, 50));
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Wind"))
              if (props.getWindRelease() == 0) {
                props.setWindRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncWindReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWindRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Wind Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Earth"))
              if (props.getEarthRelease() == 0) {
                props.setEarthRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncEarthReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerEarthRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Earth Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Fire"))
              if (props.getFireRelease() == 0) {
                props.setFireRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncFireReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerFireRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Fire Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Water"))
              if (props.getWaterRelease() == 0) {
                props.setWaterRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncWaterReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWaterRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Water Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Lightning"))
              if (props.getLightningRelease() == 0) {
                props.setLightningRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncLightningReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerLightningRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Lightning Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Boil"))
              if (props.getboilRelease() == 0) {
                props.setboilRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncboilReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerBoilRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Boil Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Crystal"))
              if (props.getcrystalRelease() == 0) {
                props.setcrystalRelease(1);
                PacketDispatcher.sendTo((IMessage)new SynccrystalReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerCrystalRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Crystal Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Earth"))
              if (props.getEarthRelease() == 0) {
                props.setEarthRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncEarthReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerEarthRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Earth Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Explosion"))
              if (props.getexplosionRelease() == 0) {
                props.setexplosionRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncexplosionReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerExplosionRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Explosion Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Ice"))
              if (props.geticeRelease() == 0) {
                props.seticeRelease(1);
                PacketDispatcher.sendTo((IMessage)new SynciceReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerIceRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Ice Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Lava"))
              if (props.getlavaRelease() == 0) {
                props.setlavaRelease(1);
                PacketDispatcher.sendTo((IMessage)new SynclavaReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerLavaRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Lava Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Magnet"))
              if (props.getmagnetRelease() == 0) {
                props.setmagnetRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncmagnetReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerMagnetRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Magnet Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Scorch"))
              if (props.getscorchRelease() == 0) {
                props.setscorchRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncscorchReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerScorchRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Scorch Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Steel"))
              if (props.getsteelRelease() == 0) {
                props.setsteelRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncsteelReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerSteelRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Steel Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Storm"))
              if (props.getstormRelease() == 0) {
                props.setstormRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncstormReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerStormRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Storm Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Water"))
              if (props.getWaterRelease() == 0) {
                props.setWaterRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncWaterReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWaterRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Water Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Yin"))
              if (props.getYinRelease() == 0) {
                props.setYinRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncYinReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerYinRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Yin Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Yang"))
              if (props.getYangRelease() == 0) {
                props.setYangRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncYangReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerYangRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Yang Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
          } 
          if (rand >= 40 && rand < 80) {
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("The DNA implant went wrong!"));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("Your body cannot handle the"));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("sudden injection of DNA and is"));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("rejecting it"));
            player.setHealth(0.0F);
            par1ItemStack.stackSize--;
          } 
          if (rand >= 80) {
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("The DNA implant failed.."));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("You still feel weak because of the effects"));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("and your blood is poisoned!"));
            player.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 2400, 5));
            player.addPotionEffect(new PotionEffect(Potion.confusion.id, 600, 50));
            player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 2400, 5));
            player.addPotionEffect(new PotionEffect(Potion.weakness.id, 2400, 50));
            player.addPotionEffect(new PotionEffect(Potion.poison.id, 2400, 1));
            par1ItemStack.stackSize--;
          } 
        } 
        if (props.getHealth() == 500) {
          int rand = par2World.rand.nextInt(99);
          if (rand <= 69) {
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("You succesfully implanted the DNA into yourself!"));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("You still feel weak because of the effects"));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("You'll need a full day of rest"));
            player.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 24000, 5));
            player.addPotionEffect(new PotionEffect(Potion.confusion.id, 1200, 50));
            player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 24000, 5));
            player.addPotionEffect(new PotionEffect(Potion.weakness.id, 24000, 50));
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Wind"))
              if (props.getWindRelease() == 0) {
                props.setWindRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncWindReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWindRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Wind Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Earth"))
              if (props.getEarthRelease() == 0) {
                props.setEarthRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncEarthReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerEarthRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Earth Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Fire"))
              if (props.getFireRelease() == 0) {
                props.setFireRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncFireReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerFireRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Fire Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Water"))
              if (props.getWaterRelease() == 0) {
                props.setWaterRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncWaterReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWaterRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Water Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Lightning"))
              if (props.getLightningRelease() == 0) {
                props.setLightningRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncLightningReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerLightningRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Lightning Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Boil"))
              if (props.getboilRelease() == 0) {
                props.setboilRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncboilReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerBoilRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Boil Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Crystal"))
              if (props.getcrystalRelease() == 0) {
                props.setcrystalRelease(1);
                PacketDispatcher.sendTo((IMessage)new SynccrystalReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerCrystalRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Crystal Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Earth"))
              if (props.getEarthRelease() == 0) {
                props.setEarthRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncEarthReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerEarthRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Earth Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Explosion"))
              if (props.getexplosionRelease() == 0) {
                props.setexplosionRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncexplosionReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerExplosionRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Explosion Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Ice"))
              if (props.geticeRelease() == 0) {
                props.seticeRelease(1);
                PacketDispatcher.sendTo((IMessage)new SynciceReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerIceRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Ice Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Lava"))
              if (props.getlavaRelease() == 0) {
                props.setlavaRelease(1);
                PacketDispatcher.sendTo((IMessage)new SynclavaReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerLavaRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Lava Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Magnet"))
              if (props.getmagnetRelease() == 0) {
                props.setmagnetRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncmagnetReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerMagnetRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Magnet Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Scorch"))
              if (props.getscorchRelease() == 0) {
                props.setscorchRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncscorchReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerScorchRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Scorch Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Steel"))
              if (props.getsteelRelease() == 0) {
                props.setsteelRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncsteelReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerSteelRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Steel Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Storm"))
              if (props.getstormRelease() == 0) {
                props.setstormRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncstormReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerStormRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Storm Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Water"))
              if (props.getWaterRelease() == 0) {
                props.setWaterRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncWaterReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWaterRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Water Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Yin"))
              if (props.getYinRelease() == 0) {
                props.setYinRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncYinReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerYinRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Yin Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
            if (par1ItemStack.stackTagCompound.getString("Nature").equals("Yang"))
              if (props.getYangRelease() == 0) {
                props.setYangRelease(1);
                PacketDispatcher.sendTo((IMessage)new SyncYangReleaseMessage(player), (EntityPlayerMP)player);
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerYangRelease));
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Yang Release Chakra nature!"));
                par1ItemStack.stackSize--;
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("You already have this chakra nature!"));
              }  
          } 
          if (rand >= 70 && rand < 80) {
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("The DNA implant went wrong!"));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("Your body cannot handle the"));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("sudden injection of DNA and is"));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("rejecting it"));
            player.setHealth(0.0F);
            par1ItemStack.stackSize--;
          } 
          if (rand >= 80) {
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("The DNA implant failed.."));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("You still feel weak because of the effects"));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("and your blood is poisoned!"));
            player.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 2400, 5));
            player.addPotionEffect(new PotionEffect(Potion.confusion.id, 600, 50));
            player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 2400, 5));
            player.addPotionEffect(new PotionEffect(Potion.weakness.id, 2400, 50));
            player.addPotionEffect(new PotionEffect(Potion.poison.id, 2400, 1));
            par1ItemStack.stackSize--;
          } 
        } 
      } 
    } 
    return par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    if (par1ItemStack.stackTagCompound != null) {
      ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
      if (!par1ItemStack.stackTagCompound.getBoolean("Identified"))
        par3List.add(EnumChatFormatting.RED + "Unidentified DNA"); 
      if (par1ItemStack.stackTagCompound.getBoolean("Identified"))
        par3List.add(EnumChatFormatting.BLUE + "DNA: " + par1ItemStack.stackTagCompound.getString("Nature")); 
      if (props.getIntelligence() < 20) {
        par3List.add(EnumChatFormatting.RED + "You need at least 20");
        par3List.add(EnumChatFormatting.RED + "Intelligence to Identify DNA");
      } 
      if (!par1ItemStack.stackTagCompound.getBoolean("Identified")) {
        if (props.getIntelligence() >= 20 && props.getIntelligence() < 40)
          par3List.add(EnumChatFormatting.GREEN + "You have 1% chance to succefully Identify DNA"); 
        if (props.getIntelligence() >= 40 && props.getIntelligence() < 60)
          par3List.add(EnumChatFormatting.GREEN + "You have 5% chance to succefully Identify DNA"); 
        if (props.getIntelligence() >= 60 && props.getIntelligence() < 80)
          par3List.add(EnumChatFormatting.GREEN + "You have 15% chance to succefully Identify DNA"); 
        if (props.getIntelligence() >= 80 && props.getIntelligence() < 90)
          par3List.add(EnumChatFormatting.GREEN + "You have 25% chance to succefully Identify DNA"); 
        if (props.getIntelligence() >= 90 && props.getIntelligence() < 100)
          par3List.add(EnumChatFormatting.GREEN + "You have 50% chance to succefully Identify DNA"); 
        if (props.getIntelligence() == 100)
          par3List.add(EnumChatFormatting.GREEN + "You have 70% chance to succefully Identify DNA"); 
      } 
      if (par1ItemStack.stackTagCompound.getBoolean("Identified")) {
        if (props.getHealth() < 300) {
          par3List.add(EnumChatFormatting.GREEN + "You need at least 300 Medical");
          par3List.add(EnumChatFormatting.GREEN + "in order to implant DNA");
        } 
        if (props.getHealth() >= 300 && props.getHealth() < 400) {
          par3List.add(EnumChatFormatting.GREEN + "You have 20% chance to succefully implant DNA");
          par3List.add(EnumChatFormatting.GREEN + "it has 60% chance to be fatal");
        } 
        if (props.getHealth() >= 400 && props.getHealth() < 500) {
          par3List.add(EnumChatFormatting.GREEN + "You have 40% chance to succefully implant DNA");
          par3List.add(EnumChatFormatting.GREEN + "it has 40% chance to be fatal");
        } 
        if (props.getHealth() == 500) {
          par3List.add(EnumChatFormatting.GREEN + "You have 70% chance to succefully implant DNA");
          par3List.add(EnumChatFormatting.GREEN + "it has 10% chance to be fatal");
        } 
      } 
    } 
  }
}

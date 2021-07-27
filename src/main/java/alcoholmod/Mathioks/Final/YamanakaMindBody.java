package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.Entity.EntityYamanakaFool;
import alcoholmod.Mathioks.Entity.EntityYamanakaMindBody;
import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class YamanakaMindBody extends Item {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public YamanakaMindBody() {
    this.maxStackSize = 1;
  }
  
  public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player) {
    return false;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if (!par2World.isRemote && (EntityPlayer)par3Entity != null) {
      if (par1ItemStack.stackTagCompound == null) {
        par1ItemStack.stackTagCompound = new NBTTagCompound();
        par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
        par1ItemStack.stackTagCompound.setBoolean("Shot", false);
        par1ItemStack.stackTagCompound.setBoolean("Mid", false);
        par1ItemStack.stackTagCompound.setDouble("locX", 0.0D);
        par1ItemStack.stackTagCompound.setDouble("locY", 0.0D);
        par1ItemStack.stackTagCompound.setDouble("locZ", 0.0D);
        par1ItemStack.stackTagCompound.setInteger("counter", 0);
      } 
      if (par1ItemStack.stackTagCompound != null && !par2World.isRemote) {
        ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)par3Entity);
        if (par1ItemStack.stackTagCompound.getBoolean("Shot")) {
          int counter = par1ItemStack.stackTagCompound.getInteger("counter");
          if (counter > 0) {
            counter--;
            par1ItemStack.stackTagCompound.setInteger("counter", counter);
          } 
          if (counter < 1) {
            counter = 20;
            par1ItemStack.stackTagCompound.setInteger("counter", counter);
            ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.invisibility.id, 25, 0));
            ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.resistance.id, 25, 25));
            List<Entity> list = par2World.getEntitiesWithinAABB(EntityYamanakaFool.class, AxisAlignedBB.getBoundingBox(par1ItemStack.stackTagCompound.getDouble("locX") - 5.0D, par1ItemStack.stackTagCompound.getDouble("locY") - 5.0D, par1ItemStack.stackTagCompound.getDouble("locZ") - 5.0D, par1ItemStack.stackTagCompound.getDouble("locX") + 5.0D, par1ItemStack.stackTagCompound.getDouble("locY") + 5.0D, par1ItemStack.stackTagCompound.getDouble("locZ") + 5.0D));
            EntityPlayer player = (EntityPlayer)par3Entity;
            if (player != null)
              for (int k2 = 0; k2 < list.size(); k2++) {
                Entity entity2 = list.get(k2);
                String user = player.getUniqueID().toString();
                entity2.getDistance(player.posX, player.posY, player.posZ);
                if (entity2 instanceof EntityYamanakaFool) {
                  if (((EntityYamanakaFool)entity2).getOwner() != null && !((EntityYamanakaFool)entity2).getOwner().getCommandSenderName().toString().equals(par1ItemStack.stackTagCompound.getString("Owner"))) {
                    par1ItemStack.stackTagCompound.setBoolean("Mid", true);
                    par1ItemStack.stackTagCompound.setBoolean("Shot", false);
                  } 
                  if (entity2.ticksExisted >= 600) {
                    par1ItemStack.stackTagCompound.setBoolean("Shot", false);
                    ((EntityPlayer)par3Entity).removePotionEffect(Potion.invisibility.id);
                    ((EntityPlayer)par3Entity).removePotionEffect(Potion.resistance.id);
                    ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText("Mind Body Transfer Jutsu-Deactivate"));
                  } 
                } else {
                  par1ItemStack.stackTagCompound.setBoolean("Mid", true);
                  par1ItemStack.stackTagCompound.setBoolean("Shot", false);
                } 
              }  
            props.consumeMana(10);
          } 
          if (props.getCurrentMana() <= 0) {
            ((EntityPlayer)par3Entity).removePotionEffect(Potion.invisibility.id);
            ((EntityPlayer)par3Entity).removePotionEffect(Potion.resistance.id);
            par1ItemStack.stackTagCompound.setBoolean("Shot", false);
            ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText("Mind Body Transfer Jutsu-Deactivate"));
            ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.blindness.id, 600, 25));
            ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 600, 25));
            ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.weakness.id, 600, 25));
            ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.confusion.id, 600, 25));
          } 
          if (((EntityPlayer)par3Entity).getHeldItem() != null && ((EntityPlayer)par3Entity).getHeldItem().getItem() != this) {
            ((EntityPlayer)par3Entity).removePotionEffect(Potion.invisibility.id);
            ((EntityPlayer)par3Entity).removePotionEffect(Potion.resistance.id);
            par1ItemStack.stackTagCompound.setBoolean("Shot", false);
            ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText("Mind Body Transfer Jutsu-Deactivate"));
            ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.blindness.id, 600, 25));
            ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 600, 25));
            ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.weakness.id, 600, 25));
            ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.confusion.id, 600, 25));
          } 
          if (((EntityPlayer)par3Entity).getHeldItem() == null) {
            ((EntityPlayer)par3Entity).removePotionEffect(Potion.invisibility.id);
            ((EntityPlayer)par3Entity).removePotionEffect(Potion.resistance.id);
            par1ItemStack.stackTagCompound.setBoolean("Shot", false);
            ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText("Mind Body Transfer Jutsu-Deactivate"));
            ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.blindness.id, 600, 25));
            ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 600, 25));
            ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.weakness.id, 600, 25));
            ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.confusion.id, 600, 25));
          } 
          if (((EntityPlayer)par3Entity).getHealth() == 0.0F) {
            ((EntityPlayer)par3Entity).removePotionEffect(Potion.invisibility.id);
            ((EntityPlayer)par3Entity).removePotionEffect(Potion.resistance.id);
            par1ItemStack.stackTagCompound.setBoolean("Shot", false);
            ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText("Mind Body Transfer Jutsu-Deactivate"));
            ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.blindness.id, 600, 25));
            ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 600, 25));
            ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.weakness.id, 600, 25));
            ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.confusion.id, 600, 25));
          } 
        } 
        if (par1ItemStack.stackTagCompound.getBoolean("Mid")) {
          EntityPlayer player = (EntityPlayer)par3Entity;
          List<Entity> list = par2World.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox(player.posX - 3.0D, player.posY - 3.0D, player.posZ - 3.0D, player.posX + 3.0D, player.posY + 3.0D, player.posZ + 3.0D));
          if (player != null) {
            int counter;
            for (counter = 0; counter < list.size(); counter++) {
              if (!par2World.isRemote) {
                Entity entity2 = list.get(counter);
                String user = player.getUniqueID().toString();
                entity2.getDistance(player.posX, player.posY, player.posZ);
                if (entity2 instanceof EntityYamanakaMindBody) {
                  entity2.setDead();
                  player.setPositionAndUpdate(par1ItemStack.stackTagCompound.getDouble("locX"), par1ItemStack.stackTagCompound.getDouble("locY"), par1ItemStack.stackTagCompound.getDouble("locZ"));
                } 
              } 
            } 
            for (counter = 0; counter < list.size(); counter++) {
              if (!par2World.isRemote) {
                Entity entity2 = list.get(counter);
                String user = player.getUniqueID().toString();
                entity2.getDistance(player.posX, player.posY, player.posZ);
                if (entity2 instanceof EntityYamanakaFool) {
                  ((EntityYamanakaFool)entity2).killed = true;
                  entity2.setDead();
                  par1ItemStack.stackTagCompound.setBoolean("Mid", false);
                  ((EntityPlayer)par3Entity).removePotionEffect(Potion.invisibility.id);
                  ((EntityPlayer)par3Entity).removePotionEffect(Potion.resistance.id);
                  ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText("Mind Body Transfer Jutsu-Deactivate"));
                  ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.blindness.id, 600, 25));
                  ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 600, 25));
                  ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.weakness.id, 600, 25));
                  ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.confusion.id, 600, 25));
                } 
              } 
            } 
            counter = par1ItemStack.stackTagCompound.getInteger("counter");
            if (counter > 0) {
              counter--;
              par1ItemStack.stackTagCompound.setInteger("counter", counter);
            } 
            if (counter < 1) {
              par1ItemStack.stackTagCompound.setBoolean("Mid", false);
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText("Mind Body Transfer Jutsu-Deactivate"));
              ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.blindness.id, 600, 25));
              ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 600, 25));
              ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.weakness.id, 600, 25));
              ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.confusion.id, 600, 25));
            } 
          } 
        } 
      } 
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName()) && props.getClanName().contains("Yamanaka")) {
        if (!Par1ItemStack.stackTagCompound.getBoolean("Shot") && !Par1ItemStack.stackTagCompound.getBoolean("Mid")) {
          if (props.getCurrentMana() >= 70) {
            Par1ItemStack.stackTagCompound.setDouble("locX", Par3EntityPlayer.posX);
            Par1ItemStack.stackTagCompound.setDouble("locY", Par3EntityPlayer.posY);
            Par1ItemStack.stackTagCompound.setDouble("locZ", Par3EntityPlayer.posZ);
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Mind Body Transfer Jutsu!!"));
            Par2World.spawnEntityInWorld((Entity)new EntityYamanakaMindBody(Par2World, (EntityLivingBase)Par3EntityPlayer));
            props.consumeMana(70);
            Par1ItemStack.stackTagCompound.setBoolean("Shot", true);
            Par1ItemStack.stackTagCompound.setInteger("counter", 20);
          } else {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough chakra"));
          } 
        } else if (Par1ItemStack.stackTagCompound.getBoolean("Shot")) {
          Par3EntityPlayer.removePotionEffect(Potion.invisibility.id);
          Par3EntityPlayer.removePotionEffect(Potion.resistance.id);
          Par1ItemStack.stackTagCompound.setInteger("counter", 50);
          Par1ItemStack.stackTagCompound.setBoolean("Mid", true);
          Par1ItemStack.stackTagCompound.setBoolean("Shot", false);
        } 
      } else {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You are not the owner of this item"));
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null) {
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner"));
      par3List.add(EnumChatFormatting.DARK_AQUA + "The main jutsu of the Yamanaka Clan.");
      par3List.add(EnumChatFormatting.DARK_AQUA + "By focusing your chakra the user extends");
      par3List.add(EnumChatFormatting.DARK_AQUA + "their spirit and takes over the enemies body.");
      par3List.add(EnumChatFormatting.DARK_AQUA + "When the users body that is left behind gets");
      par3List.add(EnumChatFormatting.DARK_AQUA + "killed or the body that's being taken over dies");
      par3List.add(EnumChatFormatting.DARK_AQUA + "the user of this jutsu dies with it");
      par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + 'F');
      par3List.add(EnumChatFormatting.DARK_RED + "Chakra Upkeep/Sec: " + '\001');
      par3List.add(EnumChatFormatting.AQUA + "Counter: " + par1ItemStack.stackTagCompound.getInteger("counter"));
    } 
  }
}

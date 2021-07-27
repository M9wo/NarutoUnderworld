package alcoholmod.Mathioks.Final.ClanJutsu;

import alcoholmod.Mathioks.Entity.EntityInuzuka;
import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.JutsuItem;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class InuzukaPassingFangOverFang extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public InuzukaPassingFangOverFang() {
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null) {
      if (par1ItemStack.stackTagCompound == null) {
        par1ItemStack.stackTagCompound = new NBTTagCompound();
        par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
        par1ItemStack.stackTagCompound.setInteger("counter", 0);
        par1ItemStack.stackTagCompound.setBoolean("Ready", false);
        par1ItemStack.stackTagCompound.setString("Companion", "");
        par1ItemStack.stackTagCompound.setBoolean("BeastMode", false);
        par1ItemStack.stackTagCompound.setBoolean("Together", false);
        par1ItemStack.stackTagCompound.setBoolean("Started", false);
        par1ItemStack.stackTagCompound.setInteger("StartedCounter", 0);
      } 
      EntityPlayer player = (EntityPlayer)par3Entity;
      ExtendedPlayer props = ExtendedPlayer.get(player);
      if (props.getCurrentMana() >= 30 + props.getNinjutsu() / 600 && !par1ItemStack.stackTagCompound.getBoolean("Ready"))
        par1ItemStack.stackTagCompound.setBoolean("Ready", true); 
      if (props.getCurrentMana() < 30 + props.getNinjutsu() / 600 && par1ItemStack.stackTagCompound.getBoolean("Ready"))
        par1ItemStack.stackTagCompound.setBoolean("Ready", false); 
      int counter = par1ItemStack.stackTagCompound.getInteger("counter");
      int StartedCounter = par1ItemStack.stackTagCompound.getInteger("StartedCounter");
      if (StartedCounter > 0) {
        StartedCounter--;
        par1ItemStack.stackTagCompound.setInteger("StartedCounter", StartedCounter);
      } 
      if (StartedCounter == 0 && par1ItemStack.stackTagCompound.getBoolean("Started"))
        par1ItemStack.stackTagCompound.setBoolean("Started", false); 
      if (counter > 0) {
        counter--;
        par1ItemStack.stackTagCompound.setInteger("counter", counter);
        if (counter > 10) {
          List<Entity> list = par2World.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox(player.posX - 4.0D, player.posY - 2.0D, player.posZ - 4.0D, player.posX + 4.0D, player.posY + 2.0D, player.posZ + 4.0D));
          if (player != null)
            for (int k2 = 0; k2 < list.size(); k2++) {
              if (!par2World.isRemote) {
                Entity entity = list.get(k2);
                String user = player.getUniqueID().toString();
                double d0 = entity.getDistance(player.posX, player.posY, player.posZ);
                if (entity instanceof EntityLiving && entity instanceof EntityLiving)
                  if (par1ItemStack.stackTagCompound.getBoolean("Together")) {
                    if (!entity.getCommandSenderName().toString().equals(par1ItemStack.stackTagCompound.getString("Companion"))) {
                      if (par1ItemStack.stackTagCompound.getBoolean("BeastMode")) {
                        entity.attackEntityFrom(DamageSource.causePlayerDamage(player), 17.0F + (int)props.getTaijutsu());
                        ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.weakness.id, 50, 1));
                      } else {
                        entity.attackEntityFrom(DamageSource.causePlayerDamage(player), 14.0F + (int)props.getTaijutsu());
                      } 
                      ((EntityLiving)entity).addPotionEffect(new PotionEffect(Potion.confusion.id, 50, 2));
                    } 
                  } else if (!par1ItemStack.stackTagCompound.getBoolean("Together") && !(entity instanceof InuzukaEntityKuromaru) && !(entity instanceof InuzukaEntityAkamaru) && !(entity instanceof alcoholmod.Mathioks.Jutsu.EntityBeastClone)) {
                    entity.attackEntityFrom(DamageSource.causePlayerDamage(player), 7.0F + (int)props.getTaijutsu());
                    if (d0 <= 10.0D) {
                      double dx = entity.posX - player.posX;
                      double dy = entity.posY - player.posY;
                      double dz = entity.posZ - player.posZ;
                      entity.motionX += dx * 0.75D / d0;
                      entity.motionY += dy * 0.75D / d0 + 0.2D;
                      entity.motionZ += dz * 0.75D / d0;
                    } 
                  }  
                if (entity instanceof EntityPlayer && !entity.getUniqueID().toString().equals(user))
                  if (par1ItemStack.stackTagCompound.getBoolean("Together")) {
                    if (!entity.getCommandSenderName().toString().equals(par1ItemStack.stackTagCompound.getString("Companion"))) {
                      if (par1ItemStack.stackTagCompound.getBoolean("BeastMode")) {
                        entity.attackEntityFrom(DamageSource.causePlayerDamage(player), 17.0F + (int)props.getTaijutsu());
                        ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.weakness.id, 50, 1));
                      } else {
                        entity.attackEntityFrom(DamageSource.causePlayerDamage(player), 14.0F + (int)props.getTaijutsu());
                      } 
                      ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.confusion.id, 50, 2));
                    } 
                  } else if (!par1ItemStack.stackTagCompound.getBoolean("Together") && !(entity instanceof InuzukaEntityKuromaru) && !(entity instanceof InuzukaEntityAkamaru) && !(entity instanceof alcoholmod.Mathioks.Jutsu.EntityBeastClone)) {
                    entity.attackEntityFrom(DamageSource.causePlayerDamage(player), 7.0F + (int)props.getTaijutsu());
                    if (d0 <= 10.0D) {
                      double dx = entity.posX - player.posX;
                      double dy = entity.posY - player.posY;
                      double dz = entity.posZ - player.posZ;
                      entity.motionX += dx * 0.75D / d0;
                      entity.motionY += dy * 0.75D / d0 + 0.2D;
                      entity.motionZ += dz * 0.75D / d0;
                    } 
                  }  
              } 
            }  
        } 
      } 
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
      EntityPlayer player = Par3EntityPlayer;
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getClanName().contains("Inuzuka"))
        if (props.getCurrentMana() >= 20 + props.getNinjutsu() / 600) {
          if (Par1ItemStack.stackTagCompound.getBoolean("Ready")) {
            int counter = Par1ItemStack.stackTagCompound.getInteger("counter");
            if (counter == 0) {
              List<Entity> list = Par2World.getEntitiesWithinAABB(EntityInuzuka.class, AxisAlignedBB.getBoundingBox(Par3EntityPlayer.posX - 15.0D, Par3EntityPlayer.posY - 10.0D, Par3EntityPlayer.posZ - 15.0D, Par3EntityPlayer.posX + 15.0D, Par3EntityPlayer.posY + 10.0D, Par3EntityPlayer.posZ + 15.0D));
              Par3EntityPlayer.addVelocity(-Math.sin(Math.toRadians(Par3EntityPlayer.rotationYawHead)) * 6.0D, 0.0D, Math.cos(Math.toRadians(Par3EntityPlayer.rotationYawHead)) * 6.0D);
              for (int k2 = 0; k2 < list.size(); k2++) {
                Entity entity2 = list.get(k2);
                String user = player.getUniqueID().toString();
                entity2.getDistance(player.posX, player.posY, player.posZ);
                if (entity2 instanceof EntityInuzuka && ((EntityInuzuka)entity2).getOwner() != null && ((EntityInuzuka)entity2).getOwner().getCommandSenderName().toString().equals(Par1ItemStack.stackTagCompound.getString("Owner")) && !Par1ItemStack.stackTagCompound.getBoolean("Started")) {
                  Par1ItemStack.stackTagCompound.setInteger("StartedCounter", 30);
                  if (entity2 instanceof alcoholmod.Mathioks.Jutsu.EntityBeastClone) {
                    Par1ItemStack.stackTagCompound.setBoolean("BeastMode", true);
                  } else {
                    Par1ItemStack.stackTagCompound.setBoolean("BeastMode", false);
                  } 
                  Par1ItemStack.stackTagCompound.setBoolean("Together", true);
                  Par1ItemStack.stackTagCompound.setString("Companion", ((EntityTameable)entity2).getCommandSenderName().toString());
                  counter = 30;
                  Par1ItemStack.stackTagCompound.setInteger("counter", counter);
                  entity2.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, Par3EntityPlayer.rotationPitch);
                  entity2.addVelocity(-Math.sin(Math.toRadians(Par3EntityPlayer.rotationYawHead)) * 6.0D, 0.0D, Math.cos(Math.toRadians(Par3EntityPlayer.rotationYawHead)) * 6.0D);
                  props.consumeMana(20);
                  if (!Par2World.isRemote)
                    Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Inuzuka Style: Double Passing Fang Over Fang!!")); 
                  Par1ItemStack.stackTagCompound.setBoolean("Started", true);
                } 
              } 
              if (list.size() == 0 && !Par1ItemStack.stackTagCompound.getBoolean("Started")) {
                Par1ItemStack.stackTagCompound.setInteger("StartedCounter", 30);
                counter = 30;
                Par1ItemStack.stackTagCompound.setInteger("counter", counter);
                props.consumeMana(20);
                Par1ItemStack.stackTagCompound.setBoolean("Together", false);
                if (!Par2World.isRemote)
                  Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Inuzuka Style: Single Passing Fang Over Fang!")); 
                Par1ItemStack.stackTagCompound.setBoolean("Started", true);
              } 
            } 
          } 
        } else if (!Par2World.isRemote) {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough chakra!"));
        }  
    } else if (!Par2World.isRemote) {
      Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You are not the owner of this jutsu"));
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "A jutsu used by members of the Inuzuka clan");
    par3List.add(EnumChatFormatting.DARK_AQUA + "firing the user off at imense speeds damaging");
    par3List.add(EnumChatFormatting.DARK_AQUA + "any opponent in its way, power gets enhanced");
    par3List.add(EnumChatFormatting.DARK_AQUA + "when used in conjuction with the dog companion");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + '\024');
    par3List.add(EnumChatFormatting.DARK_RED + "Damage (Alone): " + 7.0F + (int)props.getTaijutsu());
    par3List.add(EnumChatFormatting.DARK_RED + "Damage (With Dog): " + 14.0F + (int)props.getTaijutsu());
    par3List.add(EnumChatFormatting.DARK_RED + "Damage (With Dog Human Mode): " + 17.0F + (int)props.getTaijutsu());
  }
}

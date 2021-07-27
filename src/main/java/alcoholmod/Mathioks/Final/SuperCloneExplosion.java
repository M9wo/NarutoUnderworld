package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Jutsu.EntitySuperCloneExplosion;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class SuperCloneExplosion extends JutsuItem {
  private boolean isinair;
  
  private Entity p_70085_1_;
  
  private Object worldObj;
  
  public SuperCloneExplosion() {
    setMaxDamage(9600);
    isDamageable();
    this.maxStackSize = 1;
  }
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getInteger("counter") == 0) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getGenjutsu() < 10)
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Your Genjutsu is too low")); 
      if (props.getCurrentMana() >= 35 + props.getGenjutsu() / 600) {
        if (props.getGenjutsu() >= 10 && props.getGenjutsu() < 25) {
          EntitySuperCloneExplosion EntityBunshin = new EntitySuperCloneExplosion(Par2World);
          EntityBunshin.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin.setTamed(true);
          EntityBunshin.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin.rotationYawHead = EntityBunshin.rotationYaw;
          EntityBunshin.renderYawOffset = EntityBunshin.rotationYaw;
          EntityBunshin.explosionRadius = 1;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin);
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Kage Bunsin no Jutsu!!"));
        } 
        if (props.getGenjutsu() >= 25 && props.getGenjutsu() < 60) {
          EntitySuperCloneExplosion EntityBunshin = new EntitySuperCloneExplosion(Par2World);
          EntityBunshin.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin.setTamed(true);
          EntityBunshin.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin.rotationYawHead = EntityBunshin.rotationYaw;
          EntityBunshin.renderYawOffset = EntityBunshin.rotationYaw;
          EntityBunshin.explosionRadius = 2;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin);
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Kage Bunsin no Jutsu!!"));
        } 
        if (props.getGenjutsu() >= 60 && props.getGenjutsu() < 85) {
          EntitySuperCloneExplosion EntityBunshin = new EntitySuperCloneExplosion(Par2World);
          EntityBunshin.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin.setTamed(true);
          EntityBunshin.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin.rotationYawHead = EntityBunshin.rotationYaw;
          EntityBunshin.renderYawOffset = EntityBunshin.rotationYaw;
          EntityBunshin.explosionRadius = 2;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin);
          EntitySuperCloneExplosion EntityBunshin2 = new EntitySuperCloneExplosion(Par2World);
          EntityBunshin2.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin2.setTamed(true);
          EntityBunshin2.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin2.rotationYawHead = EntityBunshin2.rotationYaw;
          EntityBunshin2.renderYawOffset = EntityBunshin2.rotationYaw;
          EntityBunshin2.explosionRadius = 2;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin2);
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Kage Bunsin no Jutsu!!"));
        } 
        if (props.getGenjutsu() >= 85) {
          EntitySuperCloneExplosion EntityBunshin = new EntitySuperCloneExplosion(Par2World);
          EntityBunshin.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin.setTamed(true);
          EntityBunshin.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin.rotationYawHead = EntityBunshin.rotationYaw;
          EntityBunshin.renderYawOffset = EntityBunshin.rotationYaw;
          EntityBunshin.explosionRadius = 3;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin);
          EntitySuperCloneExplosion EntityBunshin2 = new EntitySuperCloneExplosion(Par2World);
          EntityBunshin2.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin2.setTamed(true);
          EntityBunshin2.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin2.rotationYawHead = EntityBunshin2.rotationYaw;
          EntityBunshin2.renderYawOffset = EntityBunshin2.rotationYaw;
          EntityBunshin2.explosionRadius = 3;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin2);
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Kage Bunsin no Jutsu!!"));
        } 
        props.consumeMana(35 + props.getGenjutsu() / 600);
        Par1ItemStack.stackTagCompound.setInteger("counter", 300);
      } else {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough chakra"));
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (props.getGenjutsu() >= 10 && props.getGenjutsu() < 25) {
      par3List.add(EnumChatFormatting.DARK_AQUA + "A Genjutsu that creates a clone");
      par3List.add(EnumChatFormatting.DARK_AQUA + "of the user that will explode on death");
      par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (35 + props.getGenjutsu() / 600));
      par3List.add(EnumChatFormatting.DARK_RED + "Genjutsu for next stage: 25");
    } 
    if (props.getGenjutsu() >= 25 && props.getGenjutsu() < 60) {
      par3List.add(EnumChatFormatting.DARK_AQUA + "A Genjutsu that creates a clone");
      par3List.add(EnumChatFormatting.DARK_AQUA + "of the user that will explode on death");
      par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (35 + props.getGenjutsu() / 600));
      par3List.add(EnumChatFormatting.DARK_RED + "Genjutsu for next stage: 60");
    } 
    if (props.getGenjutsu() >= 60 && props.getGenjutsu() < 85) {
      par3List.add(EnumChatFormatting.DARK_AQUA + "A Genjutsu that creates two clones");
      par3List.add(EnumChatFormatting.DARK_AQUA + "of the user that will explode on death");
      par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (35 + props.getGenjutsu() / 600));
      par3List.add(EnumChatFormatting.DARK_RED + "Genjutsu for next stage: 85");
    } 
    if (props.getGenjutsu() >= 85 && props.getGenjutsu() < 100) {
      par3List.add(EnumChatFormatting.DARK_AQUA + "A Genjutsu that creates two clones");
      par3List.add(EnumChatFormatting.DARK_AQUA + "of the user that will explode on death");
      par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (35 + props.getGenjutsu() / 600));
    } 
  }
}

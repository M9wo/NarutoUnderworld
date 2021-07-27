package alcoholmod.Mathioks.Final.ClanJutsu;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.JutsuItem;
import alcoholmod.Mathioks.NickModels.KikaichuEntity;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class AburameKikaichuSummon extends JutsuItem {
  public AburameKikaichuSummon() {
    setMaxDamage(9600);
    isDamageable();
    this.maxStackSize = 1;
  }
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World Par2World, Entity Par3EntityPlayer, int par4, boolean par5) {
    if ((EntityPlayer)Par3EntityPlayer != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)Par3EntityPlayer).getCommandSenderName());
      par1ItemStack.stackTagCompound.setInteger("counter", 0);
    } 
    int counter = par1ItemStack.stackTagCompound.getInteger("counter");
    if (counter > 0) {
      counter--;
      par1ItemStack.stackTagCompound.setInteger("counter", counter);
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
      int counter = Par1ItemStack.stackTagCompound.getInteger("counter");
      if (counter == 0) {
        ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
        if (props.getCurrentMana() >= 30 && props.getClanName().contains("Aburame")) {
          counter = 200;
          Par1ItemStack.stackTagCompound.setInteger("counter", counter);
          KikaichuEntity KikaichuEntity = new KikaichuEntity(Par2World);
          KikaichuEntity KikaichuEntity1 = new KikaichuEntity(Par2World);
          KikaichuEntity KikaichuEntity2 = new KikaichuEntity(Par2World);
          KikaichuEntity KikaichuEntity10 = new KikaichuEntity(Par2World);
          KikaichuEntity KikaichuEntity11 = new KikaichuEntity(Par2World);
          KikaichuEntity KikaichuEntity21 = new KikaichuEntity(Par2World);
          KikaichuEntity KikaichuEntity20 = new KikaichuEntity(Par2World);
          KikaichuEntity KikaichuEntity12 = new KikaichuEntity(Par2World);
          KikaichuEntity KikaichuEntity22 = new KikaichuEntity(Par2World);
          KikaichuEntity KikaichuEntity3 = new KikaichuEntity(Par2World);
          KikaichuEntity KikaichuEntity13 = new KikaichuEntity(Par2World);
          KikaichuEntity KikaichuEntity23 = new KikaichuEntity(Par2World);
          KikaichuEntity KikaichuEntity4 = new KikaichuEntity(Par2World);
          KikaichuEntity KikaichuEntity14 = new KikaichuEntity(Par2World);
          KikaichuEntity KikaichuEntity24 = new KikaichuEntity(Par2World);
          KikaichuEntity KikaichuEntity5 = new KikaichuEntity(Par2World);
          KikaichuEntity KikaichuEntity15 = new KikaichuEntity(Par2World);
          KikaichuEntity KikaichuEntity25 = new KikaichuEntity(Par2World);
          KikaichuEntity KikaichuEntity6 = new KikaichuEntity(Par2World);
          KikaichuEntity KikaichuEntity16 = new KikaichuEntity(Par2World);
          KikaichuEntity KikaichuEntity26 = new KikaichuEntity(Par2World);
          KikaichuEntity.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          KikaichuEntity.setTamed(true);
          KikaichuEntity.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          KikaichuEntity.rotationYawHead = KikaichuEntity.rotationYaw;
          KikaichuEntity.renderYawOffset = KikaichuEntity.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)KikaichuEntity);
          KikaichuEntity1.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          KikaichuEntity1.setTamed(true);
          KikaichuEntity1.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          KikaichuEntity1.rotationYawHead = KikaichuEntity1.rotationYaw;
          KikaichuEntity1.renderYawOffset = KikaichuEntity1.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)KikaichuEntity1);
          KikaichuEntity2.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          KikaichuEntity2.setTamed(true);
          KikaichuEntity2.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ - 1.0D, Par3EntityPlayer.rotationYaw, 0.0F);
          KikaichuEntity2.rotationYawHead = KikaichuEntity2.rotationYaw;
          KikaichuEntity2.renderYawOffset = KikaichuEntity2.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)KikaichuEntity2);
          KikaichuEntity10.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          KikaichuEntity10.setTamed(true);
          KikaichuEntity10.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ - 1.0D, Par3EntityPlayer.rotationYaw, 0.0F);
          KikaichuEntity10.rotationYawHead = KikaichuEntity10.rotationYaw;
          KikaichuEntity10.renderYawOffset = KikaichuEntity10.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)KikaichuEntity10);
          KikaichuEntity11.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          KikaichuEntity11.setTamed(true);
          KikaichuEntity11.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          KikaichuEntity11.rotationYawHead = KikaichuEntity11.rotationYaw;
          KikaichuEntity11.renderYawOffset = KikaichuEntity11.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)KikaichuEntity11);
          KikaichuEntity21.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          KikaichuEntity21.setTamed(true);
          KikaichuEntity21.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ - 1.0D, Par3EntityPlayer.rotationYaw, 0.0F);
          KikaichuEntity21.rotationYawHead = KikaichuEntity21.rotationYaw;
          KikaichuEntity21.renderYawOffset = KikaichuEntity21.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)KikaichuEntity21);
          KikaichuEntity20.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          KikaichuEntity20.setTamed(true);
          KikaichuEntity20.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          KikaichuEntity20.rotationYawHead = KikaichuEntity20.rotationYaw;
          KikaichuEntity20.renderYawOffset = KikaichuEntity20.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)KikaichuEntity20);
          KikaichuEntity12.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          KikaichuEntity12.setTamed(true);
          KikaichuEntity12.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          KikaichuEntity12.rotationYawHead = KikaichuEntity12.rotationYaw;
          KikaichuEntity12.renderYawOffset = KikaichuEntity12.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)KikaichuEntity12);
          KikaichuEntity22.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          KikaichuEntity22.setTamed(true);
          KikaichuEntity22.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ + 1.0D, Par3EntityPlayer.rotationYaw, 0.0F);
          KikaichuEntity22.rotationYawHead = KikaichuEntity22.rotationYaw;
          KikaichuEntity22.renderYawOffset = KikaichuEntity22.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)KikaichuEntity22);
          KikaichuEntity3.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          KikaichuEntity3.setTamed(true);
          KikaichuEntity3.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ + 1.0D, Par3EntityPlayer.rotationYaw, 0.0F);
          KikaichuEntity3.rotationYawHead = KikaichuEntity3.rotationYaw;
          KikaichuEntity3.renderYawOffset = KikaichuEntity3.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)KikaichuEntity3);
          KikaichuEntity13.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          KikaichuEntity13.setTamed(true);
          KikaichuEntity13.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ + 1.0D, Par3EntityPlayer.rotationYaw, 0.0F);
          KikaichuEntity13.rotationYawHead = KikaichuEntity13.rotationYaw;
          KikaichuEntity13.renderYawOffset = KikaichuEntity13.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)KikaichuEntity13);
          KikaichuEntity23.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          KikaichuEntity23.setTamed(true);
          KikaichuEntity23.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          KikaichuEntity23.rotationYawHead = KikaichuEntity23.rotationYaw;
          KikaichuEntity23.renderYawOffset = KikaichuEntity23.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)KikaichuEntity23);
          KikaichuEntity4.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          KikaichuEntity4.setTamed(true);
          KikaichuEntity4.setPositionAndRotation(Par3EntityPlayer.posX + 1.0D, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ - 1.0D, Par3EntityPlayer.rotationYaw, 0.0F);
          KikaichuEntity4.rotationYawHead = KikaichuEntity4.rotationYaw;
          KikaichuEntity4.renderYawOffset = KikaichuEntity4.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)KikaichuEntity4);
          KikaichuEntity14.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          KikaichuEntity14.setTamed(true);
          KikaichuEntity14.setPositionAndRotation(Par3EntityPlayer.posX + 1.0D, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          KikaichuEntity14.rotationYawHead = KikaichuEntity14.rotationYaw;
          KikaichuEntity14.renderYawOffset = KikaichuEntity14.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)KikaichuEntity14);
          KikaichuEntity24.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          KikaichuEntity24.setTamed(true);
          KikaichuEntity24.setPositionAndRotation(Par3EntityPlayer.posX + 1.0D, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ - 1.0D, Par3EntityPlayer.rotationYaw, 0.0F);
          KikaichuEntity24.rotationYawHead = KikaichuEntity24.rotationYaw;
          KikaichuEntity24.renderYawOffset = KikaichuEntity24.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)KikaichuEntity24);
          KikaichuEntity5.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          KikaichuEntity5.setTamed(true);
          KikaichuEntity5.setPositionAndRotation(Par3EntityPlayer.posX + 2.0D, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          KikaichuEntity5.rotationYawHead = KikaichuEntity5.rotationYaw;
          KikaichuEntity5.renderYawOffset = KikaichuEntity5.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)KikaichuEntity5);
          KikaichuEntity15.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          KikaichuEntity15.setTamed(true);
          KikaichuEntity15.setPositionAndRotation(Par3EntityPlayer.posX - 1.0D, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ + 1.0D, Par3EntityPlayer.rotationYaw, 0.0F);
          KikaichuEntity15.rotationYawHead = KikaichuEntity15.rotationYaw;
          KikaichuEntity15.renderYawOffset = KikaichuEntity15.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)KikaichuEntity15);
          KikaichuEntity25.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          KikaichuEntity25.setTamed(true);
          KikaichuEntity25.setPositionAndRotation(Par3EntityPlayer.posX - 1.0D, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ + 1.0D, Par3EntityPlayer.rotationYaw, 0.0F);
          KikaichuEntity25.rotationYawHead = KikaichuEntity25.rotationYaw;
          KikaichuEntity25.renderYawOffset = KikaichuEntity25.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)KikaichuEntity25);
          KikaichuEntity6.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          KikaichuEntity6.setTamed(true);
          KikaichuEntity6.setPositionAndRotation(Par3EntityPlayer.posX + 1.0D, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          KikaichuEntity6.rotationYawHead = KikaichuEntity6.rotationYaw;
          KikaichuEntity6.renderYawOffset = KikaichuEntity6.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)KikaichuEntity6);
          KikaichuEntity16.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          KikaichuEntity16.setTamed(true);
          KikaichuEntity16.setPositionAndRotation(Par3EntityPlayer.posX + 1.0D, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ + 1.0D, Par3EntityPlayer.rotationYaw, 0.0F);
          KikaichuEntity16.rotationYawHead = KikaichuEntity16.rotationYaw;
          KikaichuEntity16.renderYawOffset = KikaichuEntity16.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)KikaichuEntity16);
          KikaichuEntity26.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          KikaichuEntity26.setTamed(true);
          KikaichuEntity26.setPositionAndRotation(Par3EntityPlayer.posX + 1.0D, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ + 1.0D, Par3EntityPlayer.rotationYaw, 0.0F);
          KikaichuEntity26.rotationYawHead = KikaichuEntity26.rotationYaw;
          KikaichuEntity26.renderYawOffset = KikaichuEntity26.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)KikaichuEntity26);
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Hidden Jutsu: Aburame Kikaichu Release!"));
          props.consumeMana(30);
          return Par1ItemStack;
        } 
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "Release 20 Kikaichu that will");
    par3List.add(EnumChatFormatting.DARK_AQUA + "poison your opponent and drain");
    par3List.add(EnumChatFormatting.DARK_AQUA + "their chakra");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: 30");
  }
}

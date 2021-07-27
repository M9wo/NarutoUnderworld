package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Jutsu.EntityBunshin;
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

public class KageBunshinMultiMax extends JutsuItem {
  public KageBunshinMultiMax() {
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
        if (props.getGenjutsu() < 60 && props.getKinjutsu() < 50) {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You don't have the correct stats"));
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You need Genjutsu : 60"));
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You need Kinjutsu : 50"));
        } 
        if (props.getGenjutsu() >= 60 && props.getKinjutsu() >= 50 && props.getCurrentMana() >= 130 + props.getGenjutsu() / 600) {
          counter = 300;
          Par1ItemStack.stackTagCompound.setInteger("counter", counter);
          EntityBunshin EntityBunshin = new EntityBunshin(Par2World);
          EntityBunshin EntityBunshin1 = new EntityBunshin(Par2World);
          EntityBunshin EntityBunshin2 = new EntityBunshin(Par2World);
          EntityBunshin EntityBunshin10 = new EntityBunshin(Par2World);
          EntityBunshin EntityBunshin11 = new EntityBunshin(Par2World);
          EntityBunshin EntityBunshin21 = new EntityBunshin(Par2World);
          EntityBunshin EntityBunshin20 = new EntityBunshin(Par2World);
          EntityBunshin EntityBunshin12 = new EntityBunshin(Par2World);
          EntityBunshin EntityBunshin22 = new EntityBunshin(Par2World);
          EntityBunshin EntityBunshin3 = new EntityBunshin(Par2World);
          EntityBunshin EntityBunshin13 = new EntityBunshin(Par2World);
          EntityBunshin EntityBunshin23 = new EntityBunshin(Par2World);
          EntityBunshin EntityBunshin4 = new EntityBunshin(Par2World);
          EntityBunshin EntityBunshin14 = new EntityBunshin(Par2World);
          EntityBunshin EntityBunshin24 = new EntityBunshin(Par2World);
          EntityBunshin EntityBunshin5 = new EntityBunshin(Par2World);
          EntityBunshin EntityBunshin15 = new EntityBunshin(Par2World);
          EntityBunshin EntityBunshin25 = new EntityBunshin(Par2World);
          EntityBunshin EntityBunshin6 = new EntityBunshin(Par2World);
          EntityBunshin EntityBunshin16 = new EntityBunshin(Par2World);
          EntityBunshin EntityBunshin26 = new EntityBunshin(Par2World);
          EntityBunshin EntityBunshin7 = new EntityBunshin(Par2World);
          EntityBunshin EntityBunshin17 = new EntityBunshin(Par2World);
          EntityBunshin EntityBunshin27 = new EntityBunshin(Par2World);
          EntityBunshin EntityBunshin107 = new EntityBunshin(Par2World);
          EntityBunshin EntityBunshin117 = new EntityBunshin(Par2World);
          EntityBunshin EntityBunshin217 = new EntityBunshin(Par2World);
          EntityBunshin EntityBunshin207 = new EntityBunshin(Par2World);
          EntityBunshin EntityBunshin127 = new EntityBunshin(Par2World);
          EntityBunshin EntityBunshin227 = new EntityBunshin(Par2World);
          EntityBunshin EntityBunshin37 = new EntityBunshin(Par2World);
          EntityBunshin EntityBunshin137 = new EntityBunshin(Par2World);
          EntityBunshin EntityBunshin237 = new EntityBunshin(Par2World);
          EntityBunshin EntityBunshin47 = new EntityBunshin(Par2World);
          EntityBunshin EntityBunshin147 = new EntityBunshin(Par2World);
          EntityBunshin EntityBunshin247 = new EntityBunshin(Par2World);
          EntityBunshin EntityBunshin57 = new EntityBunshin(Par2World);
          EntityBunshin EntityBunshin157 = new EntityBunshin(Par2World);
          EntityBunshin EntityBunshin257 = new EntityBunshin(Par2World);
          EntityBunshin EntityBunshin67 = new EntityBunshin(Par2World);
          EntityBunshin EntityBunshin167 = new EntityBunshin(Par2World);
          EntityBunshin EntityBunshin267 = new EntityBunshin(Par2World);
          EntityBunshin.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin.setTamed(true);
          EntityBunshin.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin.rotationYawHead = EntityBunshin.rotationYaw;
          EntityBunshin.renderYawOffset = EntityBunshin.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin);
          EntityBunshin1.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin1.setTamed(true);
          EntityBunshin1.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin1.rotationYawHead = EntityBunshin1.rotationYaw;
          EntityBunshin1.renderYawOffset = EntityBunshin1.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin1);
          EntityBunshin2.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin2.setTamed(true);
          EntityBunshin2.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ - 1.0D, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin2.rotationYawHead = EntityBunshin2.rotationYaw;
          EntityBunshin2.renderYawOffset = EntityBunshin2.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin2);
          EntityBunshin10.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin10.setTamed(true);
          EntityBunshin10.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ - 1.0D, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin10.rotationYawHead = EntityBunshin10.rotationYaw;
          EntityBunshin10.renderYawOffset = EntityBunshin10.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin10);
          EntityBunshin11.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin11.setTamed(true);
          EntityBunshin11.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin11.rotationYawHead = EntityBunshin11.rotationYaw;
          EntityBunshin11.renderYawOffset = EntityBunshin11.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin11);
          EntityBunshin21.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin21.setTamed(true);
          EntityBunshin21.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ - 1.0D, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin21.rotationYawHead = EntityBunshin21.rotationYaw;
          EntityBunshin21.renderYawOffset = EntityBunshin21.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin21);
          EntityBunshin20.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin20.setTamed(true);
          EntityBunshin20.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin20.rotationYawHead = EntityBunshin20.rotationYaw;
          EntityBunshin20.renderYawOffset = EntityBunshin20.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin20);
          EntityBunshin12.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin12.setTamed(true);
          EntityBunshin12.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin12.rotationYawHead = EntityBunshin12.rotationYaw;
          EntityBunshin12.renderYawOffset = EntityBunshin12.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin12);
          EntityBunshin22.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin22.setTamed(true);
          EntityBunshin22.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ + 1.0D, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin22.rotationYawHead = EntityBunshin22.rotationYaw;
          EntityBunshin22.renderYawOffset = EntityBunshin22.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin22);
          EntityBunshin3.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin3.setTamed(true);
          EntityBunshin3.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ + 1.0D, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin3.rotationYawHead = EntityBunshin3.rotationYaw;
          EntityBunshin3.renderYawOffset = EntityBunshin3.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin3);
          EntityBunshin13.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin13.setTamed(true);
          EntityBunshin13.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ + 1.0D, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin13.rotationYawHead = EntityBunshin13.rotationYaw;
          EntityBunshin13.renderYawOffset = EntityBunshin13.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin13);
          EntityBunshin23.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin23.setTamed(true);
          EntityBunshin23.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin23.rotationYawHead = EntityBunshin23.rotationYaw;
          EntityBunshin23.renderYawOffset = EntityBunshin23.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin23);
          EntityBunshin4.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin4.setTamed(true);
          EntityBunshin4.setPositionAndRotation(Par3EntityPlayer.posX + 1.0D, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ - 1.0D, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin4.rotationYawHead = EntityBunshin4.rotationYaw;
          EntityBunshin4.renderYawOffset = EntityBunshin4.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin4);
          EntityBunshin14.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin14.setTamed(true);
          EntityBunshin14.setPositionAndRotation(Par3EntityPlayer.posX + 1.0D, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin14.rotationYawHead = EntityBunshin14.rotationYaw;
          EntityBunshin14.renderYawOffset = EntityBunshin14.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin14);
          EntityBunshin24.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin24.setTamed(true);
          EntityBunshin24.setPositionAndRotation(Par3EntityPlayer.posX + 1.0D, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ - 1.0D, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin24.rotationYawHead = EntityBunshin24.rotationYaw;
          EntityBunshin24.renderYawOffset = EntityBunshin24.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin24);
          EntityBunshin5.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin5.setTamed(true);
          EntityBunshin5.setPositionAndRotation(Par3EntityPlayer.posX + 2.0D, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin5.rotationYawHead = EntityBunshin5.rotationYaw;
          EntityBunshin5.renderYawOffset = EntityBunshin5.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin5);
          EntityBunshin15.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin15.setTamed(true);
          EntityBunshin15.setPositionAndRotation(Par3EntityPlayer.posX - 1.0D, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ + 1.0D, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin15.rotationYawHead = EntityBunshin15.rotationYaw;
          EntityBunshin15.renderYawOffset = EntityBunshin15.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin15);
          EntityBunshin25.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin25.setTamed(true);
          EntityBunshin25.setPositionAndRotation(Par3EntityPlayer.posX - 1.0D, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ + 1.0D, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin25.rotationYawHead = EntityBunshin25.rotationYaw;
          EntityBunshin25.renderYawOffset = EntityBunshin25.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin25);
          EntityBunshin6.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin6.setTamed(true);
          EntityBunshin6.setPositionAndRotation(Par3EntityPlayer.posX + 1.0D, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin6.rotationYawHead = EntityBunshin6.rotationYaw;
          EntityBunshin6.renderYawOffset = EntityBunshin6.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin6);
          EntityBunshin16.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin16.setTamed(true);
          EntityBunshin16.setPositionAndRotation(Par3EntityPlayer.posX + 1.0D, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ + 1.0D, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin16.rotationYawHead = EntityBunshin16.rotationYaw;
          EntityBunshin16.renderYawOffset = EntityBunshin16.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin16);
          EntityBunshin26.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin26.setTamed(true);
          EntityBunshin26.setPositionAndRotation(Par3EntityPlayer.posX + 1.0D, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ + 1.0D, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin26.rotationYawHead = EntityBunshin26.rotationYaw;
          EntityBunshin26.renderYawOffset = EntityBunshin26.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin26);
          EntityBunshin7.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin7.setTamed(true);
          EntityBunshin7.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin7.rotationYawHead = EntityBunshin7.rotationYaw;
          EntityBunshin7.renderYawOffset = EntityBunshin7.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin7);
          EntityBunshin17.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin17.setTamed(true);
          EntityBunshin17.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin17.rotationYawHead = EntityBunshin17.rotationYaw;
          EntityBunshin17.renderYawOffset = EntityBunshin17.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin17);
          EntityBunshin27.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin27.setTamed(true);
          EntityBunshin27.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ - 1.0D, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin27.rotationYawHead = EntityBunshin27.rotationYaw;
          EntityBunshin27.renderYawOffset = EntityBunshin27.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin27);
          EntityBunshin107.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin107.setTamed(true);
          EntityBunshin107.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ - 1.0D, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin107.rotationYawHead = EntityBunshin107.rotationYaw;
          EntityBunshin107.renderYawOffset = EntityBunshin107.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin107);
          EntityBunshin117.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin117.setTamed(true);
          EntityBunshin117.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin117.rotationYawHead = EntityBunshin117.rotationYaw;
          EntityBunshin117.renderYawOffset = EntityBunshin117.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin117);
          EntityBunshin217.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin217.setTamed(true);
          EntityBunshin217.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ - 1.0D, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin217.rotationYawHead = EntityBunshin217.rotationYaw;
          EntityBunshin217.renderYawOffset = EntityBunshin217.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin217);
          EntityBunshin207.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin207.setTamed(true);
          EntityBunshin207.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin207.rotationYawHead = EntityBunshin207.rotationYaw;
          EntityBunshin207.renderYawOffset = EntityBunshin207.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin207);
          EntityBunshin127.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin127.setTamed(true);
          EntityBunshin127.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin127.rotationYawHead = EntityBunshin127.rotationYaw;
          EntityBunshin127.renderYawOffset = EntityBunshin127.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin127);
          EntityBunshin227.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin227.setTamed(true);
          EntityBunshin227.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ + 1.0D, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin227.rotationYawHead = EntityBunshin227.rotationYaw;
          EntityBunshin227.renderYawOffset = EntityBunshin227.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin227);
          EntityBunshin37.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin37.setTamed(true);
          EntityBunshin37.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ + 1.0D, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin37.rotationYawHead = EntityBunshin37.rotationYaw;
          EntityBunshin37.renderYawOffset = EntityBunshin37.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin37);
          EntityBunshin137.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin137.setTamed(true);
          EntityBunshin137.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ + 1.0D, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin137.rotationYawHead = EntityBunshin137.rotationYaw;
          EntityBunshin137.renderYawOffset = EntityBunshin137.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin137);
          EntityBunshin237.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin237.setTamed(true);
          EntityBunshin237.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin237.rotationYawHead = EntityBunshin237.rotationYaw;
          EntityBunshin237.renderYawOffset = EntityBunshin237.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin237);
          EntityBunshin47.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin47.setTamed(true);
          EntityBunshin47.setPositionAndRotation(Par3EntityPlayer.posX + 1.0D, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ - 1.0D, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin47.rotationYawHead = EntityBunshin47.rotationYaw;
          EntityBunshin47.renderYawOffset = EntityBunshin47.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin47);
          EntityBunshin147.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin147.setTamed(true);
          EntityBunshin147.setPositionAndRotation(Par3EntityPlayer.posX + 1.0D, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin147.rotationYawHead = EntityBunshin147.rotationYaw;
          EntityBunshin147.renderYawOffset = EntityBunshin147.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin147);
          EntityBunshin247.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin247.setTamed(true);
          EntityBunshin247.setPositionAndRotation(Par3EntityPlayer.posX + 1.0D, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ - 1.0D, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin247.rotationYawHead = EntityBunshin247.rotationYaw;
          EntityBunshin247.renderYawOffset = EntityBunshin247.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin247);
          EntityBunshin57.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin57.setTamed(true);
          EntityBunshin57.setPositionAndRotation(Par3EntityPlayer.posX + 2.0D, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin57.rotationYawHead = EntityBunshin57.rotationYaw;
          EntityBunshin57.renderYawOffset = EntityBunshin57.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin57);
          EntityBunshin157.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin157.setTamed(true);
          EntityBunshin157.setPositionAndRotation(Par3EntityPlayer.posX - 1.0D, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ + 1.0D, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin157.rotationYawHead = EntityBunshin157.rotationYaw;
          EntityBunshin157.renderYawOffset = EntityBunshin157.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin157);
          EntityBunshin257.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin257.setTamed(true);
          EntityBunshin257.setPositionAndRotation(Par3EntityPlayer.posX - 1.0D, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ + 1.0D, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin257.rotationYawHead = EntityBunshin257.rotationYaw;
          EntityBunshin257.renderYawOffset = EntityBunshin257.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin257);
          EntityBunshin67.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin67.setTamed(true);
          EntityBunshin67.setPositionAndRotation(Par3EntityPlayer.posX + 1.0D, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin67.rotationYawHead = EntityBunshin67.rotationYaw;
          EntityBunshin67.renderYawOffset = EntityBunshin67.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin67);
          EntityBunshin167.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin167.setTamed(true);
          EntityBunshin167.setPositionAndRotation(Par3EntityPlayer.posX + 1.0D, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ + 1.0D, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin167.rotationYawHead = EntityBunshin167.rotationYaw;
          EntityBunshin167.renderYawOffset = EntityBunshin167.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin167);
          EntityBunshin267.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin267.setTamed(true);
          EntityBunshin267.setPositionAndRotation(Par3EntityPlayer.posX + 1.0D, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ + 1.0D, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin267.rotationYawHead = EntityBunshin267.rotationYaw;
          EntityBunshin267.renderYawOffset = EntityBunshin267.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin267);
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Multiple Kage Bunshin No Jutsu Max!!!"));
          props.consumeMana(130 + props.getGenjutsu() / 600);
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "Create 41 clones of yourself");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (130 + props.getGenjutsu() / 600));
  }
}

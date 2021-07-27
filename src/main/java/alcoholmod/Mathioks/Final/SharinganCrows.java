package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Jutsu.EntityCrowDisguiseJutsu;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class SharinganCrows extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public SharinganCrows() {
    setMaxDamage(3700);
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName()) && Par1ItemStack.stackTagCompound.getInteger("counter") == 0) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getSharinganActive()) {
        if (props.getCurrentMana() >= 5 + props.getNinjutsu() / 600) {
          EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu = new EntityCrowDisguiseJutsu(Par2World);
          EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu1 = new EntityCrowDisguiseJutsu(Par2World);
          EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu2 = new EntityCrowDisguiseJutsu(Par2World);
          EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu3 = new EntityCrowDisguiseJutsu(Par2World);
          EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu4 = new EntityCrowDisguiseJutsu(Par2World);
          EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu5 = new EntityCrowDisguiseJutsu(Par2World);
          EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu6 = new EntityCrowDisguiseJutsu(Par2World);
          EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu7 = new EntityCrowDisguiseJutsu(Par2World);
          EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu8 = new EntityCrowDisguiseJutsu(Par2World);
          EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu9 = new EntityCrowDisguiseJutsu(Par2World);
          EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu10 = new EntityCrowDisguiseJutsu(Par2World);
          EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu11 = new EntityCrowDisguiseJutsu(Par2World);
          EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu12 = new EntityCrowDisguiseJutsu(Par2World);
          EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu13 = new EntityCrowDisguiseJutsu(Par2World);
          EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu14 = new EntityCrowDisguiseJutsu(Par2World);
          EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu15 = new EntityCrowDisguiseJutsu(Par2World);
          EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu16 = new EntityCrowDisguiseJutsu(Par2World);
          EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu17 = new EntityCrowDisguiseJutsu(Par2World);
          EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu18 = new EntityCrowDisguiseJutsu(Par2World);
          EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu19 = new EntityCrowDisguiseJutsu(Par2World);
          EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu20 = new EntityCrowDisguiseJutsu(Par2World);
          EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu21 = new EntityCrowDisguiseJutsu(Par2World);
          EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu22 = new EntityCrowDisguiseJutsu(Par2World);
          EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu23 = new EntityCrowDisguiseJutsu(Par2World);
          EntityCrowDisguiseJutsu entitycrow = new EntityCrowDisguiseJutsu(Par2World);
          EntityCrowDisguiseJutsu entitycrow1 = new EntityCrowDisguiseJutsu(Par2World);
          EntityCrowDisguiseJutsu1.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityCrowDisguiseJutsu1.setTamed(true);
          EntityCrowDisguiseJutsu2.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityCrowDisguiseJutsu2.setTamed(true);
          EntityCrowDisguiseJutsu3.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityCrowDisguiseJutsu3.setTamed(true);
          EntityCrowDisguiseJutsu4.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityCrowDisguiseJutsu4.setTamed(true);
          EntityCrowDisguiseJutsu5.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityCrowDisguiseJutsu5.setTamed(true);
          EntityCrowDisguiseJutsu6.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityCrowDisguiseJutsu6.setTamed(true);
          EntityCrowDisguiseJutsu7.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityCrowDisguiseJutsu7.setTamed(true);
          EntityCrowDisguiseJutsu8.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityCrowDisguiseJutsu8.setTamed(true);
          EntityCrowDisguiseJutsu9.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityCrowDisguiseJutsu9.setTamed(true);
          EntityCrowDisguiseJutsu10.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityCrowDisguiseJutsu10.setTamed(true);
          EntityCrowDisguiseJutsu12.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityCrowDisguiseJutsu12.setTamed(true);
          EntityCrowDisguiseJutsu13.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityCrowDisguiseJutsu13.setTamed(true);
          EntityCrowDisguiseJutsu11.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityCrowDisguiseJutsu11.setTamed(true);
          EntityCrowDisguiseJutsu14.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityCrowDisguiseJutsu14.setTamed(true);
          EntityCrowDisguiseJutsu15.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityCrowDisguiseJutsu15.setTamed(true);
          EntityCrowDisguiseJutsu16.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityCrowDisguiseJutsu16.setTamed(true);
          EntityCrowDisguiseJutsu17.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityCrowDisguiseJutsu17.setTamed(true);
          EntityCrowDisguiseJutsu18.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityCrowDisguiseJutsu18.setTamed(true);
          EntityCrowDisguiseJutsu19.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityCrowDisguiseJutsu19.setTamed(true);
          EntityCrowDisguiseJutsu20.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityCrowDisguiseJutsu20.setTamed(true);
          EntityCrowDisguiseJutsu21.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityCrowDisguiseJutsu21.setTamed(true);
          EntityCrowDisguiseJutsu22.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityCrowDisguiseJutsu22.setTamed(true);
          EntityCrowDisguiseJutsu23.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityCrowDisguiseJutsu23.setTamed(true);
          EntityCrowDisguiseJutsu.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityCrowDisguiseJutsu.rotationYawHead = EntityCrowDisguiseJutsu.rotationYaw;
          EntityCrowDisguiseJutsu.renderYawOffset = EntityCrowDisguiseJutsu.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu);
          EntityCrowDisguiseJutsu1.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityCrowDisguiseJutsu1.rotationYawHead = EntityCrowDisguiseJutsu1.rotationYaw;
          EntityCrowDisguiseJutsu1.renderYawOffset = EntityCrowDisguiseJutsu1.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu1);
          EntityCrowDisguiseJutsu2.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityCrowDisguiseJutsu2.rotationYawHead = EntityCrowDisguiseJutsu2.rotationYaw;
          EntityCrowDisguiseJutsu2.renderYawOffset = EntityCrowDisguiseJutsu2.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu2);
          EntityCrowDisguiseJutsu3.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityCrowDisguiseJutsu3.rotationYawHead = EntityCrowDisguiseJutsu3.rotationYaw;
          EntityCrowDisguiseJutsu3.renderYawOffset = EntityCrowDisguiseJutsu3.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu3);
          EntityCrowDisguiseJutsu4.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityCrowDisguiseJutsu4.rotationYawHead = EntityCrowDisguiseJutsu4.rotationYaw;
          EntityCrowDisguiseJutsu4.renderYawOffset = EntityCrowDisguiseJutsu4.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu4);
          EntityCrowDisguiseJutsu5.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityCrowDisguiseJutsu5.rotationYawHead = EntityCrowDisguiseJutsu5.rotationYaw;
          EntityCrowDisguiseJutsu5.renderYawOffset = EntityCrowDisguiseJutsu5.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu5);
          EntityCrowDisguiseJutsu6.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityCrowDisguiseJutsu6.rotationYawHead = EntityCrowDisguiseJutsu6.rotationYaw;
          EntityCrowDisguiseJutsu6.renderYawOffset = EntityCrowDisguiseJutsu6.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu6);
          EntityCrowDisguiseJutsu7.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityCrowDisguiseJutsu7.rotationYawHead = EntityCrowDisguiseJutsu7.rotationYaw;
          EntityCrowDisguiseJutsu7.renderYawOffset = EntityCrowDisguiseJutsu7.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu7);
          EntityCrowDisguiseJutsu8.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityCrowDisguiseJutsu8.rotationYawHead = EntityCrowDisguiseJutsu8.rotationYaw;
          EntityCrowDisguiseJutsu8.renderYawOffset = EntityCrowDisguiseJutsu8.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu8);
          EntityCrowDisguiseJutsu9.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityCrowDisguiseJutsu9.rotationYawHead = EntityCrowDisguiseJutsu9.rotationYaw;
          EntityCrowDisguiseJutsu9.renderYawOffset = EntityCrowDisguiseJutsu9.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu9);
          EntityCrowDisguiseJutsu10.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityCrowDisguiseJutsu10.rotationYawHead = EntityCrowDisguiseJutsu10.rotationYaw;
          EntityCrowDisguiseJutsu10.renderYawOffset = EntityCrowDisguiseJutsu10.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu10);
          EntityCrowDisguiseJutsu11.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityCrowDisguiseJutsu11.rotationYawHead = EntityCrowDisguiseJutsu11.rotationYaw;
          EntityCrowDisguiseJutsu11.renderYawOffset = EntityCrowDisguiseJutsu11.rotationYaw;
          EntityCrowDisguiseJutsu23.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityCrowDisguiseJutsu23.rotationYawHead = EntityCrowDisguiseJutsu23.rotationYaw;
          EntityCrowDisguiseJutsu23.renderYawOffset = EntityCrowDisguiseJutsu23.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu23);
          EntityCrowDisguiseJutsu12.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityCrowDisguiseJutsu12.rotationYawHead = EntityCrowDisguiseJutsu12.rotationYaw;
          EntityCrowDisguiseJutsu12.renderYawOffset = EntityCrowDisguiseJutsu12.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu12);
          EntityCrowDisguiseJutsu13.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityCrowDisguiseJutsu13.rotationYawHead = EntityCrowDisguiseJutsu13.rotationYaw;
          EntityCrowDisguiseJutsu13.renderYawOffset = EntityCrowDisguiseJutsu13.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu13);
          EntityCrowDisguiseJutsu14.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityCrowDisguiseJutsu14.rotationYawHead = EntityCrowDisguiseJutsu14.rotationYaw;
          EntityCrowDisguiseJutsu14.renderYawOffset = EntityCrowDisguiseJutsu14.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu14);
          EntityCrowDisguiseJutsu15.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityCrowDisguiseJutsu15.rotationYawHead = EntityCrowDisguiseJutsu15.rotationYaw;
          EntityCrowDisguiseJutsu15.renderYawOffset = EntityCrowDisguiseJutsu15.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu15);
          EntityCrowDisguiseJutsu16.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityCrowDisguiseJutsu16.rotationYawHead = EntityCrowDisguiseJutsu16.rotationYaw;
          EntityCrowDisguiseJutsu16.renderYawOffset = EntityCrowDisguiseJutsu16.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu16);
          EntityCrowDisguiseJutsu17.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityCrowDisguiseJutsu17.rotationYawHead = EntityCrowDisguiseJutsu17.rotationYaw;
          EntityCrowDisguiseJutsu17.renderYawOffset = EntityCrowDisguiseJutsu17.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu17);
          EntityCrowDisguiseJutsu18.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityCrowDisguiseJutsu18.rotationYawHead = EntityCrowDisguiseJutsu18.rotationYaw;
          EntityCrowDisguiseJutsu18.renderYawOffset = EntityCrowDisguiseJutsu18.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu18);
          EntityCrowDisguiseJutsu19.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityCrowDisguiseJutsu19.rotationYawHead = EntityCrowDisguiseJutsu19.rotationYaw;
          EntityCrowDisguiseJutsu19.renderYawOffset = EntityCrowDisguiseJutsu19.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu19);
          EntityCrowDisguiseJutsu20.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityCrowDisguiseJutsu20.rotationYawHead = EntityCrowDisguiseJutsu20.rotationYaw;
          EntityCrowDisguiseJutsu20.renderYawOffset = EntityCrowDisguiseJutsu20.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu20);
          EntityCrowDisguiseJutsu21.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityCrowDisguiseJutsu21.rotationYawHead = EntityCrowDisguiseJutsu21.rotationYaw;
          EntityCrowDisguiseJutsu21.renderYawOffset = EntityCrowDisguiseJutsu21.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu21);
          EntityCrowDisguiseJutsu22.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityCrowDisguiseJutsu22.rotationYawHead = EntityCrowDisguiseJutsu22.rotationYaw;
          EntityCrowDisguiseJutsu22.renderYawOffset = EntityCrowDisguiseJutsu22.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu22);
          entitycrow.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          entitycrow.setTamed(true);
          entitycrow.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          entitycrow.rotationYawHead = entitycrow.rotationYaw;
          entitycrow.renderYawOffset = entitycrow.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)entitycrow);
          entitycrow1.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          entitycrow1.setTamed(true);
          entitycrow1.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          entitycrow1.rotationYawHead = entitycrow1.rotationYaw;
          entitycrow1.renderYawOffset = entitycrow1.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)entitycrow1);
          Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.invisibility.id, 200, 10));
          Par1ItemStack.stackTagCompound.setInteger("counter", 200);
          props.consumeMana(5 + props.getNinjutsu() / 600);
        } else {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough chakra"));
        } 
      } else {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Sharingan needs to be active"));
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "Cast a Genjutsu that engulfs yourself in crows");
    par3List.add(EnumChatFormatting.RED + "Can only be used when Sharingan is active");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (5 + props.getNinjutsu() / 600));
  }
}

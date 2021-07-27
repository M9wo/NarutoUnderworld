package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Jutsu.EntitySnakeJutsu2;
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

public class BindingSnakeGlare extends JutsuItem {
  public BindingSnakeGlare() {
    setMaxDamage(9600);
    isDamageable();
    this.maxStackSize = 1;
  }
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName()) && Par1ItemStack.stackTagCompound.getInteger("counter") == 0) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getCurrentMana() >= 30 && props.getClanName().contains("Shirogane")) {
        EntitySnakeJutsu2 EntityBunshin = new EntitySnakeJutsu2(Par2World);
        EntitySnakeJutsu2 EntityBunshin1 = new EntitySnakeJutsu2(Par2World);
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
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Binding Snake Glare!"));
        Par1ItemStack.stackTagCompound.setInteger("counter", 1000);
        props.consumeMana(30);
        return Par1ItemStack;
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "Create 2 snakes that bind your opponent");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + '\036');
  }
}

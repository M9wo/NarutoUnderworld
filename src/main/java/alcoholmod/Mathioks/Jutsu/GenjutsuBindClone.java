package alcoholmod.Mathioks.Jutsu;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.JutsuItem;
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

public class GenjutsuBindClone extends JutsuItem {
  private boolean isinair;
  
  private Entity p_70085_1_;
  
  private Object worldObj;
  
  public GenjutsuBindClone() {
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
      if (props.getGenjutsu() < 15) {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Your Genjutsu needs to be at least 15"));
      } else if (props.getCurrentMana() >= 30) {
        EntityBindClone EntityBunshin = new EntityBindClone(Par2World);
        if (!Par2World.isRemote) {
          EntityBunshin.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin.setTamed(true);
          EntityBunshin.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 2.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin.rotationYawHead = EntityBunshin.rotationYaw;
          EntityBunshin.renderYawOffset = EntityBunshin.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin);
          EntityBunshin.HealthSet = true;
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Genjutsu: Bind Clone!"));
          props.consumeMana(30);
          Par1ItemStack.stackTagCompound.setInteger("counter", 300);
          return Par1ItemStack;
        } 
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    par3List.add(EnumChatFormatting.DARK_AQUA + "Create a clone of yourself that");
    par3List.add(EnumChatFormatting.DARK_AQUA + "binds the opponent by holding it");
    par3List.add(EnumChatFormatting.DARK_AQUA + "It doesn't follow the user");
    if (props.getGenjutsu() >= 15 && props.getGenjutsu() < 40) {
      par3List.add(EnumChatFormatting.GOLD + "Clone Health: 20");
      par3List.add(EnumChatFormatting.DARK_RED + "Genjutsu for next stage: 40");
    } 
    if (props.getGenjutsu() >= 40 && props.getGenjutsu() < 60) {
      par3List.add(EnumChatFormatting.GOLD + "Clone Health: 30");
      par3List.add(EnumChatFormatting.DARK_RED + "Genjutsu for next stage: 60");
    } 
    if (props.getGenjutsu() >= 60 && props.getGenjutsu() < 80) {
      par3List.add(EnumChatFormatting.GOLD + "Clone Health: 40");
      par3List.add(EnumChatFormatting.DARK_RED + "Genjutsu for next stage: 80");
    } 
    if (props.getGenjutsu() >= 80)
      par3List.add(EnumChatFormatting.GOLD + "Clone Health: 50"); 
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (30 + props.getGenjutsu() / 600));
  }
}

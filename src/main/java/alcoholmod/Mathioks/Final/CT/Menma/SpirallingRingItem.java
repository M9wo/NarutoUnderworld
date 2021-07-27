package alcoholmod.Mathioks.Final.CT.Menma;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.JutsuItem;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class SpirallingRingItem extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public SpirallingRingItem() {
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
      par1ItemStack.stackTagCompound.setInteger("kd", 0);
    } 
    if (par1ItemStack.stackTagCompound != null && par1ItemStack.stackTagCompound.getInteger("kd") > 0) {
      int counter = par1ItemStack.stackTagCompound.getInteger("kd");
      par1ItemStack.stackTagCompound.setInteger("kd", --counter);
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote)
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
        ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
        if (props.getCurrentMana() >= 60 + props.getNinjutsu() / 600) {
          if (Par1ItemStack.stackTagCompound.getInteger("kd") == 0) {
            Par1ItemStack.stackTagCompound.setInteger("kd", 400);
            Vec3 look = Par3EntityPlayer.getLookVec();
            SpirallingRingEntity fireball3 = new SpirallingRingEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
            fireball3.setPosition(Par3EntityPlayer.posX + look.xCoord * 5.0D, Par3EntityPlayer.posY + 2.0D + look.yCoord * 6.0D, Par3EntityPlayer.posZ + look.zCoord * 5.0D);
            fireball3.lastTickPosX = look.xCoord * 0.2D;
            fireball3.lastTickPosY = look.yCoord * 0.2D;
            fireball3.lastTickPosZ = look.zCoord * 0.2D;
            Par2World.spawnEntityInWorld((Entity)fireball3);
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Menma-Style: Spiralling Ring!!!"));
            props.consumeMana(60 + props.getNinjutsu() / 600);
          } 
        } else {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough chakra!"));
        } 
      } else {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You are not the owner of this jutsu"));
      }  
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    par3List.add(EnumChatFormatting.DARK_AQUA + "A jutsu apparently used by someone named");
    par3List.add(EnumChatFormatting.DARK_AQUA + "Menma, This jutsu does considerable damage");
    par3List.add(EnumChatFormatting.DARK_AQUA + "and explodes on impact");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (60 + props.getNinjutsu() / 600));
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: " + '(');
  }
}

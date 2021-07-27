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
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class RasenShurikenItem extends JutsuItem {
  public int counter = 0;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public RasenShurikenItem() {
    setMaxDamage(5100);
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName()) && Par1ItemStack.stackTagCompound.getInteger("counter") == 0) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getWindRelease() == 1)
        if (props.getCurrentMana() >= 85 + props.getNinjutsu() / 600) {
          Vec3 look = Par3EntityPlayer.getLookVec();
          RasenShurikenEntity fireball3 = new RasenShurikenEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
          fireball3.setPosition(Par3EntityPlayer.posX + look.xCoord * 5.0D, Par3EntityPlayer.posY + 2.0D + look.yCoord * 6.0D, Par3EntityPlayer.posZ + look.zCoord * 5.0D);
          fireball3.lastTickPosX = look.xCoord * 0.2D;
          fireball3.lastTickPosY = look.yCoord * 0.2D;
          fireball3.lastTickPosZ = look.zCoord * 0.2D;
          Par2World.spawnEntityInWorld((Entity)fireball3);
          Par1ItemStack.stackTagCompound.setInteger("counter", 200);
          props.consumeMana(85 + props.getNinjutsu() / 600);
        } else {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough chakra"));
        }  
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "A Legendary, Lethal technique");
    par3List.add(EnumChatFormatting.DARK_AQUA + "invented by Naruto Uzumaki");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (85 + props.getNinjutsu() / 600));
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: ??");
  }
}

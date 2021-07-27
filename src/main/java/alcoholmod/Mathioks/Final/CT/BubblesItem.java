package alcoholmod.Mathioks.Final.CT;

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

public class BubblesItem extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public BubblesItem() {
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote)
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
        ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
        if (props.getWaterRelease() == 1)
          if (props.getCurrentMana() >= 15 + props.getNinjutsu() / 600) {
            Vec3 look = Par3EntityPlayer.getLookVec();
            BubblesEntity fireball3 = new BubblesEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
            BubblesEntity fireball4 = new BubblesEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
            BubblesEntity fireball5 = new BubblesEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
            BubblesEntity fireball6 = new BubblesEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
            BubblesEntity fireball7 = new BubblesEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
            BubblesEntity fireball8 = new BubblesEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
            fireball6.setPositionAndRotation(Par3EntityPlayer.posX + 1.0D, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ + 1.0D, Par3EntityPlayer.rotationYaw + 60.0F, 0.0F);
            Par2World.spawnEntityInWorld((Entity)fireball6);
            fireball5.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 2.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
            Par2World.spawnEntityInWorld((Entity)fireball5);
            fireball4.setPositionAndRotation(Par3EntityPlayer.posX + 1.0D, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ + 1.0D, Par3EntityPlayer.rotationYaw, 0.0F);
            Par2World.spawnEntityInWorld((Entity)fireball4);
            fireball3.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ + 1.0D, Par3EntityPlayer.rotationYaw + 120.0F, 0.0F);
            Par2World.spawnEntityInWorld((Entity)fireball3);
            fireball7.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 2.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
            Par2World.spawnEntityInWorld((Entity)fireball7);
            fireball8.setPositionAndRotation(Par3EntityPlayer.posX + 1.0D, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw + 180.0F, 0.0F);
            Par2World.spawnEntityInWorld((Entity)fireball8);
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Water Release: Bubble Jutsu!!!"));
            props.consumeMana(15 + props.getNinjutsu() / 600);
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
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "A Water Release jutsu that creates");
    par3List.add(EnumChatFormatting.DARK_AQUA + "bubbles that slowdown anyone touching them");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (15 + props.getNinjutsu() / 600));
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: " + '\006');
  }
}

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

public class RinneganTengaiItem extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null) {
      if (par1ItemStack.stackTagCompound == null) {
        par1ItemStack.stackTagCompound = new NBTTagCompound();
        par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
        par1ItemStack.stackTagCompound.setInteger("counter", 0);
      } 
      int counter = par1ItemStack.stackTagCompound.getInteger("counter");
      if (counter > 0) {
        counter--;
        par1ItemStack.stackTagCompound.setInteger("counter", counter);
      } 
    } 
  }
  
  public RinneganTengaiItem() {
    setMaxDamage(5100);
    this.maxStackSize = 1;
  }
  
  protected float getGravityVelocity() {
    return 1.0F;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getrinnegan() == 1 && props.getSharinganSize() == 3.0D) {
        if (props.getCurrentMana() >= 1000 + props.getNinjutsu() / 50) {
          if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
            int counter = Par1ItemStack.stackTagCompound.getInteger("counter");
            if (counter == 0) {
              Vec3 look = Par3EntityPlayer.getLookVec();
              RinneganTengaiEntity fireball2 = new RinneganTengaiEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
              fireball2.setPosition(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 155.0D, Par3EntityPlayer.posZ);
              Par2World.spawnEntityInWorld((Entity)fireball2);
              props.consumeMana(1000 + props.getNinjutsu() / 50);
              counter = 200;
              Par1ItemStack.stackTagCompound.setInteger("counter", counter);
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Heaven Concealed: Tengai Shinsei!!!!"));
            } 
          } else {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You are not the owner of this item"));
          } 
        } else {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You don't have enough chakra"));
        } 
      } else {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You have not unlocked the Rinnegan yet"));
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null) {
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner"));
      par3List.add(EnumChatFormatting.AQUA + "Counter: " + par1ItemStack.stackTagCompound.getString("counter"));
    } 
    par3List.add(EnumChatFormatting.DARK_PURPLE + "A jutsu used by people who posess ");
    par3List.add(EnumChatFormatting.DARK_PURPLE + "the powers of the Rinnegan.");
    par3List.add(EnumChatFormatting.DARK_PURPLE + "Summons a meteor.");
    par3List.add(EnumChatFormatting.DARK_RED + "Chakra Cost: " + (1000 + props.getNinjutsu() / 50));
  }
}

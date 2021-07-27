package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Rinnegan.EntityLimbo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class RinneganLimbo extends JutsuItem {
  private boolean isinair;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
      par1ItemStack.stackTagCompound.setInteger("counter", 0);
    } 
    if (par1ItemStack.stackTagCompound != null && par1ItemStack.stackTagCompound.getInteger("counter") > 0) {
      int counter = par1ItemStack.stackTagCompound.getInteger("counter");
      par1ItemStack.stackTagCompound.setInteger("counter", --counter);
    } 
    if (par1ItemStack.getItemDamage() < par1ItemStack.getMaxDamage())
      par1ItemStack.setItemDamage(par1ItemStack.getItemDamage() - 1); 
    if (par5 && par3Entity instanceof EntityPlayer) {
      EntityPlayer entityplayer = (EntityPlayer)par3Entity;
      if (par1ItemStack.getItemDamage() > 0);
    } 
    if (par1ItemStack.getItemDamage() < par1ItemStack.getMaxDamage() && par3Entity instanceof EntityPlayer) {
      EntityPlayer entityplayer = (EntityPlayer)par3Entity;
      if (this.isinair)
        for (int cp = 0; cp <= 10; cp++) {
          double d0 = itemRand.nextGaussian() * 0.02D;
          double d1 = itemRand.nextGaussian() * 0.02D;
          double d2 = itemRand.nextGaussian() * 0.02D;
          double dx = entityplayer.posX;
          double dy = entityplayer.posY - 1.8D;
          double d3 = entityplayer.posZ;
        }  
    } 
  }
  
  public RinneganLimbo() {
    setMaxDamage(3700);
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getrinnegan() == 1 && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName()) && Par1ItemStack.stackTagCompound.getInteger("counter") == 0) {
        EntityLimbo entitilimbo = new EntityLimbo(Par2World);
        EntityLimbo entitilimbo1 = new EntityLimbo(Par2World);
        EntityLimbo entitilimbo2 = new EntityLimbo(Par2World);
        entitilimbo.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
        entitilimbo.setTamed(true);
        entitilimbo.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
        entitilimbo.rotationYawHead = entitilimbo.rotationYaw;
        entitilimbo.renderYawOffset = entitilimbo.rotationYaw;
        Par2World.spawnEntityInWorld((Entity)entitilimbo);
        entitilimbo1.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
        entitilimbo1.setTamed(true);
        entitilimbo1.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
        entitilimbo1.rotationYawHead = entitilimbo1.rotationYaw;
        entitilimbo1.renderYawOffset = entitilimbo1.rotationYaw;
        Par2World.spawnEntityInWorld((Entity)entitilimbo1);
        entitilimbo2.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
        entitilimbo2.setTamed(true);
        entitilimbo2.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
        entitilimbo2.rotationYawHead = entitilimbo2.rotationYaw;
        entitilimbo2.renderYawOffset = entitilimbo2.rotationYaw;
        Par2World.spawnEntityInWorld((Entity)entitilimbo2);
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Limbo: Border Jail !!!"));
        Par1ItemStack.stackTagCompound.setInteger("counter", 6000);
        props.consumeMana(500);
      } 
    } 
    return Par1ItemStack;
  }
}

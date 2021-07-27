package alcoholmod.Mathioks.Final.CT;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.JutsuItem;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class RinneganUnivPullItem extends JutsuItem {
  private boolean isinair;
  
  public int counter = 0;
  
  public int counter2 = 0;
  
  public int counter5 = 0;
  
  public int counter3 = 0;
  
  public int counter10 = 0;
  
  public boolean start = false;
  
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
    if (par5 && par3Entity != null) {
      EntityPlayer entityplayer = (EntityPlayer)par3Entity;
      if (par1ItemStack.getItemDamage() > 0);
    } 
    if (par1ItemStack.stackTagCompound.getInteger("counter") > 0 && par3Entity != null) {
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
  
  public RinneganUnivPullItem() {
    setMaxDamage(3700);
    isDamageable();
    this.maxStackSize = 1;
  }
  
  public void onUpdate1(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if (this.counter2 > 0)
      this.counter2--; 
    if (this.counter3 > 0)
      this.counter3--; 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getrinnegan() == 1 && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName()) && Par1ItemStack.stackTagCompound.getInteger("counter") == 0 && props.getCurrentMana() >= 1000) {
        RinneganUnivPullEntity UnivPull = new RinneganUnivPullEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
        UnivPull.ownerOfThis = Par3EntityPlayer.getUniqueID().toString();
        Par2World.spawnEntityInWorld((Entity)UnivPull);
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Chibaku - Universal Pull!!!"));
        Par1ItemStack.stackTagCompound.setInteger("counter", 12000);
        props.consumeMana(1000);
      } 
    } 
    return Par1ItemStack;
  }
}

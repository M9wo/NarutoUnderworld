package alcoholmod.Mathioks.Final.CT;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.JutsuItem;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityFallingBlock;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class SixPathsCTItem extends JutsuItem {
  private SixPathsCTEntity EntityCT;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
      par1ItemStack.stackTagCompound.setInteger("counter", 0);
      par1ItemStack.stackTagCompound.setInteger("counter2", 0);
      par1ItemStack.stackTagCompound.setInteger("counter3", 0);
      par1ItemStack.stackTagCompound.setInteger("counter5", 0);
      par1ItemStack.stackTagCompound.setInteger("counter10", 0);
      par1ItemStack.stackTagCompound.setBoolean("start", false);
    } 
    boolean start = par1ItemStack.stackTagCompound.getBoolean("start");
    int counter = par1ItemStack.stackTagCompound.getInteger("counter");
    int counter2 = par1ItemStack.stackTagCompound.getInteger("counter2");
    int counter3 = par1ItemStack.stackTagCompound.getInteger("counter3");
    int counter5 = par1ItemStack.stackTagCompound.getInteger("counter5");
    int counter10 = par1ItemStack.stackTagCompound.getInteger("counter10");
    if (start) {
      counter10++;
      par1ItemStack.stackTagCompound.setInteger("counter", counter);
      if (counter10 <= 2000 && counter10 >= 200 && !par2World.isRemote)
        for (int i = 0; i < 40; i++) {
          int cp = par2World.rand.nextInt(70);
          int angle = par2World.rand.nextInt(210);
          int x = MathHelper.floor_double(this.EntityCT.posX + cp * Math.sin(angle / 80.0D * 2.141592653589793D));
          int y = MathHelper.floor_double(this.EntityCT.posY);
          int z;
          for (z = MathHelper.floor_double(this.EntityCT.posZ + cp * Math.cos(angle / 80.0D * 2.141592653589793D)); par2World.isAirBlock(x, y, z); y--);
          if (par2World.isAirBlock(x, y + 1, z) && par2World.isAirBlock(x, y + 2, z) && par2World.isAirBlock(x, y + 3, z) && !par2World.isAirBlock(x, y, z)) {
            Block block = par2World.getBlock(x, y, z);
            int meta = par2World.getBlockMetadata(x, y, z);
            EntityFallingBlock entity = new EntityFallingBlock(par2World, x, y + 1.5D, z, block, meta);
            entity.motionY = 1.0D;
            par2World.spawnEntityInWorld((Entity)entity);
            if (par2World.getBlock(x, y, z) != Blocks.bedrock)
              par2World.setBlockToAir(x, y, z); 
          } 
        }  
    } 
    if (par1ItemStack.getItemDamage() < par1ItemStack.getMaxDamage())
      par1ItemStack.setItemDamage(par1ItemStack.getItemDamage() - 1); 
    if (par5 && par3Entity instanceof EntityPlayer) {
      EntityPlayer entityplayer = (EntityPlayer)par3Entity;
      if (par1ItemStack.getItemDamage() > 0);
    } 
    if (par1ItemStack.getItemDamage() < par1ItemStack.getMaxDamage() && par3Entity instanceof EntityPlayer) {
      EntityPlayer entityplayer = (EntityPlayer)par3Entity;
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
  
  public SixPathsCTItem() {
    setMaxDamage(3700);
    isDamageable();
    this.maxStackSize = 1;
  }
  
  public void onUpdate1(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    int counter = par1ItemStack.stackTagCompound.getInteger("counter");
    int counter2 = par1ItemStack.stackTagCompound.getInteger("counter2");
    int counter3 = par1ItemStack.stackTagCompound.getInteger("counter3");
    int counter5 = par1ItemStack.stackTagCompound.getInteger("counter5");
    int counter10 = par1ItemStack.stackTagCompound.getInteger("counter10");
    if (counter2 > 0) {
      counter2--;
      par1ItemStack.stackTagCompound.setInteger("counter2", counter2);
    } 
    if (counter3 > 0) {
      counter3--;
      par1ItemStack.stackTagCompound.setInteger("counter3", counter3);
    } 
  }
  
  public boolean hitEntity(ItemStack Par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase Par3EntityPlayer) {
    if (!Par3EntityPlayer.worldObj.isRemote) {
      EntityPlayer player = (EntityPlayer)Par3EntityPlayer;
      ExtendedPlayer props = ExtendedPlayer.get(player);
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
        if (props.getrinnegan() == 1)
          if (props.getCurrentMana() >= 4000) {
            if (!Par3EntityPlayer.worldObj.isRemote) {
              boolean start = Par1ItemStack.stackTagCompound.getBoolean("start");
              int counter = Par1ItemStack.stackTagCompound.getInteger("counter");
              int counter2 = Par1ItemStack.stackTagCompound.getInteger("counter2");
              int counter3 = Par1ItemStack.stackTagCompound.getInteger("counter3");
              int counter5 = Par1ItemStack.stackTagCompound.getInteger("counter5");
              int counter10 = Par1ItemStack.stackTagCompound.getInteger("counter10");
              this.EntityCT = new SixPathsCTEntity(Par3EntityPlayer.worldObj, Par3EntityPlayer, Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ);
              Par3EntityPlayer.worldObj.spawnEntityInWorld((Entity)this.EntityCT);
              start = true;
              Par1ItemStack.stackTagCompound.setBoolean("start", start);
              if (counter2 == 0) {
                ((EntityPlayer)Par3EntityPlayer).addChatComponentMessage((IChatComponent)new ChatComponentText("Six Paths - Chibaku Tensei!!!"));
                counter2 = 30;
                Par1ItemStack.stackTagCompound.setInteger("counter2", counter2);
              } 
              Par1ItemStack.damageItem(1800, Par3EntityPlayer);
              counter5 = 0;
              Par1ItemStack.stackTagCompound.setInteger("counter5", counter5);
              if (this.EntityCT != null);
              props.consumeMana(4000);
            } 
          } else {
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough chakra"));
          }  
      } else {
        player.addChatComponentMessage((IChatComponent)new ChatComponentText("You are not the owner of this Jutsu"));
      } 
    } 
    return false;
  }
}

package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class RinneganAlmightyPull extends JutsuItem {
  private boolean isinair;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public RinneganAlmightyPull() {
    setMaxDamage(3700);
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if (par1ItemStack.getItemDamage() < par1ItemStack.getMaxDamage())
      par1ItemStack.setItemDamage(par1ItemStack.getItemDamage() - 1); 
    if (par5 && par3Entity instanceof EntityPlayer) {
      EntityPlayer entityplayer = (EntityPlayer)par3Entity;
      if (par1ItemStack.getItemDamage() <= 0);
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
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
      int counter = Par1ItemStack.stackTagCompound.getInteger("counter");
      if (counter == 0) {
        EntityPlayer player = Par3EntityPlayer;
        ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
        if (props.getrinnegan() == 1 && props.getSharinganSize() == 3.0D) {
          if (props.getCurrentMana() >= 500 + props.getNinjutsu() / 150) {
            List<Entity> list = Par2World.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox(Par3EntityPlayer.posX - 10.0D, Par3EntityPlayer.posY - 10.0D, Par3EntityPlayer.posZ - 10.0D, Par3EntityPlayer.posX + 10.0D, Par3EntityPlayer.posY + 10.0D, Par3EntityPlayer.posZ + 10.0D));
            if (Par3EntityPlayer != null)
              for (int k2 = 0; k2 < list.size(); k2++) {
                Entity entity = list.get(k2);
                String user = Par3EntityPlayer.getUniqueID().toString();
                if (entity instanceof EntityLiving) {
                  double d0 = entity.getDistance(player.posX, player.posY, player.posZ);
                  if (d0 <= 15.0D && d0 > 3.0D) {
                    double dx = -entity.posX + player.posX;
                    double dy = -entity.posY + player.posY;
                    double dz = -entity.posZ + player.posZ;
                    entity.motionX += dx * 3.0D / d0;
                    entity.motionY += dy * 3.0D / d0 + 0.2D;
                    entity.motionZ += dz * 3.0D / d0;
                  } 
                  if (d0 <= 3.0D) {
                    entity.motionX = 0.0D;
                    entity.motionY = 0.0D;
                    entity.motionZ = 0.0D;
                    ((EntityLiving)entity).addPotionEffect(new PotionEffect(Potion.weakness.id, 30, 4));
                    ((EntityLiving)entity).addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 30, 4));
                  } 
                } 
                if (entity instanceof EntityPlayer) {
                  if (!entity.getUniqueID().toString().equals(user)) {
                    double d0 = entity.getDistance(player.posX, player.posY, player.posZ);
                    if (d0 <= 15.0D && d0 > 3.0D) {
                      double dx = -entity.posX + player.posX;
                      double dy = -entity.posY + player.posY;
                      double dz = -entity.posZ + player.posZ;
                      entity.motionX += dx * 3.0D / d0;
                      entity.motionY += dy * 3.0D / d0 + 0.2D;
                      entity.motionZ += dz * 3.0D / d0;
                    } 
                    if (d0 <= 3.0D) {
                      entity.motionX = 0.0D;
                      entity.motionY = 0.0D;
                      entity.motionZ = 0.0D;
                      ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.weakness.id, 30, 4));
                      ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 30, 4));
                    } 
                  } 
                } else {
                  double d0 = entity.getDistance(player.posX, player.posY, player.posZ);
                  if (d0 <= 15.0D && d0 > 3.0D) {
                    double dx = -entity.posX + player.posX;
                    double dy = -entity.posY + player.posY;
                    double dz = -entity.posZ + player.posZ;
                    entity.motionX += dx * 3.0D / d0;
                    entity.motionY += dy * 3.0D / d0 + 0.2D;
                    entity.motionZ += dz * 3.0D / d0;
                  } 
                  if (d0 <= 3.0D) {
                    entity.motionX = 0.0D;
                    entity.motionY = 0.0D;
                    entity.motionZ = 0.0D;
                  } 
                } 
              }  
            props.consumeMana(500 + props.getNinjutsu() / 150);
            counter = 1000;
            Par1ItemStack.stackTagCompound.setInteger("counter", counter);
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("Universal Pull!"));
          } else {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You don't have enough chakra"));
          } 
        } else {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You have not unlocked the Rinnegan yet"));
        } 
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
    par3List.add(EnumChatFormatting.DARK_PURPLE + "Pulls enemies in.");
    par3List.add(EnumChatFormatting.DARK_RED + "Chakra Cost: " + (500 + props.getNinjutsu() / 150));
  }
}

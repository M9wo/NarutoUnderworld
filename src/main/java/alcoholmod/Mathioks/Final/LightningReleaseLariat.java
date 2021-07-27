package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class LightningReleaseLariat extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
      par1ItemStack.stackTagCompound.setInteger("counter", 0);
      par1ItemStack.stackTagCompound.setBoolean("Ready", false);
    } 
    if (par1ItemStack.stackTagCompound != null) {
      EntityPlayer player = (EntityPlayer)par3Entity;
      ExtendedPlayer props = ExtendedPlayer.get(player);
      if (props.getCurrentMana() >= 30 + props.getNinjutsu() / 600 && !par1ItemStack.stackTagCompound.getBoolean("Ready"))
        par1ItemStack.stackTagCompound.setBoolean("Ready", true); 
      if (props.getCurrentMana() < 30 + props.getNinjutsu() / 600 && par1ItemStack.stackTagCompound.getBoolean("Ready"))
        par1ItemStack.stackTagCompound.setBoolean("Ready", false); 
      int counter = par1ItemStack.stackTagCompound.getInteger("counter");
      if (counter > 0) {
        counter--;
        par1ItemStack.stackTagCompound.setInteger("counter", counter);
        if (counter > 10) {
          if (((EntityPlayer)par3Entity).isInWater() || ((EntityPlayer)par3Entity).worldObj.getBlock(MathHelper.floor_double(((EntityPlayer)par3Entity).posX), MathHelper.floor_double(((EntityPlayer)par3Entity).posY - 0.2D - ((EntityPlayer)par3Entity).yOffset), MathHelper.floor_double(((EntityPlayer)par3Entity).posZ)) == Blocks.water) {
            List<Entity> list1 = par2World.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox(((EntityPlayer)par3Entity).posX - 10.0D, ((EntityPlayer)par3Entity).posY - 3.0D, ((EntityPlayer)par3Entity).posZ - 10.0D, ((EntityPlayer)par3Entity).posX + 10.0D, ((EntityPlayer)par3Entity).posY + 3.0D, ((EntityPlayer)par3Entity).posZ + 10.0D));
            if ((EntityPlayer)par3Entity != null)
              for (int k2 = 0; k2 < list1.size(); k2++) {
                if (!par2World.isRemote) {
                  Entity entity = list1.get(k2);
                  String user = ((EntityPlayer)par3Entity).getUniqueID().toString();
                  entity.getDistance(((EntityPlayer)par3Entity).posX, ((EntityPlayer)par3Entity).posY, ((EntityPlayer)par3Entity).posZ);
                  if (entity instanceof net.minecraft.entity.EntityLiving && entity instanceof EntityLivingBase)
                    ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 10, 2)); 
                  if (entity instanceof EntityPlayer && !entity.getUniqueID().toString().equals(user))
                    ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 10, 2)); 
                } 
              }  
          } 
          List<Entity> list = par2World.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox(player.posX - 2.0D, player.posY - 1.0D, player.posZ - 2.0D, player.posX + 2.0D, player.posY + 1.0D, player.posZ + 2.0D));
          if (player != null)
            for (int k2 = 0; k2 < list.size(); k2++) {
              if (!par2World.isRemote) {
                Entity entity = list.get(k2);
                String user = player.getUniqueID().toString();
                double d0 = entity.getDistance(player.posX, player.posY, player.posZ);
                if (entity instanceof net.minecraft.entity.EntityLiving && entity instanceof net.minecraft.entity.EntityLiving) {
                  entity.attackEntityFrom(DamageSource.causePlayerDamage(player), 10.0F + (int)props.getTaijutsu());
                  if (d0 <= 10.0D) {
                    double dx = entity.posX - player.posX;
                    double dy = entity.posY - player.posY;
                    double dz = entity.posZ - player.posZ;
                    entity.motionX += dx * 0.75D / d0;
                    entity.motionY += dy * 0.75D / d0 + 0.2D;
                    entity.motionZ += dz * 0.75D / d0;
                  } 
                } 
                if (entity instanceof EntityPlayer && !entity.getUniqueID().toString().equals(user)) {
                  entity.attackEntityFrom(DamageSource.causePlayerDamage(player), 10.0F + (int)props.getTaijutsu());
                  if (d0 <= 10.0D) {
                    double dx = entity.posX - player.posX;
                    double dy = entity.posY - player.posY;
                    double dz = entity.posZ - player.posZ;
                    entity.motionX += dx * 0.75D / d0;
                    entity.motionY += dy * 0.75D / d0 + 0.2D;
                    entity.motionZ += dz * 0.75D / d0;
                  } 
                } 
              } 
            }  
        } 
      } 
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (Par1ItemStack.stackTagCompound.getBoolean("Ready")) {
      int counter = Par1ItemStack.stackTagCompound.getInteger("counter");
      if (counter == 0) {
        ExtendedPlayer props1 = ExtendedPlayer.get(Par3EntityPlayer);
        if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName()) && props1.getLightningRelease() == 1 && props1.getCurrentMana() >= 30 + props1.getNinjutsu() / 600)
          Par3EntityPlayer.addVelocity(-Math.sin(Math.toRadians(Par3EntityPlayer.rotationYawHead)) * 6.0D, 0.0D, Math.cos(Math.toRadians(Par3EntityPlayer.rotationYawHead)) * 6.0D); 
        if (!Par2World.isRemote)
          if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
            ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
            if (props.getLightningRelease() == 1)
              if (props.getCurrentMana() >= 30 + props.getNinjutsu() / 600) {
                counter = 30;
                Par1ItemStack.stackTagCompound.setInteger("counter", counter);
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Lariat!"));
                props.consumeMana(30 + props.getNinjutsu() / 600);
              } else {
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough chakra"));
              }  
          } else {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Are not The owner of this Item"));
          }  
      } 
    } else if (!Par2World.isRemote) {
      Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough chakra"));
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "Damage your opponent by chopping");
    par3List.add(EnumChatFormatting.DARK_AQUA + "them in the throat with extreme speed");
    par3List.add(EnumChatFormatting.DARK_RED + "Chakra Cost: " + (30 + props.getNinjutsu() / 600));
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: " + (10 + (int)props.getTaijutsu()));
  }
}

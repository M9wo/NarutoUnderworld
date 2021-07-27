package alcoholmod.Mathioks.Taijutsu;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.JutsuItem;
import alcoholmod.Mathioks.NickModels.NightGuyEntity;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
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
import net.minecraft.world.World;

public class NightGuy extends JutsuItem {
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
    if (par1ItemStack.stackTagCompound != null) {
      int counter = par1ItemStack.stackTagCompound.getInteger("counter");
      if (counter > 0) {
        if (counter <= 6850 && counter >= 6840)
          ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.harm.id, 1000, 4)); 
        counter--;
        par1ItemStack.stackTagCompound.setInteger("counter", counter);
        if (counter > 6960) {
          for (int i = 0; i < 400; i++) {
            double d2 = ((EntityPlayer)par3Entity).worldObj.rand.nextGaussian() * 0.02D;
            double d0d = ((EntityPlayer)par3Entity).worldObj.rand.nextGaussian() * 0.02D;
            double d1 = ((EntityPlayer)par3Entity).worldObj.rand.nextGaussian() * 0.02D;
            ((EntityPlayer)par3Entity).worldObj.spawnParticle("witchMagic", ((EntityPlayer)par3Entity).posX + (((EntityPlayer)par3Entity).worldObj.rand.nextFloat() * ((EntityPlayer)par3Entity).width * 2.0F) - ((EntityPlayer)par3Entity).width, ((EntityPlayer)par3Entity).posY - 1.0D + (((EntityPlayer)par3Entity).worldObj.rand.nextFloat() * ((EntityPlayer)par3Entity).height), ((EntityPlayer)par3Entity).posZ + (((EntityPlayer)par3Entity).worldObj.rand.nextFloat() * ((EntityPlayer)par3Entity).width * 2.0F) - ((EntityPlayer)par3Entity).width, d2, d0d, d1);
            ((EntityPlayer)par3Entity).worldObj.spawnParticle("witchMagic", ((EntityPlayer)par3Entity).posX + (((EntityPlayer)par3Entity).worldObj.rand.nextFloat() * ((EntityPlayer)par3Entity).width * 2.0F) - ((EntityPlayer)par3Entity).width, ((EntityPlayer)par3Entity).posY - 2.0D + (((EntityPlayer)par3Entity).worldObj.rand.nextFloat() * ((EntityPlayer)par3Entity).height), ((EntityPlayer)par3Entity).posZ + (((EntityPlayer)par3Entity).worldObj.rand.nextFloat() * ((EntityPlayer)par3Entity).width * 2.0F) - ((EntityPlayer)par3Entity).width, d2, d0d, d1);
          } 
          EntityPlayer player = (EntityPlayer)par3Entity;
          ExtendedPlayer props = ExtendedPlayer.get(player);
          List<Entity> list = par2World.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox(player.posX - 2.0D, player.posY - 1.0D, player.posZ - 2.0D, player.posX + 2.0D, player.posY + 1.0D, player.posZ + 2.0D));
          if (player != null)
            for (int k2 = 0; k2 < list.size(); k2++) {
              if (!par2World.isRemote) {
                Entity entity = list.get(k2);
                String user = player.getUniqueID().toString();
                double d0 = entity.getDistance(player.posX, player.posY, player.posZ);
                if (entity instanceof net.minecraft.entity.EntityLiving && entity instanceof net.minecraft.entity.EntityLiving) {
                  entity.attackEntityFrom(DamageSource.causePlayerDamage(player), 400.0F + (int)props.getTaijutsu());
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
                  entity.attackEntityFrom(DamageSource.causePlayerDamage(player), 400.0F + (int)props.getTaijutsu());
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
    int counter = Par1ItemStack.stackTagCompound.getInteger("counter");
    if (counter == 0 && 
      !Par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName()) && props.getClanName().contains("Lee")) {
        if (props.getEightGatesStage() >= 8) {
          NightGuyEntity fireball2 = new NightGuyEntity(Par2World);
          fireball2.setPosition(Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ);
          fireball2.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          fireball2.setTamed(true);
          Par2World.spawnEntityInWorld((Entity)fireball2);
          Par3EntityPlayer.addVelocity(-Math.sin(Math.toRadians(Par3EntityPlayer.rotationYawHead)) * 6.0D, 0.0D, Math.cos(Math.toRadians(Par3EntityPlayer.rotationYawHead)) * 6.0D);
          counter = 7000;
          Par1ItemStack.stackTagCompound.setInteger("counter", counter);
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Night Guy!!!"));
        } else {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You need to have the Gate of Death open"));
        } 
      } else {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Are not The owner of this Item"));
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null) {
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner"));
      par3List.add(EnumChatFormatting.AQUA + "Counter: " + par1ItemStack.stackTagCompound.getInteger("counter"));
    } 
    par3List.add(EnumChatFormatting.DARK_AQUA + "A forbidden taijutsu of the highest");
    par3List.add(EnumChatFormatting.DARK_AQUA + "level. Creates such an impact that");
    par3List.add(EnumChatFormatting.DARK_AQUA + "it shatters whatever the user");
    par3List.add(EnumChatFormatting.DARK_AQUA + "comes in contact with,");
    par3List.add(EnumChatFormatting.DARK_AQUA + "along with the user.");
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: " + (160 + (int)props.getTaijutsu()));
  }
}

package alcoholmod.Mathioks.HolidayEvents.Easter2018;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.JutsuItem;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Calendar;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class Easter2018Taijutsu extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
      par1ItemStack.stackTagCompound.setInteger("counter", 0);
      Calendar calendar = par3Entity.worldObj.getCurrentDate();
      if (calendar.get(2) + 1 == 3 && calendar.get(5) >= 30)
        par1ItemStack.stackTagCompound.setInteger("Obtained", 1); 
      if (calendar.get(2) + 1 == 4 && calendar.get(5) >= 1 && calendar.get(5) <= 9)
        par1ItemStack.stackTagCompound.setInteger("Obtained", 1); 
    } 
    if (par1ItemStack.stackTagCompound != null) {
      int counter = par1ItemStack.stackTagCompound.getInteger("counter");
      if (counter > 0) {
        counter--;
        par1ItemStack.stackTagCompound.setInteger("counter", counter);
        if (counter > 950) {
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
                  entity.attackEntityFrom(DamageSource.causePlayerDamage(player), 5.0F + (int)props.getTaijutsu());
                  par2World.createExplosion(par3Entity, par3Entity.posX, par3Entity.posY, par3Entity.posZ, 1.0F, false);
                  if (d0 <= 8.0D) {
                    double dx = entity.posX - player.posX;
                    double dy = entity.posY - player.posY;
                    double dz = entity.posZ - player.posZ;
                    entity.motionX += dx * 0.75D / d0;
                    entity.motionY += dy * 0.75D / d0 + 0.2D;
                    entity.motionZ += dz * 0.75D / d0;
                  } 
                } 
                if (entity instanceof EntityPlayer && !entity.getUniqueID().toString().equals(user)) {
                  entity.attackEntityFrom(DamageSource.causePlayerDamage(player), 5.0F + (int)props.getTaijutsu());
                  par2World.createExplosion(par3Entity, par3Entity.posX, par3Entity.posY, par3Entity.posZ, 1.0F, false);
                  if (d0 <= 8.0D) {
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
    if (counter == 0) {
      Par3EntityPlayer.addVelocity(-Math.sin(Math.toRadians(Par3EntityPlayer.rotationYawHead)) * 8.0D, 0.0D, Math.cos(Math.toRadians(Par3EntityPlayer.rotationYawHead)) * 8.0D);
      if (!Par2World.isRemote)
        if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
          if (Par1ItemStack.stackTagCompound.getInteger("Obtained") == 1) {
            counter = 1000;
            Par1ItemStack.stackTagCompound.setInteger("counter", counter);
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Taijutsu: TamaGO!"));
          } else {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You can only use this jutsu if you obtained it during the Easter Event"));
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "A Taijutsu used by Kurousagi.");
    par3List.add(EnumChatFormatting.DARK_AQUA + "Attack the opponent with a frontal kick");
    par3List.add(EnumChatFormatting.DARK_AQUA + "and push an explosive egg into them that");
    par3List.add(EnumChatFormatting.DARK_AQUA + "also pushes them back.");
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: 5 + Explosion");
  }
}

package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
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

public class JouganPush extends JutsuItem {
  private boolean isinair;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
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
  
  public JouganPush() {
    setMaxDamage(3700);
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
      int counter = Par1ItemStack.stackTagCompound.getInteger("counter");
      if (counter == 0) {
        EntityPlayer player = Par3EntityPlayer;
        ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
        if (props.getJougan() >= 1 && props.getJouganActive()) {
          if (props.getCurrentMana() >= 60 + props.getNinjutsu() / 200) {
            List<Entity> list = Par2World.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox(Par3EntityPlayer.posX - 10.0D, Par3EntityPlayer.posY - 10.0D, Par3EntityPlayer.posZ - 10.0D, Par3EntityPlayer.posX + 10.0D, Par3EntityPlayer.posY + 10.0D, Par3EntityPlayer.posZ + 10.0D));
            if (Par3EntityPlayer != null)
              for (int k2 = 0; k2 < list.size(); k2++) {
                Entity entity = list.get(k2);
                String user = Par3EntityPlayer.getUniqueID().toString();
                if (entity instanceof net.minecraft.entity.EntityLiving) {
                  double d0 = entity.getDistance(player.posX, player.posY, player.posZ);
                  entity.attackEntityFrom(DamageSource.causePlayerDamage(Par3EntityPlayer), 1.0F);
                  if (d0 <= 4.0D) {
                    double dx = entity.posX - player.posX;
                    double dy = entity.posY - player.posY;
                    double dz = entity.posZ - player.posZ;
                    entity.motionX += dx * 1.75D / d0;
                    entity.motionY += dy * 1.75D / d0 + 0.3D;
                    entity.motionZ += dz * 1.75D / d0;
                  } 
                } 
                if (entity instanceof EntityPlayer) {
                  if (!entity.getUniqueID().toString().equals(user)) {
                    double d0 = entity.getDistance(player.posX, player.posY, player.posZ);
                    entity.attackEntityFrom(DamageSource.causePlayerDamage(Par3EntityPlayer), 1.0F);
                    if (d0 <= 4.0D) {
                      double dx = entity.posX - player.posX;
                      double dy = entity.posY - player.posY;
                      double dz = entity.posZ - player.posZ;
                      entity.motionX += dx * 1.75D / d0;
                      entity.motionY += dy * 1.75D / d0 + 0.3D;
                      entity.motionZ += dz * 1.75D / d0;
                    } 
                  } 
                } else {
                  double d0 = entity.getDistance(player.posX, player.posY, player.posZ);
                  if (d0 <= 4.0D) {
                    double dx = entity.posX - player.posX;
                    double dy = entity.posY - player.posY;
                    double dz = entity.posZ - player.posZ;
                    entity.motionX += dx * 1.75D / d0;
                    entity.motionY += dy * 1.75D / d0 + 0.3D;
                    entity.motionZ += dz * 1.75D / d0;
                  } 
                } 
              }  
            props.consumeMana(60 + props.getNinjutsu() / 200);
            counter = 220;
            Par1ItemStack.stackTagCompound.setInteger("counter", counter);
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("Chakra Push!"));
          } else {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You don't have enough chakra"));
          } 
        } else {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You must have the Jougan active to use this jutsu"));
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "A jutsu used by people who posess ");
    par3List.add(EnumChatFormatting.DARK_AQUA + "the powers of the Jougan.");
    par3List.add(EnumChatFormatting.DARK_AQUA + "Pushes enemies back.");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (60 + props.getNinjutsu() / 200));
  }
}

package alcoholmod.Mathioks.Kinjutsu;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.JutsuItem;
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

public class ChakraThreads extends JutsuItem {
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
        par1ItemStack.stackTagCompound.setInteger("stage", 0);
        par1ItemStack.stackTagCompound.setInteger("particles", 0);
        par1ItemStack.stackTagCompound.setInteger("damageCounter", 0);
        par1ItemStack.stackTagCompound.setString("Target", "");
        par1ItemStack.stackTagCompound.setInteger("On", 0);
        par1ItemStack.stackTagCompound.setDouble("UserHealth", 0.0D);
        par1ItemStack.stackTagCompound.setDouble("TargetHealth", 0.0D);
      } 
      if (par1ItemStack.stackTagCompound != null) {
        EntityPlayer player = (EntityPlayer)par3Entity;
        ExtendedPlayer props = ExtendedPlayer.get(player);
        if (par1ItemStack.stackTagCompound.getInteger("On") == 1 && par1ItemStack.stackTagCompound.getString("Owner") != null && ((EntityPlayer)par3Entity).getHealth() != par1ItemStack.stackTagCompound.getDouble("UserHealth"))
          if (((EntityPlayer)par3Entity).getHealth() - par1ItemStack.stackTagCompound.getDouble("UserHealth") < 0.0D) {
            List<Entity> list = par2World.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox(par3Entity.posX - 20.0D, par3Entity.posY - 20.0D, par3Entity.posZ - 20.0D, par3Entity.posX + 20.0D, par3Entity.posY + 20.0D, par3Entity.posZ + 20.0D));
            if (player != null)
              for (int k2 = 0; k2 < list.size(); k2++) {
                if (!par2World.isRemote) {
                  Entity entity = list.get(k2);
                  String user = par3Entity.getUniqueID().toString();
                  entity.getDistance(par3Entity.posX, par3Entity.posY, par3Entity.posZ);
                  if (entity instanceof net.minecraft.entity.EntityLiving && entity instanceof net.minecraft.entity.EntityLivingBase && entity.getCommandSenderName().toString().equals(par1ItemStack.stackTagCompound.getString("Target"))) {
                    entity.attackEntityFrom(DamageSource.causePlayerDamage(player), (float)(par1ItemStack.stackTagCompound.getDouble("UserHealth") - ((EntityPlayer)par3Entity).getHealth()));
                    par1ItemStack.stackTagCompound.setDouble("UserHealth", ((EntityPlayer)par3Entity).getHealth());
                  } 
                  if (entity instanceof EntityPlayer && 
                    !entity.getUniqueID().toString().equals(user) && entity.getCommandSenderName().toString().equals(par1ItemStack.stackTagCompound.getString("Target"))) {
                    entity.attackEntityFrom(DamageSource.causePlayerDamage(player), (float)(par1ItemStack.stackTagCompound.getDouble("UserHealth") - ((EntityPlayer)par3Entity).getHealth()));
                    par1ItemStack.stackTagCompound.setDouble("UserHealth", ((EntityPlayer)par3Entity).getHealth());
                  } 
                } 
              }  
          } else {
            par1ItemStack.stackTagCompound.setDouble("UserHealth", ((EntityPlayer)par3Entity).getHealth());
          }  
      } 
    } 
  }
  
  public ChakraThreads() {
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote)
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
        EntityPlayer player = Par3EntityPlayer;
        ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
        if (Par1ItemStack.stackTagCompound.getInteger("On") == 0) {
          if (props.getCurrentMana() >= 50) {
            if (props.getKinjutsu() >= 40) {
              List<Entity> list = Par2World.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox(Par3EntityPlayer.posX - 3.0D, Par3EntityPlayer.posY - 3.0D, Par3EntityPlayer.posZ - 3.0D, Par3EntityPlayer.posX + 3.0D, Par3EntityPlayer.posY + 3.0D, Par3EntityPlayer.posZ + 3.0D));
              if (Par3EntityPlayer != null)
                for (int k2 = 0; k2 < list.size(); k2++) {
                  if (!Par2World.isRemote) {
                    Entity entity = list.get(k2);
                    String user = Par3EntityPlayer.getUniqueID().toString();
                    entity.getDistance(player.posX, player.posY, player.posZ);
                    if (entity instanceof net.minecraft.entity.EntityLiving && entity instanceof net.minecraft.entity.EntityLivingBase) {
                      Par1ItemStack.stackTagCompound.setString("Target", entity.getCommandSenderName().toString());
                      Par1ItemStack.stackTagCompound.setDouble("UserHealth", Par3EntityPlayer.getHealth());
                      Par1ItemStack.stackTagCompound.setInteger("On", 1);
                      player.addChatComponentMessage((IChatComponent)new ChatComponentText("Forbidden Jutsu: Chakra Threads!"));
                    } 
                    if (entity instanceof EntityPlayer && !entity.getUniqueID().toString().equals(user)) {
                      Par1ItemStack.stackTagCompound.setString("Target", entity.getCommandSenderName().toString());
                      Par1ItemStack.stackTagCompound.setDouble("UserHealth", Par3EntityPlayer.getHealth());
                      Par1ItemStack.stackTagCompound.setInteger("On", 1);
                      player.addChatComponentMessage((IChatComponent)new ChatComponentText("Forbidden Jutsu: Chakra Threads!"));
                    } 
                    props.consumeMana(50);
                  } 
                }  
            } 
          } else {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough chakra"));
          } 
        } else {
          Par1ItemStack.stackTagCompound.setInteger("On", 0);
          Par1ItemStack.stackTagCompound.setString("Target", "");
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Forbidden Jutsu: Chakra Threads-Off"));
        } 
      } else {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Are not The owner of this Item"));
      }  
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "A Kinjutsu passed down by");
    par3List.add(EnumChatFormatting.DARK_AQUA + "the Fuhma clan.");
    par3List.add(EnumChatFormatting.DARK_AQUA + "Creates an unbreakable chakra");
    par3List.add(EnumChatFormatting.DARK_AQUA + "thread between the user and enemy's");
    par3List.add(EnumChatFormatting.DARK_AQUA + "hearts, resulting in all damage caused");
    par3List.add(EnumChatFormatting.DARK_AQUA + "to the user to be inflicted to the");
    par3List.add(EnumChatFormatting.DARK_AQUA + "opponent aswell as long as they are");
    par3List.add(EnumChatFormatting.DARK_AQUA + "within a 20 block radius.");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: 50");
    par3List.add(EnumChatFormatting.DARK_RED + "Kinjutsu needed: 40");
  }
}

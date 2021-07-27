package alcoholmod.Mathioks.Final.ClanJutsu;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.JutsuItem;
import alcoholmod.Mathioks.Jutsu.EntityBeastClone;
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
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class InuzukaBeastHumanClone extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public InuzukaBeastHumanClone() {
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
      par1ItemStack.stackTagCompound.setDouble("locX", 0.0D);
      par1ItemStack.stackTagCompound.setDouble("locY", 0.0D);
      par1ItemStack.stackTagCompound.setDouble("locZ", 0.0D);
      par1ItemStack.stackTagCompound.setInteger("counter", 0);
    } 
    if (par1ItemStack.stackTagCompound != null && par1ItemStack.stackTagCompound.getInteger("counter") > 0) {
      int counter = par1ItemStack.stackTagCompound.getInteger("counter");
      par1ItemStack.stackTagCompound.setInteger("counter", --counter);
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getInteger("counter") == 0)
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
        EntityPlayer player = Par3EntityPlayer;
        ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
        if (props.getClanName().contains("Inuzuka"))
          if (props.getCurrentMana() >= 25 + props.getNinjutsu() / 600) {
            List<Entity> list = Par2World.getEntitiesWithinAABB(InuzukaEntityKuromaru.class, AxisAlignedBB.getBoundingBox(Par3EntityPlayer.posX - 15.0D, Par3EntityPlayer.posY - 15.0D, Par3EntityPlayer.posZ - 15.0D, Par3EntityPlayer.posX + 15.0D, Par3EntityPlayer.posY + 15.0D, Par3EntityPlayer.posZ + 15.0D));
            List<Entity> list2 = Par2World.getEntitiesWithinAABB(InuzukaEntityAkamaru.class, AxisAlignedBB.getBoundingBox(Par3EntityPlayer.posX - 15.0D, Par3EntityPlayer.posY - 15.0D, Par3EntityPlayer.posZ - 15.0D, Par3EntityPlayer.posX + 15.0D, Par3EntityPlayer.posY + 15.0D, Par3EntityPlayer.posZ + 15.0D));
            int k2;
            for (k2 = 0; k2 < list.size(); k2++) {
              Entity entity2 = list.get(k2);
              String user = player.getUniqueID().toString();
              entity2.getDistance(player.posX, player.posY, player.posZ);
              if (entity2 instanceof InuzukaEntityKuromaru && ((InuzukaEntityKuromaru)entity2).getOwner() != null && ((InuzukaEntityKuromaru)entity2).getOwner().getCommandSenderName().toString().equals(Par1ItemStack.stackTagCompound.getString("Owner"))) {
                EntityBeastClone EntityBunshin = new EntityBeastClone(Par2World);
                EntityBunshin.ticksExisted = 0;
                EntityBunshin.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
                EntityBunshin.setTamed(true);
                EntityBunshin.setHealth(((InuzukaEntityKuromaru)entity2).getHealth());
                EntityBunshin.name = ((InuzukaEntityKuromaru)entity2).getCustomNameTag();
                EntityBunshin.kind = 2;
                EntityBunshin.skin = ((InuzukaEntityKuromaru)entity2).getTameSkin();
                EntityBunshin.setPositionAndRotation(entity2.posX, entity2.posY + 2.0D, entity2.posZ, entity2.rotationYaw, 0.0F);
                EntityBunshin.rotationYawHead = EntityBunshin.rotationYaw;
                EntityBunshin.renderYawOffset = EntityBunshin.rotationYaw;
                Par2World.spawnEntityInWorld((Entity)EntityBunshin);
                entity2.setDead();
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Inuzuka Style: Beast Human Clone Technique!!"));
                props.consumeMana(25 + props.getNinjutsu() / 600);
                Par1ItemStack.stackTagCompound.setInteger("counter", 300);
              } 
            } 
            for (k2 = 0; k2 < list2.size(); k2++) {
              Entity entity2 = list2.get(k2);
              String user = player.getUniqueID().toString();
              entity2.getDistance(player.posX, player.posY, player.posZ);
              if (entity2 instanceof InuzukaEntityAkamaru && ((InuzukaEntityAkamaru)entity2).getOwner() != null && ((InuzukaEntityAkamaru)entity2).getOwner().getCommandSenderName().toString().equals(Par1ItemStack.stackTagCompound.getString("Owner"))) {
                EntityBeastClone EntityBunshin = new EntityBeastClone(Par2World);
                EntityBunshin.ticksExisted = 0;
                EntityBunshin.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
                EntityBunshin.setTamed(true);
                EntityBunshin.setHealth(((InuzukaEntityAkamaru)entity2).getHealth());
                EntityBunshin.name = ((InuzukaEntityAkamaru)entity2).getCustomNameTag();
                EntityBunshin.kind = 1;
                EntityBunshin.skin = ((InuzukaEntityAkamaru)entity2).getTameSkin();
                EntityBunshin.setPositionAndRotation(entity2.posX, entity2.posY + 2.0D, entity2.posZ, entity2.rotationYaw, 0.0F);
                EntityBunshin.rotationYawHead = EntityBunshin.rotationYaw;
                EntityBunshin.renderYawOffset = EntityBunshin.rotationYaw;
                Par2World.spawnEntityInWorld((Entity)EntityBunshin);
                entity2.setDead();
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Inuzuka Style: Beast Human Clone Technique!!"));
                props.consumeMana(25 + props.getNinjutsu() / 600);
                Par1ItemStack.stackTagCompound.setInteger("counter", 300);
              } 
            } 
          } else {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough chakra!"));
          }  
      } else {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You are not the owner of this jutsu"));
      }  
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "A jutsu used by members of the Inuzuka clan");
    par3List.add(EnumChatFormatting.DARK_AQUA + "transforming their trusty dog companion");
    par3List.add(EnumChatFormatting.DARK_AQUA + "into a clone of themselves to increase");
    par3List.add(EnumChatFormatting.DARK_AQUA + "after which both user and partner attack the opponent");
    par3List.add(EnumChatFormatting.DARK_AQUA + "in a perfect ferocious tag-team combination");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (25 + props.getNinjutsu() / 600));
    par3List.add(EnumChatFormatting.DARK_RED + "Duration: 90 seconds");
  }
}

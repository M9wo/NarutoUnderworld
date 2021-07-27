package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Jutsu.EntitySnakeJutsu;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class TwinSnakesMutualDeathTechnique extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
      par1ItemStack.stackTagCompound.setInteger("counter", 0);
      par1ItemStack.stackTagCompound.setInteger("counterTime", 0);
    } 
    if (par1ItemStack.stackTagCompound != null && !par2World.isRemote) {
      int counter = par1ItemStack.stackTagCompound.getInteger("counter");
      if (counter >= 1) {
        int counterTime = par1ItemStack.stackTagCompound.getInteger("counterTime");
        counterTime++;
        par1ItemStack.stackTagCompound.setInteger("counterTime", counterTime);
        if (counterTime >= 100) {
          counter = 0;
          par1ItemStack.stackTagCompound.setInteger("counter", counter);
          counterTime = 0;
          par1ItemStack.stackTagCompound.setInteger("counterTime", counterTime);
          ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText("Preparation failed"));
        } 
      } 
      if (counter == 5);
    } 
  }
  
  public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
    if (!player.worldObj.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(player);
      if (stack.stackTagCompound.getString("Owner").equals(player.getCommandSenderName()) && props.getClanName().contains("Shirogane")) {
        int counter = stack.stackTagCompound.getInteger("counter");
        int counterTime = stack.stackTagCompound.getInteger("counterTime");
        if (counter < 5) {
          counter++;
          stack.stackTagCompound.setInteger("counter", counter);
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("Preparation " + counter));
        } 
        if (counter == 5)
          if (props.getCurrentMana() >= 100) {
            if (entity instanceof EntityLivingBase) {
              EntitySnakeJutsu EntityBunshin = new EntitySnakeJutsu(player.worldObj);
              EntitySnakeJutsu EntityBunshin1 = new EntitySnakeJutsu(player.worldObj);
              EntityBunshin.func_152115_b(player.getUniqueID().toString());
              EntityBunshin.setTamed(true);
              EntityBunshin.Death = true;
              EntityBunshin.setPositionAndRotation(player.posX, player.posY + 1.0D, player.posZ, player.rotationYaw, 0.0F);
              EntityBunshin.rotationYawHead = EntityBunshin.rotationYaw;
              EntityBunshin.renderYawOffset = EntityBunshin.rotationYaw;
              player.worldObj.spawnEntityInWorld((Entity)EntityBunshin);
              EntityBunshin1.func_152115_b(player.getUniqueID().toString());
              EntityBunshin1.setTamed(true);
              EntityBunshin1.Death = true;
              EntityBunshin1.setPositionAndRotation(player.posX, player.posY + 1.0D, player.posZ, player.rotationYaw, 0.0F);
              EntityBunshin1.rotationYawHead = EntityBunshin1.rotationYaw;
              EntityBunshin1.renderYawOffset = EntityBunshin1.rotationYaw;
              player.worldObj.spawnEntityInWorld((Entity)EntityBunshin1);
              ((EntityLivingBase)entity).attackEntityFrom(DamageSource.generic, 30.0F);
              player.attackEntityFrom(DamageSource.generic, 30.0F);
              counter = 0;
              stack.stackTagCompound.setInteger("counter", counter);
              counterTime = 0;
              stack.stackTagCompound.setInteger("counterTime", counterTime);
            } 
            props.consumeMana(100);
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("Twin Snakes Mutual Death Technique!!"));
          } else {
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("Your chakra is not high enough"));
          }  
      } else {
        player.addChatComponentMessage((IChatComponent)new ChatComponentText("You Are not The owner of this Item"));
      } 
    } 
    return true;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "An extremely powerful ninjutsu");
    par3List.add(EnumChatFormatting.DARK_AQUA + "that creates 2 snakes that bite");
    par3List.add(EnumChatFormatting.DARK_AQUA + "eachother, then explode and inflict");
    par3List.add(EnumChatFormatting.DARK_AQUA + "30 damage to both enemy and user");
    par3List.add(EnumChatFormatting.DARK_AQUA + "(Left click entity, needs 5 preparations)");
    par3List.add(EnumChatFormatting.DARK_RED + "Chakra: 100");
  }
}

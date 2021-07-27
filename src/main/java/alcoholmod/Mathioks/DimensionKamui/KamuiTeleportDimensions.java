package alcoholmod.Mathioks.DimensionKamui;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.JutsuItem;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

public class KamuiTeleportDimensions extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
      par1ItemStack.stackTagCompound.setInteger("counter", 0);
      par1ItemStack.stackTagCompound.setInteger("Teleported", 0);
      par1ItemStack.stackTagCompound.setDouble("RealWorldX", 0.0D);
      par1ItemStack.stackTagCompound.setDouble("RealWorldY", 0.0D);
      par1ItemStack.stackTagCompound.setDouble("RealWorldZ", 0.0D);
      par1ItemStack.stackTagCompound.setDouble("KamuiWorldX", 0.0D);
      par1ItemStack.stackTagCompound.setDouble("KamuiWorldY", 0.0D);
      par1ItemStack.stackTagCompound.setDouble("KamuiWorldZ", 0.0D);
    } 
    if (par1ItemStack.stackTagCompound != null)
      par1ItemStack.stackTagCompound.getInteger("counter");
  }
  
  public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3) {
    Side side = FMLCommonHandler.instance().getEffectiveSide();
    if (side == Side.SERVER && var3 instanceof EntityPlayerMP) {
      WorldServer worldserver = (WorldServer)var2;
      EntityPlayerMP var4 = (EntityPlayerMP)var3;
      if (var3.ridingEntity == null && var3.riddenByEntity == null && var4.dimension == 35) {
        var1.stackTagCompound.setDouble("KamuiWorldX", var3.posX);
        var1.stackTagCompound.setDouble("KamuiWorldY", (var2.getTopSolidOrLiquidBlock((int)var3.posX, (int)var3.posZ) + 1));
        var1.stackTagCompound.setDouble("KamuiWorldZ", var3.posZ);
        var4.mcServer.getConfigurationManager().transferPlayerToDimension(var4, 0, new LightDimensionTeleporter(worldserver));
        var3.setPositionAndUpdate(var1.stackTagCompound.getDouble("RealWorldX"), var1.stackTagCompound.getDouble("RealWorldY"), var1.stackTagCompound.getDouble("RealWorldZ"));
      } else if (var3.ridingEntity == null && var3.riddenByEntity == null) {
        var1.stackTagCompound.setDouble("RealWorldX", var3.posX);
        var1.stackTagCompound.setDouble("RealWorldY", var3.posY);
        var1.stackTagCompound.setDouble("RealWorldZ", var3.posZ);
        var4.mcServer.getConfigurationManager().transferPlayerToDimension(var4, 35, new LightDimensionTeleporter(worldserver));
        var3.setPositionAndUpdate(var1.stackTagCompound.getDouble("KamuiWorldX"), var1.stackTagCompound.getDouble("KamuiWorldY"), var1.stackTagCompound.getDouble("KamuiWorldZ"));
      } 
    } 
    return var1;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null) {
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner"));
      par3List.add(EnumChatFormatting.AQUA + "RX: " + par1ItemStack.stackTagCompound.getDouble("RealWorldX"));
      par3List.add(EnumChatFormatting.AQUA + "RY: " + par1ItemStack.stackTagCompound.getDouble("RealWorldY"));
      par3List.add(EnumChatFormatting.AQUA + "RZ: " + par1ItemStack.stackTagCompound.getDouble("RealWorldZ"));
      par3List.add(EnumChatFormatting.AQUA + "KX: " + par1ItemStack.stackTagCompound.getDouble("KamuiWorldX"));
      par3List.add(EnumChatFormatting.AQUA + "KY: " + par1ItemStack.stackTagCompound.getDouble("KamuiWorldY"));
      par3List.add(EnumChatFormatting.AQUA + "KZ: " + par1ItemStack.stackTagCompound.getDouble("KamuiWorldZ"));
    } 
  }
}

package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.block.Blockss;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class WaterReleaseExplodingWaterCollidingWave extends JutsuItem {
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
      par1ItemStack.stackTagCompound.setInteger("Counter", 0);
      par1ItemStack.stackTagCompound.setBoolean("Active", false);
    } 
    boolean FireMode = par1ItemStack.stackTagCompound.getBoolean("FireMode");
    if (FireMode) {
      EntityPlayer player = (EntityPlayer)par3Entity;
      ExtendedPlayer props = ExtendedPlayer.get(player);
      if (props.getWaterRelease() == 1) {
        int counter = par1ItemStack.stackTagCompound.getInteger("counter");
        if (counter > 0) {
          counter--;
          par1ItemStack.stackTagCompound.setInteger("counter", counter);
        } 
        if (counter < 1) {
          counter = 5;
          par1ItemStack.stackTagCompound.setInteger("counter", counter);
          props.consumeMana(1);
        } 
        if (props.getCurrentMana() < 1) {
          FireMode = false;
          par1ItemStack.stackTagCompound.setBoolean("FireMode", FireMode);
          ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText("Water Prison Shark Dance Technique-Stop"));
        } 
        int size = 100;
        double r = Math.cbrt(size) * 0.6D;
        double r2 = Math.cbrt(size) * 6.0D;
        double r3 = Math.cbrt(size) * 5.0D;
        double r4 = Math.cbrt(size) * 4.0D;
        double r5 = Math.cbrt(size) * 3.0D;
        double r6 = Math.cbrt(size) * 2.0D;
        double r7 = Math.cbrt(size) * 1.0D;
        double r1 = Math.cbrt(size) * 0.1D;
        for (int i = 0; i < 10; i++) {
          int ang0 = par2World.rand.nextInt(360);
          int ang1 = par2World.rand.nextInt(360);
          int x = MathHelper.floor_double(((EntityPlayer)par3Entity).posX + r * Math.sin(ang0 / 180.0D * 15.707963267948966D) * Math.sin(ang1 / 180.0D * 15.707963267948966D));
          int y = MathHelper.floor_double(((EntityPlayer)par3Entity).posY + r * Math.cos(ang0 / 180.0D * 15.707963267948966D));
          int z = MathHelper.floor_double(((EntityPlayer)par3Entity).posZ + r * Math.sin(ang0 / 180.0D * 15.707963267948966D) * Math.cos(ang1 / 180.0D * 15.707963267948966D));
          int x1 = MathHelper.floor_double(((EntityPlayer)par3Entity).posX + 0.6D * Math.sin(ang0 / 180.0D * 15.707963267948966D) * Math.sin(ang1 / 180.0D * 15.707963267948966D));
          int y1 = MathHelper.floor_double(((EntityPlayer)par3Entity).posY + 0.6D * Math.cos(ang0 / 180.0D * 15.707963267948966D));
          int z1 = MathHelper.floor_double(((EntityPlayer)par3Entity).posZ + 0.6D * Math.sin(ang0 / 180.0D * 15.707963267948966D) * Math.cos(ang1 / 180.0D * 15.707963267948966D));
          int x2 = MathHelper.floor_double(((EntityPlayer)par3Entity).posX + 2.0D * Math.sin(ang0 / 180.0D * 15.707963267948966D) * Math.sin(ang1 / 180.0D * 15.707963267948966D));
          int y2 = MathHelper.floor_double(((EntityPlayer)par3Entity).posY + 2.0D * Math.cos(ang0 / 180.0D * 15.707963267948966D));
          int z2 = MathHelper.floor_double(((EntityPlayer)par3Entity).posZ + 2.0D * Math.sin(ang0 / 180.0D * 15.707963267948966D) * Math.cos(ang1 / 180.0D * 15.707963267948966D));
          int x3 = MathHelper.floor_double(((EntityPlayer)par3Entity).posX + 3.0D * Math.sin(ang0 / 180.0D * 15.707963267948966D) * Math.sin(ang1 / 180.0D * 15.707963267948966D));
          int y3 = MathHelper.floor_double(((EntityPlayer)par3Entity).posY + 3.0D * Math.cos(ang0 / 180.0D * 15.707963267948966D));
          int z3 = MathHelper.floor_double(((EntityPlayer)par3Entity).posZ + 3.0D * Math.sin(ang0 / 180.0D * 15.707963267948966D) * Math.cos(ang1 / 180.0D * 15.707963267948966D));
          int x4 = MathHelper.floor_double(((EntityPlayer)par3Entity).posX + 4.0D * Math.sin(ang0 / 180.0D * 15.707963267948966D) * Math.sin(ang1 / 180.0D * 15.707963267948966D));
          int y4 = MathHelper.floor_double(((EntityPlayer)par3Entity).posY + 4.0D * Math.cos(ang0 / 180.0D * 15.707963267948966D));
          int z4 = MathHelper.floor_double(((EntityPlayer)par3Entity).posZ + 4.0D * Math.sin(ang0 / 180.0D * 15.707963267948966D) * Math.cos(ang1 / 180.0D * 15.707963267948966D));
          int x5 = MathHelper.floor_double(((EntityPlayer)par3Entity).posX + 5.0D * Math.sin(ang0 / 180.0D * 15.707963267948966D) * Math.sin(ang1 / 180.0D * 15.707963267948966D));
          int y5 = MathHelper.floor_double(((EntityPlayer)par3Entity).posY + 5.0D * Math.cos(ang0 / 180.0D * 15.707963267948966D));
          int z5 = MathHelper.floor_double(((EntityPlayer)par3Entity).posZ + 5.0D * Math.sin(ang0 / 180.0D * 15.707963267948966D) * Math.cos(ang1 / 180.0D * 15.707963267948966D));
          int x6 = MathHelper.floor_double(((EntityPlayer)par3Entity).posX + 6.0D * Math.sin(ang0 / 180.0D * 15.707963267948966D) * Math.sin(ang1 / 180.0D * 15.707963267948966D));
          int y6 = MathHelper.floor_double(((EntityPlayer)par3Entity).posY + 6.0D * Math.cos(ang0 / 180.0D * 15.707963267948966D));
          int z6 = MathHelper.floor_double(((EntityPlayer)par3Entity).posZ + 6.0D * Math.sin(ang0 / 180.0D * 15.707963267948966D) * Math.cos(ang1 / 180.0D * 15.707963267948966D));
          int x7 = MathHelper.floor_double(((EntityPlayer)par3Entity).posX + 7.0D * Math.sin(ang0 / 180.0D * 15.707963267948966D) * Math.sin(ang1 / 180.0D * 15.707963267948966D));
          int y7 = MathHelper.floor_double(((EntityPlayer)par3Entity).posY + 7.0D * Math.cos(ang0 / 180.0D * 15.707963267948966D));
          int z7 = MathHelper.floor_double(((EntityPlayer)par3Entity).posZ + 7.0D * Math.sin(ang0 / 180.0D * 15.707963267948966D) * Math.cos(ang1 / 180.0D * 15.707963267948966D));
          int x8 = MathHelper.floor_double(((EntityPlayer)par3Entity).posX + 8.0D * Math.sin(ang0 / 180.0D * 15.707963267948966D) * Math.sin(ang1 / 180.0D * 15.707963267948966D));
          int y8 = MathHelper.floor_double(((EntityPlayer)par3Entity).posY + 8.0D * Math.cos(ang0 / 180.0D * 15.707963267948966D));
          int z8 = MathHelper.floor_double(((EntityPlayer)par3Entity).posZ + 8.0D * Math.sin(ang0 / 180.0D * 15.707963267948966D) * Math.cos(ang1 / 180.0D * 15.707963267948966D));
          int x9 = MathHelper.floor_double(((EntityPlayer)par3Entity).posX + 9.0D * Math.sin(ang0 / 180.0D * 15.707963267948966D) * Math.sin(ang1 / 180.0D * 15.707963267948966D));
          int y9 = MathHelper.floor_double(((EntityPlayer)par3Entity).posY + 9.0D * Math.cos(ang0 / 180.0D * 15.707963267948966D));
          int z9 = MathHelper.floor_double(((EntityPlayer)par3Entity).posZ + 9.0D * Math.sin(ang0 / 180.0D * 15.707963267948966D) * Math.cos(ang1 / 180.0D * 15.707963267948966D));
          int x10 = MathHelper.floor_double(((EntityPlayer)par3Entity).posX + 10.0D * Math.sin(ang0 / 180.0D * 15.707963267948966D) * Math.sin(ang1 / 180.0D * 15.707963267948966D));
          int y10 = MathHelper.floor_double(((EntityPlayer)par3Entity).posY + 10.0D * Math.cos(ang0 / 180.0D * 15.707963267948966D));
          int z10 = MathHelper.floor_double(((EntityPlayer)par3Entity).posZ + 10.0D * Math.sin(ang0 / 180.0D * 15.707963267948966D) * Math.cos(ang1 / 180.0D * 15.707963267948966D));
          int x11 = MathHelper.floor_double(((EntityPlayer)par3Entity).posX + 11.0D * Math.sin(ang0 / 180.0D * 15.707963267948966D) * Math.sin(ang1 / 180.0D * 15.707963267948966D));
          int y11 = MathHelper.floor_double(((EntityPlayer)par3Entity).posY + 11.0D * Math.cos(ang0 / 180.0D * 15.707963267948966D));
          int z11 = MathHelper.floor_double(((EntityPlayer)par3Entity).posZ + 11.0D * Math.sin(ang0 / 180.0D * 15.707963267948966D) * Math.cos(ang1 / 180.0D * 15.707963267948966D));
          int x12 = MathHelper.floor_double(((EntityPlayer)par3Entity).posX + 12.0D * Math.sin(ang0 / 180.0D * 15.707963267948966D) * Math.sin(ang1 / 180.0D * 15.707963267948966D));
          int y12 = MathHelper.floor_double(((EntityPlayer)par3Entity).posY + 12.0D * Math.cos(ang0 / 180.0D * 15.707963267948966D));
          int z12 = MathHelper.floor_double(((EntityPlayer)par3Entity).posZ + 12.0D * Math.sin(ang0 / 180.0D * 15.707963267948966D) * Math.cos(ang1 / 180.0D * 15.707963267948966D));
          int x13 = MathHelper.floor_double(((EntityPlayer)par3Entity).posX + 13.0D * Math.sin(ang0 / 180.0D * 15.707963267948966D) * Math.sin(ang1 / 180.0D * 15.707963267948966D));
          int y13 = MathHelper.floor_double(((EntityPlayer)par3Entity).posY + 13.0D * Math.cos(ang0 / 180.0D * 15.707963267948966D));
          int z13 = MathHelper.floor_double(((EntityPlayer)par3Entity).posZ + 13.0D * Math.sin(ang0 / 180.0D * 15.707963267948966D) * Math.cos(ang1 / 180.0D * 15.707963267948966D));
          int x14 = MathHelper.floor_double(((EntityPlayer)par3Entity).posX + 14.0D * Math.sin(ang0 / 180.0D * 15.707963267948966D) * Math.sin(ang1 / 180.0D * 15.707963267948966D));
          int y14 = MathHelper.floor_double(((EntityPlayer)par3Entity).posY + 14.0D * Math.cos(ang0 / 180.0D * 15.707963267948966D));
          int z14 = MathHelper.floor_double(((EntityPlayer)par3Entity).posZ + 14.0D * Math.sin(ang0 / 180.0D * 15.707963267948966D) * Math.cos(ang1 / 180.0D * 15.707963267948966D));
          if (!par2World.isRemote) {
            if (par2World.getBlock(x, y, z) == Blocks.air)
              par2World.setBlock(x, y, z, (Block)Blockss.jutsuWater, 0, 2); 
            if (par2World.getBlock(x1, y1, z1) == Blocks.air)
              par2World.setBlock(x1, y1, z1, (Block)Blockss.jutsuWater, 0, 2); 
            if (par2World.getBlock(x2, y2, z2) == Blocks.air)
              par2World.setBlock(x2, y2, z2, (Block)Blockss.jutsuWater, 0, 2); 
            if (par2World.getBlock(x3, y3, z3) == Blocks.air)
              par2World.setBlock(x3, y3, z3, (Block)Blockss.jutsuWater, 0, 2); 
            if (par2World.getBlock(x4, y4, z4) == Blocks.air)
              par2World.setBlock(x4, y4, z4, (Block)Blockss.jutsuWater, 0, 2); 
            if (par2World.getBlock(x5, y5, z5) == Blocks.air)
              par2World.setBlock(x5, y5, z5, (Block)Blockss.jutsuWater, 0, 2); 
            if (par2World.getBlock(x6, y6, z6) == Blocks.air)
              par2World.setBlock(x6, y6, z6, (Block)Blockss.jutsuWater, 0, 2); 
            if (par2World.getBlock(x7, y7, z7) == Blocks.air)
              par2World.setBlock(x7, y7, z7, (Block)Blockss.jutsuWater, 0, 2); 
            if (par2World.getBlock(x8, y8, z8) == Blocks.air)
              par2World.setBlock(x8, y8, z8, (Block)Blockss.jutsuWater, 0, 2); 
            if (par2World.getBlock(x9, y9, z9) == Blocks.air)
              par2World.setBlock(x9, y9, z9, (Block)Blockss.jutsuWater, 0, 2); 
            if (par2World.getBlock(x10, y10, z10) == Blocks.air)
              par2World.setBlock(x10, y10, z10, (Block)Blockss.jutsuWater, 0, 2); 
            if (par2World.getBlock(x11, y11, z11) == Blocks.air)
              par2World.setBlock(x11, y11, z11, (Block)Blockss.jutsuWater, 0, 2); 
            if (par2World.getBlock(x12, y12, z12) == Blocks.air)
              par2World.setBlock(x12, y12, z12, (Block)Blockss.jutsuWater, 0, 2); 
            if (par2World.getBlock(x13, y13, z13) == Blocks.air)
              par2World.setBlock(x13, y13, z13, (Block)Blockss.jutsuWater, 0, 2); 
            if (par2World.getBlock(x14, y14, z14) == Blocks.air)
              par2World.setBlock(x14, y14, z14, (Block)Blockss.jutsuWater, 0, 2); 
          } 
        } 
      } 
    } 
  }
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public WaterReleaseExplodingWaterCollidingWave() {
    setMaxDamage(3700);
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote)
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
        boolean FireMode = Par1ItemStack.stackTagCompound.getBoolean("FireMode");
        if (!FireMode) {
          ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
          if (props.getCurrentMana() >= 100) {
            Par1ItemStack.stackTagCompound.setBoolean("FireMode", true);
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Water Prison Shark Dance Technique"));
            props.consumeMana(100);
          } else {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough chakra!"));
          } 
        } else if (FireMode) {
          Par1ItemStack.stackTagCompound.setBoolean("FireMode", false);
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Water Prison Shark Dance Technique-Stop"));
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "A jutsu originally used by Kisame");
    par3List.add(EnumChatFormatting.DARK_AQUA + "Hoshigaki, creates a water orb around");
    par3List.add(EnumChatFormatting.DARK_AQUA + "the user and uses him as the centre.");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + 'd');
    par3List.add(EnumChatFormatting.GOLD + "Chakra Upkeep: " + '\003');
  }
}

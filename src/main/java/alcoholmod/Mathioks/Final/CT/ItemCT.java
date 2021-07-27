package alcoholmod.Mathioks.Final.CT;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.JutsuItem;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityFallingBlock;
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

public class ItemCT extends JutsuItem {
  private EntityCT EntityCT;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public ItemCT() {
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
      par1ItemStack.stackTagCompound.setString("EntityCT", "");
      par1ItemStack.stackTagCompound.setBoolean("start", false);
      par1ItemStack.stackTagCompound.setInteger("counter10", 0);
      par1ItemStack.stackTagCompound.setInteger("counter2", 0);
    } 
    boolean start = par1ItemStack.stackTagCompound.getBoolean("start");
    int counter10 = par1ItemStack.stackTagCompound.getInteger("counter10");
    counter10++;
    if (start && counter10 <= 2500 && counter10 >= 100 && !par2World.isRemote)
      for (int i = 0; i < 2; i++) {
        int r = par2World.rand.nextInt(20);
        int angle = par2World.rand.nextInt(210);
        int x = MathHelper.floor_double(this.EntityCT.posX + r * Math.sin(angle / 80.0D * 2.141592653589793D));
        int y = MathHelper.floor_double(this.EntityCT.posY);
        int z;
        for (z = MathHelper.floor_double(this.EntityCT.posZ + r * Math.cos(angle / 80.0D * 2.141592653589793D)); par2World.isAirBlock(x, y, z); y--);
        if (par2World.isAirBlock(x, y + 1, z) && par2World.isAirBlock(x, y + 2, z) && par2World.isAirBlock(x, y + 3, z) && !par2World.isAirBlock(x, y, z)) {
          Block block = par2World.getBlock(x, y, z);
          int meta = par2World.getBlockMetadata(x, y, z);
          EntityFallingBlock entity = new EntityFallingBlock(par2World, x, y + 1.5D, z, block, meta);
          entity.motionY = 1.0D;
          par2World.spawnEntityInWorld((Entity)entity);
          if (par2World.getBlock(x, y, z) != Blocks.bedrock)
            par2World.setBlockToAir(x, y, z); 
        } 
      }  
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote)
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
        ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
        if (props.getrinnegan() == 1)
          if (props.getCurrentMana() >= 1200 + props.getNinjutsu() / 600) {
            this.EntityCT = new EntityCT(Par2World, (EntityLivingBase)Par3EntityPlayer, Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ);
            this.EntityCT.ownerOfThis = Par3EntityPlayer.getUniqueID().toString();
            Par2World.spawnEntityInWorld((Entity)this.EntityCT);
            Par1ItemStack.stackTagCompound.setString("EntityCT", this.EntityCT.getUniqueID().toString());
            Par1ItemStack.stackTagCompound.setBoolean("start", true);
            int counter2 = Par1ItemStack.stackTagCompound.getInteger("counter2");
            if (counter2 == 0) {
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Chibaku Tensei!!!"));
              Par1ItemStack.stackTagCompound.setInteger("counter2", 30);
            } 
            if (this.EntityCT != null);
            props.consumeMana(1200 + props.getNinjutsu() / 600);
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "An ultimate Rinnegan jutsu");
    par3List.add(EnumChatFormatting.DARK_AQUA + "allowing for the user to create a new");
    par3List.add(EnumChatFormatting.DARK_AQUA + "gravitational force");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (1200 + props.getNinjutsu() / 600));
  }
}

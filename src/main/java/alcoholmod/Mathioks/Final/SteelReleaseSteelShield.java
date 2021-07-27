package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class SteelReleaseSteelShield extends JutsuItem {
  private boolean isinair;
  
  public int counter = 0;
  
  public int counter2 = 0;
  
  private int i;
  
  private int j;
  
  private int k;
  
  boolean on;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public SteelReleaseSteelShield() {
    setMaxDamage(200);
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.getItemDamage() == 0 && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getsteelRelease() == 1) {
        if (props.getCurrentMana() >= 5) {
          this.i = MathHelper.floor_double(Par3EntityPlayer.posX);
          this.j = MathHelper.floor_double(Par3EntityPlayer.posY);
          this.k = MathHelper.floor_double(Par3EntityPlayer.posZ);
          if (Par2World.getBlock(this.i + 2, this.j, this.k + 2) == Blocks.air)
            Par2World.setBlock(this.i + 2, this.j, this.k + 2, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i + 2, this.j, this.k + 1) == Blocks.air)
            Par2World.setBlock(this.i + 2, this.j, this.k + 1, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i + 2, this.j, this.k) == Blocks.air)
            Par2World.setBlock(this.i + 2, this.j, this.k, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i + 2, this.j, this.k - 1) == Blocks.air)
            Par2World.setBlock(this.i + 2, this.j, this.k - 1, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i + 2, this.j, this.k - 2) == Blocks.air)
            Par2World.setBlock(this.i + 2, this.j, this.k - 2, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i + 1, this.j, this.k + 2) == Blocks.air)
            Par2World.setBlock(this.i + 1, this.j, this.k + 2, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i + 1, this.j, this.k - 2) == Blocks.air)
            Par2World.setBlock(this.i + 1, this.j, this.k - 2, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i, this.j, this.k + 2) == Blocks.air)
            Par2World.setBlock(this.i, this.j, this.k + 2, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i, this.j, this.k - 2) == Blocks.air)
            Par2World.setBlock(this.i, this.j, this.k - 2, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i - 1, this.j, this.k + 2) == Blocks.air)
            Par2World.setBlock(this.i - 1, this.j, this.k + 2, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i - 1, this.j, this.k - 2) == Blocks.air)
            Par2World.setBlock(this.i - 1, this.j, this.k - 2, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i - 2, this.j, this.k + 2) == Blocks.air)
            Par2World.setBlock(this.i - 2, this.j, this.k + 2, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i - 2, this.j, this.k + 1) == Blocks.air)
            Par2World.setBlock(this.i - 2, this.j, this.k + 1, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i - 2, this.j, this.k) == Blocks.air)
            Par2World.setBlock(this.i - 2, this.j, this.k, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i - 2, this.j, this.k - 1) == Blocks.air)
            Par2World.setBlock(this.i - 2, this.j, this.k - 1, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i - 2, this.j, this.k - 2) == Blocks.air)
            Par2World.setBlock(this.i - 2, this.j, this.k - 2, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i + 2, this.j + 1, this.k + 2) == Blocks.air)
            Par2World.setBlock(this.i + 2, this.j + 1, this.k + 2, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i + 2, this.j + 1, this.k + 1) == Blocks.air)
            Par2World.setBlock(this.i + 2, this.j + 1, this.k + 1, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i + 2, this.j + 1, this.k) == Blocks.air)
            Par2World.setBlock(this.i + 2, this.j + 1, this.k, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i + 2, this.j + 1, this.k - 1) == Blocks.air)
            Par2World.setBlock(this.i + 2, this.j + 1, this.k - 1, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i + 2, this.j + 1, this.k - 2) == Blocks.air)
            Par2World.setBlock(this.i + 2, this.j + 1, this.k - 2, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i + 1, this.j + 1, this.k + 2) == Blocks.air)
            Par2World.setBlock(this.i + 1, this.j + 1, this.k + 2, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i + 1, this.j + 1, this.k - 2) == Blocks.air)
            Par2World.setBlock(this.i + 1, this.j + 1, this.k - 2, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i, this.j + 1, this.k + 2) == Blocks.air)
            Par2World.setBlock(this.i, this.j + 1, this.k + 2, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i, this.j + 1, this.k - 2) == Blocks.air)
            Par2World.setBlock(this.i, this.j + 1, this.k - 2, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i - 1, this.j + 1, this.k + 2) == Blocks.air)
            Par2World.setBlock(this.i - 1, this.j + 1, this.k + 2, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i - 1, this.j + 1, this.k - 2) == Blocks.air)
            Par2World.setBlock(this.i - 1, this.j + 1, this.k - 2, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i - 2, this.j + 1, this.k + 2) == Blocks.air)
            Par2World.setBlock(this.i - 2, this.j + 1, this.k + 2, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i - 2, this.j + 1, this.k + 1) == Blocks.air)
            Par2World.setBlock(this.i - 2, this.j + 1, this.k + 1, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i - 2, this.j + 1, this.k) == Blocks.air)
            Par2World.setBlock(this.i - 2, this.j + 1, this.k, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i - 2, this.j + 1, this.k - 1) == Blocks.air)
            Par2World.setBlock(this.i - 2, this.j + 1, this.k - 1, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i - 2, this.j + 1, this.k - 2) == Blocks.air)
            Par2World.setBlock(this.i - 2, this.j + 1, this.k - 2, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i + 2, this.j + 2, this.k + 2) == Blocks.air)
            Par2World.setBlock(this.i + 2, this.j + 2, this.k + 2, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i + 2, this.j + 2, this.k + 1) == Blocks.air)
            Par2World.setBlock(this.i + 2, this.j + 2, this.k + 1, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i + 2, this.j + 2, this.k) == Blocks.air)
            Par2World.setBlock(this.i + 2, this.j + 2, this.k, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i + 2, this.j + 2, this.k - 1) == Blocks.air)
            Par2World.setBlock(this.i + 2, this.j + 2, this.k - 1, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i + 2, this.j + 2, this.k - 2) == Blocks.air)
            Par2World.setBlock(this.i + 2, this.j + 2, this.k - 2, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i + 1, this.j + 2, this.k + 2) == Blocks.air)
            Par2World.setBlock(this.i + 1, this.j + 2, this.k + 2, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i + 1, this.j + 2, this.k - 2) == Blocks.air)
            Par2World.setBlock(this.i + 1, this.j + 2, this.k - 2, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i, this.j + 2, this.k + 2) == Blocks.air)
            Par2World.setBlock(this.i, this.j + 2, this.k + 2, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i, this.j + 2, this.k - 2) == Blocks.air)
            Par2World.setBlock(this.i, this.j + 2, this.k - 2, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i - 1, this.j + 2, this.k + 2) == Blocks.air)
            Par2World.setBlock(this.i - 1, this.j + 2, this.k + 2, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i - 1, this.j + 2, this.k - 2) == Blocks.air)
            Par2World.setBlock(this.i - 1, this.j + 2, this.k - 2, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i - 2, this.j + 2, this.k + 2) == Blocks.air)
            Par2World.setBlock(this.i - 2, this.j + 2, this.k + 2, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i - 2, this.j + 2, this.k + 1) == Blocks.air)
            Par2World.setBlock(this.i - 2, this.j + 2, this.k + 1, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i - 2, this.j + 2, this.k) == Blocks.air)
            Par2World.setBlock(this.i - 2, this.j + 2, this.k, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i - 2, this.j + 2, this.k - 1) == Blocks.air)
            Par2World.setBlock(this.i - 2, this.j + 2, this.k - 1, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i - 2, this.j + 2, this.k - 2) == Blocks.air)
            Par2World.setBlock(this.i - 2, this.j + 2, this.k - 2, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i, this.j + 2, this.k) == Blocks.air)
            Par2World.setBlock(this.i, this.j + 2, this.k, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i + 1, this.j + 2, this.k + 1) == Blocks.air)
            Par2World.setBlock(this.i + 1, this.j + 2, this.k + 1, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i + 1, this.j + 2, this.k) == Blocks.air)
            Par2World.setBlock(this.i + 1, this.j + 2, this.k, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i + 1, this.j + 2, this.k - 1) == Blocks.air)
            Par2World.setBlock(this.i + 1, this.j + 2, this.k - 1, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i, this.j + 2, this.k + 1) == Blocks.air)
            Par2World.setBlock(this.i, this.j + 2, this.k + 1, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i, this.j + 2, this.k - 1) == Blocks.air)
            Par2World.setBlock(this.i, this.j + 2, this.k - 1, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i - 1, this.j + 2, this.k + 1) == Blocks.air)
            Par2World.setBlock(this.i - 1, this.j + 2, this.k + 1, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i - 1, this.j + 2, this.k) == Blocks.air)
            Par2World.setBlock(this.i - 1, this.j + 2, this.k, Blocks.iron_bars); 
          if (Par2World.getBlock(this.i - 1, this.j + 2, this.k - 1) == Blocks.air)
            Par2World.setBlock(this.i - 1, this.j + 2, this.k - 1, Blocks.iron_bars); 
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Steel Release: Steel Shield Technique!"));
          props.consumeMana(5);
          Par1ItemStack.setItemDamage(50);
          return Par1ItemStack;
        } 
        if (Par1ItemStack.getItemDamage() == 50) {
          if (Par2World.getBlock(this.i + 2, this.j, this.k + 2) == Blocks.iron_bars)
            Par2World.setBlock(this.i + 2, this.j, this.k + 2, Blocks.air); 
          if (Par2World.getBlock(this.i + 2, this.j, this.k + 1) == Blocks.iron_bars)
            Par2World.setBlock(this.i + 2, this.j, this.k + 1, Blocks.air); 
          if (Par2World.getBlock(this.i + 2, this.j, this.k) == Blocks.iron_bars)
            Par2World.setBlock(this.i + 2, this.j, this.k, Blocks.air); 
          if (Par2World.getBlock(this.i + 2, this.j, this.k - 1) == Blocks.iron_bars)
            Par2World.setBlock(this.i + 2, this.j, this.k - 1, Blocks.air); 
          if (Par2World.getBlock(this.i + 2, this.j, this.k - 2) == Blocks.iron_bars)
            Par2World.setBlock(this.i + 2, this.j, this.k - 2, Blocks.air); 
          if (Par2World.getBlock(this.i + 1, this.j, this.k + 2) == Blocks.iron_bars)
            Par2World.setBlock(this.i + 1, this.j, this.k + 2, Blocks.air); 
          if (Par2World.getBlock(this.i + 1, this.j, this.k - 2) == Blocks.iron_bars)
            Par2World.setBlock(this.i + 1, this.j, this.k - 2, Blocks.air); 
          if (Par2World.getBlock(this.i, this.j, this.k + 2) == Blocks.iron_bars)
            Par2World.setBlock(this.i, this.j, this.k + 2, Blocks.air); 
          if (Par2World.getBlock(this.i, this.j, this.k - 2) == Blocks.iron_bars)
            Par2World.setBlock(this.i, this.j, this.k - 2, Blocks.air); 
          if (Par2World.getBlock(this.i - 1, this.j, this.k + 2) == Blocks.iron_bars)
            Par2World.setBlock(this.i - 1, this.j, this.k + 2, Blocks.air); 
          if (Par2World.getBlock(this.i - 1, this.j, this.k - 2) == Blocks.iron_bars)
            Par2World.setBlock(this.i - 1, this.j, this.k - 2, Blocks.air); 
          if (Par2World.getBlock(this.i - 2, this.j, this.k + 2) == Blocks.iron_bars)
            Par2World.setBlock(this.i - 2, this.j, this.k + 2, Blocks.air); 
          if (Par2World.getBlock(this.i - 2, this.j, this.k + 1) == Blocks.iron_bars)
            Par2World.setBlock(this.i - 2, this.j, this.k + 1, Blocks.air); 
          if (Par2World.getBlock(this.i - 2, this.j, this.k) == Blocks.iron_bars)
            Par2World.setBlock(this.i - 2, this.j, this.k, Blocks.air); 
          if (Par2World.getBlock(this.i - 2, this.j, this.k - 1) == Blocks.iron_bars)
            Par2World.setBlock(this.i - 2, this.j, this.k - 1, Blocks.air); 
          if (Par2World.getBlock(this.i - 2, this.j, this.k - 2) == Blocks.iron_bars)
            Par2World.setBlock(this.i - 2, this.j, this.k - 2, Blocks.air); 
          if (Par2World.getBlock(this.i + 2, this.j + 1, this.k + 2) == Blocks.iron_bars)
            Par2World.setBlock(this.i + 2, this.j + 1, this.k + 2, Blocks.air); 
          if (Par2World.getBlock(this.i + 2, this.j + 1, this.k + 1) == Blocks.iron_bars)
            Par2World.setBlock(this.i + 2, this.j + 1, this.k + 1, Blocks.air); 
          if (Par2World.getBlock(this.i + 2, this.j + 1, this.k) == Blocks.iron_bars)
            Par2World.setBlock(this.i + 2, this.j + 1, this.k, Blocks.air); 
          if (Par2World.getBlock(this.i + 2, this.j + 1, this.k - 1) == Blocks.iron_bars)
            Par2World.setBlock(this.i + 2, this.j + 1, this.k - 1, Blocks.air); 
          if (Par2World.getBlock(this.i + 2, this.j + 1, this.k - 2) == Blocks.iron_bars)
            Par2World.setBlock(this.i + 2, this.j + 1, this.k - 2, Blocks.air); 
          if (Par2World.getBlock(this.i + 1, this.j + 1, this.k + 2) == Blocks.iron_bars)
            Par2World.setBlock(this.i + 1, this.j + 1, this.k + 2, Blocks.air); 
          if (Par2World.getBlock(this.i + 1, this.j + 1, this.k - 2) == Blocks.iron_bars)
            Par2World.setBlock(this.i + 1, this.j + 1, this.k - 2, Blocks.air); 
          if (Par2World.getBlock(this.i, this.j + 1, this.k + 2) == Blocks.iron_bars)
            Par2World.setBlock(this.i, this.j + 1, this.k + 2, Blocks.air); 
          if (Par2World.getBlock(this.i, this.j + 1, this.k - 2) == Blocks.iron_bars)
            Par2World.setBlock(this.i, this.j + 1, this.k - 2, Blocks.air); 
          if (Par2World.getBlock(this.i - 1, this.j + 1, this.k + 2) == Blocks.iron_bars)
            Par2World.setBlock(this.i - 1, this.j + 1, this.k + 2, Blocks.air); 
          if (Par2World.getBlock(this.i - 1, this.j + 1, this.k - 2) == Blocks.iron_bars)
            Par2World.setBlock(this.i - 1, this.j + 1, this.k - 2, Blocks.air); 
          if (Par2World.getBlock(this.i - 2, this.j + 1, this.k + 2) == Blocks.iron_bars)
            Par2World.setBlock(this.i - 2, this.j + 1, this.k + 2, Blocks.air); 
          if (Par2World.getBlock(this.i - 2, this.j + 1, this.k + 1) == Blocks.iron_bars)
            Par2World.setBlock(this.i - 2, this.j + 1, this.k + 1, Blocks.air); 
          if (Par2World.getBlock(this.i - 2, this.j + 1, this.k) == Blocks.iron_bars)
            Par2World.setBlock(this.i - 2, this.j + 1, this.k, Blocks.air); 
          if (Par2World.getBlock(this.i - 2, this.j + 1, this.k - 1) == Blocks.iron_bars)
            Par2World.setBlock(this.i - 2, this.j + 1, this.k - 1, Blocks.air); 
          if (Par2World.getBlock(this.i - 2, this.j + 1, this.k - 2) == Blocks.iron_bars)
            Par2World.setBlock(this.i - 2, this.j + 1, this.k - 2, Blocks.air); 
          if (Par2World.getBlock(this.i + 2, this.j + 2, this.k + 2) == Blocks.iron_bars)
            Par2World.setBlock(this.i + 2, this.j + 2, this.k + 2, Blocks.air); 
          if (Par2World.getBlock(this.i + 2, this.j + 2, this.k + 1) == Blocks.iron_bars)
            Par2World.setBlock(this.i + 2, this.j + 2, this.k + 1, Blocks.air); 
          if (Par2World.getBlock(this.i + 2, this.j + 2, this.k) == Blocks.iron_bars)
            Par2World.setBlock(this.i + 2, this.j + 2, this.k, Blocks.air); 
          if (Par2World.getBlock(this.i + 2, this.j + 2, this.k - 1) == Blocks.iron_bars)
            Par2World.setBlock(this.i + 2, this.j + 2, this.k - 1, Blocks.air); 
          if (Par2World.getBlock(this.i + 2, this.j + 2, this.k - 2) == Blocks.iron_bars)
            Par2World.setBlock(this.i + 2, this.j + 2, this.k - 2, Blocks.air); 
          if (Par2World.getBlock(this.i + 1, this.j + 2, this.k + 2) == Blocks.iron_bars)
            Par2World.setBlock(this.i + 1, this.j + 2, this.k + 2, Blocks.air); 
          if (Par2World.getBlock(this.i + 1, this.j + 2, this.k - 2) == Blocks.iron_bars)
            Par2World.setBlock(this.i + 1, this.j + 2, this.k - 2, Blocks.air); 
          if (Par2World.getBlock(this.i, this.j + 2, this.k + 2) == Blocks.iron_bars)
            Par2World.setBlock(this.i, this.j + 2, this.k + 2, Blocks.air); 
          if (Par2World.getBlock(this.i, this.j + 2, this.k - 2) == Blocks.iron_bars)
            Par2World.setBlock(this.i, this.j + 2, this.k - 2, Blocks.air); 
          if (Par2World.getBlock(this.i - 1, this.j + 2, this.k + 2) == Blocks.iron_bars)
            Par2World.setBlock(this.i - 1, this.j + 2, this.k + 2, Blocks.air); 
          if (Par2World.getBlock(this.i - 1, this.j + 2, this.k - 2) == Blocks.iron_bars)
            Par2World.setBlock(this.i - 1, this.j + 2, this.k - 2, Blocks.air); 
          if (Par2World.getBlock(this.i - 2, this.j + 2, this.k + 2) == Blocks.iron_bars)
            Par2World.setBlock(this.i - 2, this.j + 2, this.k + 2, Blocks.air); 
          if (Par2World.getBlock(this.i - 2, this.j + 2, this.k + 1) == Blocks.iron_bars)
            Par2World.setBlock(this.i - 2, this.j + 2, this.k + 1, Blocks.air); 
          if (Par2World.getBlock(this.i - 2, this.j + 2, this.k) == Blocks.iron_bars)
            Par2World.setBlock(this.i - 2, this.j + 2, this.k, Blocks.air); 
          if (Par2World.getBlock(this.i - 2, this.j + 2, this.k - 1) == Blocks.iron_bars)
            Par2World.setBlock(this.i - 2, this.j + 2, this.k - 1, Blocks.air); 
          if (Par2World.getBlock(this.i - 2, this.j + 2, this.k - 2) == Blocks.iron_bars)
            Par2World.setBlock(this.i - 2, this.j + 2, this.k - 2, Blocks.air); 
          if (Par2World.getBlock(this.i, this.j + 2, this.k) == Blocks.iron_bars)
            Par2World.setBlock(this.i, this.j + 2, this.k, Blocks.air); 
          if (Par2World.getBlock(this.i + 1, this.j + 2, this.k + 1) == Blocks.iron_bars)
            Par2World.setBlock(this.i + 1, this.j + 2, this.k + 1, Blocks.air); 
          if (Par2World.getBlock(this.i + 1, this.j + 2, this.k) == Blocks.iron_bars)
            Par2World.setBlock(this.i + 1, this.j + 2, this.k, Blocks.air); 
          if (Par2World.getBlock(this.i + 1, this.j + 2, this.k - 1) == Blocks.iron_bars)
            Par2World.setBlock(this.i + 1, this.j + 2, this.k - 1, Blocks.air); 
          if (Par2World.getBlock(this.i, this.j + 2, this.k + 1) == Blocks.iron_bars)
            Par2World.setBlock(this.i, this.j + 2, this.k + 1, Blocks.air); 
          if (Par2World.getBlock(this.i, this.j + 2, this.k - 1) == Blocks.iron_bars)
            Par2World.setBlock(this.i, this.j + 2, this.k - 1, Blocks.air); 
          if (Par2World.getBlock(this.i - 1, this.j + 2, this.k + 1) == Blocks.iron_bars)
            Par2World.setBlock(this.i - 1, this.j + 2, this.k + 1, Blocks.air); 
          if (Par2World.getBlock(this.i - 1, this.j + 2, this.k) == Blocks.iron_bars)
            Par2World.setBlock(this.i - 1, this.j + 2, this.k, Blocks.air); 
          if (Par2World.getBlock(this.i - 1, this.j + 2, this.k - 1) == Blocks.iron_bars)
            Par2World.setBlock(this.i - 1, this.j + 2, this.k - 1, Blocks.air); 
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Steel Release: Steel Shield Technique-Deactivate"));
          Par1ItemStack.setItemDamage(0);
        } 
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "A jutsu that creates a shield");
    par3List.add(EnumChatFormatting.DARK_AQUA + "of iron barbs around the user");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + '\005');
  }
}

package alcoholmod.Mathioks.Final.CT;

import alcoholmod.Mathioks.Entity.EntityKaguyaSpearBones;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityFallingBlock;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class ItemChibakuTensei extends Item {
  private boolean isinair;
  
  private EntityKaguyaSpearBones EntityKaguyaSpearBones;
  
  public int counter = 0;
  
  public int counter2 = 0;
  
  private EntityCT EntityCT;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public ItemChibakuTensei() {
    setMaxDamage(3700);
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (this.EntityCT != null);
    for (int i = 0; i < 40; i++) {
      int r = Par2World.rand.nextInt(40);
      int angle = Par2World.rand.nextInt(360);
      int x = MathHelper.floor_double(this.EntityCT.posX + r * Math.sin(angle / 180.0D * Math.PI));
      int y = MathHelper.floor_double(this.EntityCT.posY);
      int z;
      for (z = MathHelper.floor_double(this.EntityCT.posZ + r * Math.cos(angle / 180.0D * Math.PI)); Par2World.isAirBlock(x, y, z); y--);
      if (Par2World.isAirBlock(x, y + 1, z) && Par2World.isAirBlock(x, y + 2, z) && Par2World.isAirBlock(x, y + 3, z) && !Par2World.isAirBlock(x, y, z)) {
        Block block = Par2World.getBlock(x, y, z);
        int meta = Par2World.getBlockMetadata(x, y, z);
        EntityFallingBlock entity = new EntityFallingBlock(Par2World, x + 0.5D, y + 1.5D, z + 0.5D, block, meta);
        entity.motionY = 1.0D;
        Par2World.spawnEntityInWorld((Entity)entity);
        Par2World.setBlockToAir(x, y, z);
      } 
      if (this.counter2 == 0)
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Chibaku Tensei!!!")); 
      this.counter += 600;
    } 
    return Par1ItemStack;
  }
}

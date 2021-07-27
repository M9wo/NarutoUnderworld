package alcoholmod.Mathioks.SevenSwordsmen;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class ScytheHidanItem extends ItemSword {
  public ScytheHidanItem(Item.ToolMaterial mat) {
    super(mat);
    setFull3D();
    setUnlocalizedName("scytheHidani");
    setCreativeTab(AlcoholMod.tabTools);
  }
  
  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister iconReg) {
    this.itemIcon = iconReg.registerIcon("tm:" + getUnlocalizedName().substring(getUnlocalizedName().indexOf(".") + 1));
  }
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null) {
      if (par1ItemStack.stackTagCompound == null) {
        par1ItemStack.stackTagCompound = new NBTTagCompound();
        par1ItemStack.stackTagCompound.setString("HitEntity", "empty");
        par1ItemStack.stackTagCompound.setInteger("Counter", 0);
      } 
      if (par1ItemStack.stackTagCompound != null) {
        int counter = par1ItemStack.stackTagCompound.getInteger("Counter");
        if (counter > 0) {
          counter--;
          par1ItemStack.stackTagCompound.setInteger("Counter", counter);
        } 
      } 
    } 
  }
  
  public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase) {
    return true;
  }
  
  public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
    ExtendedPlayer props = ExtendedPlayer.get(player);
    stack.stackTagCompound.setString("HitEntity", entity.getUniqueID().toString());
    boolean canAttack = false;
    if (props.getKenjutsu() < 3.0D)
      canAttack = true; 
    if (props.getKenjutsu() >= 3.0D)
      canAttack = false; 
    return canAttack;
  }
  
  public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack) {
    if (entityLiving instanceof EntityPlayer) {
      boolean canSwing = false;
      ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)entityLiving);
      if (props.getKenjutsu() < 3.0D)
        canSwing = true; 
      if (props.getKenjutsu() >= 3.0D)
        canSwing = false; 
      return canSwing;
    } 
    return false;
  }
  
  public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entity) {
    if (!world.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(entity);
      if (props.getDeathPossession() == 2) {
        int counter = itemstack.stackTagCompound.getInteger("Counter");
        if (counter == 0) {
          List<Entity> list = world.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox(entity.posX - 80.0D, entity.posY - 80.0D, entity.posZ - 80.0D, entity.posX + 80.0D, entity.posY + 80.0D, entity.posZ + 80.0D));
          for (int k2 = 0; k2 < list.size(); k2++) {
            Entity entity2 = list.get(k2);
            String user = entity.getUniqueID().toString();
            entity2.getDistance(entity.posX, entity.posY, entity.posZ);
            if (entity2 instanceof EntityLivingBase && entity2.getUniqueID().toString().equals(itemstack.stackTagCompound.getString("HitEntity"))) {
              entity2.attackEntityFrom(DamageSource.causeThornsDamage((Entity)entity), 5.0F);
              entity.attackEntityFrom(DamageSource.magic, 5.0F);
              if (((EntityLivingBase)entity2).getHealth() == 0.0F);
              counter = 40;
              itemstack.stackTagCompound.setInteger("Counter", counter);
            } 
          } 
        } 
      } 
    } 
    return itemstack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    par3List.add(EnumChatFormatting.DARK_AQUA + "A Scythe typically used by");
    par3List.add(EnumChatFormatting.DARK_AQUA + "members of the Jashin-Religion");
    par3List.add(EnumChatFormatting.DARK_AQUA + "Right click in a jashin-ritual circle");
    par3List.add(EnumChatFormatting.DARK_AQUA + "to damage both user aswell as last hit enemy");
    par3List.add(EnumChatFormatting.GOLD + "Kenjutsu: 100");
  }
}

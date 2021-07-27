package alcoholmod.Mathioks.Armor;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.proxys.ClientProxy;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ExtraArmor10 extends ItemArmor {
  private String[] armorTypes = new String[] { "helmetGenin", "chestplateGenin", "legsGenin", "bootsGenin" };
  
  public ExtraArmor10(ItemArmor.ArmorMaterial armorMaterial_, int i, int armorType) {
    super(armorMaterial_, i, armorType);
  }
  
  public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer) {
    if (!stack.getItem().equals(AlcoholMod.helmetGenin) && !stack.getItem().equals(AlcoholMod.chestplateGenin) && !stack.getItem().equals(AlcoholMod.bootsGenin) && !stack.getItem().equals(AlcoholMod.legsGenin))
      return stack.getItem().equals(AlcoholMod.legsTest) ? "tm:textures/armor/Genin.png" : null; 
    return "tm:textures/armor/Genin.png";
  }
  
  public void registerIcons(IIconRegister reg) {
    if (this == AlcoholMod.helmetGenin)
      this.itemIcon = reg.registerIcon("tm:helmetGenin"); 
    if (this == AlcoholMod.chestplateGenin)
      this.itemIcon = reg.registerIcon("tm:genin_chest"); 
    if (this == AlcoholMod.legsGenin)
      this.itemIcon = reg.registerIcon("tm:genin_leg_1"); 
    if (this == AlcoholMod.bootsGenin)
      this.itemIcon = reg.registerIcon("tm:genin_boots"); 
  }
  
  @SideOnly(Side.CLIENT)
  public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int armorSlot) {
    ModelBiped armorModel = (ModelBiped)ClientProxy.armorModels.get(this);
    if (armorModel != null)
      if (entityLiving instanceof EntityPlayer) {
        armorModel.bipedHead.showModel = (armorSlot == 0);
        armorModel.bipedHeadwear.showModel = false;
        armorModel.bipedBody.showModel = (armorSlot == 1 || armorSlot == 2);
        armorModel.bipedRightArm.showModel = (armorSlot == 1);
        armorModel.bipedLeftArm.showModel = (armorSlot == 1);
        armorModel.bipedRightLeg.showModel = (armorSlot == 2 || armorSlot == 3);
        armorModel.bipedLeftLeg.showModel = (armorSlot == 2 || armorSlot == 3);
        armorModel.isSneak = entityLiving.isSneaking();
        armorModel.isRiding = entityLiving.isRiding();
        armorModel.isChild = entityLiving.isChild();
        armorModel.heldItemRight = 0;
        armorModel.aimedBow = false;
        EntityPlayer player = (EntityPlayer)entityLiving;
        ItemStack held_item = player.getEquipmentInSlot(0);
        if (held_item != null) {
          armorModel.heldItemRight = 1;
          if (player.getItemInUseCount() > 0) {
            EnumAction enumaction = held_item.getItemUseAction();
            if (enumaction == EnumAction.bow) {
              armorModel.aimedBow = true;
            } else if (enumaction == EnumAction.block) {
              armorModel.heldItemRight = 3;
            } 
          } 
        } 
      } else {
        armorModel.bipedHead.showModel = (armorSlot == 0);
        armorModel.bipedHeadwear.showModel = false;
        armorModel.bipedBody.showModel = (armorSlot == 1 || armorSlot == 2);
        armorModel.bipedRightArm.showModel = (armorSlot == 1);
        armorModel.bipedLeftArm.showModel = (armorSlot == 1);
        armorModel.bipedRightLeg.showModel = (armorSlot == 2 || armorSlot == 3);
        armorModel.bipedLeftLeg.showModel = (armorSlot == 2 || armorSlot == 3);
        armorModel.isSneak = entityLiving.isSneaking();
        armorModel.isRiding = entityLiving.isRiding();
        armorModel.isChild = entityLiving.isChild();
        armorModel.heldItemRight = 0;
        armorModel.aimedBow = false;
        if (entityLiving.getHeldItem() != null)
          armorModel.heldItemRight = 1; 
      }  
    return armorModel;
  }
}

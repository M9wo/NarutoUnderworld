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

public class ExtraArmor61 extends ItemArmor {
  private String[] armorTypes = new String[] { "helmetNaruto", "chestplateNaruto", "legsNaruto", "bootsNaruto" };
  
  private boolean DontShowArmor;
  
  private boolean AllowPuttingOnArmor;
  
  private boolean OtherMode;
  
  public ExtraArmor61(ItemArmor.ArmorMaterial armorMaterial_, int renderindex, int armorType) {
    super(armorMaterial_, renderindex, armorType);
  }
  
  public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer) {
    if (!stack.getItem().equals(AlcoholMod.helmetNaruto) && !stack.getItem().equals(AlcoholMod.chestplateNaruto) && !stack.getItem().equals(AlcoholMod.bootsNaruto) && !stack.getItem().equals(AlcoholMod.legsNaruto))
      return stack.getItem().equals(AlcoholMod.legsNaruto) ? "tm:textures/armor/DONE/Naruto.png" : null; 
    return "tm:textures/armor/DONE/Naruto.png";
  }
  
  public void setDamage(ItemStack stack, int damage) {}
  
  public void registerIcons(IIconRegister reg) {
    if (this == AlcoholMod.helmetNaruto)
      this.itemIcon = reg.registerIcon("tm:anbu_mask_14(4963)"); 
    if (this == AlcoholMod.chestplateNaruto)
      this.itemIcon = reg.registerIcon("tm:chestplateNaruto"); 
    if (this == AlcoholMod.legsNaruto)
      this.itemIcon = reg.registerIcon("tm:legsNaruto"); 
    if (this == AlcoholMod.bootsNaruto)
      this.itemIcon = reg.registerIcon("tm:bootsNaruto"); 
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

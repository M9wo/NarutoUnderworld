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

public class ExtraArmor49 extends ItemArmor {
  private String[] armorTypes = new String[] { "helmetnarutothelast", "chestplatenarutothelast", "legsnarutothelast", "bootsnarutothelast" };
  
  private boolean DontShowArmor;
  
  private boolean AllowPuttingOnArmor;
  
  private boolean OtherMode;
  
  public ExtraArmor49(ItemArmor.ArmorMaterial armorMaterial_, int renderindex, int armorType) {
    super(armorMaterial_, renderindex, armorType);
  }
  
  public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer) {
    if (!stack.getItem().equals(AlcoholMod.helmetnarutothelast) && !stack.getItem().equals(AlcoholMod.chestplatenarutothelast) && !stack.getItem().equals(AlcoholMod.bootsnarutothelast) && !stack.getItem().equals(AlcoholMod.legsnarutothelast))
      return stack.getItem().equals(AlcoholMod.legsnarutothelast) ? "tm:textures/armor/DONE/narutothelast.png" : null; 
    return "tm:textures/armor/DONE/narutothelast.png";
  }
  
  public void registerIcons(IIconRegister reg) {
    if (this == AlcoholMod.helmetnarutothelast)
      this.itemIcon = reg.registerIcon("tm:helmetnarutothelast"); 
    if (this == AlcoholMod.chestplatenarutothelast)
      this.itemIcon = reg.registerIcon("tm:chestplatenarutothelast"); 
    if (this == AlcoholMod.legsnarutothelast)
      this.itemIcon = reg.registerIcon("tm:legsnarutothelast"); 
    if (this == AlcoholMod.bootsnarutothelast)
      this.itemIcon = reg.registerIcon("tm:bootsnarutothelast"); 
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

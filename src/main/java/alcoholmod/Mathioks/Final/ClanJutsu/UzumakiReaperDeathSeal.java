package alcoholmod.Mathioks.Final.ClanJutsu;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.JutsuItem;
import alcoholmod.Mathioks.NickModels.UzumakiShinigamiEntity;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class UzumakiReaperDeathSeal extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public UzumakiReaperDeathSeal() {
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if (par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
      par1ItemStack.stackTagCompound.setInteger("counter", 0);
      par1ItemStack.stackTagCompound.setInteger("stage", 0);
      par1ItemStack.stackTagCompound.setInteger("particles", 0);
      par1ItemStack.stackTagCompound.setInteger("kd", 0);
      par1ItemStack.stackTagCompound.setBoolean("MistMode", false);
      par1ItemStack.stackTagCompound.setBoolean("Found", false);
    } 
    boolean MistMode = par1ItemStack.stackTagCompound.getBoolean("MistMode");
    boolean Found = par1ItemStack.stackTagCompound.getBoolean("Found");
    int kd = par1ItemStack.stackTagCompound.getInteger("kd");
    if (MistMode) {
      int counter = par1ItemStack.stackTagCompound.getInteger("counter");
      if (counter > 0 && !Found) {
        counter--;
        par1ItemStack.stackTagCompound.setInteger("counter", counter);
      } 
      for (int i = 0; i < 10; i++)
        ((EntityPlayer)par3Entity).worldObj.spawnParticle("magicCrit", par3Entity.posX, par3Entity.posY + par2World.rand.nextDouble() * 1.0D, par3Entity.posZ, par2World.rand.nextGaussian(), 0.0D, par2World.rand.nextGaussian()); 
      List<Entity> list = par2World.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox(((EntityPlayer)par3Entity).posX - 10.0D, ((EntityPlayer)par3Entity).posY - 3.0D, ((EntityPlayer)par3Entity).posZ - 10.0D, ((EntityPlayer)par3Entity).posX + 10.0D, ((EntityPlayer)par3Entity).posY + 3.0D, ((EntityPlayer)par3Entity).posZ + 10.0D));
      if ((EntityPlayer)par3Entity != null)
        for (int k2 = 0; k2 < list.size(); k2++) {
          if (!par2World.isRemote) {
            Entity entity = list.get(k2);
            String user = ((EntityPlayer)par3Entity).getUniqueID().toString();
            entity.getDistance(((EntityPlayer)par3Entity).posX, ((EntityPlayer)par3Entity).posY, ((EntityPlayer)par3Entity).posZ);
            if (entity instanceof net.minecraft.entity.EntityLiving && entity instanceof EntityLivingBase) {
              ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 20, 100));
              par1ItemStack.stackTagCompound.setBoolean("Found", true);
            } 
            if (entity instanceof EntityPlayer)
              if (entity.getUniqueID().toString().equals(user)) {
                ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 20, 100));
                par1ItemStack.stackTagCompound.setBoolean("Found", true);
              } else {
                ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 20, 100));
                par1ItemStack.stackTagCompound.setBoolean("Found", true);
              }  
          } 
        }  
      if (Found) {
        UzumakiShinigamiEntity fireball2 = new UzumakiShinigamiEntity(par2World);
        if (!par2World.isRemote) {
          fireball2.setPosition(par3Entity.posX, par3Entity.posY, par3Entity.posZ);
          fireball2.func_152115_b(((EntityPlayer)par3Entity).getUniqueID().toString());
          fireball2.setTamed(true);
          par2World.spawnEntityInWorld((Entity)fireball2);
          par1ItemStack.stackTagCompound.setBoolean("Found", false);
          par1ItemStack.stackTagCompound.setInteger("counter", 0);
          par1ItemStack.stackTagCompound.setBoolean("MistMode", false);
        } 
      } 
      if (counter == 0) {
        MistMode = false;
        par1ItemStack.stackTagCompound.setBoolean("MistMode", MistMode);
      } 
    } 
    if (kd > 0) {
      kd--;
      par1ItemStack.stackTagCompound.setInteger("kd", kd);
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      int kd = Par1ItemStack.stackTagCompound.getInteger("kd");
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName()) && props.getClanName().contains("Uzumaki")) {
        if (kd <= 0) {
          if (props.getKinjutsu() >= 65 && props.getCurrentMana() >= 150) {
            int counter = Par1ItemStack.stackTagCompound.getInteger("counter");
            if (counter == 0) {
              counter = 70;
              Par1ItemStack.stackTagCompound.setInteger("counter", counter);
              boolean MistMode = Par1ItemStack.stackTagCompound.getBoolean("MistMode");
              MistMode = true;
              Par1ItemStack.stackTagCompound.setBoolean("MistMode", MistMode);
              props.consumeMana(150);
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Forbidden Jutsu: Reaper Death Seal!!"));
              Par1ItemStack.stackTagCompound.setInteger("kd", 36000);
            } 
          } 
        } else {
          Par3EntityPlayer.addChatMessage((IChatComponent)new ChatComponentText("Jutsu on cooldown"));
        } 
      } else {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You are not the owner of this jutsu"));
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "A Sealing technique developped by");
    par3List.add(EnumChatFormatting.DARK_AQUA + "members of the Uzumaki clan to call upon");
    par3List.add(EnumChatFormatting.DARK_AQUA + "the power of the Shinigami.");
    par3List.add(EnumChatFormatting.DARK_AQUA + "Summons the Shinigami and takes the souls of");
    par3List.add(EnumChatFormatting.DARK_AQUA + "everyone within a 20 block radius aswell as");
    par3List.add(EnumChatFormatting.DARK_AQUA + "seal their chakra.");
    par3List.add(EnumChatFormatting.RED + "Chakra Cost: 150");
    par3List.add(EnumChatFormatting.RED + "Kinjutsu Needed: 65");
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Cool Down: " + par1ItemStack.stackTagCompound.getInteger("kd")); 
  }
}

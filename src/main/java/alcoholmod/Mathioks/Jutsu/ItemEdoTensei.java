package alcoholmod.Mathioks.Jutsu;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.CT.EdoCageEntity;
import alcoholmod.Mathioks.Final.CT.EdoCageEntity_1;
import alcoholmod.Mathioks.Final.CT.EdoCageEntity_2;
import alcoholmod.Mathioks.Final.CT.EdoCageEntity_3;
import alcoholmod.Mathioks.Final.CT.EdoCageEntity_4;
import alcoholmod.Mathioks.Final.CT.EdoCageEntity_5;
import alcoholmod.Mathioks.Final.JutsuItem;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class ItemEdoTensei extends JutsuItem {
  private boolean isinair;
  
  private Entity p_70085_1_;
  
  private boolean startCounter = false;
  
  private boolean start = false;
  
  private int i;
  
  private int j;
  
  private int k;
  
  private int counter = 0;
  
  private Object worldObj;
  
  public ItemEdoTensei() {
    setMaxDamage(9600);
    isDamageable();
    this.maxStackSize = 1;
  }
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null) {
      if (par1ItemStack.stackTagCompound == null) {
        par1ItemStack.stackTagCompound = new NBTTagCompound();
        par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
        par1ItemStack.stackTagCompound.setInteger("counter", 0);
        par1ItemStack.stackTagCompound.setString("summon", "Hashirama");
        par1ItemStack.stackTagCompound.setInteger("switchCounter", 0);
      } 
      int c = par1ItemStack.stackTagCompound.getInteger("counter");
      if (c > 0) {
        c--;
        par1ItemStack.stackTagCompound.setInteger("counter", c);
      } 
      int switchCounter = par1ItemStack.stackTagCompound.getInteger("switchCounter");
      if (switchCounter > 0) {
        switchCounter--;
        par1ItemStack.stackTagCompound.setInteger("switchCounter", switchCounter);
      } 
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote)
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
        if (Par3EntityPlayer.isSneaking()) {
          int switchCounter = Par1ItemStack.stackTagCompound.getInteger("switchCounter");
          if (switchCounter == 0) {
            if (Par1ItemStack.stackTagCompound.getString("summon").equals("Hashirama")) {
              Par1ItemStack.stackTagCompound.setString("summon", "Hiruzen");
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Changed summon to: Hiruzen"));
            } else if (Par1ItemStack.stackTagCompound.getString("summon").equals("Hiruzen")) {
              Par1ItemStack.stackTagCompound.setString("summon", "Madara");
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Changed summon to: Madara"));
            } else if (Par1ItemStack.stackTagCompound.getString("summon").equals("Madara")) {
              Par1ItemStack.stackTagCompound.setString("summon", "Nagato");
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Changed summon to: Nagato"));
            } else if (Par1ItemStack.stackTagCompound.getString("summon").equals("Nagato")) {
              Par1ItemStack.stackTagCompound.setString("summon", "Sasori");
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Changed summon to: Sasori"));
            } else if (Par1ItemStack.stackTagCompound.getString("summon").equals("Sasori")) {
              Par1ItemStack.stackTagCompound.setString("summon", "Sakon");
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Changed summon to: Sakon"));
            } else if (Par1ItemStack.stackTagCompound.getString("summon").equals("Sakon")) {
              Par1ItemStack.stackTagCompound.setString("summon", "Hashirama");
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Changed summon to: Hashirama"));
            } 
            switchCounter = 3;
            Par1ItemStack.stackTagCompound.setInteger("switchCounter", switchCounter);
          } 
        } else {
          ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
          int c = Par1ItemStack.stackTagCompound.getInteger("counter");
          if (c == 0)
            if (props.getCurrentMana() >= 300 + props.getNinjutsu() / 250) {
              Vec3 look = Par3EntityPlayer.getLookVec();
              if (Par1ItemStack.stackTagCompound.getString("summon").equals("Hashirama")) {
                EdoCageEntity_1 fireball2 = new EdoCageEntity_1(Par2World, (EntityLivingBase)Par3EntityPlayer);
                fireball2.setPosition(Par3EntityPlayer.posX, Par3EntityPlayer.posY - 3.1D, Par3EntityPlayer.posZ);
                Par2World.spawnEntityInWorld((Entity)fireball2);
                this.i = MathHelper.floor_double(Par3EntityPlayer.posX);
                this.j = MathHelper.floor_double(Par3EntityPlayer.posY);
                this.k = MathHelper.floor_double(Par3EntityPlayer.posZ);
                this.start = true;
                if (!this.startCounter)
                  this.startCounter = true; 
              } else if (Par1ItemStack.stackTagCompound.getString("summon").equals("Hiruzen")) {
                EdoCageEntity_2 fireball2 = new EdoCageEntity_2(Par2World, (EntityLivingBase)Par3EntityPlayer);
                fireball2.setPosition(Par3EntityPlayer.posX, Par3EntityPlayer.posY - 3.1D, Par3EntityPlayer.posZ);
                Par2World.spawnEntityInWorld((Entity)fireball2);
                this.i = MathHelper.floor_double(Par3EntityPlayer.posX);
                this.j = MathHelper.floor_double(Par3EntityPlayer.posY);
                this.k = MathHelper.floor_double(Par3EntityPlayer.posZ);
                this.start = true;
                if (!this.startCounter)
                  this.startCounter = true; 
              } else if (Par1ItemStack.stackTagCompound.getString("summon").equals("Madara")) {
                EdoCageEntity fireball2 = new EdoCageEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
                fireball2.setPosition(Par3EntityPlayer.posX, Par3EntityPlayer.posY - 3.1D, Par3EntityPlayer.posZ);
                Par2World.spawnEntityInWorld((Entity)fireball2);
                this.i = MathHelper.floor_double(Par3EntityPlayer.posX);
                this.j = MathHelper.floor_double(Par3EntityPlayer.posY);
                this.k = MathHelper.floor_double(Par3EntityPlayer.posZ);
                this.start = true;
                if (!this.startCounter)
                  this.startCounter = true; 
              } else if (Par1ItemStack.stackTagCompound.getString("summon").equals("Nagato")) {
                EdoCageEntity_3 fireball2 = new EdoCageEntity_3(Par2World, (EntityLivingBase)Par3EntityPlayer);
                fireball2.setPosition(Par3EntityPlayer.posX, Par3EntityPlayer.posY - 3.1D, Par3EntityPlayer.posZ);
                Par2World.spawnEntityInWorld((Entity)fireball2);
                this.i = MathHelper.floor_double(Par3EntityPlayer.posX);
                this.j = MathHelper.floor_double(Par3EntityPlayer.posY);
                this.k = MathHelper.floor_double(Par3EntityPlayer.posZ);
                this.start = true;
                if (!this.startCounter)
                  this.startCounter = true; 
              } else if (Par1ItemStack.stackTagCompound.getString("summon").equals("Sakon")) {
                EdoCageEntity_4 fireball2 = new EdoCageEntity_4(Par2World, (EntityLivingBase)Par3EntityPlayer);
                fireball2.setPosition(Par3EntityPlayer.posX, Par3EntityPlayer.posY - 3.1D, Par3EntityPlayer.posZ);
                Par2World.spawnEntityInWorld((Entity)fireball2);
                this.i = MathHelper.floor_double(Par3EntityPlayer.posX);
                this.j = MathHelper.floor_double(Par3EntityPlayer.posY);
                this.k = MathHelper.floor_double(Par3EntityPlayer.posZ);
                this.start = true;
                if (!this.startCounter)
                  this.startCounter = true; 
              } else if (Par1ItemStack.stackTagCompound.getString("summon").equals("Sasori")) {
                EdoCageEntity_5 fireball2 = new EdoCageEntity_5(Par2World, (EntityLivingBase)Par3EntityPlayer);
                fireball2.setPosition(Par3EntityPlayer.posX, Par3EntityPlayer.posY - 3.1D, Par3EntityPlayer.posZ);
                Par2World.spawnEntityInWorld((Entity)fireball2);
                this.i = MathHelper.floor_double(Par3EntityPlayer.posX);
                this.j = MathHelper.floor_double(Par3EntityPlayer.posY);
                this.k = MathHelper.floor_double(Par3EntityPlayer.posZ);
                this.start = true;
                if (!this.startCounter)
                  this.startCounter = true; 
              } 
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Forbidden Technique: EDO-TENSEI!!!"));
              props.consumeMana(300 + props.getNinjutsu() / 250);
              c = 2400;
              Par1ItemStack.stackTagCompound.setInteger("counter", c);
              this.isinair = true;
            } else {
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You don't have enough chakra"));
            }  
        } 
      } else {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You are not the owner of this item"));
      }  
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null) {
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner"));
      par3List.add(EnumChatFormatting.AQUA + "Counter: " + par1ItemStack.stackTagCompound.getInteger("counter"));
      par3List.add(EnumChatFormatting.GOLD + "Summon: " + par1ItemStack.stackTagCompound.getString("summon"));
    } 
    par3List.add(EnumChatFormatting.DARK_PURPLE + "A jutsu created by the 2nd Hokage");
    par3List.add(EnumChatFormatting.DARK_PURPLE + "and used by Orochimaru and Kabuto");
    par3List.add(EnumChatFormatting.DARK_PURPLE + "Yakushi.");
    par3List.add(EnumChatFormatting.DARK_PURPLE + "Summons the soul of the selected person.");
    par3List.add(EnumChatFormatting.DARK_RED + "Chakra Cost: " + (300 + props.getNinjutsu() / 250));
  }
}

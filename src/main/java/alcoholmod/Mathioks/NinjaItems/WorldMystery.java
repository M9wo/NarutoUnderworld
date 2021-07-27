package alcoholmod.Mathioks.NinjaItems;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SyncIntelligenceMessage;
import alcoholmod.Mathioks.PacketDispatcher;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class WorldMystery extends Item {
  Random rand = new Random();
  
  private boolean isinair;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.rare;
  }
  
  public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer player) {
    if (!par2World.isRemote) {
      par1ItemStack.stackSize--;
      ExtendedPlayer props = ExtendedPlayer.get(player);
      if (props.getIntelligence() < 100 && !player.capabilities.isCreativeMode) {
        if (props.getIntelligence() < 98) {
          props.setIntelligence(props.getIntelligence() + this.rand.nextInt(3) + 1);
          PacketDispatcher.sendTo((IMessage)new SyncIntelligenceMessage(player), (EntityPlayerMP)player);
        } 
        if (props.getIntelligence() == 98) {
          props.setIntelligence(props.getIntelligence() + this.rand.nextInt(2) + 1);
          PacketDispatcher.sendTo((IMessage)new SyncIntelligenceMessage(player), (EntityPlayerMP)player);
        } 
        if (props.getIntelligence() == 99) {
          props.setIntelligence(props.getIntelligence() + 1);
          PacketDispatcher.sendTo((IMessage)new SyncIntelligenceMessage(player), (EntityPlayerMP)player);
        } 
        player.addChatMessage((IChatComponent)new ChatComponentText("Your Intelligence increased as you read about the History of the World"));
      } 
    } 
    return par1ItemStack;
  }
  
  public WorldMystery() {
    setMaxDamage(12001);
    this.maxStackSize = 1;
  }
}

package alcoholmod.Mathioks.FoodItems;

import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class PakunRamen extends ItemFood {
  public PakunRamen(int p_i45340_1_, boolean p_i45340_2_) {
    super(p_i45340_1_, p_i45340_2_);
    this.maxStackSize = 15;
  }
  
  protected void onFoodEaten(ItemStack p_77849_1_, World world, EntityPlayer player) {
    if (!world.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(player);
      props.setCurrentMana(props.getCurrentMana() + 100);
      props.setCurrentSenjutsu(props.getCurrentSenjutsu() + 50);
      player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 400, 1));
      player.addPotionEffect(new PotionEffect(Potion.heal.id, 150, 1));
      int rand = world.rand.nextInt(5);
      if (rand == 0)
        player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + "Pakkun: Thank you for the support! eat up!")); 
      if (rand == 1)
        player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Mathioks: Thank you! Itadakimasu!")); 
      if (rand == 2)
        player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + "Pakkun: What's up Dog? oh sorry, you're human!")); 
      if (rand == 3) {
        player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + "Pakkun: You know, the life of a Pakkun ain't all that easy!"));
        player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + "Pakkun: I'm just sitting here in my couch maxin' relaxin'"));
        player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + "Pakkun: till suddenly Mathioks calls me and goes all"));
        player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + "Pakkun: 'Pakkun! You need to make your special ramen!"));
        player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + "Pakkun: we made it to 1500 subscribers!!'"));
        player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + "Pakkun: So goodbye chill time, hello cooking time, at least I like it!"));
      } 
      if (rand == 4) {
        player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Mathioks: Hey there! saw you got 15 ramen pieces?"));
        player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Mathioks: that's 1 for every 100 of you!"));
        player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Mathioks: I wanted to give you 1500"));
        player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Mathioks: but that would break the game"));
        player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Mathioks: Once again, thank you all so much! ^^"));
      } 
    } 
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    par3List.add(EnumChatFormatting.BLUE + "A special kind of ramen created by");
    par3List.add(EnumChatFormatting.BLUE + "Pakkun to commemorate 1500 subscribers");
    par3List.add(EnumChatFormatting.BLUE + "on the 'Mathioks Youtube Channel'");
    par3List.add(EnumChatFormatting.BLUE + "Restores chakra, senjutsu");
    par3List.add(EnumChatFormatting.BLUE + "Heals and increases speed!");
    par3List.add(EnumChatFormatting.BLUE + "Itadakimasu!");
  }
}

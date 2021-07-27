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

public class BrooklynrageRamen extends ItemFood {
  public BrooklynrageRamen(int p_i45340_1_, boolean p_i45340_2_) {
    super(p_i45340_1_, p_i45340_2_);
    this.maxStackSize = 15;
  }
  
  protected void onFoodEaten(ItemStack p_77849_1_, World world, EntityPlayer player) {
    if (!world.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(player);
      props.setCurrentMana(props.getCurrentMana() + 100);
      props.setCurrentSenjutsu(props.getCurrentSenjutsu() + 50);
      player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 500, 2));
      player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 500, 2));
      player.addPotionEffect(new PotionEffect(Potion.jump.id, 500, 1));
      player.addPotionEffect(new PotionEffect(Potion.heal.id, 100, 1));
      player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 1000, 2));
      int rand = world.rand.nextInt(5);
      if (rand == 0)
        player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.BOLD + "BrooklynRage: OOOOII!! Eat up lad!!")); 
      if (rand == 1)
        player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Mathioks & BrooklynRage: Sweet gig!! hows dat fo' sum ramen?!")); 
      if (rand == 2)
        player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.BOLD + "BrooklynRage: OI! Leave sum fo me too will yah?!")); 
      if (rand == 3) {
        player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.BOLD + "BrooklynRage: OI! Yah kneu... Mathioks be usin' me as his"));
        player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.BOLD + "BrooklynRage: guinea pig in dem jolly ol' vids o' his."));
        player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.BOLD + "BrooklynRage: but it's all in good fun yah feel meh."));
        player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.BOLD + "BrooklynRage: Oi got me sum good ramen afterwards every"));
        player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.BOLD + "BrooklynRage: toime, fillin up me belleh loike dere be no"));
        player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.BOLD + "BrooklynRage: tomorreu me lads und ladylads! HYOOOO"));
      } 
      if (rand == 4) {
        player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Mathioks: Second Special ramen..."));
        player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Mathioks: I wonder what others there are out there!"));
        player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Mathioks: But apart from that, thank you all so much! ^^"));
      } 
    } 
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    par3List.add(EnumChatFormatting.BLUE + "A special kind of ramen created by");
    par3List.add(EnumChatFormatting.BLUE + "BrooklynRage to commemorate 5000 subscribers");
    par3List.add(EnumChatFormatting.BLUE + "on the 'Mathioks Youtube Channel'");
    par3List.add(EnumChatFormatting.BLUE + "Restores chakra, senjutsu");
    par3List.add(EnumChatFormatting.BLUE + "Heals and increases speed!");
    par3List.add(EnumChatFormatting.BLUE + "aswell as Digspeed, Jump and");
    par3List.add(EnumChatFormatting.BLUE + "gives Nightvision");
    par3List.add(EnumChatFormatting.BLUE + "Itadakimasu!");
  }
}

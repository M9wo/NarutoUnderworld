package alcoholmod.Mathioks;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import java.util.Calendar;
import java.util.Random;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class OnMobDrop {
  Random rand = new Random();
  
  @SubscribeEvent
  public void onMobDropEvent(LivingDropsEvent event) {
    if (event.entity instanceof net.minecraft.entity.monster.EntityMob && ((event.source.getSourceOfDamage() instanceof net.minecraft.entity.projectile.EntityThrowable && event.source.getEntity() instanceof net.minecraft.entity.player.EntityPlayer) || (event.source.getSourceOfDamage() instanceof net.minecraft.entity.projectile.EntityArrow && event.source.getEntity() instanceof net.minecraft.entity.player.EntityPlayer) || (event.source.getSourceOfDamage() instanceof net.minecraft.entity.player.EntityPlayer && event.source.getEntity() instanceof net.minecraft.entity.player.EntityPlayer))) {
      Calendar calendar = event.entity.worldObj.getCurrentDate();
      if (calendar.get(2) + 1 == 3 && calendar.get(5) >= 30 && this.rand.nextDouble() * 3.0D < 1.0D) {
        int rand2 = event.entity.worldObj.rand.nextInt(6) + 1;
        if (rand2 == 1)
          event.entityLiving.dropItem(AlcoholMod.Easter2018CrackedEasterEggRed, 1); 
        if (rand2 == 2)
          event.entityLiving.dropItem(AlcoholMod.Easter2018CrackedEasterEggBlue, 1); 
        if (rand2 == 3)
          event.entityLiving.dropItem(AlcoholMod.Easter2018CrackedEasterEggGreen, 1); 
        if (rand2 == 4)
          event.entityLiving.dropItem(AlcoholMod.Easter2018CrackedEasterEggOrange, 1); 
        if (rand2 == 5)
          event.entityLiving.dropItem(AlcoholMod.Easter2018CrackedEasterEggPurple, 1); 
        if (rand2 == 6)
          event.entityLiving.dropItem(AlcoholMod.Easter2018CrackedEasterEggYellow, 1); 
      } 
      if (calendar.get(2) + 1 == 4 && calendar.get(5) >= 1 && calendar.get(5) <= 9 && this.rand.nextDouble() * 3.0D < 1.0D) {
        int rand2 = event.entity.worldObj.rand.nextInt(6) + 1;
        if (rand2 == 1)
          event.entityLiving.dropItem(AlcoholMod.Easter2018CrackedEasterEggRed, 1); 
        if (rand2 == 2)
          event.entityLiving.dropItem(AlcoholMod.Easter2018CrackedEasterEggBlue, 1); 
        if (rand2 == 3)
          event.entityLiving.dropItem(AlcoholMod.Easter2018CrackedEasterEggGreen, 1); 
        if (rand2 == 4)
          event.entityLiving.dropItem(AlcoholMod.Easter2018CrackedEasterEggOrange, 1); 
        if (rand2 == 5)
          event.entityLiving.dropItem(AlcoholMod.Easter2018CrackedEasterEggPurple, 1); 
        if (rand2 == 6)
          event.entityLiving.dropItem(AlcoholMod.Easter2018CrackedEasterEggYellow, 1); 
      } 
    } 
  }
}

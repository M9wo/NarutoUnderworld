package alcoholmod.Mathioks.TransformationsRealPackage;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import java.util.Iterator;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;

public class ByakuganTick {
  private int particleTick;
  
  private int hungerTick;
  
  private int howlTick;
  
  @SubscribeEvent
  public void playerTick(TickEvent.PlayerTickEvent event) {
    if (event.phase == TickEvent.Phase.START) {
      EntityPlayer player = event.player;
      ExtendedPlayer props = ExtendedPlayer.get(player);
      if (props.getByakuganActive() || props.getJouganActive())
        this.particleTick++; 
      if (this.particleTick > 19) {
        int range = 80;
        player.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, AxisAlignedBB.getBoundingBox(player.posX - range, player.posY - range, player.posZ - range, player.posX + range, player.posY + range, player.posZ + range));
        List playerentities = player.worldObj.getEntitiesWithinAABB(EntityPlayer.class, AxisAlignedBB.getBoundingBox(player.posX - range, player.posY - range, player.posZ - range, player.posX + range, player.posY + range, player.posZ + range));
        List<Entity> animalentities = player.worldObj.getEntitiesWithinAABB(EntityAnimal.class, AxisAlignedBB.getBoundingBox(player.posX - range, player.posY - range, player.posZ - range, player.posX + range, player.posY + range, player.posZ + range));
        List<Entity> mobentities = player.worldObj.getEntitiesWithinAABB(EntityMob.class, AxisAlignedBB.getBoundingBox(player.posX - range, player.posY - range, player.posZ - range, player.posX + range, player.posY + range, player.posZ + range));
        Iterator<Entity> var9 = playerentities.iterator();
        while (var9.hasNext()) {
          Entity e = var9.next();
          if (props.trackAll) {
            String user = event.player.getUniqueID().toString();
            if (!e.getUniqueID().toString().equals(user))
              AlcoholMod.proxy.generateScentParticles(e, 0.0F, 0.0F, 1.0F); 
          } 
        } 
        var9 = animalentities.iterator();
        while (var9.hasNext()) {
          Entity e = var9.next();
          if (props.trackAll)
            AlcoholMod.proxy.generateScentParticles(e, 0.0F, 1.0F, 0.0F); 
        } 
        var9 = mobentities.iterator();
        while (var9.hasNext()) {
          Entity e = var9.next();
          if (props.trackAll)
            AlcoholMod.proxy.generateScentParticles(e, 1.0F, 0.0F, 0.0F); 
        } 
        this.particleTick = 0;
      } 
    } 
  }
}

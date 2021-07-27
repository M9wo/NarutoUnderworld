package lc208.nam.hooklib.example;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import lc208.nam.hooklib.asm.Hook;
import lc208.nam.hooklib.asm.Hook.ReturnValue;
import lc208.nam.hooklib.asm.ReturnCondition;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.ForgeHooks;

public class AnnotationHooks {
  @SideOnly(Side.CLIENT)
  @Hook
  public static void resize(Minecraft mc, int x, int y) {
    System.out.println("Resize, x=" + x + ", y=" + y);
  }
  
  @Hook(injectOnExit = true, returnCondition = ReturnCondition.ALWAYS)
  public static int getTotalArmorValue(ForgeHooks fh, EntityPlayer player, @ReturnValue int returnValue) {
    return returnValue / 2;
  }
  
  @Hook(returnCondition = ReturnCondition.ON_TRUE, intReturnConstant = 100)
  public static boolean getPortalCooldown(EntityPlayer player) {
    return (player.dimension == 0);
  }
  
  @Hook(injectOnExit = true, returnCondition = ReturnCondition.ON_TRUE, returnAnotherMethod = "getBrightness")
  public static boolean getBrightnessForRender(Entity entity, float f) {
    return (entity.height > 1.5F);
  }
  
  public static int getBrightness(Entity entity, float f) {
    int oldValue = 0;
    int j = (oldValue >> 20 & 0xF) / 2;
    int k = (oldValue >> 4 & 0xF) / 2;
    return j << 20 | k << 4;
  }
}

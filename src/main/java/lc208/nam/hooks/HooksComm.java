package lc208.nam.hooks;

import cpw.mods.fml.common.event.FMLServerStartingEvent;
import flash.stardustmod.main.Main;
import lc208.nam.hooklib.asm.Hook;
import lc208.nam.hooklib.asm.ReturnCondition;

public class HooksComm {
  @Hook(returnCondition = ReturnCondition.ALWAYS)
  public static void serverLoad(Main m, FMLServerStartingEvent event) {}
}

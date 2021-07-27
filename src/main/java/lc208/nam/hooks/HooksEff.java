package lc208.nam.hooks;

import lc208.nam.hooklib.asm.Hook;
import lc208.nam.hooklib.asm.ReturnCondition;
import org.blockartistry.mod.DynSurround.VersionCheck;

public class HooksEff {
  @Hook(returnCondition = ReturnCondition.ALWAYS)
  public static void run(VersionCheck vc) {}
}

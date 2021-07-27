package lc208.nam.hooks;

import cpw.mods.fml.relauncher.FMLLaunchHandler;
import cpw.mods.fml.relauncher.Side;
import lc208.nam.hooklib.minecraft.HookLoader;
import lc208.nam.hooklib.minecraft.PrimaryClassTransformer;

public class HooksLoader extends HookLoader {
  Side side;
  
  public HooksLoader() {}
  
  public HooksLoader(Side side) {
    this.side = side;
  }
  
  public String[] getASMTransformerClass() {
    return new String[] { PrimaryClassTransformer.class.getName() };
  }
  
  public void registerHooks() {
    if (FMLLaunchHandler.side().isClient()) {
      registerHookContainer("lc208.nam.hooks.HooksGui");
      registerHookContainer("lc208.nam.hooks.HooksEnch");
    } 
    registerHookContainer("lc208.nam.hooks.Hooks");
    registerHookContainer("lc208.nam.hooks.HooksTai");
    registerHookContainer("lc208.nam.hooks.HooksComm");
    registerHookContainer("lc208.nam.hooks.HooksItemsSword");
    registerHookContainer("lc208.nam.hooks.HooksEff");
  }
}

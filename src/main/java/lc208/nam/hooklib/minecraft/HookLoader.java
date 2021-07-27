package lc208.nam.hooklib.minecraft;

import cpw.mods.fml.common.asm.transformers.DeobfuscationTransformer;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin;
import java.util.Map;
import lc208.nam.hooklib.asm.AsmHook;
import lc208.nam.hooklib.asm.ClassMetadataReader;
import lc208.nam.hooklib.asm.HookClassTransformer;

public abstract class HookLoader implements IFMLLoadingPlugin {
  private static DeobfuscationTransformer deobfuscationTransformer;
  
  private static ClassMetadataReader deobfuscationMetadataReader = new DeobfuscationMetadataReader();
  
  public static HookClassTransformer getTransformer() {
    return PrimaryClassTransformer.instance.registeredSecondTransformer ? MinecraftClassTransformer.instance : PrimaryClassTransformer.instance;
  }
  
  public static void registerHook(AsmHook hook) {
    getTransformer().registerHook(hook);
  }
  
  public static void registerHookContainer(String className) {
    getTransformer().registerHookContainer(className);
  }
  
  public static ClassMetadataReader getDeobfuscationMetadataReader() {
    return deobfuscationMetadataReader;
  }
  
  static DeobfuscationTransformer getDeobfuscationTransformer() {
    if (HookLibPlugin.getObfuscated() && deobfuscationTransformer == null)
      deobfuscationTransformer = new DeobfuscationTransformer(); 
    return deobfuscationTransformer;
  }
  
  public String[] getLibraryRequestClass() {
    return null;
  }
  
  public String getAccessTransformerClass() {
    return null;
  }
  
  public String[] getASMTransformerClass() {
    return null;
  }
  
  public String getModContainerClass() {
    return null;
  }
  
  public String getSetupClass() {
    return null;
  }
  
  public void injectData(Map<String, Object> data) {
    registerHooks();
  }
  
  protected abstract void registerHooks();
}

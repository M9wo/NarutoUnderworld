package lc208.nam.hooklib.example;

import lc208.nam.hooklib.minecraft.HookLoader;
import lc208.nam.hooklib.minecraft.PrimaryClassTransformer;

public class ExampleHookLoader extends HookLoader {
  public String[] getASMTransformerClass() {
    return new String[] { PrimaryClassTransformer.class.getName() };
  }
  
  public void registerHooks() {
    registerHookContainer("lc208.nam.hooklib.example.AnnotationHooks");
  }
}

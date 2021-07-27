package lc208.nam.hooklib.asm;

import org.objectweb.asm.MethodVisitor;

public abstract class HookInjectorFactory {
  protected boolean isPriorityInverted = false;
  
  abstract HookInjectorMethodVisitor createHookInjector(MethodVisitor paramMethodVisitor, int paramInt, String paramString1, String paramString2, AsmHook paramAsmHook, HookInjectorClassVisitor paramHookInjectorClassVisitor);
  
  static class MethodEnter extends HookInjectorFactory {
    public static final MethodEnter INSTANCE = new MethodEnter();
    
    public HookInjectorMethodVisitor createHookInjector(MethodVisitor mv, int access, String name, String desc, AsmHook hook, HookInjectorClassVisitor cv) {
      return new HookInjectorMethodVisitor.MethodEnter(mv, access, name, desc, hook, cv);
    }
  }
  
  static class MethodExit extends HookInjectorFactory {
    public static final MethodExit INSTANCE = new MethodExit();
    
    public HookInjectorMethodVisitor createHookInjector(MethodVisitor mv, int access, String name, String desc, AsmHook hook, HookInjectorClassVisitor cv) {
      return new HookInjectorMethodVisitor.MethodExit(mv, access, name, desc, hook, cv);
    }
  }
  
  static class LineNumber extends HookInjectorFactory {
    private int lineNumber;
    
    public LineNumber(int lineNumber) {
      this.lineNumber = lineNumber;
    }
    
    public HookInjectorMethodVisitor createHookInjector(MethodVisitor mv, int access, String name, String desc, AsmHook hook, HookInjectorClassVisitor cv) {
      return new HookInjectorMethodVisitor.LineNumber(mv, access, name, desc, hook, cv, this.lineNumber);
    }
  }
}

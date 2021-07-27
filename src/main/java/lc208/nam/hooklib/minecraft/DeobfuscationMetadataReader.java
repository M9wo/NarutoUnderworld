package lc208.nam.hooklib.minecraft;

import cpw.mods.fml.common.asm.transformers.deobf.FMLDeobfuscatingRemapper;
import java.io.IOException;
import java.lang.reflect.Method;
import lc208.nam.hooklib.asm.ClassMetadataReader;
import net.minecraft.launchwrapper.Launch;
import net.minecraft.launchwrapper.LaunchClassLoader;
import org.objectweb.asm.ClassVisitor;

public class DeobfuscationMetadataReader extends ClassMetadataReader {
  private static Method runTransformers;
  
  static {
    try {
      runTransformers = LaunchClassLoader.class.getDeclaredMethod("runTransformers", new Class[] { String.class, String.class, byte[].class });
      runTransformers.setAccessible(true);
    } catch (Exception e) {
      e.printStackTrace();
    } 
  }
  
  public byte[] getClassData(String className) throws IOException {
    byte[] bytes = super.getClassData(unmap(className.replace('.', '/')));
    return deobfuscateClass(className, bytes);
  }
  
  protected boolean checkSameMethod(String sourceName, String sourceDesc, String targetName, String targetDesc) {
    return (checkSameMethod(sourceName, targetName) && sourceDesc.equals(targetDesc));
  }
  
  protected ClassMetadataReader.MethodReference getMethodReferenceASM(String type, String methodName, String desc) throws IOException {
    ClassMetadataReader.FindMethodClassVisitor cv = new ClassMetadataReader.FindMethodClassVisitor(this, methodName, desc);
    byte[] bytes = getTransformedBytes(type);
    acceptVisitor(bytes, (ClassVisitor)cv);
    return cv.found ? new ClassMetadataReader.MethodReference(type, cv.targetName, cv.targetDesc) : null;
  }
  
  static byte[] deobfuscateClass(String className, byte[] bytes) {
    if (HookLoader.getDeobfuscationTransformer() != null)
      bytes = HookLoader.getDeobfuscationTransformer().transform(className, className, bytes); 
    return bytes;
  }
  
  private static byte[] getTransformedBytes(String type) throws IOException {
    String obfName = unmap(type);
    byte[] bytes = Launch.classLoader.getClassBytes(obfName);
    if (bytes == null)
      throw new RuntimeException("Bytes for " + obfName + " not found"); 
    try {
      bytes = (byte[])runTransformers.invoke(Launch.classLoader, new Object[] { obfName, type, bytes });
    } catch (Exception e) {
      e.printStackTrace();
    } 
    return bytes;
  }
  
  private static String unmap(String type) {
    if (HookLibPlugin.getObfuscated())
      return FMLDeobfuscatingRemapper.INSTANCE.unmap(type); 
    return type;
  }
  
  private static boolean checkSameMethod(String srgName, String mcpName) {
    if (HookLibPlugin.getObfuscated() && MinecraftClassTransformer.instance != null) {
      int methodId = MinecraftClassTransformer.getMethodId(srgName);
      String remappedName = MinecraftClassTransformer.instance.getMethodNames().get(Integer.valueOf(methodId));
      if (remappedName != null && remappedName.equals(mcpName))
        return true; 
    } 
    return srgName.equals(mcpName);
  }
}

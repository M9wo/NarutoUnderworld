package alcoholmod.Mathioks.TransformationsRealPackage;

import cpw.mods.fml.relauncher.ReflectionHelper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import net.minecraft.entity.Entity;

public class Helper {
  public static String entityToString(Entity e) {
    return (e == null) ? "Entity is null" : e.toString();
  }
  
  public static class Reflection {
    public static Object callMethod(Class cls, Object obj, String[] methodName, Class[] paramtype, Object... param) {
      if (param != null && paramtype.length != param.length)
        return null; 
      try {
        Method method = ReflectionHelper.findMethod(cls, obj, methodName, paramtype);
        return method.invoke(obj, param);
      } catch (Exception var6) {
        var6.printStackTrace();
        return null;
      } 
    }
    
    public static Object callMethod(Object obj, String[] methodName, Class[] paramtype, Object... param) {
      return callMethod(obj.getClass(), obj, methodName, paramtype, param);
    }
    
    public static Class[] createArray(Class... objects) {
      return objects;
    }
    
    public static Object getPrivateFinalField(Class cls, Object obj, String... fieldname) {
      try {
        Field privateStringField = ReflectionHelper.findField(cls, fieldname);
        return privateStringField.get(obj);
      } catch (Exception var4) {
        return null;
      } 
    }
    
    public static void setPrivateField(Class cls, Object obj, Object value, String... fieldname) {
      try {
        Field privateStringField = ReflectionHelper.findField(cls, fieldname);
        privateStringField.set(obj, value);
      } catch (Exception exception) {}
    }
  }
  
  public static class Obfuscation {
    private static final HashMap posNames = new HashMap<Object, Object>();
    
    private static void add(String key, String... value) {
      posNames.put(key, value);
    }
    
    public static void fillMap() {
      add("EntityPlayer/setSize", new String[] { "setSize", "func_70105_a" });
      add("EntityPlayer/sleeping", new String[] { "sleeping", "field_71083_bS" });
      add("EntityPlayer/sleepTimer", new String[] { "sleepTimer", "field_71076_b" });
      add("Minecraft/fileAssets", new String[] { "fileAssets", "field_110446_Y" });
      add("TileEntityBeacon/field_146015_k", new String[] { "field_146015_k" });
      add("Entity/setSize", new String[] { "setSize", "func_70105_a" });
      add("EntityPlayer/updateItemUse", new String[] { "updateItemUse", "func_71010_c" });
      add("EntityRenderer/loadShader", new String[] { "loadShader", "func_175069_a" });
      add("EntityRenderer/theShaderGroup", new String[] { "theShaderGroup", "field_147707_d" });
    }
    
    public static String[] getPosNames(String key) {
      return (String[])posNames.get(key);
    }
  }
}

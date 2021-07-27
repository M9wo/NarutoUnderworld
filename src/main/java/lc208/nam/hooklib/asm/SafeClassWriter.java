package lc208.nam.hooklib.asm;

import java.util.ArrayList;
import org.objectweb.asm.ClassWriter;

public class SafeClassWriter extends ClassWriter {
  private final ClassMetadataReader classMetadataReader;
  
  public SafeClassWriter(ClassMetadataReader classMetadataReader, int flags) {
    super(flags);
    this.classMetadataReader = classMetadataReader;
  }
  
  protected String getCommonSuperClass(String type1, String type2) {
    ArrayList<String> superClasses1 = this.classMetadataReader.getSuperClasses(type1);
    ArrayList<String> superClasses2 = this.classMetadataReader.getSuperClasses(type2);
    int size = Math.min(superClasses1.size(), superClasses2.size());
    int i;
    for (i = 0; i < size && ((String)superClasses1.get(i)).equals(superClasses2.get(i)); i++);
    if (i == 0)
      return "java/lang/Object"; 
    return superClasses1.get(i - 1);
  }
}
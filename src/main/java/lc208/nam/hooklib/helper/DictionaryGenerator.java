package lc208.nam.hooklib.helper;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.FileUtils;

public class DictionaryGenerator {
  public static void main(String[] args) throws Exception {
    File f1 = new File("methods.csv");
    List<String> lines = FileUtils.readLines(f1);
    lines.remove(0);
    HashMap<Integer, String> map = new HashMap<Integer, String>();
    for (String str : lines) {
      String[] splitted = str.split(",");
      int first = splitted[0].indexOf('_');
      int second = splitted[0].indexOf('_', first + 1);
      int id = Integer.valueOf(splitted[0].substring(first + 1, second)).intValue();
      map.put(Integer.valueOf(id), splitted[1]);
    } 
    DataOutputStream out = new DataOutputStream(new FileOutputStream("methods.bin"));
    out.writeInt(map.size());
    for (Map.Entry<Integer, String> entry : map.entrySet()) {
      out.writeInt(((Integer)entry.getKey()).intValue());
      out.writeUTF(entry.getValue());
    } 
    out.close();
  }
}

import java.util.*;

public class Using_Tree_Map {

  public static void main(String[] args) {
    TreeMap<String, Integer> T1 = new TreeMap<String, Integer>();
    T1.put("A", 1);
    T1.put("M", 5);
    T1.put("C", 4);
    T1.put("D", 6);
    T1.remove("D");
    for (Map.Entry<String, Integer> obj : T1.entrySet()) {
      System.out.println(obj.getKey() + " " + obj.getValue());
    }
  }
}

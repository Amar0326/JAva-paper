import java.util.*;

public class Using_Hash_Map {

  public static void main(String[] args) {
    HashMap<String, Integer> A1 = new HashMap<String, Integer>();
    A1.put("A", 1);
    A1.put("M", 5);
    A1.put("C", 4);
    A1.put("D", 6);
    A1.remove("D");
    for (Map.Entry<String, Integer> obj : A1.entrySet()) {
      System.out.println(obj.getKey() + " " + obj.getValue());
    }
  }
}

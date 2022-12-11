interface Printable {
  public int Tell(int a);
}

public class Lamda_With_Arguments {
//Lamda_With_Arguments
  public static void main(String[] args) {
    Printable S1 = a -> {
      return a;
    };

    System.out.println(S1.Tell(25));
  }
}

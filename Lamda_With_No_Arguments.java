interface Sayable {
  public void Tell();
}

public class Lamda_With_No_Arguments {
//Lamda_With_No_Arguments
  public static void main(String[] args) {
    Sayable S1 = () -> {
      System.out.println("Nothing To Tell");
    };
    S1.Tell();
  }
}

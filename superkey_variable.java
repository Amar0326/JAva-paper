class A {

  int m = 1;
}

class B extends A {

  int m = 2;

  void printValues() {
    System.out.println(m);//prints color of B class
    System.out.println(super.m);//prints color of A class
  }
}

public class superkey_variable {

  public static void main(String args[]) {
    B b1 = new B();
    b1.printValues();
  }
}

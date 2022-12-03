import java.lang.Thread;

class A extends Thread {

  @Override
  public void run() {
    System.out.println("Class A");
  }
}

class B extends Thread {

  @Override
  public void run() {
    System.out.println("Class B");
  }
}

class multithread {

  public static void main(String[] args) {
    A t1 = new A();
    t1.start();
    B t2 = new B();
    t2.start();
    System.out.println("Main Thread");
  }                                                                         
}

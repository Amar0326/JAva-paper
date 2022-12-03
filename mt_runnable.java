import java.lang.Thread;

class m implements Runnable {

  public void run() {
    System.out.println("Class M");
  }
}

class n implements Runnable {

  public void run() {
    System.out.println("Class N");
  }
}

public class mt_runnable {

  public static void main(String[] args) {
    m m1 = new m();
    n n1 = new n();
    Thread t1 = new Thread(m1); // <--- Creating Object Of Thread Class And Passing Refrences Of Class Thats Having thread in side
    Thread t2 = new Thread(n1); // <--- Creating Object Of Thread Class And Passing Refrences Of Class Thats Having thread in side
    t1.start(); // <--- Starting Thread 
    t2.start(); // <--- Starting Thread 
    System.out.println("Main Class");
  }
}

import java.lang.Thread;

public class priority {

  public static void main(String[] args) {
    Dell t1 = new Dell();
    Dell t2 = new Dell();
    Dell t3 = new Dell();
    t1.setName("Thread 1");
    t2.setName("Thread 2");
    t3.setName("Thread 3");

    // t1.setPriority(Thread.MAX_PRIORITY);
    // t2.setPriority(Thread.NORM_PRIORITY);
    // t3.setPriority(Thread.MIN_PRIORITY);
    t1.setPriority(10);
    t2.setPriority(5);
    t3.setPriority(1);

    t1.start();
    t2.start();
    t3.start();
  }
}

class Dell extends Thread {

  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName());
    System.out.println(Thread.currentThread().getPriority());
  }
}

class Animal {

  Animal() {
    System.out.println("animal is created");
  }
}

class Dog extends Animal {

  Dog() {
    super(); // Accessing values Of parent
    System.out.println("dog is created");
  }
}

public class superkey_constructor {

  public static void main(String args[]) {
    Dog d = new Dog();
  }
}

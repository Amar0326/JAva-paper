class A{
    void display(){
        System.out.println("In A ");
    }
}

class B extends A{
    void display(){
        System.out.println("In B ");
    }
}

class C extends A{
    void display(){
        System.out.println("In C ");
    }
}

public class dynamic_method_dispatch {
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();
        C c1 = new C();

        A r;// creating variable r 
        r=a1;
        r.display();
        r=b1;
        r.display();
        r=c1;
        r.display();
    }
    
}
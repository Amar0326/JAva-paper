interface IEat{
    int i=0;
   public void eat();
}

interface IWalk{
    int i=0;
    void walk();
}

interface IFly{
    int i=0;
    void fly();
}

class dog implements IEat,IWalk
{
   public void eat(){
        System.out.println("Eat");
    }
   public void walk(){
        System.out.println("Walk");
    }
}

class bird implements IEat,IFly
{
   public void eat(){
        System.out.println("Eat");
    }
   public void fly(){
        System.out.println("fly");
    }
}

public class Multiple_Inheritance {
    public static void main(String[] args) {
        dog d1=new dog();
        d1.walk();
        d1.eat();

        bird b1=new bird();
        b1.fly();
        b1.eat();

    }
}
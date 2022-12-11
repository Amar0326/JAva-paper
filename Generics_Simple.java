class Printable <T>
{
    T data;
    Printable(T data){
        this.data=data;
    }
    public void show(){
        System.out.println(this.data);
    }
}
public class Generics_Simple {
   public static void main(String[] args) {
    Printable<Integer> P1 = new  Printable<Integer> (20);  // Integers
    P1.show();
    Printable<String> P2 = new Printable<String>("Amar"); //String
    P2.show();
   }
}

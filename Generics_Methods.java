class Square {
    <T> void Sqr(T t1){
       System.out.println(t1);
    }
}

public class Generics_Methods {
    public static void main(String[] args) {
        Square sq1 =new Square();
        sq1.<String>Sqr("Amar");
    }
}


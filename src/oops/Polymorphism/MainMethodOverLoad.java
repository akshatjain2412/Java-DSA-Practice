package oops.Polymorphism;

public class MainMethodOverLoad {
    public static void main(String g){
        System.out.println("String");
    }
    public static void main(int g){
        System.out.println("INt");
    }
    public static void main(String[] args) {
        System.out.println(10);
        main("rakesh");
        main('C');
    }
}

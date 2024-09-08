package oops.Polymorphism;


import java.math.BigInteger;
 //Note varargs have lowest priority (int a),( int c,int b),(int... a)
public class AutomaticPromotion {
    static void show(int a){System.out.println("Int");}
    static void show(Object o){
        System.out.println("Object");
    }
    static  void show(double b){System.out.println("Double");}
    public static void main(String[] args) {
        show(129);//print double if int parameter method is not present converted into double all three
        show(23);
        show('c');//this is automatic promotion because char can convert into int
        //if both double and int not present then object is used in place of them
        //object is the parent class of all the classes in java
        //child>parent
        //if we pass string "123" if string method present then it pass in string otherwise in object class if we declare it
    }
}

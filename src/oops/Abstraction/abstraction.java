package oops.Abstraction;

public class abstraction {
    abstract class Vechile{
       // abstract int no_of_Tyres; we can use as abstract it is only possible for class and method
        abstract void tyres()throws RuntimeException;//abstract class does not have any body
        //we can't use private in abstract class

        void show(){//this is concrete method
            System.out.println(1);
        }
    }
    //parent class exception<=child class
    //parent class exception>=child class
    class car extends Vechile{
        void tyres() throws ArithmeticException { //implemented class can not private
            //this is implementation of abstract class
            super.show();//we can invoke another method which is not abstract
            //super.tyres();//we can't invoke abstract class
            System.out.println(4);
        }
        void show(){ //this is overriding
            System.out.println();
        }
    }
    class scooter extends Vechile{
        void tyres(){
            System.out.println(10);
        }
    }

    public static void main(String[] args) {
        Vechile vc; //we can only create the reference of the abstract class

    }
}

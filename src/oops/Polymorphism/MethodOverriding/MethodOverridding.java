package oops.Polymorphism.MethodOverriding;
//Note
// we can't override from private, static and final method of parent class

public class MethodOverridding {
    class Car{
        String name="Volvo";
        void showCar(){
            System.out.println(name);
        }
    }
    class truck extends Car{
        @Override
        void showCar() {
            System.out.println("tata");
        }
    }

    public static void main(String[] args) {
        MethodOverridding m=new MethodOverridding();
        truck t=m.new truck();
        t.showCar();//output when showCar function is not override in truck is volvo
        //output after override it is Tata
        //overriding is used when we inherit any class and some function are diff  from both the classes so we override this by use of method overriding
    }
}

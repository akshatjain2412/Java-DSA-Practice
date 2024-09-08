package oops.Polymorphism.MethodOverriding;

public class overridingReturntype {
    class parent {
        Object show(){
            System.out.println("object");
            return 0;  //object is a parent class of all the data types so if parent class is high priority so overriding possible
        }
        parent get(){
            System.out.println("parent");
            return new parent();// this is the parent class of child so it is higher priority
        }
    }
    class child extends parent{  //overriding is only possible when inheritance is present between two classes
        String show(){
            System.out.println("String");//string is child class of object class
            return "";
        }
        child get(){
            System.out.println("child");//child class is child class of parent class
            return new child();
        }
    }

    public static void main(String[] args) {
        child c=new overridingReturntype().new child();
        c.show();//it gives String in output
        c.get();//it gives child

        parent p=new overridingReturntype().new parent();
        p.show();//it gives Object
        p.get();////it gives parent
    }
}

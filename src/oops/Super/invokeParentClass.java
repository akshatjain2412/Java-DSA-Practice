package oops.Super;

public class invokeParentClass {
    class A{
        void B1(){
            System.out.println("parent");
        }
    }
    class B extends A{
        void B1(){
            System.out.println("subclass");
        }
        void B2(){
            this.B1();//current class method
            B1();//if we use method without this then compiler automatic use this keyword

            super.B1();//here we use parent class method
            B1();//if method is override then we need to use super keyword because compiler think this is current class method
            //if there is not overrides method we can directly use method without super
        }
    }
    public static void main(String[] args) {
        invokeParentClass.B obj=new invokeParentClass().new B();
        obj.B2();
    }
}
//we can also use super as return

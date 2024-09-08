package oops.Super;
//super keyword refers to the immediate parent class instance variable
//we cant use
public class _super {
    class A{
        int i=10;//parent class instance variable
    }
    class B extends A{ //when we use super keyword it is necessary we have inherited class
        private int i=20;//current class instance variable
        int a=super.i; // can use super keyword if parent class data member is static or nonstatic
        void show(int i){
            System.out.println(i);// it points on method parameter
            System.out.println(this.i);//it points current class instance variable
            System.out.println(super.i);//it points parent class parent variable
        }
    }
    public static void main(String[] args) {
        _super.B obj=new _super().new B();
        obj.show(32);
    }
}

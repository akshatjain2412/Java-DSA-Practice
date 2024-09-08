package oops.Super;

public class forConstructor {
    class A{
        //parent class instance variable
        int x;
        //constructor
        A(int x){
            this.x=x;
        }
    }
    class B extends A{
        int y;// class instance variable
        B(int x,int y){
            super(x);//use parent class constructor
            this.y=y;
        }
        void display(){
            System.out.println(y);
            System.out.println(super.x);
        }
    }
    public static void main(String[] args) {
     forConstructor.B fc=new forConstructor().new B(12,10);
        fc.display();
    }
}
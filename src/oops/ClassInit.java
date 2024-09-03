package oops;

public class ClassInit {
    //initialization by method
    public static class bymethod{
        String color;
        int age;
        void init(String s,int a){
            color=s;
            age=a;
        }
        void display(){
            System.out.println(color+" "+age);
        }
    }
    //initialization by reference method
    public static class reference {
        String color;
        int age;
    }
    //initialization by constructor method
    public static class constructor{
        String color;
        int age;
        public constructor(String s,int t){
            this.color=s;
            this.age=t;
        }
        public constructor(){

        }
        void display(){
            System.out.println(color+" "+age);
        }
    }
    public static void main(String[] args) {
        reference  oc;//declaration of class
        oc = new reference(); //this constructor is used for initialize object
        //here oc is initialization

        oc.color="Pink";            //initialization by reference method
        oc.age=32;
        System.out.println(oc.color+" "+oc.age);

        bymethod ac=new bymethod();     //initialization by constructor by method
        ac.init("blue",41);
        ac.display();

        constructor c=new constructor("aksh",134);   //initialization by constructor method
        c.display();

        c=new constructor("ak",23);
        c.display();
    }
}

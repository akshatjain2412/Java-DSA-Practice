package oops.Inheritance;

public class single {
    class animal{
        int age=12; //data member of animal class
        void display(){
            System.out.println(age);  //function of animal class
        }
    }
    class dog extends animal{  //inherit the property of animal

        void show() {  //function of dog class
            display(); //inherit property of animal class
        }
    }

    public static void main(String[] args) {

        single s=new single();  //this object of single class is made to make a object of animal class because animal is present in animal class
        animal ak=s.new animal(); //s.new animal to make animal class object because it presents in single class
        ak.display();
        //ak.show(); we can't use it because this property is not present in animal class this is the property of dog class

        single s1=new single(); //same work goes here
        dog d=s.new dog();
        d.show();//this is the property of animal class
        d.display();//this is the property of animal class which is inherited by dog class

    }
}

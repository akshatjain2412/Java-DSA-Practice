package oops;

import java.util.Scanner;

class object {
    public static class Person {
         int age;
         String name;
         String city;
         int time;

         Person(String name,int age,String city,int time){
             this.name=name;
             this.age=age;
             this.city=city;
             this.time=time;
         }

        public void say() {
            System.out.println(name + " [" + age + "] say hi "+ "lived in "+city);
        }
        public void Sleep()
        {
            if(time>=22 && time<=24||time>=1 && time<=6)
            {
                System.out.println(name+" Sleeping");
                return;
            }
            System.out.println(name+" Awake");
        }

    }
        public static void Swap(Person ob1, Person ob2){

//          Person temp=ob1;    this is not swapping the actual object it only swap the refrence of the object
//          ob1=ob2;
//          ob2=temp;


            ob1=new Person(null,0,null,0);
            String temp=ob1.name;
            ob1.name=ob2.name;
            ob2.name=temp;

            ob1=new Person(null,0,null,0);
            int temp1=ob1.age;
            ob1.age=ob2.age;
            ob2.age=temp1;

            String temp2=ob1.city;
            ob1.city=ob2.city;
            ob2.city=temp2;


        }
        public static void main(String[] args) {
        // Scanner scan=new Scanner(System.in);
//            String name= scan.next();
//            int age=scan.nextInt();
//            String city=scan.next();
//            int time=scan.nextInt();


//            Person ob = new Person();
//            ob.name = "rakesh";
//            ob.age = 20;
//            ob.city="bhopal";
//            ob.say();
//
//            Person ob2 = new Person();
//            ob2.name = "aksh";
//            ob2.age = 10;
//            ob2.city="mumbai";
//            ob2.say();
//
//            Person ob3=ob;
//            ob3.name="naman";
//            ob3.city="daman";
//            ob3.say();


             Person ob=new Person ("akshat",78,"mumbai",18);

             Person ob1=new Person ("rakesh",36,"agra",3);


//            ob.Sleep();
//            ob1.Sleep();


              ob.say();
              ob1.say();

              Swap(ob,ob1);

              ob.say();
              ob1.say();
              ob.Sleep();
              ob1.Sleep();





    }
}
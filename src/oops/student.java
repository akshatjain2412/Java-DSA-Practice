package oops;

import java.util.Scanner;

public class student {
    public class info {
        int rollno;
        String name;
        int age;
        double percentage;
         info() {
        }
        info( int rollno, String name,int age, double percenatge){
            this.rollno = rollno;
            this.name = name;
            this.age = age;
            this.percentage = percenatge;
        }
    }
    public void name(info obj ){
        System.out.println(obj.name);
        return;
    }
    public void test(){

            Scanner sc = new Scanner(System.in);
            System.out.println("rollno.");
            int rollno = sc.nextInt();
            System.out.println("name");
            String name = sc.next();
            System.out.println("age");
            int age = sc.nextInt();
            System.out.println("percentage");
            double percentage = sc.nextDouble();
            info i = new info(rollno, name, age, percentage);
            System.out.println(i.rollno);
            System.out.println(i.name);
            System.out.println(i.age);
            System.out.println(i.percentage);
            System.out.println(i);


            name(i);

    }

    public static void main(String[] args) {
       student ravi=new student();
       ravi.test();

       student rahul=new student();
       rahul.test();


    }
}

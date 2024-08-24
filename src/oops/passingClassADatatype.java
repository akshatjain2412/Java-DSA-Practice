package oops;

import java.util.ArrayList;
import java.util.Scanner;
public class passingClassADatatype {
      static class employee{    //it must be static to access in main class.
        private int enpno;
        private String name;     //here we make all three attributes with private class so nobody can change it
        private String address;  //only getter and setter can do changes

        employee(int enpno,String name,String address){
            this.enpno=enpno;
            this.name=name;
            this.getClass();
            this.address=address;

        }
          static void printclass(employee e){

             System.out.println("rollno. "+ e.enpno);
             System.out.println("name "+e.name);
             System.out.println("address "+e.address);

         }
          static String name(employee e)
         {
             return e.name;
         }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int empno=sc.nextInt();
        String name=sc.next();
        sc.nextLine();
        String address=sc.nextLine();
        //passingClassADatatype.employee st=new passingClassADatatype.employee(empno,name,address);
        // make obj by parent class which is passingClass...
          employee emp=new employee(empno,name,address);

        emp.printclass(emp);// we use emp because it is present in employee class and also print through
        //same class
        System.out.println(emp.name(emp));
    }
}

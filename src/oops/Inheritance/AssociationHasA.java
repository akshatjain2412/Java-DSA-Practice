package oops.Inheritance;

import java.util.HashSet;
import java.util.Set;

//this is the Association this is has-A relationship
public class AssociationHasA {                  //this is a association class
    public static class Bank {                  //this is bank class
        private final String bankName;          //bankName
        private Set<Employee> emp;              //set of all candidates

        Bank(String bankName) {                 //constructor for Bank class
            this.bankName = bankName;
        }

        String getbankname() {                  //function to get bank name
            return this.bankName;
        }

        void setEmp(Set<Employee> emp) {        //function to set the employee
            this.emp = emp;
        }

        Set<Employee> getEmp() {                //function to get the employee
            return this.emp;
        }
    }

    public static class Employee {              //Employee class
        private String empName;                 // name of employee

        Employee(String empName) {              //constructor for the employee class
            this.empName = empName;
        }

        String getName() {                      //function to get employee name
            return this.empName;
        }
    }
}
    class association{
        public static void main(String[] args) {      //here this is another association class


            AssociationHasA.Employee suraj = new AssociationHasA.Employee("suraj");
            //we create a Employee class because it presents in AssociationHasA so we use AssociationHasA throughout main method
            AssociationHasA.Employee mukesh = new AssociationHasA.Employee("Mukesh");
            Set<AssociationHasA.Employee> emp = new HashSet<>();//this is the set of All employee
            emp.add(suraj);//add employees set
            emp.add(mukesh);

            AssociationHasA.Bank b = new AssociationHasA.Bank("Axis Bank"); //this is Bank object
            b.setEmp(emp);//set employee in bank class

            for(AssociationHasA.Employee employee:b.getEmp()){    //to print the employee name associated with which bank
                System.out.println(employee.getName()+" "+b.getbankname());
            }
        }
    }


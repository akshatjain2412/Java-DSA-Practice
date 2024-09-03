package oops.Inheritance;

public class multilevel {
    public class dada{
        int dadaAge=90;
        void age()
        {
            System.out.println(dadaAge);//print dada age
            //no other class field is used because it is itself parent class of all the classes
        }
    }
    public class papa extends dada{
        int papaAge;
        void page()
        {
            // we inherit only dadaAge because of this is super class of papa
            //buts we can't use child(data member) here
            System.out.println(dadaAge);
            System.out.println(papaAge=(dadaAge-20));
        }
    }
    public class child extends papa{
        int child;
        void cage(){
            //we can use all property of dada and papa class
            System.out.println(dadaAge);
            System.out.println(papaAge);  //here it always print 0 because it always takes papaAge because of no initialization
            System.out.println(child=(papaAge-15));

        }
    }

    public static void main(String[] args) {
        multilevel m=new multilevel(); //this class obtain all th classes in it
        dada d=m.new dada(); //make dada class object
        d.age(); //we only inherit here dada age because is a parent class for both two classes

        papa p=m.new papa(); //make papa class object
        p.page(); //

        papa p1=m.new child();//we can make parent class object from the child class buts it inherits only parent class
        p1.page();

        child c=m.new child();//we create child class object
        c.cage();

    }
}

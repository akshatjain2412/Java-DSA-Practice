package oops.Inheritance;

public class Hybrid {
    public class dada{
        int dadaAge=90;
        void age()
        {
            System.out.println(dadaAge);//print dada age
            //no other class field is used because it is itself parent class of all the classes
        }
    }
    public class papa extends dada {
        int papaAge;
        void page()
        {
            // we inherit only dadaAge because of this is super class of papa
            //buts we can't use chachaAge here
            System.out.println(dadaAge);
            System.out.println(papaAge=(dadaAge-20));
        }
    }
    public class chacha extends dada{
        int chachaAge;
        void cage(){
            // we inherit only dadaAge because of this is super class of papa
            //buts we can't use papaAge here
            System.out.println(dadaAge);
            System.out.println(chachaAge=(dadaAge-15));

        }
    }

    public static void main(String[] args) {
        Hybrid h =new Hybrid(); //this class obtain all th classes in it 
        dada d=h.new dada(); //make dada class object
        d.age(); //we only inherit here dada age because is a parent class for both two classes
        
        papa p=h.new papa(); //make papa class object
        p.page(); //
        
        chacha c=h.new chacha();//we create child class object
        c.cage();
        
        //
        dada d1=h.new chacha();//we can make parent class object from the child class buts it inherits only parent class
        d1.age();

    }
}

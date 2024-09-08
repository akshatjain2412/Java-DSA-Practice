package oops.Interface;

public class Interface {
    //interface may be any access modifier
    interface vechile{
        //variable always use public static final if we don't then jvm do or us
        int tyres=10;//declared is compulsory
        void run();//always use public abstract if we not make jvm automatically use here
        public abstract void start();//

        default void Make(){// it is necessary to write default it is a concrete method
            System.out.println(32);
        }
        //can also use static concrete method but we can use
        static void tyres(){

        }

    }
    // it is necessary if how many method signature present in interface all must be implements in implemented class
    public class car implements vechile{
        int carTyres=4;
        public void run(){//here write public is important
            System.out.println(78);
        }
        public void start(){
            System.out.println(77);
        }
        public void Make(){//this is overriding we use interface's concrete method
             //we don't use super here because we implement an interface not class
             System.out.println(28);
        }
        public static void tyres(){//this is not implement because of private in interface
            System.out.println(19);
        }
    }

    public static void main(String[] args) {
        vechile v=new Interface().new car();
        v.Make();
        v.start();
        v.run();
        car c=new Interface().new car();
        c.run();
        Interface.vechile.tyres();// it is static, so we can directly call it by class name
        car.tyres();
        int tyres = v.tyres; // can directly call it we need to put it in a references then we will use it
        System.out.println(tyres);
        System.out.println(vechile.tyres);// or we can simply call by class name

    }
}

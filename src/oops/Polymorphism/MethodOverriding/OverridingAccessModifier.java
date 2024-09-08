package oops.Polymorphism.MethodOverriding;

public class OverridingAccessModifier {
    //note always parent class method must be same or lower priority (parent method access modifier=<child)
    class test{
        static void show(){        //if there is no access modifier return then it is a default modifier
            System.out.println("lower priority");
        }
    }
    class score extends test{
        public static void show(){
            System.out.println("higher priority");
        }
    }

    public static void main(String[] args) {
        test t=new OverridingAccessModifier().new test();
        t.show();

        score s=new OverridingAccessModifier().new score();
        s.show();
    }

}

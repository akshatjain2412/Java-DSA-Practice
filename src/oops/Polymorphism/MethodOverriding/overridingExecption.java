package oops.Polymorphism.MethodOverriding;

public class overridingExecption {
    class test{
        void show() throws RuntimeException{ //if we use Exception in this method the override class give error because
            // arithmetic exception is child of runtime exception but Exception inherit both runtime and compile time
            // exception so if compile time exception happen then it can't handle it so whenever we call super class method
            //otherwise ew can use it
            try {
                System.out.println(0);
            }
            catch (RuntimeException e){
                e.printStackTrace();
            }
        }
    }
    //parent class>= child class
    class exp extends test {
        @Override
        void show() throws ArithmeticException {
            try {
                System.out.println(10);
                super.show();//this is invoking of parent class method
            } catch (ArithmeticException a) {
                System.out.println(a);
            }
        }
    }
        public static void main(String[] args) {
            overridingExecption oe=new overridingExecption();

            test t=oe.new test();
            t.show();

            exp e=oe.new exp();
            e.show();
        }

    }


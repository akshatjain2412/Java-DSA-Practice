package oops.Interface;


public class MultipleInheritance {
    //here is first interface
    interface i1{
        void start();
    }
    //here is second interface
    interface i2{
        void run();
    }
     static class test extends Interface implements i1,i2 {
        void s() {//it is very important to do it in method
            Interface.vechile v = new Interface.car();
            int a = vechile.tyres;
            v.run();
        }
        @Override
        public void start() {
            System.out.println("this is started");
        }

        @Override
        public void run() {
            System.out.println("this is running");
        }
    }
    class bus{

    }

    public static void main(String[] args) {
        test t=new test();// we can directly call it because we make test class as static
        t.s();
        t.run();
        t.start();
    }
}

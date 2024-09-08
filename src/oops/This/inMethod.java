package oops.This;

public class inMethod {

       static void run() {
            System.out.println(329);
          //  this.start();  //we cannot use this keyword when method is static
        }

        void start() {
            System.out.println(49);
         //   this.start(); // this will cause infinite time loop
            run();
            this.run(); //we not use this so compiler automatically use it while invoking the method
        }
        //we can not use this outside class
    public static void main(String[] args) {
           inMethod im=new inMethod();
           im.start();

           im.run();
    }
}

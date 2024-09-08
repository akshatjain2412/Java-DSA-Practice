package oops.Final;

public class method {
    class test{
        final void get(){
            System.out.println("we");
        }
    }
    class XYZ extends test{
       //   void get(){
        //     we can not override this method it because it use final keyword in parent class
        //  }
    }
}

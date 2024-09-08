package oops.ExceptionHandling;

public class errorInMethod {
    public static void main(String[] args) {

        try {
            System.out.println("try");
            divide();
        }
        catch (ArithmeticException a){
            a.printStackTrace();
        }
        finally {
            //if the program is terminated abnormally because the absence of catch block it will also execute.
            System.out.println("it will always execute");
        }
    }
    static int divide(){
        //error occur in this method first so this method make an object of Exception class which have three fields
        // name,description and stacktrace of the exception
        int a=10;
        int b=0;
        int c=a/b;
        return c;
    }
}

package oops.ExceptionHandling;

public class CheckedOrUnchecked  {
    //in compile time exception system don't either compile code or not execute  it
    //we use "Exception" for compile time Exception without try and catch
    static  class UnderAgeException extends Exception{
        UnderAgeException()throws UnderAgeException{//we can also use throws keyword here
            super("this is checked Exception");
        }
    }
    //in unchecked exception we don't have need to try catch if we only want to compile the code but if we want to
    //execute then we need to try catch to handle exception
    static class LessAgeExceptions extends RuntimeException{
        LessAgeExceptions()throws LessAgeExceptions {
            super("this is unchecked exception");
        }
    }

    public static void main(String[] args)throws UnderAgeException {
        int age =17;
        try{
           if(age<18){
               //throw keyword can use for both checked or unchecked both type of exception
               throw new UnderAgeException();
           }
           else{
               System.out.println("eligible");
           }
        }
        catch (UnderAgeException ua){
            ua.printStackTrace();
        }
        // for unchecked exception
        int a =16;
        try{
            if(a<18){
                throw new LessAgeExceptions();
            }
            else{
                System.out.println("eligible");
            }
        }
        catch(LessAgeExceptions la){
            la.printStackTrace();
        }
    }
}

package ExceptionHandling;

public class CustomClass {
//this is achieved by throw keyword

    static class LessAgeException extends RuntimeException{ //less age is a run time exception then we call it
        LessAgeException(String message){ //this is parameterized constructor
            super(message);//give it to the parent class
        }
        LessAgeException(){//this is default constructor
            super("give less age"); //default set value
        }
    }
public static void main(String[] args) {
        int age =17;
    try{
        if(age<18){
//          throw new LessAgeException("Age is below 18");
            throw new LessAgeException();//throw keyword is used to make custom exception
            // keyword is use here to allocate memory in heap
        }
        else{
            System.out.println("Go you can vote");
        }
    }
    catch (LessAgeException le){
        le.printStackTrace();
    }
}
}

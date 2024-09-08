package oops.ExceptionHandling;

public class try_catch {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try{//this is for risky code
            System.out.println(788);//this will also print because after that the problem is occurred
            int c=a/b;// here is the problem
            System.out.println(89);
        }
        //we can't make try block without catch or finally block at least one of them needed at a time
        catch(ArithmeticException i){
            //this is for handling
            i.printStackTrace();//it prints name ,description and stack trace where the exception is occurs
            //but somehow e.printStackTrace print in last after all 4
            System.out.println(i);//give name and description of the Exception
            System.out.println(i.toString());  //give name and description of the Exception
            System.out.println(i.getStackTrace());
            System.out.println(i.getMessage());// only print description of the exception
        }
        //System.out.println();//we can't use any line of code here.
        catch (Exception e){ //parent class exception must be used after child class
            //we can create n no. of catch blocks but try and finally use one time.
        }

        finally{
            //this block always execute even if remove all catch block from this class ,exception occur or not
            //cleanup the code if we allocate some resource in the try then we can close here.
            //it is always execute even after using break ,return ,continue
            // we can also use here try and catch
            a=0;
            b=0;
            System.out.println("a and b initialized with zero");
        }
    }
    //sequence must be, try,catch then finally without this sequence it will give error
}

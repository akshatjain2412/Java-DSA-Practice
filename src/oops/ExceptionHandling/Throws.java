package oops.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.SQLClientInfoException;

public class Throws {
    //here file not found not through Exception it gives the indication to the caller method that this exception can occur
    //it not actually handle the occurs.
    void readFile() throws FileNotFoundException{
        FileInputStream fi=new FileInputStream("c/abc.txt");
        //some code
    }
    //same goes here
    void saveFile() throws FileNotFoundException,SQLClientInfoException {//it can indicate any no. of exception
        String a ="this is demo";
        FileOutputStream fi=new FileOutputStream("c/abc.txt");
    }
}
class test{
    //here main is the caller method because it calls read and save file method these have exception signature
    //so, we need write same here like called methods
    public static void main(String[] args) throws FileNotFoundException {
        Throws t=new Throws();
        try{
            t.readFile();
        }
        catch (FileNotFoundException fnf){
            fnf.getStackTrace();//it will not print anything
            System.out.println(fnf);
        }
        try {
            t.saveFile();
        }
        catch (FileNotFoundException fnf1){
            fnf1.getStackTrace();
        }
        catch (SQLClientInfoException _){

        }
    }

}
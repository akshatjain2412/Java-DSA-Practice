package String;
import java.sql.SQLOutput;
import java.util.Scanner;
public class InteringAndNewString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="hello";

        String gtr="hello";// if both str and gtr has same string like 'hello' then they both are pointing same memory location
        str="mello";//here we change pointing form hello to mello

        System.out.println(str);
        System.out.println(gtr);



       // Intering is use to save space
        //if we want to create same string name with diffirent memory location then we use

        String s="hello";
        String g=new String("hello");
        System.out.println(s);
        System.out.println(g);
    }
}

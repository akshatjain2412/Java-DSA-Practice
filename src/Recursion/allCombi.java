package Recursion;
import java.util.ArrayList;
import java.util.Scanner;
public class allCombi {
    public static void all(String s,String curr){

        if(s.length()==0){
            System.out.println(curr);
            return ;
        }
        char ch=s.charAt(0);
        String rem=s.substring(1);
        all(rem,curr);
        all(rem,curr+ch);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String word=sc.next();
        all(word,"");
    }
}

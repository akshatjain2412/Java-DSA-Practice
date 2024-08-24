package Recursion;

import java.util.Scanner;

public class Palindrome {
    static boolean palindrome(String s,int i,int j){
        if(i>=j){
            return true;
        }
        if(s.charAt(i)!=s.charAt(j)){
            return false;
        }
        if(palindrome(s,i+1,j-1)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(palindrome(s,0,s.length()-1)){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
    }
}

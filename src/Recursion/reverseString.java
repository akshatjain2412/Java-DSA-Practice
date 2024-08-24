package Recursion;

import java.util.Scanner;

public class reverseString{
    public static String occ(String s, int index){
        if(index>=s.length()){
            return "";
        }
        return occ(s,index+1)+s.charAt(index);
    }
    // second approach without index
    public static String occ(String s){
        if(s.length()==0){
            return "";
        }
        String small=s.substring(1);
        char ch=s.charAt(0);
        return occ(small)+ch;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(occ(s,0));
        System.out.println(occ(s));  //method overloading
    }
}

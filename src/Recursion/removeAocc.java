package Recursion;

import java.util.Scanner;

public class removeAocc {
    public static String occ(String s, int index){
        if(index>=s.length()){
            return "";
        }

        if(s.charAt(index)=='a'){
            return "" +occ(s,index+1);
        }
        else{
            return s.charAt(index)+occ(s,index+1);
        }

    }
    // second approach without index
    public static String occ(String s){
        if(s.length()==0){
            return "";
        }
        String small=s.substring(1);
        char ch=s.charAt(0);
        if(ch=='a'){
            return occ(small);
        }
        else{
            return ch+occ(small);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(occ(s,0));
        System.out.println(occ(s));  //method overloading
    }
}

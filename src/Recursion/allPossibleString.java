package Recursion;
 import java.util.ArrayList;
 import java.util.Scanner;
public class allPossibleString {
    public static ArrayList<String> all(String s){
        ArrayList<String> list=new ArrayList<>();
        if(s.length()==0){
            list.add("");
            return list;
        }
        ArrayList<String> j=all(s.substring(1));
        char ch=s.charAt(0);
        for(String t:j){
            list.add(t);
            list.add(ch+t);
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String word=sc.next();
        System.out.println(all(word));
    }
}

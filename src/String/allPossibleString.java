package String;

import java.util.Scanner;

public class allPossibleString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in );
        String str= sc.next();
        int count=0;
        for(int i=0;i<str.length();i++){
            for (int j = i+1; j <=str.length() ; j++) {
                System.out.println(str.substring(i,j));
                count++;
            }
        }
        System.out.println(count);
    }
}

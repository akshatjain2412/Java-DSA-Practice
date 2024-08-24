package Recursion;

import java.util.Scanner;
public class printNum {
    public static void print(int num){
        if(num==1)
        {
            System.out.println(1);
            return;
        }
        System.out.println(num);   //for    reverse
        print(num-1);
        System.out.println(num);   //normal

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        print(num);
    }
}

package Recursion;

import java.util.Scanner;

public class Multiples {
    public static void multiples(int num,int mul)
    {
        if(mul==1){
            System.out.println(num);
            return;
        }
        multiples(num,mul-1);
        System.out.println(num*mul);


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int mul=sc.nextInt();
        multiples(num,mul);
    }
}

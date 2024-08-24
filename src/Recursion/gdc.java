package Recursion;

import java.util.Scanner;
public class gdc {
    public static void gcd(int num1,int num2)
    {
        if(num1%num2==0){
            System.out.println(num2);
            return;
        }
        gcd(num2,num1%num2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int num2=sc.nextInt();

            gcd(num, num2);
        }
    
}

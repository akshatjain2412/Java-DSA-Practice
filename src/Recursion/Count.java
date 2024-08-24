package Recursion;

import java.util.Scanner;

public class Count {
    static int count;
    public static int SumofDi1(int num)
    {
        if (num>0&&num<9) {
            count++;
            return 1;
        }
        SumofDi1(num/10);
        count++;

        return count;
    }

    public static int SumofDi(int num)
    {

        if(num>0&&num<9)
        {
            return 1;
        }
        int sum= SumofDi(num/10)+1;

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(SumofDi(num));   //this is normal method because we use not use int count inside this method
        //because count always call as zero
        System.out.println(SumofDi1(num));// this is the way we can make count in method
    }
}

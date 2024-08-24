package Recursion;

import java.util.Scanner;

public class SumOfDigit {
    static int sum;
    public static int SumofDi1(int num)
    {

        if(num>0&&num<9)
        {
            sum+=num;
            return 1;
        }

        sum+=num%10;
        SumofDi1(num/10);

       return sum;
    }
    public static int SumofDi(int num)
    {

        if(num>0&&num<9)
        {

            return num;
        }

        int sum= SumofDi(num/10)+num%10;

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(SumofDi1(num));
    }
}

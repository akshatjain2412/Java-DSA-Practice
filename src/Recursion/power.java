package Recursion;
import java.util.Scanner;
public class power {
    public static int pow(int num,int pow)
    {
        if(pow==0){
            return 1;
        }
        return pow(num,pow-1)*num;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        int pow=sc.nextInt();
        System.out.println(pow(num,pow));
    }
}

package Recursion;
import java.util.Scanner;
public class oddEvenSeries {
    public static int oddEven(int num)
    {
        if(num==1){
            return 1;
        }
        if(num%2==0){
            return oddEven(num-1)-num;

        }
        else {
           return oddEven(num-1)+num;

        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(oddEven(num));
    }
}

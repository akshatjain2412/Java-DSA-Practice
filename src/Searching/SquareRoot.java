package Searching;

import java.util.Scanner;

public class SquareRoot {
    public static int sqrt(int num)
    {
        int i=1;
        int j=num;
        int sq=-1;
        while(i<j){
            int mid=(i+j)/2;
            if((mid*mid<=num)&&(mid+1)*(mid+1)>num)
            {
                sq= mid;
                break;
            }
            else if(mid*mid<num){
                i=mid;
            }
            else{
                j=mid;
            }
        }
        return sq;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int target=sc.nextInt();
        System.out.println("the number is");
        System.out.println(sqrt(target));
    }
}

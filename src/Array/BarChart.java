package Array;

import java.util.Scanner;
public class BarChart {
    public static void barchart(int []arr,int max){
        for(int i=1;i<=max;i++){
            for(int j=1;j<=arr.length;j++){
                int spaces=max-arr[j-1];
                if( i<=spaces){
                    System.out.print("   ");
                }
                else{
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int max=Integer.MIN_VALUE;
        int arr[]=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>max){
                max=arr[i];
            }

        }
        barchart(arr,max);

    }
}

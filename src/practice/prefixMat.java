package practice;

import java.util.Scanner;

public class prefixMat {
    public static int[][] initilaize(int a[][]){
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <a[i].length; j++) {
                a[i][j]=sc.nextInt();
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        arr=initilaize(arr);

        System.out.println("enter range");
        int r1=sc.nextInt();
        int c1= sc.nextInt();
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int pref=0;
        if(r1>r2||c1>c2||c1<0||c2>col||r1<0||r2>row)
        {
            System.out.println("invalid range");
        }
        else{
            for(int i=r1;i<=r2;i++)
            {
                for (int j = c1; j <=c2 ; j++) {
                    pref+=arr[i][j];
                }
            }
            System.out.println(pref);
        }
    }
}

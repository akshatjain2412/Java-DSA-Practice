package practice;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class opptimizePreMat {
    public static void get(int a[][])
    {
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {

                a[i][j]=sc.nextInt();
            }
        }
    }
    static void prefix(int arr[][]){
        for (int i = 0; i <arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {
                arr[i][j]=arr[i][j-1]+arr[i][j];
            }
        }
    }
    public static void show( int a[][])
    {
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static  int part(int arr[][])
    {
        Scanner sc=new Scanner (System.in);
        int sum=0;
        int r1=sc.nextInt();
        int c1= sc.nextInt();
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        for(int i=r1;i<=r2;i++)
        {
            sum+=arr[i][c2]-arr[i][c1-1];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int rows=sc.nextInt();
        int col=sc.nextInt();
        int arr[][]=new int[rows][col];
        get(arr);
        prefix(arr);
        show(arr);
        System.out.println(part(arr));
    }
}

package practice;

import java.util.Scanner;

public class roColPre {
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
            for (int j = 1; j < arr[0].length; j++) {    //for row prefix
                arr[i][j]=arr[i][j-1]+arr[i][j];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {    //for col prefix
                arr[j][i]+=arr[j-1][i];
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
        int total=arr[r2][c2];
        int left=arr[r2][c1-1];
        int up=arr[r1-1][c2];
        int common=arr[r1-1][c1-1];
        sum=total+common-left-up;
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
        System.out.println( part(arr));
    }
}

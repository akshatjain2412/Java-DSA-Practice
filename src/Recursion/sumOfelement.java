package Recursion;

import java.util.Scanner;
public class sumOfelement {
    static int  max(int arr[],int index)
    {
        if(index==0){
            return arr[index];
        }
        return max(arr,index-1)+arr[index];

    }
    static void  print(int arr[],int index)
    {
        if(index==0){
            System.out.println(arr[index]);
            return;
        }
        print(arr,index-1);
        System.out.println(arr[index]);
    }
    public static void set(int arr[],int index)
    {
        if(index<0){
            return;
        }
        Scanner sc=new Scanner (System.in);
        set(arr,index-1);
        arr[index]=sc.nextInt();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int arr[]=new int[length];
        set(arr,length-1);
        print(arr,length-1);
        System.out.println(max(arr,length-1));

    }
}
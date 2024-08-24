package Recursion;

import java.util.Scanner;
public class firstINX {
    static int find(int arr[],int index,int target)
    {
        if(index>=arr.length){
            return -1;
        }

        if(arr[index]==target){
            return index;
        }
        return   find(arr,index+1,target);

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
        int target=sc.nextInt();
        set(arr,length-1);
        print(arr,length-1);
        System.out.println(find(arr,0,target));

    }
}

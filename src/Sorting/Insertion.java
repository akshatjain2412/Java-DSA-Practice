package Sorting;

import java.util.Scanner;

public class Insertion {
    public static void sort(int arr[]) {
        for (int i = 1; i <arr.length; i++) {
          int j=i;
          while(j>0&&arr[j]<arr[j-1]){
              int temp=arr[j];
              arr[j]=arr[j-1];
              arr[j-1]=temp;
              j--;
          }

        }
    }
    public static void Set(int[]arr){
        Scanner sc=new Scanner (System.in);
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
    public static void get(int[]arr){

        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        int arr[]=new int[num];
        Set(arr);
        get(arr);
        sort(arr);
        System.out.println("sorted");
        get(arr);
    }
}

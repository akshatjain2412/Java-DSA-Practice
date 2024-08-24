package Sorting;

import java.util.Scanner;

public class Fruits {
    public static void sort(String arr[]) {
        for (int i = 0; i <arr.length-1; i++) {
            int min=i;                                   //we use selection sort here
             for(int j=i+1;j< arr.length;j++){
                 if(arr[j].compareTo(arr[min])<0){
                     min=j;
                 }
             }
             if(min!=i){
                 String temp=arr[i];
                 arr[i]=arr[min];
                 arr[min]=temp;
             }
        }
    }
    public static void Set(String []arr){
        Scanner sc=new Scanner (System.in);
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.next();
        }
    }
    public static void get(String[]arr){

        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        String arr[]=new String[num];
        Set(arr);
        get(arr);
        sort(arr);
        System.out.println("sorted");
        get(arr);
    }
}

package Sorting;

import java.util.Scanner;

public class partition {
    public static void get(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void set(int arr[]){
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
    }
    public static void partition(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            while(arr[i]<=0){
                i++;
            }
            while(arr[j]>0){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        set(arr);
        get(arr);
        partition(arr);  //partition the negative and positive element
        get(arr);
    }
}

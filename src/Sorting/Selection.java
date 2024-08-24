package Sorting;

import java.util.Scanner;

public class Selection {
    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
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

package Sorting;

import java.util.Scanner;

public class Sortzero {
    public static void sort(int arr[]) {
        for (int i = 0; i <arr.length-1; i++) {
              for(int j=0;j<arr.length-i-1;j++){
                  if(arr[j]==0){           //we use insertion sort here because we need all zero in last place
                      int temp=arr[j];
                      arr[j]=arr[j+1];
                      arr[j+1]=temp;
                  }
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

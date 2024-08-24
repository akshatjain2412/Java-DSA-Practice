package Sorting;

import java.util.Scanner;

public class Countsort {
    public static int Max(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void count(int arr[]){
        int max=Max(arr);
        int []count=new int[max+1];
        for(int a=0;a< arr.length;a++){
            count[arr[a]]++;
        }
        int k=0;
        for (int i = 0; i <count.length ; i++) {
            for (int j = 0; j <count[i]; j++) {
                     arr[k]=i;
                     k++;
            }
        }
    }
    public static void SpecCount(int arr[]){
        int []output=new int [arr.length];
        int []count=new int [Max(arr)+1];
        for(int i=0;i<arr.length;i++) {
            count[arr[i]]++;
        }
        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }
        for(int i=0;i<arr.length;i++){
            int idx=count[arr[i]]-1;
            output[idx]=arr[i];
            count[arr[i]]--;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=output[i];
        }
    }
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
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int arr[]=new int[num];
        set(arr);
        get(arr);
        SpecCount(arr);
        get(arr);
    }
}

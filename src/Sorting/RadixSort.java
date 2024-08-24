package Sorting;

import java.util.Scanner;

public class RadixSort {
    public static int Max(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void Radixsort(int arr[]){
        int max=Max(arr);
        for(int place=1;max/place>0;place*=10){
            countSort(arr,place);
        }
    }
    public static void countSort(int arr[],int place){
        int output[]=new int[arr.length];
        int count[]=new int[10];
        for(int i=0;i<arr.length;i++){
            count[(arr[i]/place)%10]++;
        }
        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }
        for(int i= arr.length-1;i>=0;i--){         // if we use here forward loop the all the element
             //are arrange in first with 90,75,45,2,170,802 here first 4 element is smaller than the 3 digit
             //so,we backward loop
            int idx=count[(arr[i]/place)%10]-1;
            output[idx]=arr[i];
            count[(arr[i]/place)%10]--;
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
        Radixsort(arr);
        get(arr);
    }
}

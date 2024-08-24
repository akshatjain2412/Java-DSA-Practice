package Sorting;

import java.util.Scanner;

public class QuickSort {
    public static void Quicksort(int arr[],int l,int r){
        if(l<r) {


            int partition = part(arr, l, r);
            Quicksort(arr, l, partition - 1);
            Quicksort(arr, partition + 1, r);
        }
    }
    public static int part(int arr[],int l,int r){
        int pivot=arr[l];
        int pidx=l;
        int i=l;
        int j=r;
        while(i<j){
            while(arr[i]<=pivot){
                i++;
            }
            while(arr[j]>pivot) {
                j--;
            }
            if(i<j){
                Swap(arr,i,j);
            }
        }
        Swap(arr,pidx,j);
        return j;
    }
    public static void Swap(int arr[],int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
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
        Quicksort(arr,0, arr.length-1);
        get(arr);
    }
}

package Sorting;

import java.util.Scanner;

public class MergeSort {
    public static void Mergesort(int []arr,int l,int r){
        if(l>=r){
            return;
        }
        int mid=(l+r)/2;
        Mergesort(arr,l,mid);
        Mergesort(arr,mid+1,r);
        Merge(arr ,l , mid ,r);
    }
    public static void Merge(int []arr,int l,int mid,int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int []left=new int [n1];
        int [] right=new int[n2];
        for (int i= 0; i <left.length; i++) {
            left[i] = arr[l + i];
        }
        for (int i= 0; i <right.length; i++) {
            right[i]=arr[mid+1+i];
        }
        int i=0,j=0,k=l;
        while(i<n1&&j<n2){
            if(left[i]<right[j]){
                arr[k]=left[i];
                i++;
                k++;
            }
            else{
                arr[k]=right[j];
                j++;
                k++;
            }
        }
        while(i<n1){
            arr[k]=left[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=right[j];
            j++;
            k++;
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
        Mergesort(arr,0, arr.length-1);
        get(arr);
    }
}

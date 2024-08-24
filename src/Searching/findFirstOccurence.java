package Searching;

import java.util.Scanner;

public class findFirstOccurence {
    public static int occ(int []arr,int target){
        int i=0;
        int j=arr.length-1;
        int lo=-1;
        while(i<j){
            int mid=(i+j)/2;
            if(target==arr[mid]){
                lo=mid;
                j=mid-1;
            }
            else if(arr[mid]>target){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return lo;
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
        int target=sc.nextInt();
        set(arr);
        get(arr);

        System.out.println(occ(arr,target));
    }
}

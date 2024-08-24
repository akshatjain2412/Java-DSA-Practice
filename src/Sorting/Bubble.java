package Sorting;
 import java.util.Scanner;
public class Bubble {
    public static void sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){           //No. of iteration which is 1 less than array Size
            for(int j=0;j<arr.length-i-1;j++){     //for all element in each itr
                if(arr[j]>arr[j+1]){
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

package Searching;

import java.util.Scanner;

public class TwoSortedArrayIdx {

      public static int idx(int arr[])
      {
          int i=0;
          int j= arr.length-1;
          int ans=-1;
          while(i<j){
              int mid=(i+j)/2;
              if(arr[mid]>arr[arr.length-1])
              {
                  i=mid+1;
              }
              else{
                  ans=mid;
                  j=mid-1;
              }
          }
          return ans;
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

            System.out.println(idx(arr));
        }
    }


package Recursion;

import java.util.*;
import java.lang.*;
import java.io.*;

public class dh
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int j=0;j<num;j++){
            int []arr=new int[16];
            int helper[]=new int[16];
            for(int i=0;i<16;i++){
                arr[i]=sc.nextInt();

            }
            for(int i=0;i<16;i++){
              helper[i]=arr[i];

            }
            Arrays.sort(helper);
            for(int i=0;i<16;i++){
                for(int k=0;k<16;k++){
                    if(helper[i]==arr[k]){
                        arr[k]=i;
                    }
                }
            }
            for(int i=0;i<16;i++){
                if(arr[i]==0) {
                    arr[i] = 0;
                }
                if(arr[i]==1||arr[i]==2){
                    arr[i]=1;
                }
                if(arr[i]>=3&&arr[i]<=6){
                    arr[i]=2;
                }
                if(arr[i]>=7&&arr[i]<15){
                    arr[i]=3;
                }
                if(arr[i]==15){
                    arr[i]=4;
            }
            }

            for(int i=0;i<helper.length;i++){
                System.out.print(" " +arr[i]);
            }
        }
    }
}

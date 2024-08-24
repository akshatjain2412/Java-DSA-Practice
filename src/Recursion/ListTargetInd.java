package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ListTargetInd {
    static ArrayList<Integer> find(int arr[], int index, int target)
    {

        if(index>=arr.length){
           return new ArrayList<>();
        }
        ArrayList<Integer> al=new ArrayList<>();
        if(arr[index]==target){
            al.add(index);
        }
        ArrayList<Integer> small= find(arr,index+1,target);
        al.addAll(small);
        return  al;

    }
    static void  print(int arr[],int index)
    {
        if(index==0){
            System.out.println(arr[index]);
            return;
        }
        print(arr,index-1);
        System.out.println(arr[index]);
    }
    public static void set(int arr[],int index)
    {
        if(index<0){
            return;
        }
        Scanner sc=new Scanner (System.in);
        set(arr,index-1);
        arr[index]=sc.nextInt();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int arr[]=new int[length];
        int target=sc.nextInt();
        set(arr,length-1);
//        print(arr,length-1);
        System.out.println(find(arr,0,target));

    }
}

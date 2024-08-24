package Array;
import java.util.Scanner;
public class elementInd {
    public static int indxoftarget(int arr[],int target){
        int idx=-1;
           for(int i=0;i<arr.length;i++){
               if(arr[i]==target){
                   return i;

               }
           }
        return idx;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int tar=sc.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println(indxoftarget(arr,tar));

    }
}

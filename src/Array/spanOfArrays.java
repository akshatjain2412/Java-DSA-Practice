package Array;
import java.util.Scanner;
public class spanOfArrays {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int num =sc.nextInt();
            int []arr =new int[num];
            int min= Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;

            for(int i=0;i<num;i++){
                arr[i]=sc.nextInt();
                if(arr[i]>max){
                    max=arr[i];
                }
                if(arr[i]<min){
                    min=arr[i];
                }
            }
            System.out.println(max-min);
        }
    }


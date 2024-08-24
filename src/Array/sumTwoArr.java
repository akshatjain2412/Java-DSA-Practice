package Array;
import java.util.Scanner;
public class sumTwoArr {
    public static int [] sum(int arr1[],int []arr2,int num1,int num2){
        int sum[]=new int[num1 > num2? num1:num2];
            int i=arr1.length;
            int j=arr2.length;
            int k=sum.length;
            int c=0;
            while(k>0){
                int d=c;
                if(i>=0){
                    d+=arr1[i];
                }
                if(j>=0){
                    d+=arr2[j];
                }
                c=d/10;
                d%=10;
                sum[k]=d;

                i--;
                j--;
                k--;
            }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int []arr1=new int[num1];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        int num2=sc.nextInt();
        int []arr2=new int[num2];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }
        int sum[]=sum(arr1,arr2,num1,num2);
        for(int i=0;i<sum.length;i++){
            System.out.println(sum[i]);
        }

    }
}

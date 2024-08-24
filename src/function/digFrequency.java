package function;
import java.util.Scanner;
public class digFrequency {
    static int frequency(int num,int tar){
        int count=0;
       for(int i=num;i>0;i/=10){
           if(i%10==tar){
               count++;
               num/=10;
           }
       }
       return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        int tar=sc.nextInt();
        System.out.println(frequency(num,tar));

    }
}

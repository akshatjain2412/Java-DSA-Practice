package function;
import java.util.Scanner;
public class baseconvertor {
    static int frequency(int num,int base){
        int div=0;
        int count=0;
        for(int i=num;i>0;i/=base) {
            int pow=(int)Math.pow(10,count);
            int a = num % base;
            div=div+(a*pow);
            num /= base;
            count++;
        }
        return div;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        int base=sc.nextInt();
        System.out.println(frequency(num,base));

    }
}

package numberbasics;
import java.util.Scanner;
public class bejaminbulb {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        // in this question only perfect square root is only because it has odd no. of factorization
        for(int i=1;i*i<=num;i++){
            System.out.println(i*i);
        }
    }
}

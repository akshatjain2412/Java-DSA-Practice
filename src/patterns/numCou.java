package patterns;
 import java.util.Scanner;
public class numCou {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
       int val=1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " +val+ " ");
                val++;

            }

            System.out.println();
        }
    }
}

package patterns;
import java.util.Scanner;
public class fibTri {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int val=0;
        int val2=1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " +val+ " ");
                int z=val+val2;
                val=val2;
                val2=z;

            }

            System.out.println();
        }
    }
}

package patterns;
import java.util.Scanner;
public class perTri {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int val=0;
        int val2=1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
              if(j==1||i==j){
                  System.out.print(" 1 ");
              }
              else{
                  System.out.print(i-1+j);
              }

            }

            System.out.println();
        }
    }
}

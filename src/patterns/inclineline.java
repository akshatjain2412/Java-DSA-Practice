package patterns;
import java.util.Scanner;
public class inclineline {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int star=1;
        for(int i=1;i<=num;i++){
            for(int j=num-1;j>=i;j--){
                System.out.print("   ");
            }
            for(int j=1;j<=star;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

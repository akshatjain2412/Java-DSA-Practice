package patterns;
import java.util.Scanner;
public class arrow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        int mid=num/2;
        int star=1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=mid;j++){
                if(mid+1==i){
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }

            for(int j=1;j<=star;j++){
                System.out.print(" * ");
            }
            if(i>mid) {
                star-=2;
            }
            star++;
            System.out.println();
        }
    }
}

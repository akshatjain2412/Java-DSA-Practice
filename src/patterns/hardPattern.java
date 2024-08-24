package patterns;
import java.util.Scanner;
public class hardPattern {
    public static  void pattern(int num){
        int n=(num*2-1);
        int poi=num+num/2;
        int poi2=num/2+1;
        int a=(num/2)+1;
        int fir=num-1;
        int st=1;
        int a2=1;
        int sp=num/2;
        for(int i=1;i<=n;i++) {
            if(i>=fir+1) {

                for (int j = 1; j <= a; j++) {
                    if(j<=sp){
                        System.out.print("   ");
                    }
                    else{
                        System.out.print(" * ");
                    }
                }
                if(i>=poi){
                    sp++;
                }
                else{
                    sp--;
                }

            }

            else{
                for (int j = 1; j <= a; j++) {
                    System.out.print("   ");
                }

            }
            for (int j = 1; j <= num; j++) {
                if (poi == i) {
                    System.out.print(" e ");
                } else {
                    System.out.print("   ");
                }

            }
            for (int j = 1; j <= num; j++) {
                if (i >= poi2 && i <= poi) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }

            for (int j = 1; j <= num; j++) {
                if (poi2 == i) {
                    System.out.print(" e ");
                } else {
                    System.out.print("   ");
                }
            }
            if(i<=num){
            for (int j = 1; j <= st; j++) {
                System.out.print(" * ");
            }
             }
                 if(a2<poi2){
                     st++;
                     a2++;
                 }else{
                     st--;
                 }

            System.out.println();
        }
    }
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2!=0) {
            pattern(num);
        }
    }
}

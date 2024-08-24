package patterns;
import java .util.Scanner;
public class numHalfMountain {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        int col=2*num-1;
        int space=col-2;

        for (int i=1;i<=num;i++){
            for (int j = 1; j <=i; j++) {
                if(col+1==j){
                    System.out.print("");
                }
                else {
                    System.out.print(" " + j + " ");
                }
            }
            for(int j=1;j<=space;j++){
                System.out.print("   ");
            }

            for(int j=i;j>=1;j--){
                if(i==num && i==j){
                    j--;
                }
                System.out.print(" "+j+" ");
            }
            space-=2;

            System.out.println();
        }
    }
}

//         1                 1
//         1  2           2  1
//         1  2  3     3  2  1
//         1  2  3  4  3  2  1

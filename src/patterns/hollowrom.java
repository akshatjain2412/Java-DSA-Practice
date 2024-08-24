package patterns;

import java.util.Scanner;

public class hollowrom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int osp=num/2;
        int isp=-1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <=osp; j++) {
                System.out.print("   ");
            }
            System.out.print(" * ");
            for (int j = 1; j <=isp; j++) {
                System.out.print("   ");
            }
            if(i>1&&i<num)
                System.out.print( " * ");
            if(i<=num/2){
                osp--;
                isp+=2;
            }
            else{
                osp++;
                isp-=2;
            }
            System.out.println();
            }

        }
    }





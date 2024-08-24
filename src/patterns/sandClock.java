package patterns;

import java.util.Scanner;

public class sandClock {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();

        for(int i=1;i<=num/2+1;i++){
            if(i==1){
                for (int j = 1; j <=num; j++) {
                    System.out.print(" * ");
                }
            }
           System.out.print("   ");
            for(int j=2;j<num;j++){

                if((i==j )|| (i+j==num+1)){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();


            }
            int spaces= (num/2)-1;
            int star=3;
             for(int i = 1; i <=num/2; i++) {
                for (int j=spaces;j>=1;j--) {
                    System.out.print("   ");

                }
                spaces--;
                for(int j=1;j<=star;j++){
                    System.out.print(" * ");
                }
                star+=2;
                 System.out.println();


        }


    }
}



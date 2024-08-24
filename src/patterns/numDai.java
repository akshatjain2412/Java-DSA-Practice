package patterns;

import java.util.Scanner;

public class numDai {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();
            int st=1;
            int n=num/2;
            for(int i=1;i<=(num/2)+1;i++){


                for (int j = num/2; j>i-1; j--) {
                    System.out.print( "   " );
                }
                 int b=i;
                for(int j = 1; j <=st ; j++){
                    System.out.print(" "+ (b)+" ");
                        if(j>st/2) {
                            b-=2;
                        }
                        b++;

                }
                st=st+2;

                System.out.println();
            }
            int sp=1;
            int star=num-2;
            for(int i=1;i<=(num/2);i++){


                for (int j = 1; j<=sp; j++) {
                    System.out.print( "   " );
                }
                sp++;
                   int a=n;
                for(int j = 1; j <=star; j++){

                    System.out.print(" "+(a)+" ");
                       if(j>star/2) {
                           a-=2;
                       }
                       a++;

                }
                n--;
                star-=2;


                System.out.println();
            }
        }

}


    package patterns;

import java.util.Scanner;

    public class reverseTri {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            for (int i = 1; i <= num; i++) {
                for (int j = i; j <= num; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
    }
    /*
     *******
     ******
     *****
     ****
     ***
     **
     *

     */



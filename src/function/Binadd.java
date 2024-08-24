package function;
import java.util.Scanner;
public class Binadd {
    static int muldigbase(int base ,int num1,int d2){
        int mul=0;
        int c = 0;
        int p = 1;
        while(num1>0||c>0) {
                int d1 = num1%10;
                int val = d1 * d2 + c;
                c = val / base;
                val = val % base;
                mul += val * p;
                p = p * 10;
                num1/= 10;
        }
        return mul;
    }
    static int mulbase(int base, int num1, int num2) {
        int mul=0;
        int p=1;
            while (num2>0){

                int d2=num2%10;
                num2/=10;
                int onedig=muldigbase(base,num1,d2);
                mul=addbase(base,mul,onedig*p);
                p=p*10;
            }
            return mul;
    }

    static int addbase(int base, int num1, int num2) {
        int sum = 0;
        int c = 0;
        int p = 1;
        while (num1 > 0 || num2 > 0 || c > 0) {
            int d1 = num1 % 10;
            int d2 = num2 % 10;
            num1 = num1 / 10;
            num2 = num2 / 10;

            int d = d1 + d2 + c;
            c = d / base;
            d = d % base;
            sum += d * p;
            p = p * 10;

        }

        return sum;
    }

    static int subbase(int base, int num1, int num2) {
        int sub = 0;
        int borrow = 0;
        int p = 1;
        while (num2 > 0) {
            int d1 = num1 % 10;
            int d2 = num2 % 10;
            num1 = num1 / 10;
            num2 = num2 / 10;

            if (d1 < d2) {
                num1--;
                int d = (d1 + base) - d2;
                sub += d * p;
                p = p * 10;
            } else {
                int d = d1 - d2;
                sub += d * p;
                p = p * 10;
            }
        }
            return sub;
        }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            int base = sc.nextInt();
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println(mulbase(base, num1, num2));
        }
    }

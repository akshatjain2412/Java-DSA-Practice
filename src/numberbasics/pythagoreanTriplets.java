package numberbasics;
import java.util.Scanner;
public class pythagoreanTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int asq = a * a;
        int bsq = b * b;
        int csq = c * c;
        if (asq == bsq + csq) {
            System.out.println(true);
        } else if (bsq == asq + csq) {
            System.out.println(true);
        } else System.out.println(csq == asq + bsq);
    }
}

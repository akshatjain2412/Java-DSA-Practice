package patterns;

public class rototeNum {
    public static void main(String[] args) {
        int num1=7;
        for (int i = 1; i <=num1; i++) {
            for (int j = i; j <=num1; j++) {
                System.out.print(j);

            }
            for (int j = 1; j <=i-1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}

package practice;

public class loops {
    public static void main(String[] args) {

       outer: for (int i = 1 ; i < 5; i++) {
            inner:for (int j = 0; j < 5; j++) {
                System.out.println(j);
                break inner;
            }
           System.out.println(i);
            break outer;
        }
    }
}

package practice;

public class whileLoop {
    public static void main(String[] args) {
        int num=100;
        int i=1;
        while(i<=num){
            if(i%3==0){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
            }
    }
}

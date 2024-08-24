package Recursion;

public class fibonacci {
    public static int fib(int num1)
    {
        if(num1==0|| num1==1){
            return num1;
        }
       return fib(num1-1)+fib(num1-2);

    }
    public static void main(String[] args) {
        int num=5;
        System.out.println( fib(11));
    }
}

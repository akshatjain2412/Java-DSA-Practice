package oops.Polymorphism;

public class MethodOverloading {
    static int add(int a,int b,int c){
        return a+b+c;
    }
    static int add(int a,int b){
        return a+b;
    }
    static int add(int... a){
        int len=a.length;
        int sum=0;
        for(int i:a){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int a=10;
        int b=1;
        int c=22;
        int d=23;
        System.out.println(add(a,b,c));
        System.out.println(add(b,c));
        System.out.println(add(a,b,c,d,45,6,5,4,3,3));
    }
}

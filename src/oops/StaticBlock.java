package oops;
//when we make class that time static block also execute so if we use main method middle of two static block but
// it will print like static block 1 then 2 then psvm  because it will execute when the class loading
public class StaticBlock {
    static {//it is always present inside a class
            //we can make n no. static block in a class
        System.out.println(332);
    }
    public static void main(String[] args)  {
        System.out.println(2929);

    }
    static {
        System.out.println(301);
    }
    static int as;//static data member of a class
    //main and important use of static block is to initialize static member
    static {
        int a=10;
        final int e=232;
        as=21;
    }
}

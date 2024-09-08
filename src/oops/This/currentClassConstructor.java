package oops.This;

public class currentClassConstructor {
    int curr;
    currentClassConstructor(){
        //is necessary to use "this" first and then content
        this(10);  //we can not use this both constructor because they call each other infinite times
        System.out.println("no args");


    }
    currentClassConstructor(int a){
        //this();  //it is always use first not after sout
        System.out.println("para");

    }

    public static void main(String[] args) {
        currentClassConstructor a=new currentClassConstructor(55);
        int r=a.curr;
        System.out.println(r);

    }
}

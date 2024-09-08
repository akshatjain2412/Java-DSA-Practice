package oops.This;

public class withArg {
    int i=889;
    void  demo(int i){
        System.out.println(i);
    }
    void demo1(){
        demo(this.i);//pass an argument with
    }
    void demo3(withArg w){
        System.out.println(w);
    }
    void demo4(){
        demo3(this); //only use of this we can give current class object as argument
    }

    public static void main(String[] args) {
        withArg wa=new withArg();
        wa.demo1();
        wa.demo4();
    }
}

package oops.This;

//we only make one public class in one class
//we can make multiple default class
public class ArgWithConstructor {
    class demo{
        thisdemo td;//
        demo(thisdemo td){//we take class object of thisDemo
            this.td=td;
            System.out.println(td);//print reference of the object in memory
        }
    }
    private class thisdemo{
        void m(){
            demo d=new demo(this);// we give current class object as parameter
        }
    }
    public static void main(String[] args) {
        thisdemo td=new ArgWithConstructor().new thisdemo();
        td.m();
    }
}

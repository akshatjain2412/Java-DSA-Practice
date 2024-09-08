package oops.This;

public class inConstructor {
    static class example{
        private int ex;
        public example(int ex){
            this.ex=ex; //"this" refers to the current class object
            //this.ex refers to the current class instance variable which is ex here.
        }
        int show(){
            return ex;
        }
    }
    public static void main(String[] args) {
        example e=new example(12);//class example class
        System.out.println(e.show());//print value
    }
}

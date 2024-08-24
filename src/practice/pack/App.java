package practice.pack;

public class App {
   int a;
   int b;
   public App(){

    }
   public  App(int a, int b){
       this.a=a;
       this.b=b;
   }
   void sum(int a, int b)
   {
       System.out.println(a+b);
   }
}
class ok{

    public static void main(String[] args) {
        App a=new App();
        int e=8;
        int b=3;
        a.sum(e,b);
    }
}
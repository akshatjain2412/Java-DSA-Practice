package StringBuilder;

public class stringbuilder {
    public static void main(String[] args) {
        //constructor
        StringBuilder sc=new StringBuilder();
        StringBuilder sd=new StringBuilder("hello");
        StringBuilder ed=new StringBuilder(10);//if this capacity is  full then capacity is now 2 times

        //sc+="wallah";  this give erroe
        sc.append("javalanguage");
        ed.append("javalangua gehdbhbshfb");
        ed.append("sns");
        ed.append("nsjas");


        System.out.println(sc);
        System.out.println(sd);
        System.out.println(ed);
    }
}

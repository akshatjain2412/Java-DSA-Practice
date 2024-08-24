package oops;

public class getterSetter{
    private String name="ramesh";
    void setName(String name)
    {
        this.name=name; //this keyword is use for point current class obj
    }
    String get(getterSetter g){
        return g.name;
    }
}
class main{
    public static void main(String[] args) {
        getterSetter g=new getterSetter();
        System.out.println(g.get(g));
        g.setName("rahul");
        System.out.println(g.get(g));
    }
}

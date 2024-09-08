package oops;
//enum is a special type of class in which we put all constant value li value of pi
//it is static and final implicitly
//it can be any type of access specifier
public class eNum {
    enum Permanent_value{
        akshat(10,12),
        rakesh(19,32);


        final int  x;
        final int y;

        Permanent_value(int x,int y){
            this.x=x;
            this.y=y;
        }
    }

    enum mathSign{
        pi(3.14F),
        cos90(1);

        final float value;
        mathSign(float value){
            this.value=value;
        }
    }
    enum day{
        Sun,mon,tue,wed,thu,fri,sat;
    }
    enum direction{
        EAST(0),
        WEST(180),
        NORTH(90),
        SOUTH(360);

        final int degree;
        direction (int degree){  //here this constructor is use for here because of initialization the degree
            //but we don't create object through this.
            this.degree =degree;
        }
    }

    public static void main(String[] args) {
        Permanent_value p=Permanent_value.akshat;
        System.out.println(p.x);

        //eNum.mathSign x= new mathSign(38);//we can not create the object of enum class
        mathSign pi=mathSign.pi;//we can call all sign with same class name which is enum name like mathSign
        System.out.println(pi.value*3*3);

        for(day d:day.values()){  // this is the function to call all value in enum
            System.out.println(d);
        }
    }
}

package oops;

public class constructor {
    static class dustbin{
        String color;
        boolean Dark_in_Color;

        dustbin(){//this is default constructor
           this.color="xyz";
           this.Dark_in_Color=false;//we can provide these costume default values of an object of dustbin class
        }
        dustbin(String color,boolean Dark_in_Color){ //parametrized constructor
            this.color=color;
            this.Dark_in_Color=Dark_in_Color;
        }

        dustbin(dustbin d){    //copy constructor
            this.color=d.color;
            this.Dark_in_Color=d.Dark_in_Color;
        }
    }
    void print(dustbin d){                           //print method
        System.out.println(d.color);
        System.out.println(d.Dark_in_Color);

    }

    public static void main(String[] args) {
        constructor cons=new constructor();  //call constructor class object to class print method
        dustbin d1=new dustbin();

        dustbin d2=new dustbin("brown",true);

        dustbin d3=new dustbin(d2);

        cons.print(d1);
        cons.print(d2);
        cons.print(d3);
    }

}

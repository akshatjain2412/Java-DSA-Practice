package oops;

import java.util.ArrayList;

public class fraction {
    public static class Fraction{
        int num;
        int deno;
        static int count;
        Fraction(int num,int deno)
        {
            this.num=num;
            this.deno=deno;
            count++;
        }
    }
    public  Fraction fractionAdd(Fraction f,Fraction f2)
    {
        int num=(f.num*f2.deno)+(f2.num*f.deno);
        int deno=f.deno*f2.deno;
        Fraction f3=new Fraction(num,deno);
        return f3;
    }

    public static void main(String[] args) {
        Fraction f=new Fraction(3,7);
        System.out.println(f.num+" / "+f.deno);
        Fraction f2=new Fraction(7,3);
        System.out.println(f2.num+" / "+f2.deno);

        fraction add=new fraction();
        Fraction f3=add.fractionAdd(f,f2);
        System.out.println(f3.num+" / "+f3.deno);

        System.out.println(Fraction.count);

        ArrayList<Fraction> al=new ArrayList<>();
        al.add(f3);
        System.out.println(al.get(0));
    }
}

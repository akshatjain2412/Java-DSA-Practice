package MultiThreading;

import java.util.Scanner;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class  bookSeat{
    static int total_seats=20;
    synchronized static void bookseats(int seats){
        if(total_seats>=seats){
            System.out.println(seats +" seats booked successfully");
            total_seats-=seats;
            System.out.println("total seats left "+ total_seats);
        }
        else{
            System.out.println("seat not booked");
            System.out.println("total seats left "+ total_seats);
        }
    }
}
class thread1 extends Thread{
    bookSeat b;
    int seats;

   thread1(bookSeat b,int seats)
    {
        this.b=b;
        this.seats=seats;
    }
    public void run()
    {
        b.bookseats(seats);
    }
}
class thread2 extends Thread{
    bookSeat b;
    int seats;

   thread2(bookSeat b,int seats)
    {
        this.b=b;
        this.seats=seats;
    }
    public void run()
    {
        b.bookseats(seats);
    }
}
class staticSynchro {
//    public static  void init(bookSeat b,int seats)
//    {
//        thread1 t1=new thread1(b,seats);
//        t1.start();
//
//    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        bookSeat b1=new bookSeat();


//        while(bookSeat.total_seats>0){
//            int seats=sc.nextInt();
//            init(b1,seats);
//        }

        thread1 t1=new thread1(b1,6);
        t1.start();
        thread2 t2=new thread2(b1,2);
        t2.start();


        bookSeat b2=new bookSeat();

        thread1 t3=new thread1(b2,9);
        t3.start();
        thread2 t4=new thread2(b2,3);
        t4.start();
    }
}

package MultiThreading;

public class interrupted extends Thread
{
    @Override
    public void run(){
//        System.out.println(Thread.interrupted());
//        System.out.println(Thread.interrupted());
        System.out.println(Thread.currentThread().isInterrupted());

        try{
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().isInterrupted());

    }

    public static void main(String[] args) {
        interrupted t=new interrupted();
        t.start();
        t.interrupt();
    }
}

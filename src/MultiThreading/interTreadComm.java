package MultiThreading;
class totalEarning implements Runnable
{
     int total_earning=0;

    public void run() {
        synchronized (this) {
            for (int i = 1; i < 11; i++) {
                total_earning = total_earning + 100;
            }
            this.notify();
        }
    }
}
public  class interTreadComm {
    public static void main(String[] args) throws InterruptedException {
        totalEarning t=new totalEarning();

        Thread th=new Thread(t);
        th.start();
        synchronized (t){
            t.wait(10000);//for specific time
            System.out.println(t.total_earning);

        }
    }
}

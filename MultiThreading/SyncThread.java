package multiThreading;

class Emp{
    int count;
    public synchronized void stum(){
        count++;
    }
}
public class SyncThread{
   public static void main (String[] args)throws InterruptedException{
    Emp a=new Emp();
    Thread t1= new Thread(new Runnable() {
        public void run(){
            for(int i=0;i<1000;i++){
                a.stum();
            }
        }
    });

    Thread t2=new Thread(new Runnable() {
        public void run(){
            for(int i=0;i<1000;i++){
                a.stum();
            }
        }
    });

    t1.start();
    t2.start();

    t1.join();
    t2.join();
    System.out.println("Count is "+a.count);
   }
}

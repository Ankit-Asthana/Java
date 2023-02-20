package multiThreading;

class Ank implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){ 
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Thread One");
        }
    }
}

class Two implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Thread Two");
        }
    }
}
public class ThreadRunnable {
    public static void main(String[] arhsh){
        Ank a =new Ank();
        Two b= new Two();
        Thread t1=new Thread(a);
        Thread t2=new Thread(b);
        t1.start();
        t2.start();
    }
}

    

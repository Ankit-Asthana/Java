package multiThreading;

public class ThreadLambda {
    public static void main(String[] akdd){
    Runnable r1 = () -> {
        for(int i=0;i<10;i++){
            System.out.println("Thread one");
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    };

    Runnable r2 = () -> {
        for(int i=0;i<10;i++){
            System.out.println("Thread Two");
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    };

    Thread t1=new Thread(r1);
    Thread t2=new Thread(r2);
    
    t1.start();
    //to start thread one first and after it's execuption second thread exeutes
    try{
        t1.join();
    } catch(InterruptedException e){e.printStackTrace();}
    t2.start();
    t1.getPriority();
    t2.getPriority();
}
}

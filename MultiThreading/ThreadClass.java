package multiThreading;

public class ThreadClass extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Hi");
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] arhd){
        ThreadClass a=new  ThreadClass();
        a.start();
    }
}

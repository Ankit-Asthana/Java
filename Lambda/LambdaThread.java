/* class Mine implements Runnable{
    public void run(){
        for(int i=0;i<10;i++)
            System.out.println("Child Thread");
    }
} */
public class LambdaThread {
    public static void main(String[] athd){
        //Mine m=new Mine();
        Runnable r=()->{for(int i=0;i<10;i++){
            System.out.println("Child Thread");
        }};
        Thread t=new Thread(r);
        t.start();
        for(int i=0;i<10;i++)
            System.out.println("Main Thread");
    }
}

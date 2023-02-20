import java.util.*;
public class LambdaAnnonymous {
    public static void main(String[] args){
        //annonymous inner class using implementing the Runnable interface
        Runnable r =new Runnable(){
            public void run(){
                for(int i=0;i<10;i++){
                    System.out.println("Implemented Child Thread");
                }
            }
        };
        Thread t = new Thread(r);
        t.start();

        //annonymous inner class using extending the thread class
        /* Thread t=new Thread(){
            public void run(){
                for(int i=0;i<10;i++){
                    System.out.println("Extended Child Thread");
                }
            }
        };
        t.start(); */
    }
}

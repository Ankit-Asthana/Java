//Linking the lambda expression with the functional interface
interface Inter{
    public void hello();
}
/*class Test implements Inter{
    public void hello(){
        System.out.println("Hello");
    }
}*/
public class LambdaThree{
    public static void main(String[] args){
       // Inter t=new Test();
       Inter t= ()-> System.out.println("Hello");
        t.hello();
    }
}

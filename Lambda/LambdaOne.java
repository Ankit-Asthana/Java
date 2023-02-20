//import java.util.function.*;
class Test{
    public void add(int a,int b){
        System.out.println(a+b);
    }
}
class LambdaOne{
    public static void main(String[] args){
        Test t=new Test();
        t.add(20,30);
       // (a,b)-> {System.out.println(a+b);} // this is the lambda expression for the same function add

    }
}
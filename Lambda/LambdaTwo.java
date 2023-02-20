import java.util.*;
class One{
    public int square(int n){
        return(n*n);
    }
}
public class LambdaTwo {
    public static void main(String[] args){
        Scanner ss=new Scanner(System.in);
        One a=new One();
        System.out.println("Enter number");
        int x=ss.nextInt();
        System.out.println(a.square(x));
        //(int n) -> {return n*n;} //lambda expression for the return type method
        //n -> n*n; //more simplified way of writing the lambda function
    }
}

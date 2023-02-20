import java.util.*;
import java.util.function.*;
public class LambdaLocalVar {
    public static void main(String[] ahfoiuas){
        int i=0;
        Consumer<Integer> c1=(k)->{ //i=i+10; 
            System.out.println("Value is "+(i+k));};
        c1.accept(10);
    }
}

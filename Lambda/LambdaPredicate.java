import java.util.function.*;
public class LambdaPredicate{
    public static void main(String[] ahdi){
        Predicate<Integer> p= i -> i%2 ==0;
        System.out.println(p.test(19));
        System.out.println(p.test(40));
        /* String[] ss={"Ankit","Aryan","Saurabh","Roman","Ravi"};
        Predicate<String> p= s1->s1.length()>4;
        for(String s4:ss){
            if(p.test(s4)){
                System.out.println(s4);
            }
        } */
    }
}

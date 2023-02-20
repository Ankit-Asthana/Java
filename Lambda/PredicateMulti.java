import java.util.function.*;
public class PredicateMulti {
    public static void main(String[] arjaja){
        int[] x={10,2,5,9,11,13,50,44,60};
        Predicate<Integer> p= i->i%2==0;
        Predicate<Integer> p1= d->d>10;

        System.out.println("The element in array which is even and is greater then 10 is ");
        for(int x1 :x){
            if(p.and(p1).test(x1)){
                System.out.println(x1);
            }
        }

        System.out.println("The element in array which is even or greater then 10 is ");
        for(int i:x){
            if(p.or(p1).test(i)){
                System.out.println(i);
            }
        }

        System.out.println("The element in array which is not even ");
        for(int i:x){
            if(p.negate().test(i)){
                System.out.println(i);
            }
        }
    }
}

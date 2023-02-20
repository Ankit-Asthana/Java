import java.util.function.*;
import java.util.*;
class Person{
    String pers;
    int weight;
    Person(String a,int b){
        this.pers=a;
        this.weight=b;
    }
}
public class MethodRef {
    static Function<String,String> f1= n->n.toUpperCase();
    static Function<String,String> f2= String :: toUpperCase;

    static Predicate<Person> p1=p->p.weight >=50;
    static Predicate<Person> p2= MethodRef::weightCheck;
    public static void main(String[] args){
        ArrayList<Person> al=new ArrayList<>();
        BiFunction<String,Integer,Person> ff=(a,b)->new Person(a,b);
        al.add(ff.apply("Ankit",55));
        al.add(ff.apply("Manish",60));
        System.out.println("Lambda Expression Result "+f1.apply("ankit"));
        System.out.println("Method Reference result "+f2.apply("some"));
        for(Person p:al){
            System.out.println("Predicate 1 result= "+p1.test(p));
            System.out.println("Predicate 2 result= "+p2.test(p));
        }
    }
    static boolean weightCheck(Person per){
        return per.weight >=50;
    }
}

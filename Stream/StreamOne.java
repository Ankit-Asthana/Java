package allStream;
import java.util.stream.*;
import java.util.*;
class Product{
    int id;
    String name;
    double price;
    Product(int a,String b,double c){
        this.id=a;
        this.name=b;
        this.price=c;
    }
}
public class StreamOne {
    public static void main(String[] args){
        /* Stream<Integer> s1=Stream.of(1,2,3,4,5,6);
        s1.forEach(p->System.out.println(p));
        System.out.println("##################");
        Stream<Integer> s2= Stream.of(new Integer[] {7,8,9,10,11,12});
        s2.forEach(p->System.out.println(p)); */

        //Filtering collection using stream 
        List<Product> lp=new ArrayList<Product>();
        lp.add(new Product(101,"Bat",500.0));
        lp.add(new Product(102,"Ball",150));
        lp.add(new Product(103,"Wicket",600));
        lp.add(new Product(104,"Gloves",300));
        lp.add(new Product(105,"Helmet",400));

        List<Double> l2=lp.stream() //it will iterate over all the list of product lp
            .filter(p->p.price > 300) //it will filter the price which is greater than 300
            .map(p->p.price)    //returns the stream after applying the given function 
            .collect(Collectors.toList()); //collecting the result of the stream into List by using Collectors.toList()
        System.out.println(l2);
    }
}

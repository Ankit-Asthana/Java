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
public class StreamSumCollectors {
    public static void main(String[] args){
        List<Product> lp=new ArrayList<Product>();
        lp.add(new Product(101,"Bat",500.0));
        lp.add(new Product(102,"Ball",150));
        lp.add(new Product(103,"Wicket",600));
        lp.add(new Product(104,"Gloves",300));
        lp.add(new Product(105,"Helmet",400));

        //sum using collector
        double sp=lp.stream()
        .collect(Collectors.summingDouble(p->p.price));
        System.out.println("Sum of price using Collector = "+sp);

        //average using collector
        double av=lp.stream()
        .collect(Collectors.averagingDouble(p->p.price));
        System.out.println("Average of price is "+av);


        //finding the maximum price of the list
        Product p=lp.stream()
        .max((p1,p2)->p1.price>p2.price ? 1 :-1)
        .get();
        System.out.println("The maximum price of the list is "+p.price);

        //finding the minimum price of the list
        Product s=lp.stream()
        .min((p1,p2)->p1.price>p2.price ? 1 :-1)
        .get();
        System.out.println("The minimum price of the list is "+s.price);


        //counting the number of elements present in the list which have price more than 400
         long cnt=lp.stream()
        .filter(k->k.price > 400)
        .count();
        System.out.println("The number of elements present in the list which have price more than 400 is "+cnt);
    }
}
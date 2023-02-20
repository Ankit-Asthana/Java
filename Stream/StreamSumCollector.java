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
public class StreamSumCollector {
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
    }
}
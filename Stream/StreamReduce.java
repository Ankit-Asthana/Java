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
public class StreamReduce {
    public static void main(String[] args){
        List<Product> lp=new ArrayList<Product>();
        lp.add(new Product(101,"Bat",500.0));
        lp.add(new Product(102,"Ball",150));
        lp.add(new Product(103,"Wicket",600));
        lp.add(new Product(104,"Gloves",300));
        lp.add(new Product(105,"Helmet",400));

        //sum of the price
        double summ=lp.stream()
        .map(p->p.price)
        .reduce((sum,price)->sum+price);
        System.out.println("Sum of all the prices of the things is "+summ);
    }
}

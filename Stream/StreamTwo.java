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
public class StreamTwo {
    public static void main(String[] args){
        List<Product> lp=new ArrayList<Product>();
        lp.add(new Product(101,"Bat",500.0));
        lp.add(new Product(102,"Ball",150));
        lp.add(new Product(103,"Wicket",600));
        lp.add(new Product(104,"Gloves",300));
        lp.add(new Product(105,"Helmet",400));

        //for filtering and iterating the collection
        lp.stream() //iterating over every object of the Product
        .filter(p -> p.price == 600 || p.price==500) //filtering the product having price 600 or 500
        .forEach(p ->System.out.println(p.name)); //using for each loop in product iterating over every object that comes after filter and printing their names
    }
}

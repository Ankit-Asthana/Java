
import java.util.stream.*;
import java.util.*;
class Product{
    int id;
    String name;
    double price;
    public Product(int id,String name,double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
}
public class StreamMetReference {
    public static void main(String[] args){
        List<Product> lp=new ArrayList<Product>();
        lp.add(new Product(101,"Bat",500.0));
        lp.add(new Product(102,"Ball",150));
        lp.add(new Product(103,"Wicket",600));
        lp.add(new Product(104,"Gloves",300));
        lp.add(new Product(105,"Helmet",400));

        List<Double> pls =lp.stream()
        .filter(p->p.price > 100) //filtering the data on condition of price greater than 100
        .map(Product :: getPrice) //fetching price by using method reference
        .collect(Collectors.toList());//collecting to list
        System.out.println(pls);
    }
}


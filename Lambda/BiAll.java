package Lambda;
import java.util.function.*;
import java.util.*;
class Movie{
    String name;
    float price;
    Movie(String a,float v){
        this.name=a;
        this.price=v;
    }
}
public class BiAll{
    public static void main(String[] akjd){
        BiFunction<String,Float,Movie> fn=(mname,pricee)->new Movie(mname,pricee);
        ArrayList<Movie> al=new ArrayList<>();
       // addToList(al);
           al.add(fn.apply("SpiderMan",(float)500));
            al.add(fn.apply("Game of Thrones",(float)700));
            al.add(fn.apply("THOR love and Thunder",(float)900));
            //al.add(new Movie("Thor",1000.0));
        BiConsumer<Movie,Float> bcm=(e,d)->e.price=e.price+d;
        for(Movie k:al){
            bcm.accept(k,(float)100);
        }
        for(Movie e:al){
            System.out.println(e.name);
            System.out.println(e.price);
        }
       /*  public static void addToList(ArrayList<Movie> al){
            al.add("Ankit",500);
        } */
    }
} 

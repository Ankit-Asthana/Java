import java.util.*;

//import javax.lang.model.util.AbstractElementVisitor6;
/* class Wxy implements Comparator<Integer>{
    public int compare(Integer a, Integer b){
        if(a<b)
            return -1;
        else if(a>b)
            return +1;
        else 
            return 0;
    }
} */
public class LambdaCollection {
    public static void main(String[] args){
        ArrayList<Integer> l=new ArrayList<Integer>();
        l.add(10);
        l.add(20);
        l.add(3);
        l.add(2);
        l.add(7);
        System.out.println(l);        //FOR SORTING THE ARRAYLIST WE HAVE A COLLECTION.SORT() METHOD
        //Comparator<Integer> Wxy = (a,b)->{if(a<b)}
       // Collections.sort(a,new Wxy());
       System.out.println(l);
       Comparator<Integer> c=(I1,I2)-> I1<I2?-1:I1>I2?1:0;
       Collections.sort(l,c);
        System.out.println(l);
        //l.stream().forEach(System.out::println);
    }
}

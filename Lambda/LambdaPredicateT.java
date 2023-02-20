import java.util.function.*;
import java.util.ArrayList;
class Data{
    int Id;
    String name;
    Data(int i,String s){
        this.Id=i;
        this.name=s;
    }
}
public class LambdaPredicateT {
    public static void main(String[] ajdj){
        ArrayList<Data> d=new ArrayList<>();
        d.add(new Data(101,"Ankit"));
        d.add(new Data(102,"Aryan"));
        d.add(new Data(103,"Saurabh"));
        d.add(new Data(104,"Aditya"));
        d.add(new Data(105,"Prabhas"));

        Predicate<Data> p= s-> s.name.length()>5;
        for(Data ss:d){
            if(p.test(ss)){
                System.out.println(ss.name+" "+ss.Id);
            }
        }
    }
}

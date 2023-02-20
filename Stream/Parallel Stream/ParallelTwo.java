package allStream.parallelStream;
import java.util.stream.*;
import java.util.*;

class Employee{
    int id;
    String name;
    double salary;

    Employee(int a,String b, double c){
        this.id=a;
        this.name=b;
        this.salary=c;
    }
}
public class ParallelTwo {
    public static void main(String[] arhhsndkf){
        List<Employee> el = new ArrayList<>();
        for(int i=0;i<=1000;i++){
            el.add(new Employee(i,"Employee"+i,Double.valueOf(new Random().nextInt(1000*100))));
        }
    }
}

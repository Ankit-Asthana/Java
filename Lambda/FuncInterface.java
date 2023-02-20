import java.util.function.*;
public class FuncInterface {
    public static void main(String[] iosdilf){
        int[] x={2,4,7,3,8};
        Function<Integer,Integer> f= i->i*i;
        System.out.println("Square of each element of the arry is ");
        for(int x1:x){
            System.out.println(f.apply(x1));
        }

        String[] ss={"Ankit","Aryan","Aditya"};
        Function<String,Integer> t= s->s.length();
        System.out.println("The length of each name in the list is");
        for(String s:ss){
            System.out.println(t.apply(s));
        }

    }
}

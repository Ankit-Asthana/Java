interface Funct{
    public int sum(int a,int b);
}
/* class A implements Funct{
    public int sum(int a,int b){
        return a+b;
    }
}
 */public class FuncLam {
    public static void main(String[] args){
        Funct s=(a,b)->a+b;
        System.out.println("sum of 6 and 6 is "+s.sum(6,6));
    }
}

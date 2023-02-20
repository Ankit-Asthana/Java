//Example solution of the one interface having multiple implementation
//Interface that has to be implemented in the classes One,Two and Three
interface I1{
    public void star();
    //public void rat();
    /* default void rusk(){
        System.out.println("Interface Default");
    } */
} 

class One implements I1{
    public void star(){
        System.out.println("First Implementation");
    }
    /* public void rusk(){
        System.out.println("Default Method in Interface");
    } */
}

class Two implements I1{
    public void star(){
        System.out.println("Second Implementation");
    }
}

class Three implements I1{
    public void star(){
        System.out.println("Third Implementation");
    }
}
public class OneInterMultiImpl  {
    public static void main(String[] args){
        I1 a=new One();
        I1 b=new Two();
        I1 c=new Three();
        a.star();
       // a.rusk();
        b.star();
        c.star();
    }
}

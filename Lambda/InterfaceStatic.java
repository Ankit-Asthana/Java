interface fork{
    //public void sky();
    public static void rack(){
        System.out.println("Static Method");
    }
}
class Ank implements fork{
    public void sky(){
        System.out.println("Abstract Method");
    }
}
public class InterfaceStatic{
    public static void main(String[] args){
       /*  fork a=new Ank();
        a.sky(); */
        fork.rack();
    }
}

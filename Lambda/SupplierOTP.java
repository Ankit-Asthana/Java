import java.util.function.*;
import java.util.Date;
public class SupplierOTP {
    public static void main(String[] args){
        Supplier<Date> su=()->new Date();
        System.out.println(su.get());

        Supplier<String> sup=()->{
            String otp="";
            for(int i=0;i<5;i++){
                otp=otp+(int)(Math.random()*10);  
            }
            return otp;
        };
        System.out.println(sup.get());
        System.out.println(sup.get());
        System.out.println(sup.get());
    }
}

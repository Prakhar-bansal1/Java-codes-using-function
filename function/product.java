package function;
import java.util.*;
public class product {
    public static float productofno(float a, float b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("enter two no using enter");
        float a = SC.nextFloat();
        float b= SC.nextFloat();
       float multiply = productofno(a,b);
       
       System.out.println("product of two no: "+multiply);
       SC.close();
    }
}

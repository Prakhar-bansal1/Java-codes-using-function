package function;
import java.util.*;
public class averageofthree {
    public static void average(float a, float b, float c ) {
        System.out.println( "average of three no.  = " + (a+b+c)/3   );
    }
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("enter first value");
        float a = SC.nextFloat();
        System.out.println("enter second value");
        float b = SC.nextFloat();
        System.out.println("enter third value");
        float c = SC.nextFloat();
        average(a, b, c);
        SC.close();
    }
}

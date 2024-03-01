package function;
import java.util.*;
public class circumference {
    public static void circle (float radius) {
        System.out.println("circumference of a circle is : " + 2*3.14*radius);
    }
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("enter radius of a circle:");
        float radius= SC.nextFloat();
        circle(radius);
        SC.close();
    }
}

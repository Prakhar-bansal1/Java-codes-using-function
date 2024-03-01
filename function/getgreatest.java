package function;
import java.util.*;
public class getgreatest {
    public static int greater(int a, int b) {
        if(a>b)
        return a;
        else
        return b;
    }
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int a = SC.nextInt();
        int b = SC.nextInt();
        System.out.println(greater(a,b));
        SC.close();
                                                                                     
    }
    
}

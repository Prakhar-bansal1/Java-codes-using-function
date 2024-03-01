package function;
import java.util.*;
public class addtwono {
    public static int calculatesum(int a, int b){
         int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("enter two no using enter");
        int a = SC.nextInt();
        int b = SC.nextInt();
        int sum=calculatesum(a,b);
        System.out.println("sum of two no : "+sum);
        SC.close();
    }
}

package function;
import java.util.*;
public class factorialofanumber{
    public static void factorial(int n){
         int fact=1;
        for(int i=n; i>=1; i--){
            fact =i*fact;
        }
        System.out.println(fact);
        
    }
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n=SC.nextInt();
        factorial(n);
        
        SC.close();
    }
}


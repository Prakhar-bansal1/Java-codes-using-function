package function;
import java.util.*;
public class tablefunction {
    public static int table (int n) {
        for(int i=1; i<=10; i++){
            System.out.println(n + "*" + i + "="+n*i);
        }
        return 1;
        
    }
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC. nextInt();
        table(n);
        SC.close();
        
       
    }
}

package function;
import java.util.*;
public class oddeven {
    public static void oddevenno(int n) {
        if(n%2==0){
            System.out.println(n+ " is a even no.");
        }
        else
        System.out.println(n+ " is odd no.");
        
    }
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n= SC.nextInt();
        oddevenno(n);
        SC.close();
}
}

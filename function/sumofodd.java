package function;
import java.util.*;
public class sumofodd {
    public static void oddsum(int n) {
        int temp=0;
        for(int i=1; i<=n; i++){
            if(i%2!=0){
                temp=temp+i;
            }
           
        } 
        System.out.println(temp);
    }
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n= SC.nextInt();
        oddsum(n);
        SC.close();

    }
}

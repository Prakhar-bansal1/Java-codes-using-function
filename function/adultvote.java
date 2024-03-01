package function;
import java.util.*;
public class adultvote {
    public static void adult(int age) {
        if(age<18){
            System.out.println("you are not eligible to vote");
        }
        else
        System.out.println("eligible to vote");
    }
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int age= SC.nextInt();
        adult(age);
        SC.close();
    }
}

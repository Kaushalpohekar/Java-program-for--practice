import java.util.*;
import java.lang.*;
class quotientReminder{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        float c=a/b;
        float d=a%b;
        System.out.println("No 1:-" +a);
        System.out.println("No 2:-" +b);
        System.out.println("Quotient:-" +c);
        System.out.println("Reminder:-" +d);
    }
}


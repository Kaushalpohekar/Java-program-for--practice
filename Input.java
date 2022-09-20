import java.util.*;
import java.lang.*;
class Input{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age =sc.nextInt();
        char Gender=sc.next().charAt(0);
        System.out.println("Hello " +name);
        System.out.println("Age is " +age);
        System.out.println("Your Gender is " +Gender);
    }
}


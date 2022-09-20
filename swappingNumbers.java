import java.util.*;
import java.lang.*;
class swappingNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;
        System.out.println("Before Swaping:-" +a+ " and " +b);
        c=a;
        a=b;
        b=c;
        System.out.println("After Swaping:-" +a+ " and " +b);
    }
}


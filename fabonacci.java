import java.lang.*;
import java.util.*;
public class fabonacci{
    public static void main(String[] ags){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0, b=1;
        while(a<=n){
            System.out.println(a+" ");
            int temp=a+b;
            a=b;
            b=temp;
        }
    }
}

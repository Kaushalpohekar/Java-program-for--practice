import java.lang.*;
import java.util.*;
public class Gcd&Lcm{
    public static void main(String[] ags){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int gcd=0;
        for(int i=1;i<=n1 && i<=n2; i++){
            if(n1%i==0 && n2%i==0)
            gcd=i;
        }
        int lcm=(n1*n2)/gcd;
        System.out.println(gcd+"   "+lcm);
    }
}

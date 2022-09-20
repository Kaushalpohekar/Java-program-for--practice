import java.util.*;
import java.lang.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int r=0;
        char a=sc.next().charAt(0);
        switch(a){
            case '+':
                r=n1+n2;
                System.out.println(r);
                break;
                
            case '-':
                r=n1-n2;
                System.out.println(r);
                break;
                
            case '*':
                r=n1*n2;
                System.out.println(r);
                break;
                
            case '/':
                r=n1/n2;
                System.out.println(r);
                break;
            
            default:
            System.out.println("Invalid");
        }
    }
}
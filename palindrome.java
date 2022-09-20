import java.util.*;
import java.lang.*;
public class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n2=n;
        int r=0;
        while(n!=0){
            int digit=n%10;
            r=r*10+digit;
            n=n/10;
        }
        if(n2==r){
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Number is not Palindrome");
        }
    }    
}
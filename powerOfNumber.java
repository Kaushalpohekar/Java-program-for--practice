import java.util.*;
import java.lang.*;
public class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int e=sc.nextInt();
        int result=1;
        while(e!=0){
            result=result*n;
            e--;
        }
        System.out.println(result);
    }    
}
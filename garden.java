import java.lang.*;
import java.util.*;
public class garden{
    public static void main(String[] ags){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int[] a= new int[100]; 
        for(int i=1;i<=n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Array Elements:- ");
        for(int i=1;i<=n;i++){
            if(a[1]>=a[i]){
                count=count+0;
            }
            else{
                count=count+1;
            }
        }
        System.out.println(count);
    }
}
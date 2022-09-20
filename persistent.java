import java.lang.*;
import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] ags){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int[] a= new int[100]; 
        for(int i=1;i<=n;i++){
            a[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        int y=sc.nextInt();
        for (int i=1;i<=n;i++){
            if(x<=a[i] && y>=a[i]){
                System.out.println(a[i]);
            }
        }
    }
}
import java.util.*;
import java.lang.*;
class practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[100];
        int sum=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(i%2==1){
                sum=sum-a[i];
            }
            else{
                sum=sum+a[i];
            }
        }
        System.out.println(sum);
    }
}
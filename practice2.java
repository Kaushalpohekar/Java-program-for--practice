import java.util.*;
import java.lang.*;
class practice2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] s1=new char[str.length()];
        char[] r1=new char[str.length()];
        for(int i=0;i<str.length();i++){
            s1[i]=str.charAt(i);
        }
        for(int i=str.length();i>0;i--){
            System.out.print(s1[i-1]);
        }
    }
}
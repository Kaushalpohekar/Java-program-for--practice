import java.util.*;
import java.lang.*;
class PositiveNegative{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Number is Positive or Negative");
        int n1 = sc.nextInt();
        if(n1<=0){
            System.out.println("Number is Negative " +n1);
        }
        else{
            System.out.println("Number is Postive " +n1);
        }
    }
}
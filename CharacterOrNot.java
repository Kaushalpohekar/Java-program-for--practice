import java.util.*;
import java.lang.*;
class CharacterOrNot{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter to check input is Character or Not");
        char n1 = sc.next().charAt(0);
        if((n1>'a' && n1<='z') || (n1>='A' &&  n1<='Z')){
            System.out.println("Input is Character " +n1);
        }
        else{
            System.out.println("Input is not Character " +n1);
        }
    }
}
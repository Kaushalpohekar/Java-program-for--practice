import java.util.*;
import java.lang.*;
class LeapYear{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Year to check the year is leap year or not");
        int n1 = sc.nextInt();
        if(n1%4==0){
            System.out.println("Year is a Leap Year " +n1);
        }
        else{
            System.out.println("Year is not a Leap Year " +n1);
        }
    }
}
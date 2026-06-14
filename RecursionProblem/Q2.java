//print factorial of a number
import java.util.*;
public class Q2{
    public static int  CalFact(int n) {
        //base-case
        if(n == 1 || n == 0){
            return 1;
        }
        int fact1 = CalFact(n-1);
        int ans = fact1*n;
        return ans;
    }
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    //taking input
    System.out.print("Enter a Number : ");
    int n = sc.nextInt();

    //calling fuction
    int ans = CalFact(n);
    
    //printing output
    System.out.print("The Factorial of " + n +" is " +ans);
    }
}

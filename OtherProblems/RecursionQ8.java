package JavaPractice.OtherProblems;
//find x^n using recursion
import java.util.*;
public class RecursionQ8 {
    public static int CalPow(int x,int n) {
        if(n==0 || x==1 ) { 
          return 1 ;
        }
        if(x==0) {
            return 0;
        }
        int temp = CalPow(x,n-1);
        int result  = x*temp;
        return result;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int x = sc.nextInt();
        System.out.println("Enter a power : ");
        int n = sc.nextInt();
        int ans = CalPow(x,n);
         System.out.println(ans);
    }
}

package JavaPractice.OtherProblems;
//fibonacci series using resursion
import java.util.*;
public class RecursionQ7 {
    public static void fibo(int a,int b,int n) { 
        if(n == 0 ) {
            return ;
        }
       int c= a+b;
          fibo(b,c,n-1);

            System.out.print(" "+ c);
    }
    public static void main(String[] args) {
        System.out.println("Enter the number of terms in Fibonacci series : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0 , b = 1 ;
        System.out.print(a+" "+b+ " ");
        fibo(a,b,n-2);
    }
}

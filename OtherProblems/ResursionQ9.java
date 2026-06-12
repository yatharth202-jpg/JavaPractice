package JavaPractice.OtherProblems;
//Calculate x^n in a refind way
import java.util.Scanner;

public class ResursionQ9 {
    public static int CalPow(int x , int n) {
        if(n==0 || x ==1) {
            return 1 ;
        } if(x==0){
            return 0 ;
        } if(n%2==0){
            return CalPow(x, n/2)*CalPow(x, n/2);
        } else {
            return CalPow(x, n/2)*CalPow(x, n/2)*x;
        }
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

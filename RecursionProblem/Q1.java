// Print Number from 1 to N
import java.util.*;

public class Q1 {

    public static void countNum(int n) {
        if (n == 0) {
            return;
        }

        System.out.print(n + " ");
        countNum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        countNum(n);
        sc.close();
    }
}


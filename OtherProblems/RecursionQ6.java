package JavaPractice.OtherProblems;
//input email and asign domain name
import java.util.*;
public class RecursionQ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email : ");
        String email = sc.next();
        String domain = email.substring(0,email.indexOf('@'));
        System.out.println("Domain naem is : " + domain);
    }
}

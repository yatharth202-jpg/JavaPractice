package JavaPractice.OtherProblems;
import java.util.Scanner;

public class Qthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  email= sc.nextLine();
        String username = email.substring(0,email.indexOf('@'));
        System.out.println(username);
    }
}

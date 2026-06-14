/*Input email from user anf show username
  ABC123@gmail.com -> ABC123 */

import java.util.*;

public class Q4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //input
      System.out.print("Enter an Email to get the username : ");

      String email = sc.next();
      String username = email.substring(0,email.indexOf("@"));
      System.out.print(username);
    }
}
//Print string in reverse
import java.util.*;

public class Q8 {

    public static void reverse(String str, int idx) {

        if(idx == 0) {
            System.out.print(str.charAt(idx));
            return;
        }

           System.out.print(str.charAt(idx));
           reverse(str,idx-1);

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //input
      System.out.print("Enter a word : ");
      String str = sc.nextLine();
      
      reverse(str,str.length()-1) ;
    }
}
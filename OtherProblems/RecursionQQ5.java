package JavaPractice.OtherProblems;
//take input abcedf and change e to i 
import java.util.*;
public class RecursionQQ5 {
  public static void main(String[] args) {
    System.out.println("Enter a string: ");
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    String result = "";

    for(int i = 0; i < str.length(); i++) {
      if(str.charAt(i) == 'e') {
        result += 'i';
      } else {
        result += str.charAt(i);
      }
    }System.out.println(result);
    
  }
}

//Replace e to i in a word 
//example :- abcdefed -> abcdifid
import java.util.*;

public class Q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //input
      System.out.println("Enter a word : ");

      String str = sc.next();
      String result = "";

      //seprating the alphabets
      for(int i = 0 ; i < str.length() ; i++) {

        if(str.charAt(i) == 'e') {
          result += 'i';
        } else {
          result += str.charAt(i);
        }

      }  
       System.out.print(result);
    }
  }
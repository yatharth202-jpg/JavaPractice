//Find 1st and last occurace of an alphabet in a word
import java.util.*;

public class Q9 {

    public static int first = -1; 
    public static int last = -1 ;

    public static void findChar(String word,int idx,char alpha) {

        //Base-case
        if(idx == word.length()) {
            System.out.print(first +"," +last);
            return;
        }
        char currChar = word.charAt(idx);

        if(currChar == alpha) {
        if(first == -1) {
            first = idx ;
        } else {
            last = idx ;
        }
    } 
        findChar(word,idx+1,alpha); 
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //input
      System.out.print("Enter a word: ");
      String word = sc.next();

      System.out.print("Enter an alphabet : ");
      char alpha = sc.next().charAt(0);
      
      findChar(word,0,alpha);
      sc.close();
    }
}

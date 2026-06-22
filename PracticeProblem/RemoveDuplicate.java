package PracticeProblem;
import java.util.*;

public class RemoveDuplicate {
    public static boolean[] map = new boolean[26];

    public static void RD(String str, int idx, String newString) {
        if(idx==str.length()){
            System.out.print(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if(map[currChar - 'a']){
            RD(str, idx+1, newString);
        } else {
            newString += currChar;
            map[currChar -'a'] = true;
            RD(str, idx+1, newString);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : "); 
        String str = sc.nextLine();

        RD(str,0,"");
    }
}
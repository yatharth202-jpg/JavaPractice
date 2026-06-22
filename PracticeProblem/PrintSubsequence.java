package PracticeProblem;

import java.util.*;

public class PrintSubsequence { 

public static void RS(String str, int idx,String newString) {
    if(idx == str.length()) {
        System.out.println(newString);
        return;
    }

    char currChar = str.charAt(idx);

    //to be 
    RS(str,idx+1,newString+currChar);

    //not to be
    RS(str,idx+1,newString);

}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a String : ");
    String str = sc.nextLine();

    RS(str,0,"");
    
    sc.close();
}
}

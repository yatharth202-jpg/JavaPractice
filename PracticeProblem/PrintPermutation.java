package PracticeProblem;

import java.util.*;

public class PrintPermutation {
   public static void Perm(String str,String permutation) {
      if(str.length() == 0) {
         System.out.println(permutation);
         return;
      }
      for(int i=0 ; i<str.length() ; i++) {
         char currChar = str.charAt(i);
            String newstr = str.substring(0,i) + str.substring(i+1);

            Perm(newstr,permutation+currChar);
      }
   }
 public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a String : ");
    String str = sc.nextLine();

    Perm(str,"");

    sc.close();
 }
}



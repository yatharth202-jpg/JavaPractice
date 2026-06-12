package JavaPractice.OtherProblems;
public class Qseven {
    public static void subsequence(String str, int idx, String newstring) {
      if(idx == str.length()) {
         System.out.println(newstring);
         return;
      }
      char currchar = str.charAt(idx);
      //to be
      subsequence(str, idx+1, newstring + currchar);
      //notto be 
      subsequence(str, idx+1, newstring);
   } public static void main(String[] args) {
      String str = "abc";
    subsequence(str, 0," ");
   }
    }


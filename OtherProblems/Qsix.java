package JavaPractice.OtherProblems;
public class Qsix {
    public static int first = -1;
    public static int last = -1;
   public static void findOccu(String str,int idx, char element ) {
    if(idx == str.length()){
        System.out.print(first+last);
        return;
    }
    char currchar = str.charAt(idx);
    if(currchar == element) {
      if(first == -1) {
        first = idx ;
      } else {
        last = idx;
      }
    } findOccu(str,idx+1,element);
   } 
   public static void main(String[] args) {
    String str = "aabchdheknacd";
    findOccu(str,0, 'a');
   }
}

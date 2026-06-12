package JavaPractice.OtherProblems;

  //print number from 1 to 5
  public class RecursionQ2 {
  
    public static void printNum(int n) {
        if(n==5) {
            System.out.println(n);
            return;
        }

     System.out.println(n);
        printNum(n+1);
    }
    public static void main(String args[]) {
        int n = 1;
        printNum(n);
    }
}
        
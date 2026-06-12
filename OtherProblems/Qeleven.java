package JavaPractice.OtherProblems;
public class Qeleven {
    public static int inviteguest(int n){
        if(n<=1) {
            return 1;
        }
      int way1 = inviteguest(n-1);
      int way2 = inviteguest(n-2)*(n-1);
      return  way1 + way2;
    }
    public static void main(String[] args) {
        int n =4;
       System.out.print(inviteguest(n));
    }
}

package JavaPractice.OtherProblems;
//WAP to find factorial of a number
public class RecursionQ4 {
    public static int calFact(int n) {
        if(n==0||n==1) {
            return 1;
        }
        int fact1 = calFact(n-1);
        int ans = n*fact1;
        return ans;
    }
    public static void main(String[] args) {
        int n = 5 ;
     int ans =  calFact(n);
     System.out.println(ans);
    }
}

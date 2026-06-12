package JavaPractice.OtherProblems;
//find sum of n natural numbers
public class ResuraionQ3 {
    public static void sum(int n , int sum ){
        if(n==0) {
            System.out.println(sum);
            return;
        }
        sum(n-1,sum+=n);
    }
    public static void main(String[] args) {
        int n = 5 ; 
        sum(n,0);
    }
}

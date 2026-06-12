package JavaPractice.OtherProblems;
public class Qfour {
    public static void febonaaci(int a,int b, int n) {
        if(n == 0) {
            return;
        }
        int c = a + b;
        System.out.print(c);
        febonaaci(b,c,n-1);
    }
    public static void main(String[] args) {
        int a =0 , b=1;
        int n = 7;
        System.out.print(a+b);
        febonaaci(0,b,n-2);
    }
}
 
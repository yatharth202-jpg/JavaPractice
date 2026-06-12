package JavaPractice.OtherProblems;
public class Qfive {
    public static void factor(String str, int idx) {
        if(idx == 0) {
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        factor(str,idx-1);
    }
public static void main(String[] args) {
    String str = "hello";
    factor(str,str.length()-1);
}
    }
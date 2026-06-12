package JavaPractice.OtherProblems;
import java.util.Scanner;

public class Qtwo{
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       String result = "";
       for(int j = 0; j<str.length(); j++){
        if(str.charAt(j) =='e'){
            result += "i";
        } else{
            result += str.charAt(j);
        }
       } System.out.print(result);
    }
}

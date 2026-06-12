package JavaPractice.PatternProblem;
//WAP to convert a string to lower case and replace space with underscore
import java.util.Scanner;
public class practiceQ1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter a line : ");
        
         String line = sc.nextLine();
       
         System.out.print("Enter a string which include some upper case: ");
        
         System.out.println(line.toLowerCase());
         System.out.println(line.replace(" ","_"));
}
}
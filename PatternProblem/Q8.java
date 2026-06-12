package JavaPractice.PatternProblem;
import java.util.*;

public class Q8 {
    
   public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n : ");
    
    int n = sc.nextInt();
 

 //for upper half  

for(int i = 1 ; i<=n; i++) {

 //for  left *
   for(int j = 1 ; j <= i ; j++){
   System.out.print("*");
   }
 

 //for space

   for(int j = 1 ; j <=2*(n-i) ; j++){
   System.out.print(" ");
   }
  
 

    //for right *

 
   for(int j = 1 ; j <= i ; j++){
   System.out.print("*");
   }
   System.out.println();
 }


  //for lower half  

for(int i = n ; i>=1; i--) {

 //for  left *
   for(int j = 1 ; j <= i ; j++){
   System.out.print("*");
   }
 

 //for space

   for(int j = 1 ; j <=2*(n-i) ; j++){
   System.out.print(" ");
   }
  
 

    //for right *

 
   for(int j = 1 ; j <= i ; j++){
   System.out.print("*");
   }


   System.out.println();
 }
    }
   }
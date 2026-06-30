package PracticeProblem;

import java.util.*;
public class PathForMaze {
    public static int countPaths(int i,int j,int n,int m) {
        if(i==n || i==m) {
            return 0;
        } if(i==n-1 || j == m-1) {
            return 1;
        }

        //move-down
        int dowmPath = countPaths(i+1,j,n,m);

        //move-right
        int rightPath = countPaths(i, j+1, n, m);
        return dowmPath + rightPath;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of length : ");
        int n = sc.nextInt();
       
        System.out.print("Enter size of breath : ");
        int m = sc.nextInt();

        int totalp = countPaths(0, 0, n, m);
        
        System.out.print("Total paths for the maze to complete is : " + totalp);
      
        sc.close();
    }
    
}

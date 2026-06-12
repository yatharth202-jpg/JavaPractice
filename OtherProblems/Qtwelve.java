package JavaPractice.OtherProblems;
public class Qtwelve{
public static int count(int i , int j,int n,int m) {
    if(i==n || j == m) {
        return 0;
    }
    if(i == n-1 || j == m-1) {
        return 1;
    }
   int side = count(i+1, j, n, m);
   int down = count(i, j+1, n, m);
   return side + down ;
}
public static void main(String[] args) {
    int n = 3 , m =3 ;
    int totalp = count(0, 0, n, m);
    System.out.print(totalp);
}
}
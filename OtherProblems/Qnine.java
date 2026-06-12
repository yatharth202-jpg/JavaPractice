package JavaPractice.OtherProblems;
public class Qnine {
    public static void perm(String str, String permuatation) {
        if(str.length()==0) {
           System.out.print(permuatation + " ");
           return;
        } 
        for(int i=0 ; i<str.length() ; i++)
      { char currchar = str.charAt(i);
    String newstr = str.substring(0, i) + str.substring(i+1);
    perm(newstr,permuatation + currchar);
}
    } public static void main(String[] args) {
        String str = "abc";
        perm(str,"");
    }
}

package PracticeProblem;

import java.util.*;

public class Q1 {
    public static void PP (String str , String perm ,int idx) {
        if(str.length() == idx) {
            System.out.println(perm);
            return ;
        } 

        for(int i=0; i< str.length();i++) {

        char currChar = str.charAt(i);
        str = str.substring(0,i) + str.substring(i+1);
        PP(str,perm+currChar+idx+1);

    }
}
}
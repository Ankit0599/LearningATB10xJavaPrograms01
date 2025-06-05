package ex_013_25th_Jan_Task;

import com.sun.security.jgss.GSSUtil;

public class LAB120_Palindrome_Check_While_Loop {
    public static void main(String[] args) {
        String Word = "Word";
        String Reverse = "";

        int i = Word.length() -1 ;

        //Reverse the string using for Loop
        while (i>=0) {
            Reverse += Word.charAt(i);
            i--;
        }

        // Check if original and reverse are same
        if (Word.equals(Reverse)) {
            System.out.println( Word + " is a Palindrome.");
        }
        else {
            System.out.println( Word + " is not a Palindrome.");
        }

    }
}

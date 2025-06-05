package ex_013_25th_Jan_Task;

public class LAB119_Palindrome_Check_For_Loop {
    public static void main(String[] args) {
        String word = "Word";
        String reverse = "" ;

        // reverse the string using loop
        for ( int i = word.length() -1; i >= 0; i--) {
            reverse +=word.charAt(i);
        }

        // check if original and reverse are the same
        if (word.equals(reverse)) {
            System.out.println(word + " is a Palindrome");
        }
        else {
            System.out.println(word + " is not a Palindrome");
        }
    }
}

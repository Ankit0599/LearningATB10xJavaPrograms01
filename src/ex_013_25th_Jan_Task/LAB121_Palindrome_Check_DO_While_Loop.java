package ex_013_25th_Jan_Task;

public class LAB121_Palindrome_Check_DO_While_Loop {
    public static void main(String[] args) {
        String Word = "Word";
        String Reverse = "";

        int i = Word.length() -1;

        //Reverse the string using do while loop
        do {
            Reverse += Word.charAt(i);
            i--;
        }
        while (i>=0) ;

        // Check if original and reverse are same

        if (Word.equals(Reverse)){
            System.out.println( Word + " is a Palindrome.");
        }
        else {
            System.out.println( Word + " is not a Palindrome.");
        }
    }
}

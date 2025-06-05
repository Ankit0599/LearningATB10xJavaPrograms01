package ex_013_25th_Jan_Task;

import java.util.Locale;

public class LAB117_while_Loop_Count_VC {
    public static void main(String[] args) {
        String input = "Ankit" ;
        int vowels = 0, consonants = 0;
        int i = 0;

// convert input to lower case for easier comparison
        input = input.toLowerCase( );

        while (i < input.length()){
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) {
                // checking if a character is a vowel
                if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++ ;
                }
            }
            i++;

        }

        System.out.println("Vowels : " + vowels);
        System.out.println("Consonants :" + consonants);
    }
}

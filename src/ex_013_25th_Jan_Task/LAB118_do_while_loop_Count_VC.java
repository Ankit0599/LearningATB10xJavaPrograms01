package ex_013_25th_Jan_Task;

public class LAB118_do_while_loop_Count_VC {
    public static void main(String[] args) {
        String input = "ankit";
        int vowels = 0, cosonants = 0;
        int i = 0;

        do {
             char ch = input.charAt(i);
// Checking Character is a letter
            if (Character.isLetter(ch)) {
                // Checking char is a vowel
                if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels ++;
                } else {
                    cosonants ++;
                }
            }
            i++;
        } while (i < input.length());

        System.out.println("Vowels :" + vowels);
        System.out.println("Consonants :" + cosonants);
    }
}

package ex_013_25th_Jan_Task;

public class LAB116_For_Loop_Count_VC {
    public static void main(String[] args) {
        String input = "ankit";
        int vowels = 0, consonants = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
// checking if character is a letter
            if (Character.isLetter(ch)){
                // checking if character is a vowel
                if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels : " + vowels);
        System.out.println("Consonants : " + consonants);
    }
}

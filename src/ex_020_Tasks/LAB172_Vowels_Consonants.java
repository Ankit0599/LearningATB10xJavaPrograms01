package ex_020_Tasks;

import java.util.Scanner;

public class LAB172_Vowels_Consonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input from user
        System.out.print("enter a String : ");
        String input = sc.nextLine();

        // Step 2: Convert string to lowercase for easy comparison
        input = input.toLowerCase();

        // Step 3: Initialize counters
        int vowels = 0;
        int consonants = 0;

        // Step 4: Loop through each character
        for ( int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if character is a letter
        if (Character.isLetter(ch)){
            // Check if it's a vowel
             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                 vowels++;
             } else {
                 consonants++;
             }
        }

        }

        //step 5 : print the results
        System.out.println("Enter the number of vowels : " + vowels);
        System.out.println("Enter the number of consonants : " + consonants);
    }
}

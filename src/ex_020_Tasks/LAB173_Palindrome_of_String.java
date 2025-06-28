package ex_020_Tasks;

import java.util.Scanner;

public class LAB173_Palindrome_of_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input from user
        System.out.println("Enter a String : ");
        String input = sc.nextLine();

        //Step 2 : handle empty case
        if (input.isEmpty()){
            System.out.println("Can not provide an empty string");
            return; // Exit the method early only if input is empty
        }

        //Step 3 : Normalize input
        // Convert to lowercase and remove all non-letter characters (including spaces and punctuation)
        String cleaned = input.toLowerCase().replaceAll("[^a-z0-9]","");


        //Step 4 : Use the for loop to reverse the string manually
        String reversed = "";
        for (int i = cleaned.length() - 1; i >= 0; i--){
            reversed += cleaned.charAt(i);
        }

        // Step 5: Compare original and reversed strings
        if (cleaned.equals(reversed)) {
            System.out.println("The String is a palindrome");
        }
        else {
            System.out.println("The String is not a Palindrome");
        }
    }

}

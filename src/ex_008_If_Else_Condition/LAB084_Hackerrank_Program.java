package ex_008_If_Else_Condition;

import java.util.Scanner;

public class LAB084_Hackerrank_Program {
    public static void main(String[] args) {


        //Write a program that calculates and displays the letter grade for a
        // given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69

        // Logic Building

        //Step 1
        // Find the Inputs/Outputs
        // Input -> Score (0 - 100) -> data type = Int
        // Output -> garde -> data type -> char


        //Step 2 - Basic Logic/Rough Logic
        //if (Score >=90 && Score <=100) -> Return grade value - A
        //if (Score >=80 && Score <=89) -> Return grade value - B
        //if (Score >=70 && Score <=79) -> Return grade value - C
        //if (Score >=60 && Score <=69) -> Return grade value - D
        // else -> F;

        //Step 3 - Write code

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Score: ");
        int score = sc.nextInt();
        char grade = 'F';

        if (score >=90 && score <=100) {
            grade = 'A';
        }
        else if (score >=80 && score <=89) {
            grade = 'B';
        }
        else if (score >=70 && score <=79) {
            grade = 'C';
        }
        else if (score >=60 && score <=69) {
            grade = 'D';
        }
        else {
            grade = 'F';
        }

        System.out.println("Your grade is : " + grade);

        //Step 4 - Edge Cases

    }
}

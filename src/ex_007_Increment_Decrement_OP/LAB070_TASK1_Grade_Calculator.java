package ex_007_Increment_Decrement_OP;

import java.sql.SQLOutput;

public class LAB070_TASK1_Grade_Calculator {
    public static void main(String[] args) {
        int Score = 95;

        String grade = ( Score >= 90 && Score <= 100) ? "A" :
                ( Score >= 80 && Score <= 89) ? "B" :
                ( Score >= 70 && Score <= 79) ? "C" :
                ( Score >= 60 && Score <= 69) ? "D" :
                ( Score >= 50 && Score <= 59) ? "F" :
                        "Invalid Score";

        System.out.println("Your Score is : " + Score);
        System.out.println("Your Grade is : " + grade);
    }
}

package ex_008_If_Else_Condition;

import java.util.Scanner;

public class LAB082_ODD_EVEN_IF_ELSE_Program {
    public static void main(String[] args) {

        // Create a program and take the user inputs
        // check whether the input even and odd

        // Step 1 - Figure it out - inputs and outputs
        // number (int) i/o -> scanner clas can be used to take inputs
        // String -> odd or Even -> o/p -> println
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer Number : ");
        int num = sc.nextInt();

        // STep 2 - Logic rough
        // num%2 ==0  -> even -> modulus -> R == 0 -> even
        // num%2 !=0  -> odd


        //Step 3 - logic write
        if (num%2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        sc.close(); // Stop taking input now

        //Step 4 - Edge Cases
        // large Int - fail , -ve handle, zero, other input
    }
}

package ex_020_Tasks;

import java.util.Scanner;

public class LAB177_Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Step 1 : User Input
        System.out.println(" Enter the number of terms : ");
        int num = sc.nextInt();

        // Step 2: Handle edge cases
        if (num <= 0) {
            System.out.println("Please enter the positive numbers only ");
        }

        // Step 3: Initialize first two terms
        int a = 0;
        int b = 1;

        // Step 4: Print the Fibonacci series
        System.out.println("Fibonacci Series up to " + num + " terms :");
        for (int i=1; i<=num; i++){
            System.out.print(a + " ");

            // Calculate next term
            int next = a+b;
            a = b;
            b = next;
        }
    }
}

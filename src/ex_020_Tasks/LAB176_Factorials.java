package ex_020_Tasks;

import java.util.Scanner;

public class LAB176_Factorials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Step 1 : User Input
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();

        long fact = 1;

        //Step 2 : Checking input value having negative numbers
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers");
            return;
        }

        //step 3: calculate factorial
        for (int i = 1; i <=num; i++){
            fact = fact * i;
        }

        //Step 4 : result
        System.out.println("Factorial of " + num + " is : " + fact);
    }
}

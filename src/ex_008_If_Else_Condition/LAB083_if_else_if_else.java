package ex_008_If_Else_Condition;

import java.util.Scanner;

public class LAB083_if_else_if_else {
    public static void main(String[] args) {

        // Num 1 and Num 2
        // Num 1 > Num 2 -> 1
        // Num 1 < Num 2 -> 2
        // Num 1 == Num 2 -> 3

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Num1 : ");
        int Num1 = sc.nextInt();
        System.out.println("Enter the Num2 : ");
        int Num2 = sc.nextInt();

        if (Num1 > Num2) {
            System.out.println("Num1");
        }
        else if (Num1 < Num2) {
            System.out.println("Num2");
        }
        else {
            System.out.println("Equal!");
        }
        sc.close();
    }
}

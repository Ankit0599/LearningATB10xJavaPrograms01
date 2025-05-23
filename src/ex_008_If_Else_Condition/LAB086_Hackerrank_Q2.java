package ex_008_If_Else_Condition;

import javax.swing.*;
import java.util.Scanner;

public class LAB086_Hackerrank_Q2 {
    public static void main(String[] args) {

        //Triangle Classifier:
        //Write a program that classifies a triangle based on its side lengths.
        //Given three input values representing the lengths of the sides,
        // determine if the triangle is equilateral (all sides are equal),
        // isosceles (exactly two sides are equal),
        // or scalene (no sides are equal).
        // Use an if-else statement to classify the triangle.
        // side1, side2, side2 > eq, iso, scalene

        // Logic Building
        // Step 1
        // Find the inputs / outputs
        // Input | side1,side2,side3 -> data type -> double
        // Output SOP -> String or message -> Equilateral, Isosceles, Scalene.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Side1:  ");
        double Side1 = sc.nextDouble();

        System.out.println("Enter the length of Side2:  ");
        double Side2 = sc.nextDouble();

        System.out.println("Enter the length of Side3:  ");
        double Side3 = sc.nextDouble();

        // 2. Basic Logic | Rough Logic
        // if side1 == side2 and side2 == side3 -> side1 == side 3- eq
        // side1 == side2 | | side1 == side3 || side2 == side3 -> iso
        // // else- > scalene

        if (Side1 <= 0 || Side2 <= 0 || Side3 <= 0) {
            System.out.println("Invalid input : Side lengths must be positive.");
        }
        else {
            if (Side1 == Side2 && Side2 == Side3 && Side1 == Side3) {
                System.out.println("The triangle is Equilateral.");
            } else if (Side1 == Side2 || Side2 == Side3 || Side1 == Side3) {
                System.out.println("The triangle is Isosceles.");
            }
            else {
                System.out.println("The triangle is Scalene.");
            }

        }
        sc.close();
    }
}

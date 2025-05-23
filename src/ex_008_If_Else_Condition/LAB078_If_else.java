package ex_008_If_Else_Condition;

import java.util.Scanner;

public class LAB078_If_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age : ");
        int Age = sc.nextInt();

        if (Age > 18) {
            System.out.println("You are allowed to Vote!");
        } else {
            System.out.println("You are not allowed!");
        }
    }
}

package ex_020_Tasks;

import java.util.Scanner;

public class LAB175_LeapYearCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Step 1 : User Input
        System.out.println("Enter the Year : ");
        int year = sc.nextInt();

        //step 2 : Apply leap year logic
        if ((year%4 == 0 && year%100 != 0) || (year%400 == 0)){
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }
}

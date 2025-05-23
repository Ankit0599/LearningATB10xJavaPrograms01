package ex_009_Switch;

import java.util.Scanner;

public class LAB087_Switch_Basics {
    public static void main(String[] args) {

        // User - Enter int number from 1 to 7
        // Which day it is it
        // 1 -> Mon, 4 -> Thursday, 7 -> Sun, 8,9,10..... -> Invalid

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the day number(1 to 7)");
        int day = sc.nextInt();

        switch (day) {
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("No, Idea what it is");
        }
    }
}

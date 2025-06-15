package ex_014_Functions;

import java.util.Scanner;

public class LAB130_Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter NUM 1: ");
        int a = 0;
        if (sc.hasNextInt()){
             a = sc.nextInt();
        }
        else {
            System.out.println("Enter Int only ");
            System.exit(0);
        }
        System.out.println("Enter NUM 2: ");
        int b = 0;
        if (sc.hasNextInt()){
             b = sc.nextInt();
        }
        else {
            System.out.println("Enter Int only ");
            System.exit(0);
        }

        int result = sum(a, b);
        System.out.println(result);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

}

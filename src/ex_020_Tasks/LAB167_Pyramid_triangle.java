package ex_020_Tasks;

import java.util.Scanner;

public class LAB167_Pyramid_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int k=1; k<= 2 * i-1; k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

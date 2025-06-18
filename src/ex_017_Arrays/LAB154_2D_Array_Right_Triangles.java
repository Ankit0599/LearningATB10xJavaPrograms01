package ex_017_Arrays;

import java.util.Scanner;

public class LAB154_2D_Array_Right_Triangles {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" ENter the Number n= 5 : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

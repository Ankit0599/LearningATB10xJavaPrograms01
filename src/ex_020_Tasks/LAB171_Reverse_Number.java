package ex_020_Tasks;

import java.util.Scanner;

public class LAB171_Reverse_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Step 1: Input array size
        System.out.println("Enter the Number for the Array : ");
        int size = sc.nextInt();

        int array [] = new int[size];

        // Step 2: Input array elements
        System.out.println("Enter " + size + " Numbers : ");
        for (int i=0; i < size; i++){
            array[i] = sc.nextInt();
        }

        // Step 3: Print array in reverse order
        System.out.println("Array in reverse order : ");
        for (int i = size - 1; i >=0; i--) {
            System.out.print(array[i] + " ");
        }

    }
}

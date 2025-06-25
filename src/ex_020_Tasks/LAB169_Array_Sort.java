package ex_020_Tasks;

import java.util.Scanner;

public class LAB169_Array_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers for the array : ");
        int size = sc.nextInt();
        if (size <= 0){
            System.out.println("Array size must be greater than 0 ");
            return;
        }

        int array[] = new int[size];

        System.out.println("Enter the Elements : ");
        for (int i = 0; i < size; i++) {
            array [i] = sc.nextInt();

        }

        for (int i=0; i < size -1; i++) {
            for (int j=0; j < size -1 - i; j++) {
                if (array[j] > array [j + 1]) {
                    // Swap Elements
                    int temp = array [j];
                    array [j] = array [j+1];
                    array [j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array in ascending order :  ");
        for (int i = 0; i < size; i++) {
            System.out.print(array [i] + " ");
        }
    }
}

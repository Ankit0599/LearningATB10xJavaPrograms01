package ex_020_Tasks;

import java.util.Scanner;

public class LAB168_Second_Smallest_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array ");
        int size = sc.nextInt();

        if (size < 2){
            System.out.println("Cannot find the second smallest number, need at least 2 numbers.");
            return;
        }

        int []array = new int[size];
        System.out.println("Enter the Elements : ");
        for (int i=0; i<size; i++){
            array[i]=sc.nextInt();
        }

        int smallest = Integer.MAX_VALUE;
        int second_smallest = Integer.MAX_VALUE;

        for (int num : array){
            if (num < smallest) {
                second_smallest = smallest;
                smallest = num;
            }
            else if (num > smallest && num < second_smallest) {
                second_smallest = num;
            }
        }
        if (second_smallest == Integer.MAX_VALUE) {
            System.out.println(" There is no second smallest number (all the elements are same). ");
        }
        else {
            System.out.println(" Second Smallest number is :" +  second_smallest);
        }

    }
}

package ex_017_Arrays;

import java.util.Scanner;

public class LAB151_Array_User_Input {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter The Size : ");
        int size = Sc.nextInt();

//        int [] numbers = new int[size];
//        String [] names = new String [size];
        float [] names = new float[size];

        for (int i = 0; i < names.length; i++) {
            System.out.println(" Enter the Number : ");
            names [i] = Sc.nextFloat();
        }

        System.out.println(" ____________________ ");

        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

    }
}

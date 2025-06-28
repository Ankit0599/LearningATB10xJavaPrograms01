package ex_020_Tasks;

import java.util.Scanner;

public class LAB174_Reverse_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Step 1 : User input
        System.out.println("Enter the String : ");
        String Input = sc.nextLine();

        //Step 2 : Reverse a string manually using for loop
        String reversed = "";
        for (int i = Input.length() - 1; i>=0; i--){
            reversed += Input.charAt(i);
        }

        //Step 3 : result
        System.out.println(" Reversed String is : " + reversed);
    }
}

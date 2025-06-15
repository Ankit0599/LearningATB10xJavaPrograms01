package ex_014_Functions;

import java.math.BigInteger;
import java.sql.SQLOutput;
import java.util.Scanner;

public class LAB129_TASK {
    public static void main(String[] args) {
        //Create function of sub, sum, div & Mul
        // with parameter A, B (Take parameter from the user)

//        Logic Building
//        step 1 - inputs and outputs
//        input - a,b -> int (Scanner)
//        output - variable result

//        Step 2 - Rough logic - Create functions
//        function type -> 4th -> with parameter and with return type

//        Step 3 - write the code and find and fix - Edge Cases

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number 1 : ");
//        BigInteger a = scanner.nextBigInteger();
          int a= 0;
        if(scanner.hasNextInt()) {
             a = scanner.nextInt();
        }
        else {
            System.out.println("Enter Only Int");
            System.exit(0);
        }
        System.out.println("Enter the Number 2 : ");
//        int b = scanner.nextInt();
        int b= 0;
        if(scanner.hasNextInt()) {
            b = scanner.nextInt();
        }
        else {
            System.out.println("Enter Only Int");
            System.exit(0);
        }

        int result_sum = sum(a,b);
        int result_sub = sub(a,b);
        int result_mul = mul(a,b);
        int result_div = div(a,b);
        int result_mod = modulus(a,b);

        System.out.println(result_sum);
        System.out.println(result_sub);
        System.out.println(result_mul);
        System.out.println(result_div);
        System.out.println(result_mod);


    }

    static int sum(int a, int b) {
        return a+b;
    }

    static int sub(int a, int b) {
        return a-b;
    }

    static int mul(int a, int b) {
        return a*b;
    }

    static int modulus(int a, int b) {
        return a%b;
    }

    static int div(int a, int b) {
        if (b==0) {
            System.out.println("Div by Zero is not allowed");
        }
        return a/b;
    }

}

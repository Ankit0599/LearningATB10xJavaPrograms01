package ex_007_Increment_Decrement_OP;

public class LAB075_TASK6_CLI_Options_Ternary_Operator {
    public static void main(String[] args) {
        String A1 = args[0];
        String A2 = args[1];

        int num1 = Integer.parseInt(A1);
        int num2 = Integer.parseInt(A2);

        int result = (num1 > num2) ? num1 : num2;

        System.out.println("Max_Number is: " +  result );
    }
}

package ex_007_Increment_Decrement_OP;

public class LAB062_IN_OP {
    public static void main(String[] args) {

        // ++ Variable -> pre-increment
        // value incremented first - then stored in the result

        int a = 10; // ++a = a + 1
        int b = ++a; // a -> 11, b -> 11

        System.out.println(b);
        System.out.println(a);

        // Exp and Result table
        // Line No. | a | result b
        // 8 | 10 | NA
        // 9 | 11 | 11
        // 10 | NA | 11
        // 11 | 11 | NA
    }
}

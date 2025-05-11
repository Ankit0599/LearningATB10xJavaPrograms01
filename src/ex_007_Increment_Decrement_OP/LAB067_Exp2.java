package ex_007_Increment_Decrement_OP;

public class LAB067_Exp2 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + ++a);
        System.out.println(a);


        // Method
        // ++a -> Exp 1 -> 11, a -> 11
        // +
        // ++a -> Exp 2 -> 12, a -> 12
        // Exp 1 + Exp 2 -> 11 + 12 -> 23
    }
}

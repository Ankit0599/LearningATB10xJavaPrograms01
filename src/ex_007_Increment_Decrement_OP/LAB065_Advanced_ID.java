package ex_007_Increment_Decrement_OP;

public class LAB065_Advanced_ID {
    public static void main(String[] args) {
        int a= 10;
        System.out.println(a++ + a);

        // A + B
        // A -> a++ -> Exp1 -> 10, a -> 11
        // +
        // B -> a -> 11 -> Exp 2 -> 11
        // A + B = 10 + 11 = 21
    }
}

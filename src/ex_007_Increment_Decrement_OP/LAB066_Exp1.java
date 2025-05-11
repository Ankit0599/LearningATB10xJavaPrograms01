package ex_007_Increment_Decrement_OP;

public class LAB066_Exp1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);
        System.out.println(a);



        //Method
        //a++ -> Exp A -> 10 , a -> 11
        // +
        //++a -> Exp B -> 11, a-> 12
        // Exp A + Exp B -> 10 + 12 -> 22
    }
}

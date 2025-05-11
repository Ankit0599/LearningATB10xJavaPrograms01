package ex_007_Increment_Decrement_OP;

public class LAB072_TASK3_POST_PRE_ADD_IP {
    public static void main(String[] args) {
        int a = 10;
        int result = (++a + a++ + a++);

        // method
        // a = 10 ;
        // ++a -> a = 11
        // a++ -> a++ = 11 -> a = 12 (after printing RESULT print a will become 12)
        // a++ -> a++ = 12 -> a = 13 (after printing RESULT print a will become 13)
        // (++a + a++ + a++) = (11 + 11 + 12) = 34;

        System.out.println(result);
        System.out.println(a);
    }
}

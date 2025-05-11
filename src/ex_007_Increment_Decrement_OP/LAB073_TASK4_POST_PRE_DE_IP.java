package ex_007_Increment_Decrement_OP;

public class LAB073_TASK4_POST_PRE_DE_IP {
    public static void main(String[] args) {
        int a = 20;
        int result = (--a + a++ + a--);

        //Method
        // a = 20;
        // --a -> a = 19;
        // a ++ = 19 -> a = 20;
        // a -- = 20 -> a = 19;
        // (--a + a++ + a--) = (19 + 20 + 19) = 58;

        System.out.println(result);
        System.out.println(a);
    }
}


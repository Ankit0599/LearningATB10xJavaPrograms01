package ex_003_java_Basics;

public class LAB034_Relational_Operators {
    // <  Less than
    // < = -> Less than or equal to
    // >  greater
    // > = -> Greater or equal
    // == -> Equal to (but checking)
    // != -> Not equal

    // All of them will result boolean output

    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        boolean c = a > b; // 10>30
        System.out.println(c);

        int age_ankit = 26;
        int age_vinay = 26;
        boolean result = age_ankit >= age_vinay;
        System.out.println(result);
        // age_ankit > age_vinay or age_ankit = age_vinay

    }

}

package ex_005_Ternary_Operator;

public class LAB054_TO {
    public static void main(String[] args) {
        // result = condition ? expression 1 : expression 2

        int age = 18;
        String Can_I_Vote = age>=18 ? "Yes, you can vote" : "No, You can't vote";
        System.out.println(Can_I_Vote);
    }
}

package ex_007_Increment_Decrement_OP;

public class LAB071_TASK2_Largest_NUM {
    public static void main(String[] args) {
        int A = 15, B= 87, C = -87;
        int Largest_NUmber = (A >= B) ? ((A >= C) ? A : C) : ((B >= C) ? B : C);
        System.out.println("Your largest Number : " + Largest_NUmber);
    }
}

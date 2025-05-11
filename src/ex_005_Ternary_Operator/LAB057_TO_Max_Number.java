package ex_005_Ternary_Operator;

public class LAB057_TO_Max_Number {
    public static void main(String[] args) {

        // find the maximum number between two numbers
        // x and y ; Max x , -> ternary operator

        int x = 20;
        int y = 30;
        int max = x > y ? x : y;
        System.out.println(max);
    }
}


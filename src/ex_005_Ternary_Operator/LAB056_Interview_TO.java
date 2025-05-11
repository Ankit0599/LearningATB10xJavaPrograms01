package ex_005_Ternary_Operator;

import java.sql.SQLOutput;

public class LAB056_Interview_TO {
    public static void main(String[] args) {

        // Nested ternary
        // result = condition 1 ? expression 1 : (condition 2 ? expression 2 : expression 3);

        int number = 15;
        String result = (number > 10) ? (number > 20 ? "G is > 20" : "A is between 10 to 20") : "B";
        // (number > 20 ? "G is > 20" : "A is between 10 to 20") -> A is between 10 to 20

        System.out.println(result);


    }
}

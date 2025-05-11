package ex_007_Increment_Decrement_OP;

public class LAB061_In_De_OP {
    public static void main(String[] args) {
        //Take Inputs
        String age_string = args[0];
        int age = Integer.parseInt(age_string);

        String CanIGo_GOA = age >= 25 ? "Yes" : "No";
        System.out.println(CanIGo_GOA);

    }
}

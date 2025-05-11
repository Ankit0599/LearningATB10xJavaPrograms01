package ex_005_Ternary_Operator;

public class LAB060_Age_Classification {
    public static void main(String[] args) {
        int age = 25;

        // Adult < 65
        // Minor < 18
        // Senor > 65

        String result = (age < 18) ? "Minor" : ((age < 65) ? "Adult" : "Senior");
        System.out.println(" The Person is " + result);
    }
}

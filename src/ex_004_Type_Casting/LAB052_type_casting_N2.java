package ex_004_Type_Casting;

public class LAB052_type_casting_N2 {
    public static void main(String[] args) {
        long phone_no = 9890739845l;
       // short s = phone_no; // invalid - implicit casting not allowed
        short s = (short) phone_no; // explicit casting
    }
}

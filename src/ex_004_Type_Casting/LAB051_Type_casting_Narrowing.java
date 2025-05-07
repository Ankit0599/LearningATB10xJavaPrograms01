package ex_004_Type_Casting;

public class LAB051_Type_casting_Narrowing {
    public static void main(String [] args) {
        int val = 200;
        // byte b = val; // Invalid -> implicit casting narrowing not allowed
        byte b = (byte) val; // valid -> explicit casting allowed
        // data loss
    }
}

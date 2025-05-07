package ex_004_Type_Casting;

public class LAB053_type_casting_N3 {
    public static void main(String[] args){
        // GST = 18.45
        int course = 100;
        float GST = 18.45f;
       // int total_int = course + GST; //narrowing - implicit
        int total_int = course + (int)GST; // narrowing - explicit
        float total = course + GST; // Narrow - implicit
        float total2 = (float) course + GST; // Narrow - Explicit

        System.out.println(total);
        System.out.println(total2);
    }
}

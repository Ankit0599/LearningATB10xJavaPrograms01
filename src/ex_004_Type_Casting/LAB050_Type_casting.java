package ex_004_Type_Casting;

public class LAB050_Type_casting {
    public static void main(String[] args) {
        byte b = 10;
       // int a = b; //Valid -> implicit widening - automatically done by compiler

        int a = (int) b; //Valid -> explicit widening - not automatically done

        System.out.println(a);
    }
}

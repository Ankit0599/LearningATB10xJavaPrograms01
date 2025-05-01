package ex_003_java_Basics;

public class LAB020_Constants1 {
    int i_age; // instance variable
    static int s_age; //static variable
    //instance or static variables get the default values by JVM.

    public static void main(String[] args) {
        final int a = 10;
        final String STR = "TTH";
        final double D1 = 99.998;

        int AGE; // local variables cannot get the default value by JVM
        AGE = 29;
        //AGE = 19; -reassigning same variable will not work
        System.out.println(AGE);
    }
}

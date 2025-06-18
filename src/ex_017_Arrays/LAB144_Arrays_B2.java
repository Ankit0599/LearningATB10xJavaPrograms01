package ex_017_Arrays;

public class LAB144_Arrays_B2 {
    public static void main(String[] args) {
        int [] marks = {67, 56, 78, 54, 89, 64}; // 1st type - predefined way
        //2nd
        int [] marks2 = new int [5];//fixed size
        System.out.println(marks2.length);
        String s1 = "ankit";
        System.out.println(s1.length());

        marks2[0] = 78;
        marks2[1] = 98;
        marks2[3] = 86;
        marks2[4] = 90;

        System.out.println(marks2[3]);
//        System.out.println(marks2[10]); //java.lang.ArrayIndexOutOfBoundsException
    }
}

package ex_010_For_LOOP;

public class LAB105_Even_ODD_NUm {
    public static void main(String[] args) {
//        to find even numbers from 1 to 100
        for (int i = 0; i <=100 ; i++) {
            if (i % 2 == 0) {
                System.out.println(" EVEN -> " + i);
            }
            else {
                System.out.println("ODD -> " + i);
            }
        }
    }
}

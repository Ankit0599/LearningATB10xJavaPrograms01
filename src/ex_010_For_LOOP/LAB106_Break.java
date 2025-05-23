package ex_010_For_LOOP;

public class LAB106_Break {
    public static void main(String[] args) {
        for ( int i = 0; i <= 50; i++ ) {
            if ( i ==5 ) {
                break;
            }
            System.out.println(i);
        }
    }
}

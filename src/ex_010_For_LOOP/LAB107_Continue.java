package ex_010_For_LOOP;

public class LAB107_Continue {
    public static void main(String[] args) {
        for ( int i = 0; i <= 50; i++ ) {
            if ( i ==5 ) {
                continue; // skip the below code, move to top
            }
            System.out.println(i);
        }
    }
}

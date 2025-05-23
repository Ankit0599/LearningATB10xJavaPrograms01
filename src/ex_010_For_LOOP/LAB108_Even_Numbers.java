package ex_010_For_LOOP;

public class LAB108_Even_Numbers {
    public static void main(String[] args) {

        for ( int i = 0; i <=50 ; i++) {
            if (i % 2 == 0 ){
                System.out.println("EVEN --> " + i);
                continue;
            }
            System.out.println(i);
        }
    }
}

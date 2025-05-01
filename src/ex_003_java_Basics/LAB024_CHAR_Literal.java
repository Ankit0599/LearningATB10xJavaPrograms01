package ex_003_java_Basics;

public class LAB024_CHAR_Literal {
    public static void main(String[] args) {
        // char

        char c1 = 'A';
        char c2 = 'B';
        char c3 = 'C';

        //Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char car_r = '\r'; //delete the previous word

        System.out.println("Ankit" + new_line + "Jeure");
        System.out.println("Ankit" + tab_line + "Jeure");
        System.out.println("Ankit" + back_space + "Jeure");
        System.out.println("Ankit" + car_r + "Jeure");


        char c11 = '\u1f60';
    }
}

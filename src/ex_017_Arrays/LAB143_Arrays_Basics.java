package ex_017_Arrays;

public class LAB143_Arrays_Basics {
    public static void main(String[] args) {
        int a = 10;
        int [] marks = {30, 78, 90, 67, 100};

        //arrays creation with predefined elements
        System.out.println(marks.length);
        System.out.println(marks[0]);
//        System.out.println(marks[-1]); - ArrayIndexOutOfBoundsException
//        System.out.println(marks[100]); - ArrayIndexOutOfBoundsException
    }
}

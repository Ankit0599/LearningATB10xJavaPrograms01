package ex_017_Arrays;

import java.util.Arrays;

public class LAB146_For_Loop_Array {
    public static void main(String[] args) {
        int [] marks = {79, 93, 37, 98, 100};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        System.out.println("----------");

        for (int i = 0; i < marks.length; i++) { //0,1,2,3,4
            System.out.println(marks[i]);
        }

        Arrays.sort(marks);

    }
}

package ex_002_java_Basics;

public class LAB018_PrintF_Task {
    public static void main(String[] args){
        int number = 9;

        for (int i = 1; i <=10 ; i++) {
            int result = number * i;
            System.out.printf("%d x %d = %d\n", number, i, result);
        }
    }
}

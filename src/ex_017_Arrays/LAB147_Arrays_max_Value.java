package ex_017_Arrays;

public class LAB147_Arrays_max_Value {
    public static void main(String[] args) {
        int [] marks = {45, 47, 37, 98, 24, 56, 49, 87, 95, 74, 67};
        // MAX, MIN

        //Logic Building
        // Step 1 -> Inputs -> array -> int
        // step 2 -> output -> int - 98

        int max_output = give_Max(marks);
        System.out.println(max_output);
        int min_output = give_min(marks);
        System.out.println(min_output);
    }

    static int give_Max(int [] array) {
        //logic
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array [i] > max){
                max = array [i];
            }
        }

        return max;
    }

    static int give_min(int [] array) {
        //logic
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array [i] < min){
                min = array [i];
            }
        }

        return min;
    }
}

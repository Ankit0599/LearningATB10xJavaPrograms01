package ex_017_Arrays;

import java.util.Arrays;

public class LAB150_InterviewQ_Array {
    public static void main(String[] args) {
        // find second-largest number in an array
        int [] numbers = {34, 87 ,24, 56, 98};
        Arrays.sort(numbers); //24, 34, 56, 87, 98
        System.out.println(numbers[numbers.length-2]);

    }
}

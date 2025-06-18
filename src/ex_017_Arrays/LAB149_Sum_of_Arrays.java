package ex_017_Arrays;

public class LAB149_Sum_of_Arrays {
    public static void main(String[] args) {
        int [] numbers = {35, 87 ,98};
        int sum = 0; // 35+87+98 = 220
//        for (int i = 0; i < numbers.length; i++) {
//            sum = sum + numbers[i];
//        }
//        System.out.println(sum);

        for (int n : numbers) {
            sum = sum + n;
        }

        System.out.println(sum);
    }
}

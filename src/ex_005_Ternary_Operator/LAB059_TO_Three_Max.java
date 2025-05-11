package ex_005_Ternary_Operator;

public class LAB059_TO_Three_Max {
    public static void main(String[] args) {
        // finding te largest number -> n1, n2, n3 = Max (n1, n2, n3)

        //Step 1 - finding inputs/outputs
        //n1, n2, n3 -> int - data type
        //o/p -> int
        //21, 34, 10 -> 34

        //Step 2 - rough logic
        //n1 >= n2 -> Y1 : N1
        //Y1 -> n1 >= n3 -> Y(n1) : N(n3)
        //N1 -> n2 >= n3 -> Y(n2) : N(n3)

        int n1 = 9, n2 = 78, n3 = -65;
        int largest = (n1 >= n2) ? ((n1 >= n3) ? n1 : n3) : ((n2 >= n3) ? n2 : n3);
        System.out.println("Largest Number : " + largest);
    }
}

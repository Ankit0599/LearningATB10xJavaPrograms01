package ex_003_java_Basics;

public class LAB042_Interview_Q_OR_Gate {
    public static void main(String[]  args) {
        int balaji_Salary = 12;
        boolean b = !(balaji_Salary > 10 || balaji_Salary < 5);
        System.out.println(b);


        // balaji_Salary > 10 --> 12 > 10 --> true
        // balaji_Salary < 5 ---> 12 < 5 ---> false
        // (true || false) --> ! true
        // ! true ---> false

    }
}

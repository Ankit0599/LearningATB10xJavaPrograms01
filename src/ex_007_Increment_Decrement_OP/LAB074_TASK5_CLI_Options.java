package ex_007_Increment_Decrement_OP;

public class LAB074_TASK5_CLI_Options {
    public static void main(String[] args) {
        String Name_string = args[0];
        String Age_string = args[1];
        String Salary_string = args[2];

        int Age = Integer.parseInt(Age_string);
        int Salary = Integer.parseInt(Salary_string);

        System.out.println("Candidate Name is: " + Name_string);
        System.out.println("Candidate Age is: " + Age);
        System.out.println("Candidate Salary is: " + Salary);


    }

}

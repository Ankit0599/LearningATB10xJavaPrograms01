package ex_014_Functions;

import java.util.Scanner;

public class LAB127_USer_defined_inOne {
    public static void main(String[] args) {

        // User Defined Functions

       //1. Without Parameters and Without Return Type.
        //2. Without Parameters but With Return Type
        //3. With Parameters and Without Return Type
        //4. With Parameters and With Return Type

        //1. Without Parameters and Without Return Type.
//        greet();

        //2. Without Parameters but With Return Type
//        String s = greet_with_hello();
//        System.out.println(s);
//
//        int age_to_vote_person = age_to_vote();
//        System.out.println(" Age to Vote is -> " + age_to_vote_person );

        //3. With Parameters and Without Return Type (90%)
//        greet_with_name("Ankit");
//        greet_with_name("Meet");
//        greet_with_name("Anything");

//        greet_with_full_name("Ankit " , "Jeure");
//        greet_with_full_name("Jhony " , "Dep");

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your Name : ");
//        String name = sc.next();
//        System.out.println("Enter your Age : ");
//        int age = sc.nextInt();
//        System.out.println("Enter your Salary : ");
//        double salary = sc.nextDouble();
//
//        greet_with_details (name, age, salary);

        //4. With Parameters and With Return Type
        int sum = sum_of_two_numbers(8, 28);
        int sum2 = sum_of_two_numbers(98, 78);
        int sum3 = sum_of_two_numbers(3258, 43758);
        int sum4 = sum_of_three_numbers(243, 234623, 234);
        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);
    }
    //1. Without Parameters and Without Return Type.
    static void greet () {
        System.out.println("Hi I am - 1. Without Parameters and Without Return Type. ");
    }

    //2. Without Parameters but With Return Type
    static String greet_with_hello() {
        return "Hi , How are you";
    }

    //2. Without Parameters but With Return Type
    static int age_to_vote() {
        System.out.println("Age to Vote is Calculating.........");
        return 18;
    }

    //3. With Parameters and Without Return Type (void)
    static void greet_with_name (String name) {
        System.out.println("Hi , My Name is " + name);
    }

    static void greet_with_full_name (String firstname, String lastname) {
        System.out.println("Hi , My Name is " + firstname + lastname);
    }

    static void greet_with_details (String name, int age, double salary) {
        System.out.println("Your name is -> " + name + "\nYour age is " + age + "\nYour Salary is " + salary);
    }


    //4. With Parameters and With Return Type
    static int sum_of_two_numbers(int a, int b){
        return a+b;
    }

    static int sum_of_three_numbers(int a, int b, int c){
        return a+b+c;
    }

}
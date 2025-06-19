package ex_019_OOPS_Constructor;

import java.util.Scanner;

public class LAB164_Const {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the model Name for the tesla car : ");
        String model_name = sc.next();
        Car2 tesla = new Car2( "tesla", model_name, 2025);
        System.out.println(tesla.name);
        System.out.println(tesla.model);
        System.out.println(tesla.year);


        System.out.println("------------->");

        System.out.println("Enter the model Name for the nano car : ");
        String model_name2 = sc.next();
        Car2 nano = new Car2("nano", model_name2, 2014);
        System.out.println(nano.name);
        System.out.println(nano.model);
        System.out.println(nano.year);
    }
}

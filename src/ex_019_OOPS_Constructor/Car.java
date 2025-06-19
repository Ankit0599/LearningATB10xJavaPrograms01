package ex_019_OOPS_Constructor;

public class Car {
    String name;
    String Model;
    int year;
    int price;

    //Default Constructor


    Car() {
        String name = "THAR";
        String Model = "UNKNOWN";
        int year = 2024;
        int price = 1000000;
        System.out.println("DC");
    }
}

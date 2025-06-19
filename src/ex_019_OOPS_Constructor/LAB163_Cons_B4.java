package ex_019_OOPS_Constructor;

public class LAB163_Cons_B4 {
    public static void main(String[] args) {
        Car tesla = new Car();
        tesla.name = "Tesla Model 5";
        tesla.Model = "Model 5";
        tesla.year = 2025;
        System.out.println(tesla.name);
        System.out.println(tesla.Model);
        System.out.println(tesla.year);

        System.out.println("-----------");

        Car Nano = new Car();
        Nano.name = "Tata Nano";
        System.out.println(Nano.name);
    }
}

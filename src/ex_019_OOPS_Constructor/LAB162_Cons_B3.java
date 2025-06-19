package ex_019_OOPS_Constructor;

public class LAB162_Cons_B3 {
    public static void main(String[] args) {
        B b1 = new B();
        System.out.println(b1);

    }
}

class B {
    B(){
        System.out.println("I want to read csv file");
        System.out.println("Open the Page before loading");
        System.out.println("You can do anything you want to do when object is created");
    }
}


package ex_019_OOPS_Constructor;

public class LAB160_Constructor_B1 {
    public static void main(String[] args) {

        baby b1 = new baby();
        new baby();
        new baby();
        baby b2;
    }
}

class baby{

    String name;

    //Default constructor is also called
    baby (){
        System.out.println("I am called object Created");
    }

    //Instance Initialization block

    {
        System.out.println("I am also called when class is loaded");
    }
}
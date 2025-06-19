package ex_018_OOPS_Concept;

public class LAB158_CATS {
    public static void main(String[] args) {
        Cats c1 = new Cats();
        Cats c2 = null; //without object
        new Cats(); // object without reference

        c1.running();
        c2.running(); //java.lang.NullPointerException
    }
}

class Cats{

    String name;
    String colour;

    void running (){
        System.out.println("Running");
    }
}
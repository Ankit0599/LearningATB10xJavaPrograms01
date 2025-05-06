package ex_003_java_Basics;

public class LAB041_OR_AND_GATE {
    public static void main(String[] args) {
        // || -> OR

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        // AND -> && Only true and true returns
        // T || T --> T
        // T || F --> F
        // F || T --> F
        // F || F --> F

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);


    }
}

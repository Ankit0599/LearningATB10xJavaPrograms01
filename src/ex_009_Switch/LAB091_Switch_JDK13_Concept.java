package ex_009_Switch;

public class LAB091_Switch_JDK13_Concept {
    public static void main(String[] args) {
        // JDK -> 13

        int itemcode = 001;

        switch (itemcode) {
            case 001, 003, 005, 007 :
            System.out.println("All of thm are Electronic Gadget");
            break;
            case 002, 004, 006 :
                System.out.println("This is Mechanical");
                break;
            default:
                System.out.println("None");
        }
    }
}

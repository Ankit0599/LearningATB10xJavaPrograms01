package ex_015_Strings;

public class LAB137_Stings_InterviewQ2 {
    public static void main(String[] args) {

        String s1 = "Hello"; //SCP - 1
        String s4 = "Hello"; //SCP - 1

        String s2 = new String("Hello"); //OA -1
        String s3 = new String("Hello"); //OA- 2
        String s5 = new String("hello"); //OA - 3

        // == -> Comparison -> Strings -> Checks the location ref.

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s2 == s3);
        System.out.println(s3 == s4);
        System.out.println(s3 == s5);

//        equals (content) -> value
//        checks the value that are equals
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s5));
        System.out.println(s3.equalsIgnoreCase(s5));
    }
}

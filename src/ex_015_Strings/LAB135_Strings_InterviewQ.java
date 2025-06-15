package ex_015_Strings;

public class LAB135_Strings_InterviewQ {
    public static void main(String[] args) {
        String name = "X-Men";
        name.toUpperCase(); //it will not print the uppercase value because it is not assigned to any variable
        name = name.toUpperCase();
        System.out.println(name);
    }
}

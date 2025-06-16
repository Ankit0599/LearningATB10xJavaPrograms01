package ex_016_Strings_Functions;

public class LAB139_STR_Functions_B1 {
    public static void main(String[] args) {
        String str1 = "Hello"; // SCP - Creates or reuses "hello" in String Constant Pool
        String str2 = "Hello";

        String str3 = new String("Hello"); //Creates a new object in heap area - OA
        String str4 = new String("Hello");

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));//true - because content is same
    }
}


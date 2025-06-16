package ex_016_Strings_Functions;

public class LAB141_Strings_Compare {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1 + s2 ; //Creates a new Hello World
        System.out.println(s3);

//        Creates a new string hello world
        System.out.println(s1.concat(s2));

//        append does only modification to the existing string
        StringBuilder stringBuilder = new StringBuilder("Sonal");
        stringBuilder.append(" Patel");
        System.out.println(stringBuilder);


//        StringBuilder and StringBuffer


    }
}

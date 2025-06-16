package ex_016_Strings_Functions;

public class LAB142_StringBuilder_StringBuffer {
    public static void main(String[] args) {

//        String -> 90%
//        StringBuilder -> 5-7% (Thread safety - we avoid it)
//        ThreadLocal -> Multithreading

        StringBuilder stringBuilder = new StringBuilder("ANkit");
        stringBuilder.append("Jeure");
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);

        stringBuilder.append("World !"); // Modifies the previously present string
        System.out.println(stringBuilder); // output ANkitJeureWorld !




    }
}

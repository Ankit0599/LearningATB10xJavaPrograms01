package ex_020_Tasks;

public class LAB170_Strings_Functions {
    public static void main(String[] args) {
        String name = "Subhashree";
        String name1 = "apple";
        String name2 = "Banana";
        String name3 = "a, b, c";
        int number = 123;
        String fruits = "Apple,Banana,Grapes";
        String Sentence = "Java is Powerful";
        String S1 = "Grapes";
        String S2 = "Banana";

        //1. length() - Returns the number of characters in the string
        System.out.println(name.length());

        //2. CharAt() - Returns the character at a specific index
        System.out.println(name.charAt(5));
        System.out.println(name.charAt(9));

        //3. substring(int beginIndex) - Returns substring from the given index to end
        System.out.println(name.substring(3));

        //4. substring(int begin, int end) - Returns substring between two indexes
        System.out.println(name.substring(3,8));

        //5. equals(String str)  - Checks if two strings are exactly equal
        System.out.println(name.equals("Subhashree"));

        //6. equalsIgnoreCase(String str) - Compares two strings, ignoring case
        System.out.println(name.equalsIgnoreCase("Subhashree"));

        //7. compareTo(String str) - Lexicographically compares two strings
        int results = S1.compareTo(S2);
        System.out.println("Result of CompareTO : " + results);

        //8. toLowerCase() - Converts string to all lowercase letters
        System.out.println(name.toLowerCase());

        //9. toUpperCase()	Converts string to all uppercase letters
        System.out.println(name.toUpperCase());

        //10. trim() - Removes leading and trailing spaces
        System.out.println(name.trim());

        //11. contains(CharSequence s) - Checks if string contains a sequence
        boolean hasWord = Sentence.contains("Power");
        System.out.println("Contains Power ?" + hasWord);

        //12. startsWith(String prefix) - Checks if string starts with a prefix
        System.out.println(name.startsWith("Su"));

        //13. endsWith(String suffix) - Checks if string ends with a suffix
        System.out.println(name.endsWith("ee"));

        //14. indexOf(char) - Returns index of first occurrence of char
        System.out.println(name.indexOf("h"));

        //15. lastIndexOf(char) - Returns index of last occurrence of char
        System.out.println(name.lastIndexOf("e"));

        //16. isEmpty() - Checks if string is empty ("")
        System.out.println(name.isEmpty());

        //17. replace(char old, char new) - Replaces characters
        System.out.println(name.replace("e", "Y"));

        //18. replaceAll(String regex, String replacement) - Replaces matching pattern
        System.out.println(name1.replaceAll("B", "D"));

        //19. split(String regex) - Splits string into an array by regex
        String []parts = fruits.split(",");

        for (String fruit : parts) {
            System.out.println(fruit);
        }

        //20. toCharArray() - Converts string to character array
        System.out.println(name3.toCharArray());

        //21. valueOf(int) - Converts other types to string
        String text = String.valueOf(123);
       System.out.println(" Number as String : " + text);

        //22. concat(String str) - Joins two strings
        System.out.println(name.concat(" Star"));
    }
}

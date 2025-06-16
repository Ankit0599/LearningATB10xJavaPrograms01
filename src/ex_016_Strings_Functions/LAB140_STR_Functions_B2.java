package ex_016_Strings_Functions;

public class LAB140_STR_Functions_B2 {
    public static void main(String[] args) {
        String name = "Sonal";
        System.out.println(name.length());
        //1. CharAt()
//        System.out.println(name.charAt(3));
//        System.out.println(name.charAt(10)); //StringIndexOutOfBoundsException

        // 2. Concat()
        System.out.println(name.concat(" Patel"));

        //3. Contains ()
        System.out.println(name.contains("Sonal")); //checking sequence present in the string value
        System.out.println(name.contains("as"));

        //4. Equals ()
        System.out.println(name.equals("Sonal"));

        //5. EqualsIgnoreCase ()
        System.out.println(name.equalsIgnoreCase("sonal"));

        //6. Index of ()
        System.out.println(name.indexOf('S'));
        System.out.println(name.indexOf('o'));
        System.out.println(name.indexOf('n'));

//        Returns the index within this string of the
//        First occurrence of the specified string

        //7. replace()
        System.out.println(name.replace('n','N'));


        //8. Split ()
//        String name4 = "Sonal Harish";
//        String [] split = name4.split(" ");
//        System.out.println(split [0]);
//        System.out.println(split [1]);

        String name5 = "ATB10x@studyProgram@automationtester";
        String [] split = name5.split("@");
        System.out.println(split [0]);
        System.out.println(split [1]);
        System.out.println(split [2]);

        //9. Substring()
        System.out.println(name.substring(1, 3));
        String ss = "Hamburger";
        System.out.println(ss.substring(4, 8));

        //10. tolowercase()
        System.out.println(name.toLowerCase());

        //11. toUppercase ()
        System.out.println(name.toUpperCase());

        //12. startswith()
        System.out.println(name.startsWith("S"));

        //13.endswith()
        System.out.println(name.endsWith("N"));

        //14.trim()
        String name3 = "    Sonal Harish     ";
        System.out.println(name3.trim());

        //15. CompareTo()
        System.out.println(name.compareTo("Sonal"));  //Comparing between ASCII values of 2 words lexicographically

        //16.cpmparetoIgnoreCase()
        System.out.println(name.compareToIgnoreCase("Sonal")); //Comparing between ASCII values of 2 words lexicographically

        //17.StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Sonal");
        stringBuilder.append(" Patel");
        System.out.println(stringBuilder);


    }
}

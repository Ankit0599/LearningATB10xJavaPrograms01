package ex_003_java_Basics;

public class LAB037_Interview_concat_plus_2 {
    public static void main(String [] args){
        String First_Name = "Ankit";
        String Last_Name = "Jeure";
        int a = 10;
        int b = 10;

        // there are 2 types of literals are there (String & Integer)

        System.out.println(First_Name + Last_Name + a + b);
        //all of them will behave similarly & all of them will act as string.
        //AnkitJeure1010 -> first operator performed as concatenation

        System.out.println(a + b + First_Name + Last_Name);
        //20AnkitJeure -> first math will happen

        System.out.println( First_Name + Last_Name + (a + b));
        //BODMAS - bracket of div, mul, add, sub
    }
}

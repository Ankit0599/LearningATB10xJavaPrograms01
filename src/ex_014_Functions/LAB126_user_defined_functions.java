package ex_014_Functions;

public class LAB126_user_defined_functions {
    public static void main(String[] args) { //JVM program (running RAM) - calls main function
        //Step 2 - calling a function
        main();
        Groot();
        System.out.println("");
        System.out.print("");
        System.out.printf("");
    }

    //Step 1 - Declaration/Define
    static void main(){
        System.out.println("this is another a look like of main");
    }
    //without parameter and without return type
    // no argument and no return type
    static void Groot() {
        System.out.println(" Hi, I am Groot ");
    }
}

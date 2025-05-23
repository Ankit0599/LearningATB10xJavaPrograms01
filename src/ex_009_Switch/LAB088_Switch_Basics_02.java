package ex_009_Switch;

import java.util.Scanner;

public class LAB088_Switch_Basics_02 {
    public static void main(String[] args) {

        // Web Automation
        // I will ask user which browser you want me to run the code
        // chrome -> Execute chrome
        // firefox -> execute firefox
        // edge -> execute edge browser

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser : ");
        String browser = scanner.next();

        switch (browser) {
            case "Chrome" :
                System.out.println("Starting the Chrome");
                System.out.println(".......!!");
                System.out.println("TC");
                break ;
            case "Firefox" :
                System.out.println("Starting the firefox browser");
                // Further code start the firefox
                // Web driver = new firefox () // Selenium code
                break;
            case "Edge" :
                System.out.println("Starting the Edge browser");
                break;
            case "Safari" :
                System.out.println("Start the Safari browser");
            default:
                System.out.println("Do not enter Invalid Browser Name");
        }
    }
}


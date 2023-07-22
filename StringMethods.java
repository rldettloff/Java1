import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        String Name;

        System.out.println("Please type your Name and press ENTER:");

        Scanner inputScanner = new java.util.Scanner(System.in);

        Name = inputScanner.nextLine();

        inputScanner.close();

        if (Name.matches("^[a-zA-Z]+$")) {
            System.out.println("Name length: " + Name.length());

            System.out.println("Uppercase name: " + Name.toUpperCase());

            System.out.println(Name + " is the best!");

        } else {

            System.out.println("Your name contains special characters. Please enter a valid name.");
        }
    }
}
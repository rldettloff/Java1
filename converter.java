import java.util.Scanner;

class NewKilogramsToPounds {
    public static void main(String[] args) {
    Double kilograms;
    
    System.out.println("Type weight in KG and press ENTER:");
    Scanner inputScanner = new java.util.Scanner(System.in);

    kilograms = inputScanner.nextDouble();
    
    inputScanner.close();
    Double Pounds;
    Pounds = (kilograms * 2.2);

    System.out.println(kilograms + " in Kilograms is " + Pounds + " in pounds");


    }
}
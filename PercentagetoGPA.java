import java.util.Scanner;

class PercentageinGPA {
    public static void main(String[] args) {
    Double percentage;

    System.out.println("Enter Student Grade Percentage");
    Scanner inputScanner= new java.util.Scanner(System.in);
    percentage = inputScanner.nextDouble();
    inputScanner.close();

if (percentage >= 95){
    System.out.println(4.0);
} else if (95 <= percentage && percentage >= 94) {
    System.out.println(4.0);
} else if (94 <= percentage && percentage  >= 93) {
    System.out.println(3.9);
} else if (93 <= percentage && percentage >= 92){
    System.out.println(3.8);
} else if (92 <= percentage && percentage  >= 91){
    System.out.println(3.7);
} else if (91 <= percentage && percentage >= 90){
    System.out.println(3.6);
} else if (90 <= percentage && percentage >= 89){
    System.out.println(3.5);
} else if (89 <= percentage && percentage  >= 88){
    System.out.println(3.4);
} else if (88 <= percentage && percentage >= 87){
    System.out.println(3.3);
} else if (87 <= percentage && percentage >= 86) {
    System.out.println(3.2);
} else if (86 <= percentage && percentage  >= 85) {
    System.out.println(3.1);
} else if (85 <= percentage && percentage >= 84){
    System.out.println(3.0);
} else if (84 <= percentage && percentage >= 83) {
    System.out.println(2.9);
} else if (83 <= percentage && percentage >= 82) {
    System.out.println(2.8);
} else if (82 <= percentage && percentage >= 81) {
    System.out.println(2.7);
} else if (81 <= percentage && percentage >= 80){
    System.out.println(2.6);
} else if (80 <= percentage && percentage >= 79){
    System.out.println(2.5);
} else if (79 <= percentage && percentage >= 78) {
    System.out.println(2.4);
} else if (78 <= percentage && percentage >= 77) {
    System.out.println(2.3);
} else if (77 <= percentage && percentage >= 76) {
    System.out.println(2.2);
} else if (76 <= percentage && percentage >= 75) {
    System.out.println(2.1);
} else if (75 <= percentage && percentage >= 74) {
    System.out.println(2.0);
} else if (74 <= percentage && percentage >= 73){
    System.out.println(1.9);
} else if (73 <= percentage && percentage >= 72) {
    System.out.println(1.8);
} else if (72 <= percentage && percentage >= 71) {
    System.out.println(1.7);
} else if (71 <= percentage && percentage >= 70) {
    System.out.println(1.6);
} else if (70 <= percentage && percentage >= 69) {
    System.out.println(1.5);
} else if (69 <= percentage && percentage >= 68){
    System.out.println(1.4);
} else if (68 <= percentage && percentage >= 67) {
    System.out.println(1.3);
} else if (67 <= percentage && percentage >= 66) {
    System.out.println(1.2);
} else if (66 <= percentage && percentage >= 65) {
    System.out.println(1.1);
} else {
    System.out.println(0.0);
}

    }
}
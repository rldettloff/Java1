import java.util.Scanner;

class GPAConverter {
    public static void main(String[] args) {
    String line;
    System.out.println("Enter Student GPA");
    Scanner inputScanner = new java.util.Scanner(System.in);
    line = inputScanner.nextLine();
    inputScanner.close();
    switch(line) {
        case "4.0":
        System.out.println("100% to 95%");
        break;

        case "3.9":
        System.out.println("95% to 94%");
        break;       
        
        case "3.8":
        System.out.println("94 to 93%");
        break;        
        
        case "3.7":
        System.out.println("93 to 92%");
        break;        
        
        case "3.6":
        System.out.println("92 to 91%");
        break;        
        
        case "3.5":
        System.out.println("91 to 90%");
        break;        
        
        case "3.4":
        System.out.println("90 to 89%");
        break;        
        
        case "3.3":
        System.out.println("89 to 88%");
        break;        
        
        case "3.2":
        System.out.println("88 to 87%");
        break;        
        
        case "3.1":
        System.out.println("87 to 86%");
        break;

        case "3.0":
        System.out.println("86 to 85%");
        break;

        case "2.9":
        System.out.println("85 to 84%");
        break;

        case "2.8":
        System.out.println("84 to 83%");
        break;

        case "2.7":
        System.out.println("83 to 82%");
        break;

        case "2.6":
        System.out.println("82 to 81%");
        break;

        case "2.5":
        System.out.println("81 to 80%");
        break;

        case "2.4":
        System.out.println("80 to 79%");
        break;

        case "2.3":
        System.out.println("79 to 78%");
        break;

        case "2.2":
        System.out.println("78 to 77%");
        break;

        case "2.1":
        System.out.println("77 to 76%");
        break;

        case "2.0":
        System.out.println("76 to 75%");
        break;

        case "1.9":
        System.out.println("75 to 74%");
        break;

        case "1.8":
        System.out.println("74 to 73%");
        break;

        case "1.7":
        System.out.println("73 to 72%");
        break;

        case "1.6":
        System.out.println("72 to 71%");
        break;

        case "1.5":
        System.out.println("71 to 70%");
        break;

        case "1.4":
        System.out.println("70 to 69%");
        break;

        case "1.3":
        System.out.println("69 to 68%");
        break;

        case "1.2":
        System.out.println("68 to 67%");
        break;

        case "1.1":
        System.out.println("67 to 66%");
        break;

        case "1.0":
        System.out.println("66 to 65%");
        break;

        case "0.0":
        System.out.println("65 to 0%");
        break;

        default:
        System.out.println("N/A");
        break;
    }
    }
}


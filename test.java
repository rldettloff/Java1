import java.util.Scanner;
public class conKmToMile {
    public static void main(String[] args){
        Double mile;
        double km;
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Enter the didtance in killo miters: ");
        km = scan.nextDouble();
    
        mile = km * 1.609334;
    
        System.out.println("You have entered: " +km +" killo meters");
        System.out.println(" and that equals to: "+mile +" miles");
}
}

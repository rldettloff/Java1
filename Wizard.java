import java.util.Random;
import java.util.Scanner;

class WizardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Player creation
        System.out.print("Enter your wizard's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your wizard's race: ");
        String race = scanner.nextLine();
        System.out.print("Enter your wizard's gender: ");
        String gender = scanner.nextLine();
        System.out.print("Enter your wizard's age: ");
        int age = scanner.nextInt();

        Wizard wizard = new Wizard(name, race, gender, age);

        // Game loop
        while (true) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Cast a spell");
            System.out.println("2. Brew a potion");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            if (choice == 1) {
                wizard.castSpell();
            } else if (choice == 2) {
                wizard.brewPotion();
            } else if (choice == 3) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        }
    }
}

class Wizard {
    private String name;
    private String race;
    private String gender;
    private int age;

    public Wizard(String name, String race, String gender, int age) {
        this.name = name;
        this.race = race;
        this.gender = gender;
        this.age = age;
    }
//list of spells and print statement to cast spells
    public void castSpell() {
        String[] spells = {"confringo", "explelliarmis", "stupify"};
        String spell = spells[new Random().nextInt(spells.length)];
        System.out.println(name + " casts " + spell + "!");
    }
//list of potions and print statements to brew potions
    public void brewPotion() {
        String[] potions = {"polyjuice potion", "Amortientia", "Elixir of life"};
        String potion = potions[new Random().nextInt(potions.length)];
        System.out.println(name + " brews a " + potion + " potion.");
    }
}

import java.util.ArrayList;

class DoraemonsPocket {
    private ArrayList<String> pockets;

    DoraemonsPocket() {
        pockets = new ArrayList<>(3);
    }

    void addItem(String itemName) {
        if (pockets.size() >= 3) {
            System.out.println("Doraemon's pocket is full. Unable to add: " + itemName);
        } else {
            pockets.add(itemName);
            System.out.println("Item inserted - Pocket " + (pockets.size() - 1) + ": " + itemName);
        }
    }

    void removeItem(String itemName) {
        if (pockets.remove(itemName)) {
            System.out.println("Item removed: " + itemName);
        } else {
            System.out.println(itemName + " is invisible");
        }
    }

    void printItems() {
        for (int i = 0; i < pockets.size(); i++) {
            System.out.println("Pocket " + i + ": " + pockets.get(i));
        }
    }

    public static void main(String[] args) {
        DoraemonsPocket pocket = new DoraemonsPocket();

        pocket.addItem("Cheesecake");
        pocket.addItem("Xbox 360");
        pocket.addItem("Steve from Minecraft");

        pocket.printItems();

        pocket.addItem("Time machine");

        pocket.printItems();

        pocket.removeItem("Beanie");
        pocket.removeItem("Naruto figurine");

        pocket.printItems();
    }
}
public class CheckInventory {
    public static void main(String[] args) {
        String[] inventory = new String[5];
        inventory[0] = "HP Potion";
        inventory[1] = "Magic Sword";
        inventory[2] = "Wooden Shield";
        inventory[3] = "Magic Key";
        printInventory(inventory);
        if(checkInventory(inventory, "Magic Key")) {
            System.out.println("Using your magic key, you open the locked door.");
        }
    }

    public static void printInventory(String[] inventory) {
        for (String s : inventory) {
            System.out.println(s);
        }
    }

    public static boolean checkInventory(String[] inventory, String toCheck){
        for (String item : inventory) {
            if (item != null && item.equals(toCheck)) {
                return true;
            }
        }
        return false;
    }
}

public class DragonSlayer {
    public static void DragonSlaying(){
        int PlayersStrength=40;
        int DragonsHP=35;
        boolean hasSword=true;
        if (PlayersStrength>=DragonsHP){
            System.out.println("You defeated the dragon! Congrats!");
        }
        else if (hasSword){
            System.out.println("You're not strong enough to defeat the dragon. However, you remember your magic sword and use it to slay the beast.");
        }
        else {
            System.out.println("The dragon defeated you...");
        }}
    public static void main(String[] args) {
        int PlayersStrength=40;
        int DragonsHP=35;
        boolean hasSword=true;
        if (PlayersStrength>=DragonsHP){
            System.out.println("You defeated the dragon! Congrats!");
        }
            else if (hasSword){
            System.out.println("You're not strong enough to defeat the dragon. However, you remember your magic sword and use it to slay the beast.");
        }
            else {
            System.out.println("The dragon defeated you...");
        }
    }
}

import java.util.Random;

public class Arena {
    public static Random generator = new Random();
    public static void main(String[] args) {
       try {
           Character player1 = new Character(10, 2, 100);
           Character player2 = new Rogue();
           player1.name = "Billy Bob";
           player1.strength = 2;
           player1.health = 50;
           player1.defense = 1;
           player2.strength = 1;
           player2.defense = 2;
           while (player1.isAlive() && player2.isAlive()) {
               int damage;
               System.out.println(player1.name + ": " + player1.health + " health remaining.");
               System.out.println(player2.name + ": " + player2.health + " health remaining.");
               damage = player1.attack(player2);
               System.out.println(player1.name + " hits " + player2.name + " for " + damage + " health.");
               damage = player2.attack(player1);
               System.out.println(player2.name + " hits " + player1.name + " for " + damage + " health.");
               System.out.println("=======================================================");
               Thread.sleep(800);
                }
           if(player1.isAlive()){
               System.out.println(player1.name + " wins!");
           }
           else if(player2.isAlive()){
               System.out.println(player2.name + " wins!");
           }
           else{
               System.out.println("It's a tie!");
           }
       }
       catch (InterruptedException e){
       }
        }
    }
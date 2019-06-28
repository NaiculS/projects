import java.util.Scanner;
import java.util.Random;

public class Adventure {
    public static void main(String[] args) {
           try{
            //Generate random value
            Random randomGenerator = new Random();
            //Initialize player name and level
            int playerLevel=1;
            String playerName;
            double playerHealth=10.0;
            String playerChoice;
            int rockDamage;
            boolean hasSword=false;
            boolean goodChoice=false;
            int dragonGold;
            int dragonGoldInitial;
            //Player name select
            Scanner userInput = new Scanner(System.in);
            System.out.println("What is your character's name?");
            playerName = userInput.nextLine();
            //Entering cave and welcome
            System.out.println("Welcome " + playerName + "!");
            System.out.println("Before you is a large cave mouth. Darkness is before you. Dare you enter the Cave of Wonders?");
            //Choice to enter cave or not
            System.out.println("1. Enter the Cave of Wonders");
            System.out.println("2. Run away to the safety of your warm bed");
            while (!goodChoice) {
                playerChoice = userInput.nextLine();
                switch (playerChoice) {
                    case "1":
                        //Player enters the cave
                        //noinspection UnusedAssignment
                        goodChoice = true;
                        System.out.println("You made it to the entrance of the cave.");
                        playerLevel++;
                        System.out.println("Your bravery has rewarded you! Congratulations, you are now level " + playerLevel + "!");
                        //Rock slide
                        System.out.println("You travel forward into the dark cave. You feel something press against your leg...");
                        Thread.sleep(1000);
                        System.out.println("It's a trap! Suddenly, you're being bombarded by rocks from above.");
                        rockDamage = randomGenerator.nextInt(5);
                        playerHealth -= rockDamage;
                        System.out.println("The rock slide hits you for " + rockDamage + " health!");
                        System.out.println("You have " + playerHealth + " health remaining.");
                        Thread.sleep(1000);
                        //Treasure
                        System.out.println("You pick yourself up from the cave floor and brush a cloud of dust from your clothes.");
                        System.out.println("The cave narrows as you press on until you manage to squeeze through an opening into a large natural cavern.");
                        System.out.println("Before you is a treasure chest.");
                        System.out.println("1. Open the chest.");
                        System.out.println("2. Ignore the chest. Obvious trap is obvious.");
                        goodChoice = false;
                        while (!goodChoice) {
                            playerChoice = userInput.nextLine();
                            switch (playerChoice) {
                                case "1":
                                    goodChoice = true;
                                    System.out.println("Uneasy after your brush with death, you slowly open the chest to reveal a magical sword!");
                                    playerLevel++;
                                    System.out.println("Your bravery has rewarded you! Congratulations, you are now level " + playerLevel + "!");
                                    //Rock slide
                                    hasSword = true;
                                    break;

                                case "2":
                                    goodChoice = true;
                                    break;

                                default:
                                    System.out.println("That is not a valid answer, please pick 1 or 2.");
                                    break;
                            }
                        }
                        System.out.println("You leave the cavern with the chest in it and continue your journey");
                        System.out.println("Up ahead the air grows warm and wet. You hear snoring.");
                        System.out.println("Peeking around a corner you see a monstrous shape! A dragon sleeps in the room ahead.");
                        System.out.println("You swallow hard and decide it is time to leave.");
                        System.out.println("As you turn, your foot finds a rock. It thuds loudly against the cave wall. The dragon wakes up!");
                        System.out.println("1. Fight the Dragon.");
                        System.out.println("2. Run for your life.");
                        goodChoice = false;
                        while(!goodChoice) {
                            playerChoice = userInput.nextLine();
                            switch (playerChoice) {
                                case "1":
                                    goodChoice = true;
                                    System.out.println("You feel courage surge through your body as you charge the dragon!");
                                    if (hasSword) {
                                        System.out.println("You raise the magic sword and plunge it into the dragon, slaying the beast.");
                                        playerLevel+=7;
                                        dragonGoldInitial = randomGenerator.nextInt(5);
                                        dragonGold=dragonGoldInitial + 10;
                                        System.out.println("Killing the dragon has rewarded you with " + dragonGold + " gold and a lot of experience. Congratulations, you are now level " + playerLevel + "!");
                                        //Rock slide
                                    } else {
                                        System.out.println("You pummel the dragon with your fists to no avail. The dragon snarls and swallows you whole. Game Over!");
                                        System.exit(0);
                                    }
                                    break;
                                case "2":
                                    goodChoice = true;
                                    System.out.println("As you run away to hide in the safety of your warm bed, the dragon yawns and returns to its slumber.");
                                    break;
                                default:
                                    System.out.println("That is not a valid answer, please pick 1 or 2.");
                                    break;
                            }
                        }
                        break;
                    case "2":
                        //Player doesn't enter the cave
                        goodChoice = true;
                        System.out.println(playerName + " runs home and goes to sleep.");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("That is not a valid answer, please pick 1 or 2.");

                }
            }
        }
    catch (InterruptedException ignored){
        }
    }
}
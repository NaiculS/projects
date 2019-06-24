//Import Scanner
import java.util.Scanner;

public class CharacterCreator {
    public static void CharacterCreation(){
            Scanner PlayerInput;
            PlayerInput=new Scanner(System.in);
            String PlayerName;
            double PlayerHealth;
            //Name Selector
            System.out.println("What is your character's name?");
            PlayerName=PlayerInput.nextLine();
            System.out.println("Welcome " + PlayerName + "!");
            //Health Selector
            System.out.println("How much health does " + PlayerName + " have?");
            PlayerHealth=PlayerInput.nextDouble();
            System.out.println("Welcome " + PlayerName + ", you have " + PlayerHealth + " HP.");
    }
    public static void main(String[] args){
            Scanner PlayerInput;
            PlayerInput=new Scanner(System.in);
            String PlayerName;
            double PlayerHealth;
            //Name Selector
            System.out.println("What is your character's name?");
            PlayerName=PlayerInput.nextLine();
            System.out.println("Welcome " + PlayerName + "!");
            //Health Selector
            System.out.println("How much health does " + PlayerName + " have?");
            PlayerHealth=PlayerInput.nextDouble();
            System.out.println("Welcome " + PlayerName + ", you have " + PlayerHealth + " HP.");

    }

}
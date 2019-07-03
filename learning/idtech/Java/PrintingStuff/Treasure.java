//Importing Random
import java.util.Random;
public class Treasure {
    public static void MakeTreasure(){
        int gold;
        boolean trap;
        Random generator=new Random();
        gold=generator.nextInt(5);
        System.out.println("You open the chest to find " + gold + " gold pieces!");
        trap = generator.nextBoolean();
        if (trap){
            System.out.println("You lost all of the gold due to a trap however...");

        }}


    public static void main(String[] args) {
        int gold;
        boolean trap;
        Random generator=new Random();
        gold=generator.nextInt(5);
        System.out.println("You open the chest to find " + gold + " gold pieces!");
        trap = generator.nextBoolean();
        if (trap){
            System.out.println("You lost all of the gold due to a trap however...");

        }

    }
}

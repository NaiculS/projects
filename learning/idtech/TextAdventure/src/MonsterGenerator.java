import java.util.Random;

@SuppressWarnings("SpellCheckingInspection")
public class MonsterGenerator {
    public static void main(String[] args) {
        String monster;
        Random generator = new Random();
        String[] monsters = { "Zombie","Skeleton","Creeper","Enderman","Silverfish", "Guardian", "Pigman", "Spider", "Notch"};
        int monsterIndex = generator.nextInt(monsters.length);
        //noinspection SpellCheckingInspection
        monsters[8]="Herobrine";
        monster = monsters[monsterIndex];
        /*System.out.println(monsters[0]);
        System.out.println(monsters[1]);
        System.out.println(monsters[2]);
        System.out.println(monsters[3]);
        System.out.println(monsters[4]);
        System.out.println(monsters[5]);
        System.out.println(monsters[6]);
        System.out.println(monsters[7]);
        System.out.println(monsters[8]);
        System.out.println("There are " + monsters.length + " possible monsters.");
        System.out.println("The last element is: " + monsters[monsters.length - 1]);*/


        System.out.println("A(n) " + monster + " appears!");
    }
}

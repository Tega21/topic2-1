package app;

import java.util.Random;

public class Game {
    public static void main(String[] args) {
        Random rand = new Random();
        int health1 = rand.ints(1, (1000 + 1)).findFirst().getAsInt();
        int health2 = rand.ints(1, (1000 + 1)).findFirst().getAsInt();

        // Create superheroes
        System.out.println("Crafting out Super Heroes....");
        Superman superman = new Superman(health1);
        Batman batman = new Batman(health2);
        System.out.println("Super Heroes are crafted!");

        //Run game of the Heroes battling eachother
        System.out.println("FIGHT!");
        while (!superman.isDead() && !batman.isDead()){
            superman.attack(batman);
            batman.attack(superman);

            if (superman.isDead()){
                System.out.println("Batman is the winner!");
            }
            if (batman.isDead()){
                System.out.println("SuperMan is the winner!");
            }
        }

    }
}

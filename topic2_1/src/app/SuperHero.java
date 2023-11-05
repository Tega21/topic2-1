package app;

import java.util.Random;

public class SuperHero {

    private String name;
    private int health;
    private boolean isDead;

    public SuperHero(String name, int health){
        // Initialize internal variables
        this.name = name;
        this.health = health;
    }
    
    public void attack(SuperHero opponent){
        // Creating a random number between 1 and 10
        Random rand = new Random();
        int damage = rand.ints(1, (10 + 1)).findFirst().getAsInt();

        // Set the health of the provided opponent
        opponent.determineHealth(damage);
        System.out.println(String.format("%s has damage of %d and health of %d", opponent.name, damage,
                opponent.health));
    }
    
    public boolean isDead(){
        return this.isDead;
    }
    
    private void determineHealth(int damage){
        // If no more health then mark as dead else subtract damage from health then continue
        if (this.health <= 0){
            this.health = 0;
            this.isDead = true;
        }else{
            this.health = this.health - damage;
        }
    }
}
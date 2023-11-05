package app;

import java.util.Random;

/**
 * Class creates a Superhero character with name, health, and state of alive or not
 */
public class SuperHero {

    private String name;
    private int health;
    private boolean isDead;
    
    /**
     * Constructs a new superhero with the specified name and health.
     *
     * @param name The superhero's name.
     * @param health The superhero's health value.
     */
    public SuperHero(String name, int health){
        // Initialize internal variables
        this.name = name;
        this.health = health;
    }
    
    /**
     * Attacks another superhero, causing a random amount of damage.
     *
     * @param opponent The superhero to be attacked.
     */
    public void attack(SuperHero opponent){
        // Creating a random number between 1 and 10
        Random rand = new Random();
        int damage = rand.ints(1, (10 + 1)).findFirst().getAsInt();

        // Set the health of the provided opponent
        opponent.determineHealth(damage);
        System.out.println(String.format("%s has damage of %d and health of %d", opponent.name, damage,
                opponent.health));
    }
    
    /**
     * Attacks another superhero, causing a random amount of damage.
     *
     * @param opponent The superhero to be attacked.
     */
    public boolean isDead(){
        return this.isDead;
    }
    
    /**
     * Private helper method to determine the superhero's health after taking damage.
     * If health drops to 0 or below, marks the superhero as dead.
     *
     * @param damage The amount of damage the superhero has taken.
     */
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
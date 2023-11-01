/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algomon;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lecturer
 * GitHub link: https://github.com/2022256/Algomon
 * Group Member 1 Name: Andrei Chistiakov
 * Group Member 1 Student Number: 2022256
 * Group Member 2 Name: Ivan Popov
 * Group Member 2 Student Number: 2022180
 */
// Enum for Algomon types
enum AlgomonType {
    FIRE, WATER, EARTH, SUN, MOON, STAR
}

// Enum for Ability types
enum AbilityType {
    OFFENSIVE, DEFENSIVE, HEALING
}

class Ability implements Activatable { // Abilities for Algomons implements activatable
    AbilityType type;
    String name;

    public Ability(AbilityType type, String name) {
        this.type = type;
        this.name = name;
        // constructor for Algomon's abilities *
    }
   
 @Override
    public void activate() { //overridden void method 
        System.out.println(name + " ability activated!");
    }    

}
        interface Activatable { //interface for abilities with void method
    void activate();
}

class Algomon { //class for algomons
    AlgomonType type;
    int health;
    int attack;
    int defense;
    int speed;
    Ability offensiveAbility;
    Ability defensiveAbility;
    Ability healingAbility;

    Algomon(AlgomonType type, int health, int attack, int defense, int speed) { //constructor for algomons
        this.type = type;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        
         switch (type) { //initialize switch method for enums
            case FIRE:
                offensiveAbility = new Ability(AbilityType.OFFENSIVE, "Fire Attack");
                defensiveAbility = new Ability(AbilityType.DEFENSIVE, "Fire Defense");
                healingAbility = new Ability(AbilityType.HEALING, "Fire Healing");
                break;
            case WATER:
                offensiveAbility = new Ability(AbilityType.OFFENSIVE, "Water Attack");
                defensiveAbility = new Ability(AbilityType.DEFENSIVE, "Water Defense");
                healingAbility = new Ability(AbilityType.HEALING, "Water Healing");
                break;
            case EARTH:
                offensiveAbility = new Ability(AbilityType.OFFENSIVE, "Earth Attack");
                defensiveAbility = new Ability(AbilityType.DEFENSIVE, "Earth Defense");
                healingAbility = new Ability(AbilityType.HEALING, "Earth Healing");
                break;
            case SUN:
                offensiveAbility = new Ability(AbilityType.OFFENSIVE, "Sun Attack");
                defensiveAbility = new Ability(AbilityType.DEFENSIVE, "Sun Defense");
                healingAbility = new Ability(AbilityType.HEALING, "Sun Healing");
                break;
        }
    }
}

class Player {  //class creates a player
    List<Algomon> algomons; 
 //array list for algomons
    
    Player() { 
        algomons = new ArrayList<>(); 
    } 
 //method to add new algomons
    void addAlgomon(Algomon algomon) { 
        algomons.add(algomon); 
    } 
} 


public class AlgomonGame { // renamed class

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //main method for the game itself, it is not required but good as an interesting feature
    IOUtils input = new IOUtils();
    int choice = 0;
         while (choice != 2) {
            choice = input.getUserInt("Welcome to Algomon Game!\n" +
            "1. Start Game\n" +
            "2. Exit\n" +
           "Enter your choice: \n");
        
            switch (choice) {
                case 1:
                    startGame(); //calling startgame method
                    break;
                case 2:
                    System.out.println("Thank you for playing Algomon Game. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        
    }
    
    }
    
 public static void startGame(){
        Algomon algomon1 = new Algomon(AlgomonType.FIRE, 100, 20, 10, 30); // now we can use enums to make our void method code smaller
        Algomon algomon2 = new Algomon(AlgomonType.WATER, 120, 15, 12, 25);
        Algomon algomon3 = new Algomon(AlgomonType.EARTH, 110, 18, 15, 28);
        Algomon algomon4 = new Algomon(AlgomonType.SUN, 130, 25, 8, 35);
 
        Player player1 = new Player(); // create 2 players 
        player1.addAlgomon(algomon1); 
        player1.addAlgomon(algomon2); 
 
        Player player2 = new Player(); 
        player2.addAlgomon(algomon3); 
        player2.addAlgomon(algomon4); 
 
        System.out.println("Algomon game prototype initialized!"); 
        System.out.println("Player 1 Algomon:"); 
        for (Algomon algomon : player1.algomons) { // output for algomon's 
            System.out.println("Type: " + algomon.type +
            " Health: " + algomon.health + " Attack: "+algomon.attack+" Defence: "+algomon.defense+" Speed: "+algomon.speed); // more variables
            algomon.offensiveAbility.activate(); 
            algomon.defensiveAbility.activate(); 
            algomon.healingAbility.activate(); 
            System.out.println("----------------------"); 
        } 
 
        System.out.println("Player 2 Algomon:"); 
        for (Algomon algomon : player2.algomons) { 
               System.out.println("Type: " + algomon.type +
            " Health: " + algomon.health + " Attack: "+algomon.attack+" Defence: "+algomon.defense+" Speed: "+algomon.speed);   // more variables
            algomon.offensiveAbility.activate(); 
            algomon.defensiveAbility.activate(); 
            algomon.healingAbility.activate(); 
            System.out.println("----------------------");
        } 
        System.out.println("Play again?");
    } 
}
 
     
    



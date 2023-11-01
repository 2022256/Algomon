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

class Ability { // Abilities for Algomons
    String type;
    String name;

    public Ability(String type, String name) {
        this.type = type;
        this.name = name;
        // constructor for Algomon's abilities *
    }
    
    void activate(){
        System.out.println(name + " ability activated");
    }
    //void method for abilites activation
}

class Algomon { 
    String type;
    int health;
    int attack;
    int defense;
    int speed;
    Ability offensiveAbility; //abilities to execute in the game
    Ability defensiveAbility;
    Ability healingAbility; 

    public Algomon(String type, int health, int attack, int defense, int speed) { //constructor for algomons and their stats
        this.type = type;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
    }
       
}

class Player { 
    List<Algomon> algomons; 
 //array list for algomons
    
    Player() { 
        algomons = new ArrayList<>(); 
    } 
 //method for add new algomons
    
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
     Algomon algomon1 = new Algomon("Fire", 100, 20, 10, 30);  // create 4 new algomons with unique abilities
        algomon1.offensiveAbility = new Ability("Offensive", "Fire Attack"); 
        algomon1.defensiveAbility = new Ability("Defensive", "Fire Defense"); 
        algomon1.healingAbility = new Ability("Healing", "Fire Healing"); 
 
        Algomon algomon2 = new Algomon("Water", 120, 15, 12, 25); 
        algomon2.offensiveAbility = new Ability("Offensive", "Water Attack"); 
        algomon2.defensiveAbility = new Ability("Defensive", "Water Defense"); 
        algomon2.healingAbility = new Ability("Healing", "Water Healing"); 
 
        Algomon algomon3 = new Algomon("Earth", 110, 18, 15, 28); 
        algomon3.offensiveAbility = new Ability("Offensive", "Earth Attack"); 
        algomon3.defensiveAbility = new Ability("Defensive", "Earth Defense"); 
        algomon3.healingAbility = new Ability("Healing", "Earth Healing"); 
 
        Algomon algomon4 = new Algomon("Sun", 130, 25, 8, 35); 
        algomon4.offensiveAbility = new Ability("Offensive", "Sun Attack"); 
        algomon4.defensiveAbility = new Ability("Defensive", "Sun Defense"); 
        algomon4.healingAbility = new Ability("Healing", "Sun Healing"); 
 
        Player player1 = new Player(); // create 2 players 
        player1.addAlgomon(algomon1); 
        player1.addAlgomon(algomon2); 
 
        Player player2 = new Player(); 
        player2.addAlgomon(algomon3); 
        player2.addAlgomon(algomon4); 
 
        System.out.println("Algomon game prototype initialized!"); 
        System.out.println("Player 1 Algomon:"); 
        for (Algomon algomon : player1.algomons) { // output for algomon's 
            System.out.println("Type: " + algomon.type); 
            System.out.println("Health: " + algomon.health); 
            algomon.offensiveAbility.activate(); 
            algomon.defensiveAbility.activate(); 
            algomon.healingAbility.activate(); 
            System.out.println("----------------------"); 
        } 
 
        System.out.println("Player 2 Algomon:"); 
        for (Algomon algomon : player2.algomons) { 
            System.out.println("Type: " + algomon.type); 
            System.out.println("Health: " + algomon.health); 
            algomon.offensiveAbility.activate(); 
            algomon.defensiveAbility.activate(); 
            algomon.healingAbility.activate(); 
            System.out.println("----------------------");
        } 
        System.out.println("Play again?");
    } 
}
 
     
    



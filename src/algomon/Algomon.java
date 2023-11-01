/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algomon;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LecturerA
 * GitHub link:
 * Group Member 1 Name:
 * Group Member 1 Student Number:
 * Group Member 2 Name:
 * Group Member 2 Student Number:
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

class Algomonos { 
    String type;
    int health;
    int attack;
    int defense;
    int speed;
    Ability offensiveAbility; //abilities to execute in the game
    Ability defensiveAbility;
    Ability healingAbility; 

    public Algomonos(String type, int health, int attack, int defense, int speed) { //constructor for algomons and their stats
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


public class Algomon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    } 
}



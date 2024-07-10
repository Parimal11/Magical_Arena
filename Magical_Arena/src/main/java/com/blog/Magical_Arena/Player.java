package com.blog.Magical_Arena;


//Player Class
public class Player {
	
		//Attributes for the players
	 	private String name;
	    private int health;
	    private int strength;
	    private int attack;
	    
	    //COnstructor for Player Class
	    public Player(String name, int health, int strength, int attack) {
	        this.name = name;
	        this.health = health;
	        this.strength = strength;
	        this.attack = attack;
	    }

	    
	    //Getters and setters for the Attributes
	    public String getName() {
	        return name;
	    }

	    public int getHealth() {
	        return health;
	    }

	    public int getStrength() {
	        return strength;
	    }

	    public int getAttack() {
	        return attack;
	    }

	    
	    
	    //Method for change in health of the Players
	    public void reduceHealth(int amount) {
	        health = Math.max(0, health - amount);
	    }

	    // Checking if the Players are alive or not
	    public boolean isAlive() {
	        return health > 0;
	    }

}

package com.blog.Magical_Arena;


//Main Class
public class Root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player playerA = new Player("Player A", 50, 5, 10); // Player A with attributes 
        Player playerB = new Player("Player B", 100, 10, 5); // Player B with attributes 


        Match match = new Match(playerA, playerB);  // Calling Match Class from root package to start the match
        match.start(); // starting the match

	}

}

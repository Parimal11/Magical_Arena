package com.blog.Magical_Arena;

public class Match {

	 private Player playerA;
	    private Player playerB;
	    private Dice dice;

	    public Match(Player playerA, Player playerB) {
	        this.playerA = playerA;
	        this.playerB = playerB;
	        this.dice = new Dice(6); // 6-sided dice
	    }

	    public void start() {
	        while (playerA.isAlive() && playerB.isAlive()) {
	            takeTurn();
	        }
	        announceWinner();
	    }

	    private void takeTurn() {
	        Player attacker, defender;

	        if (playerA.getHealth() < playerB.getHealth()) {
	            attacker = playerA;
	            defender = playerB;
	        } else {
	            attacker = playerB;
	            defender = playerA;
	        }

	        int attackRoll = dice.roll();
	        int defendRoll = dice.roll();

	        int attackDamage = attackRoll * attacker.getAttack();
	        int defendStrength = defendRoll * defender.getStrength();
	        int damageDealt = Math.max(0, attackDamage - defendStrength);

	        defender.reduceHealth(damageDealt);

	        System.out.println(attacker.getName() + " attacks with roll " + attackRoll + " (Damage: " + attackDamage + ")");
	        System.out.println(defender.getName() + " defends with roll " + defendRoll + " (Defense: " + defendStrength + ")");
	        System.out.println(defender.getName() + " takes " + damageDealt + " damage, health now " + defender.getHealth());
	        System.out.println();
	    }

	    private void announceWinner() {
	        if (playerA.isAlive()) {
	            System.out.println(playerA.getName() + " wins!");
	        } else {
	            System.out.println(playerB.getName() + " wins!");
	        }
	    }
}

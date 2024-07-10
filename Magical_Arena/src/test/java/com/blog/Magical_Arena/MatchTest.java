package com.blog.Magical_Arena;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MatchTest {
    @Test
    public void testMatch() {
        Player playerA = new Player("Player A", 50, 5, 10);
        Player playerB = new Player("Player B", 100, 10, 5);
        Match match = new Match(playerA, playerB);

        match.start();

        assertTrue(playerA.isAlive() || playerB.isAlive());
        assertFalse(playerA.isAlive() && playerB.isAlive());
    }
}


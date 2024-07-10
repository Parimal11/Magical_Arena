
package com.blog.Magical_Arena;





import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PlayerTest {
    @Test
    public void testPlayerCreation() {
        Player player = new Player("Player A", 50, 5, 10);
        assertEquals("Player A", player.getName());
        assertEquals(50, player.getHealth());
        assertEquals(5, player.getStrength());
        assertEquals(10, player.getAttack());
    }

    @Test
    public void testReduceHealth() {
        Player player = new Player("Player A", 50, 5, 10);
        player.reduceHealth(20);
        assertEquals(30, player.getHealth());
        player.reduceHealth(40);
        assertEquals(0, player.getHealth());
    }
}


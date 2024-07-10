package com.swiggy.arenatest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.swiggy.arena.Game;
import com.swiggy.arena.Player;

public class GameTest {
    private Player player1;
    private Player player2;
    private Game game;

    @BeforeEach
    public void setUp() {
        player1 = new Player("Player A", 50, 5, 10);
        player2 = new Player("Player B", 100, 10, 5);
        game = new Game(player1, player2);
    }

    @Test
    public void testGameInitialization() {
        assertNotNull(game);
    }

    @Test
    public void testGameStart() {
        game.start();
        assertTrue(player1.getHealth() <= 0 || player2.getHealth() <= 0);
    }
}

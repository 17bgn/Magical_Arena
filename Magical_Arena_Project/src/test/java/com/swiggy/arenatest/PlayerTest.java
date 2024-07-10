package com.swiggy.arenatest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.swiggy.arena.Player;

public class PlayerTest {
    private Player player;

    @BeforeEach
    public void setUp() {
        player = new Player("Player A", 50, 5, 10);
    }

    @Test
    public void testInitialHealth() {
        assertEquals(50, player.getHealth());
    }

    @Test
    public void testSetHealth() {
        player.setHealth(40);
        assertEquals(40, player.getHealth());
    }

    @Test
    public void testRollAttackDice() {
        int roll = player.rollAttackDice();
        assertTrue(roll >= 1 && roll <= 6);
    }

    @Test
    public void testRollDefendDice() {
        int roll = player.rollDefendDice();
        assertTrue(roll >= 1 && roll <= 6);
    }

    @Test
    public void testCalculateDamage() {
        int damage = player.calculateDamage(3);
        assertEquals(30, damage);
    }

    @Test
    public void testCalculateDefense() {
        int defense = player.calculateDefense(4);
        assertEquals(20, defense);
    }
}

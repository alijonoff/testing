package com.epam.jmp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BowlingGameTest {

    @Test
    void gutterGameScores0() {
        BowlingGame game = new BowlingGame();
        rollMany(game, 20, 0);
        assertEquals(0, game.score());
    }

    @Test
    void allOnesScores20() {
        BowlingGame game = new BowlingGame();
        rollMany(game, 20, 1);
        assertEquals(20, game.score());
    }

    @Test
    void oneSpareAddsNextRollBonus() {
        BowlingGame game = new BowlingGame();

        // frame 1: spare (5,5) => 10 + next roll (3)
        game.roll(5);
        game.roll(5);
        game.roll(3);

        rollMany(game, 17, 0);

        // 13 + 3 + rest zeros
        assertEquals(16, game.score());
    }

    @Test
    void oneStrikeAddsNextTwoRollsBonus() {
        BowlingGame game = new BowlingGame();

        // frame 1: strike => 10 + next two rolls (3,4)
        game.roll(10);
        game.roll(3);
        game.roll(4);

        rollMany(game, 16, 0);

        // 17 + 7 + rest zeros
        assertEquals(24, game.score());
    }

    @Test
    void perfectGameScores300() {
        BowlingGame game = new BowlingGame();
        rollMany(game, 12, 10);
        assertEquals(300, game.score());
    }

    @Test
    void rejectsInvalidPins() {
        BowlingGame game = new BowlingGame();
        assertThrows(IllegalArgumentException.class, () -> game.roll(-1));
        assertThrows(IllegalArgumentException.class, () -> game.roll(11));
    }

    private static void rollMany(BowlingGame game, int times, int pins) {
        for (int i = 0; i < times; i++) {
            game.roll(pins);
        }
    }
}
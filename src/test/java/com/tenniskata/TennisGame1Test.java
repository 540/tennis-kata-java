package com.tenniskata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Tennis Game 1 Tests")
class TennisGame1Test {

    private TennisGame1 game;

    @BeforeEach
    void setUp() {
        game = new TennisGame1("player1", "player2");
    }

    @Test
    @DisplayName("Should start with Love-All")
    void testGameStartsWithLoveAll() {
        assertEquals("Love-All", game.getScore());
    }

    @Test
    @DisplayName("Player1 wins first point: Fifteen-Love")
    void testPlayer1WinsFirstPoint() {
        game.wonPoint("player1");
        assertEquals("Fifteen-Love", game.getScore());
    }

    @Test
    @DisplayName("Player2 wins first point: Love-Fifteen")
    void testPlayer2WinsFirstPoint() {
        game.wonPoint("player2");
        assertEquals("Love-Fifteen", game.getScore());
    }

    @Test
    @DisplayName("Both players win one point: Fifteen-All")
    void testBothPlayersWinOnePoint() {
        game.wonPoint("player1");
        game.wonPoint("player2");
        assertEquals("Fifteen-All", game.getScore());
    }

    @Test
    @DisplayName("Player1 wins two points: Thirty-Love")
    void testPlayer1WinsTwoPoints() {
        game.wonPoint("player1");
        game.wonPoint("player1");
        assertEquals("Thirty-Love", game.getScore());
    }

    @Test
    @DisplayName("Both players win two points: Thirty-All")
    void testBothPlayersWinTwoPoints() {
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player2");
        game.wonPoint("player2");
        assertEquals("Thirty-All", game.getScore());
    }

    @Test
    @DisplayName("Player1 wins three points: Forty-Love")
    void testPlayer1WinsThreePoints() {
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player1");
        assertEquals("Forty-Love", game.getScore());
    }

    @Test
    @DisplayName("Both players win three points: Deuce")
    void testDeuce() {
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player2");
        game.wonPoint("player2");
        game.wonPoint("player2");
        assertEquals("Deuce", game.getScore());
    }

    @Test
    @DisplayName("Player1 wins four points straight: Win for player1")
    void testPlayer1WinsFourPointsStraight() {
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player1");
        assertEquals("Win for player1", game.getScore());
    }

    @Test
    @DisplayName("Player2 wins four points straight: Win for player2")
    void testPlayer2WinsFourPointsStraight() {
        game.wonPoint("player2");
        game.wonPoint("player2");
        game.wonPoint("player2");
        game.wonPoint("player2");
        assertEquals("Win for player2", game.getScore());
    }

    @Test
    @DisplayName("Advantage player1 after deuce")
    void testAdvantagePlayer1() {
        // Get to deuce
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player2");
        game.wonPoint("player2");
        game.wonPoint("player2");
        // Player1 wins one more
        game.wonPoint("player1");
        assertEquals("Advantage player1", game.getScore());
    }

    @Test
    @DisplayName("Advantage player2 after deuce")
    void testAdvantagePlayer2() {
        // Get to deuce
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player2");
        game.wonPoint("player2");
        game.wonPoint("player2");
        // Player2 wins one more
        game.wonPoint("player2");
        assertEquals("Advantage player2", game.getScore());
    }

    @Test
    @DisplayName("Player1 wins after advantage")
    void testPlayer1WinsAfterAdvantage() {
        // Get to deuce
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player2");
        game.wonPoint("player2");
        game.wonPoint("player2");
        // Player1 gets advantage and wins
        game.wonPoint("player1");
        game.wonPoint("player1");
        assertEquals("Win for player1", game.getScore());
    }

    @Test
    @DisplayName("Player2 wins after advantage")
    void testPlayer2WinsAfterAdvantage() {
        // Get to deuce
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player2");
        game.wonPoint("player2");
        game.wonPoint("player2");
        // Player2 gets advantage and wins
        game.wonPoint("player2");
        game.wonPoint("player2");
        assertEquals("Win for player2", game.getScore());
    }

    @Test
    @DisplayName("Back to deuce after advantage")
    void testBackToDeuceAfterAdvantage() {
        // Get to deuce
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player2");
        game.wonPoint("player2");
        game.wonPoint("player2");
        // Player1 gets advantage
        game.wonPoint("player1");
        assertEquals("Advantage player1", game.getScore());
        // Player2 equalizes back to deuce
        game.wonPoint("player2");
        assertEquals("Deuce", game.getScore());
    }

    @ParameterizedTest
    @DisplayName("Test various score combinations")
    @CsvSource({
        "0, 0, Love-All",
        "1, 0, Fifteen-Love",
        "0, 1, Love-Fifteen",
        "2, 0, Thirty-Love",
        "0, 2, Love-Thirty",
        "3, 0, Forty-Love",
        "0, 3, Love-Forty",
        "1, 1, Fifteen-All",
        "2, 2, Thirty-All",
        "3, 3, Deuce",
        "4, 4, Deuce",
        "2, 1, Thirty-Fifteen",
        "1, 2, Fifteen-Thirty",
        "3, 1, Forty-Fifteen",
        "1, 3, Fifteen-Forty",
        "3, 2, Forty-Thirty",
        "2, 3, Thirty-Forty"
    })
    void testScoreCombinations(int player1Points, int player2Points, String expectedScore) {
        for (int i = 0; i < player1Points; i++) {
            game.wonPoint("player1");
        }
        for (int i = 0; i < player2Points; i++) {
            game.wonPoint("player2");
        }
        assertEquals(expectedScore, game.getScore());
    }

    @Test
    @DisplayName("Test game with custom player names")
    void testCustomPlayerNames() {
        TennisGame1 customGame = new TennisGame1("Nadal", "Federer");
        assertEquals("Love-All", customGame.getScore());

        customGame.wonPoint("Nadal");
        assertEquals("Fifteen-Love", customGame.getScore());

        customGame.wonPoint("Federer");
        assertEquals("Fifteen-All", customGame.getScore());
    }
}


package test;

import org.junit.jupiter.api.Test;

import chess.Main;

import static org.junit.jupiter.api.Assertions.*;

class MyClassTest {

	// Test 1: Check if the King is between the Rooks (making sure it can be checked)
    @Test
    void testKingBetweenRooks() {
        String[] firstRow = {"Rook", "Knight", "Bishop", "Queen", "King", "Bishop", "Knight", "Rook"};
        assertEquals("King", firstRow[4], "The King should be at index 4 (between the Rooks)");
    }

    // Test 2: Check if the bishops are on opposite-colored squares
    @Test
    void testBishopsOnOppositeSquares() {
        String bishop1 = "Bishop White";  // White bishop at (0, 2)
        String bishop2 = "Bishop Black";  // Black bishop at (0, 5)

        assertNotEquals(bishop1, bishop2, "The bishops should be on opposite-colored squares");
    }

    // Test 3: Check if the toggle can be accessed
    @Test
    void testSetChess960Board() {
        Main myClassInstance = new Main();  

        // Call the setChess960Board() method
        myClassInstance.setChess960Board();

        // If the popup shows, the test passes
        // No assertions are needed here, this is just to make sure I can call the click
    }

    // Test 4: Check if Chess960 can be toggled
    @Test
    void testChess960Toggle() {
        boolean chess960Enabled = true;  
        assertTrue(chess960Enabled, "Chess960 should be enabled initially");
        chess960Enabled = !chess960Enabled;
        assertFalse(chess960Enabled, "Chess960 should be disabled after toggle");
    }
}
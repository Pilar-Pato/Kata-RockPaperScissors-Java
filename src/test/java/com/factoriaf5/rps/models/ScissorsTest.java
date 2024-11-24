package com.factoriaf5.rps.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ScissorsTest {

    @Test
    public void testGetName() {
        Scissors scissors = new Scissors();
        
        assertEquals("Scissors", scissors.getName());
    }

    @Test
    public void testWhoWinsAgainstRock() {
        Scissors scissors = new Scissors();
        Rock rock = new Rock();
        
        
        String result = scissors.whoWins(rock);
        assertEquals("Rock crushes Scissors. You lose!", result);
    }

    @Test
    public void testWhoWinsAgainstPaper() {
        Scissors scissors = new Scissors();
        Paper paper = new Paper();
        
       
        String result = scissors.whoWins(paper);
        assertEquals("Scissors cut Paper. You win!", result);
    }

    @Test
    public void testWhoWinsAgainstScissors() {
        Scissors scissors1 = new Scissors();
        Scissors scissors2 = new Scissors();
        
       
        String result = scissors1.whoWins(scissors2);
        assertEquals("It's a tie!", result);
    }
}

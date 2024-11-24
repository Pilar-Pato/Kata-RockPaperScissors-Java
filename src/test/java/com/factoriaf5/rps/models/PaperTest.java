package com.factoriaf5.rps.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PaperTest {

    @Test
    public void testGetName() {
        Paper paper = new Paper();
        
        assertEquals("Paper", paper.getName());
    }

    @Test
    public void testWhoWinsAgainstRock() {
        Paper paper = new Paper();
        Rock rock = new Rock();
        
        
        String result = paper.whoWins(rock);
        assertEquals("Paper covers Rock. You win!", result);
    }

    @Test
    public void testWhoWinsAgainstPaper() {
        Paper paper1 = new Paper();
        Paper paper2 = new Paper();
        
       
        String result = paper1.whoWins(paper2);
        assertEquals("It's a tie!", result);
    }

    @Test
    public void testWhoWinsAgainstScissors() {
        Paper paper = new Paper();
        Scissors scissors = new Scissors();
        
       
        String result = paper.whoWins(scissors);
        assertEquals("Scissors cut Paper. You lose!", result);
    }
}

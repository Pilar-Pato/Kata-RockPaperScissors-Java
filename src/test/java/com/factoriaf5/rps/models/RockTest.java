package com.factoriaf5.rps.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RockTest {

    @Test
    public void testGetName() {
        Rock rock = new Rock();
        
        assertEquals("Rock", rock.getName());
    }

    @Test
    public void testWhoWinsAgainstRock() {
        Rock rock1 = new Rock();
        Rock rock2 = new Rock();
        
        
        String result = rock1.whoWins(rock2);
        assertEquals("It's a tie!", result);
    }

    @Test
    public void testWhoWinsAgainstPaper() {
        Rock rock = new Rock();
        Paper paper = new Paper();
        
        
        String result = rock.whoWins(paper);
        assertEquals("Paper covers Rock. You lose!", result);
    }

    @Test
    public void testWhoWinsAgainstScissors() {
        Rock rock = new Rock();
        Scissors scissors = new Scissors();
        
        
        String result = rock.whoWins(scissors);
        assertEquals("Rock crushes Scissors. You win!", result);
    }
}

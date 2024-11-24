package com.factoriaf5.rps.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SpockTest {

    @Test
    public void testGetName() {
        Spock spock = new Spock();
        // Verificamos que el método getName() retorne "Spock"
        assertEquals("Spock", spock.getName());
    }

    @Test
    public void testWhoWinsAgainstRock() {
        Spock spock = new Spock();
        Rock rock = new Rock();
        
        // Verificamos que Spock le gane a Rock
        String result = spock.whoWins(rock);
        assertEquals("Spock vaporizes Rock. You win!", result);
    }

    @Test
    public void testWhoWinsAgainstPaper() {
        Spock spock = new Spock();
        Paper paper = new Paper();
        
        // Verificamos que Paper le gane a Spock
        String result = spock.whoWins(paper);
        assertEquals("Paper disproves Spock. You lose!", result);
    }

    @Test
    public void testWhoWinsAgainstScissors() {
        Spock spock = new Spock();
        Scissors scissors = new Scissors();
        
        // Verificamos que Spock le gane a Scissors
        String result = spock.whoWins(scissors);
        assertEquals("Spock smashes Scissors. You win!", result);
    }

    @Test
    public void testWhoWinsAgainstLizard() {
        Spock spock = new Spock();
        Lizard lizard = new Lizard();
        
        // Verificamos que Lizard le gane a Spock
        String result = spock.whoWins(lizard);
        assertEquals("Lizard poisons Spock. You lose!", result);
    }

    @Test
    public void testWhoWinsAgainstSpock() {
        Spock spock1 = new Spock();
        Spock spock2 = new Spock();
        
        // Verificamos que el juego entre dos Spock sea un empate
        String result = spock1.whoWins(spock2);
        assertEquals("It's a tie!", result);
    }
}
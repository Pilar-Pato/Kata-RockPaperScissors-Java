package com.factoriaf5.rps.Factory;

import com.factoriaf5.rps.models.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChoiceFactoryTest {

    @Test
    public void testCreateRockChoice() {
        Object choice = ChoiceFactory.createChoice("rock");
       
        assertTrue(choice instanceof Rock, "Expected a Rock object");
    }

    @Test
    public void testCreatePaperChoice() {
        Object choice = ChoiceFactory.createChoice("paper");
       
        assertTrue(choice instanceof Paper, "Expected a Paper object");
    }

    @Test
    public void testCreateScissorsChoice() {
        Object choice = ChoiceFactory.createChoice("scissors");
        
        assertTrue(choice instanceof Scissors, "Expected a Scissors object");
    }

    @Test
    public void testCreateLizardChoice() {
        Object choice = ChoiceFactory.createChoice("lizard");
        
        assertTrue(choice instanceof Lizard, "Expected a Lizard object");
    }

    @Test
    public void testCreateSpockChoice() {
        Object choice = ChoiceFactory.createChoice("spock");
        
        assertTrue(choice instanceof Spock, "Expected a Spock object");
    }

    @Test
    public void testCreateInvalidChoice() {
        
        assertThrows(IllegalArgumentException.class, () -> ChoiceFactory.createChoice("invalidChoice"));
    }
}

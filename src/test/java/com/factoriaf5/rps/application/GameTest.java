package com.factoriaf5.rps.application;

import org.junit.jupiter.api.Test;

import com.factoriaf5.rps.models.Paper;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;

import static org.junit.jupiter.api.Assertions.*;

public class GameTest {
    @Test
    public void testRockBeatsScissors() {
        Rock rock = new Rock();
        Scissors scissors = new Scissors();
        assertEquals("Rock crushes Scissors. You win!", rock.whoWins(scissors));
    }

    @Test
    public void testPaperBeatsRock() {
        Paper paper = new Paper();
        Rock rock = new Rock();
        assertEquals("Paper covers Rock. You win!", paper.whoWins(rock));
    }

    @Test
    public void testScissorsBeatsPaper() {
        Scissors scissors = new Scissors();
        Paper paper = new Paper();
        assertEquals("Scissors cut Paper. You win!", scissors.whoWins(paper));
    }
}



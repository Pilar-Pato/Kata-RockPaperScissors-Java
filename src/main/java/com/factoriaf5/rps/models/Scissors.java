package com.factoriaf5.rps.models;

public class Scissors {
    public String getName() {
        return "Scissors";
    }

    public String whoWins(Rock other) {
        return "Rock crushes Scissors. You lose!";
    }

    public String whoWins(Paper other) {
        return "Scissors cut Paper. You win!";
    }

    public String whoWins(Scissors other) {
        return "It's a tie!";
    }
}


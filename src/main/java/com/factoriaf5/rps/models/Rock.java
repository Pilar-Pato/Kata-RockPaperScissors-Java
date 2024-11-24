package com.factoriaf5.rps.models;

public class Rock {
    public String getName() {
        return "Rock";
    }

    public String whoWins(Rock other) {
        return "It's a tie!";
    }

    public String whoWins(Paper other) {
        return "Paper covers Rock. You lose!";
    }

    public String whoWins(Scissors other) {
        return "Rock crushes Scissors. You win!";
    }
}


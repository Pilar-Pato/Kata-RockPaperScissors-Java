package com.factoriaf5.rps.models;

public class Lizard {
    public String getName() {
        return "Lizard";
    }

    public String whoWins(Rock other) {
        return "Rock crushes Lizard. You lose!";
    }

    public String whoWins(Paper other) {
        return "Lizard eats Paper. You win!";
    }

    public String whoWins(Scissors other) {
        return "Scissors decapitate Lizard. You lose!";
    }

    public String whoWins(Lizard other) {
        return "It's a tie!";
    }

    public String whoWins(Spock other) {
        return "Lizard poisons Spock. You win!";
    }
}

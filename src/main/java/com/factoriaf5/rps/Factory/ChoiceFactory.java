package com.factoriaf5.rps.Factory;

import com.factoriaf5.rps.models.*;

public class ChoiceFactory {
    public static Object createChoice(String choice) {
        switch (choice.toLowerCase()) {
            case "rock":
                return new Rock();
            case "paper":
                return new Paper();
            case "scissors":
                return new Scissors();
            case "lizard":
                return new Lizard();
            case "spock":
                return new Spock();
            default:
                throw new IllegalArgumentException("Invalid choice!");
        }
    }
}

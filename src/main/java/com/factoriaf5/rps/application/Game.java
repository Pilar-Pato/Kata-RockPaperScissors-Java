package com.factoriaf5.rps.application;

import com.factoriaf5.rps.Factory.ChoiceFactory;
import com.factoriaf5.rps.models.*;

import java.util.Scanner;

public class Game {
    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your move: Rock, Paper, Scissors, Lizard, or Spock");
        String userChoice = scanner.nextLine().toLowerCase();

      
        Object playerChoice = ChoiceFactory.createChoice(userChoice);

        
        String result = play(playerChoice);

        System.out.println(result);
    }

    private String play(Object playerChoice) {
       
        int randomChoice = (int) (Math.random() * 5);
        Object computerChoice = ChoiceFactory.createChoice(getChoiceNameByIndex(randomChoice));

        
        if (playerChoice instanceof Rock) {
            return ((Rock) playerChoice).whoWins((Rock) computerChoice);
        } else if (playerChoice instanceof Paper) {
            return ((Paper) playerChoice).whoWins((Paper) computerChoice);
        } else if (playerChoice instanceof Scissors) {
            return ((Scissors) playerChoice).whoWins((Scissors) computerChoice);
        } else if (playerChoice instanceof Lizard) {
            return ((Lizard) playerChoice).whoWins((Lizard) computerChoice);
        } else if (playerChoice instanceof Spock) {
            return ((Spock) playerChoice).whoWins((Spock) computerChoice);
        } else {
            return "Invalid choice!";
        }
    }

    private String getChoiceNameByIndex(int index) {
        switch (index) {
            case 0: return "rock";
            case 1: return "paper";
            case 2: return "scissors";
            case 3: return "lizard";
            case 4: return "spock";
            default: return "rock"; 
        }
    }

    public static void main(String[] args) {
        new Game().start();
    }
}

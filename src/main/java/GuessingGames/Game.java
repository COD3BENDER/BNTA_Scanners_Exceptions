package GuessingGames;

import java.util.Scanner;


public class Game {


    public static void main(String[] args) {

        IPlay game = null;

        Scanner scanner = new Scanner(System.in);

        Scanner gameChoice = new Scanner(System.in);

        System.out.println("Enter 1 for Number Guesser or 2 for Word Guesser: ");

        if (gameChoice.nextInt() == 1){
            game = new NumberGuesser();
        }else if (gameChoice.nextInt() == 2){
            game = new WordGuesser();
        }

        System.out.println(game.start());

        while (game.isRunning()){
            System.out.println(game.promptForGuess());

            String guess = scanner.nextLine(); // capture guess

            try {
                System.out.println(game.processGuess(guess));
            }catch (Exception exception){
                System.out.println("thats not a valid guess, try again.");
            }
        }
        System.out.println("Well done, thanks for playing!");
    }

}

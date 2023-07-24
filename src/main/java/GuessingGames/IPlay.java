package GuessingGames;

public interface IPlay {
    boolean isRunning(); // this is just going to be a getter
    String start();
    String promptForGuess();
    String processGuess(String guess) throws Exception;

}

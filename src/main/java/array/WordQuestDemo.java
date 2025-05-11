package array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class WordQuestDemo {

  @SuppressWarnings("java:S106")
  public static void main(String[] args) {
    String secretWord = getRandomWord();
    int maxAttempts = 10;

    char[] gameBoard = new char[secretWord.length()];

    Arrays.fill(gameBoard, '_');

    Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome to Word Quest!");

    boolean wordNotRevealed = true;
    while (maxAttempts > 0 && wordNotRevealed) {
      System.out.println("Current word: " + String.valueOf(gameBoard));

      System.out.println();
      System.out.print("Guess a letter: ");
      String userInput = scanner.next().toUpperCase();
      char theGuess = userInput.charAt(0);

      boolean isGuessCorrect = false;
      for (int i = 0; i < secretWord.length(); i++) {
        if (secretWord.charAt(i) == theGuess) {
          gameBoard[i] = theGuess;
          isGuessCorrect = true;
        }
      }

      if (isGuessCorrect) {
        System.out.println("Good job! You found a match.");

        wordNotRevealed = containsUnderscore(gameBoard);
      } else {
        System.out.println("Incorrect! Try again.");
        maxAttempts--;
      }

      System.out.println("Attempts remaining: " + maxAttempts);
      System.out.println();
    }

    if (wordNotRevealed) {
      System.out.println("You've run out of attempts. The secret word was: " + secretWord);
    } else {
      System.out.println("Congratulations! You've revealed the secret word: " + secretWord);
    }

    scanner.close();
  }

  @SuppressWarnings("java:S2119")
  private static String getRandomWord() {
    String[] words = {"Java", "Airplane", "Friend"};

    Random random = new Random();
    int index = random.nextInt(words.length);

    String theWord = words[index];
    return theWord.toUpperCase();
  }

  private static boolean containsUnderscore(char[] gameBoard) {
    for (char c : gameBoard) {
      if (c == '_') {
        return true;
      }
    }
    return false;
  }
}

package array;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WordQuestDemov2 {

  @SuppressWarnings("java:S106")
  public static void main(String[] args) throws IOException {
    String fileName = "data/sample-words.txt";
    String secretWord = getRandomWord(fileName);
    int maxAttempts = 10;

    System.out.println("TESTING ONLY: secretWord=" + secretWord);
    System.out.println();

    char[] gameBoard = new char[secretWord.length()];

    final char EMPTY_PLACE_HOLDER = '-';
    Arrays.fill(gameBoard, EMPTY_PLACE_HOLDER);

    Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome to Word Quest!");

    boolean hasMissingLetters = true;
    while (maxAttempts > 0 && hasMissingLetters) {
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

        hasMissingLetters = contains(gameBoard, EMPTY_PLACE_HOLDER);
      } else {
        System.out.println("Incorrect! Try again.");
        maxAttempts--;
      }

      System.out.println("Attempts remaining: " + maxAttempts);
      System.out.println();
    }

    if (hasMissingLetters) {
      System.out.println("You've run out of attempts. The secret word was: " + secretWord);
    } else {
      System.out.println("Congratulations! You've revealed the secret word: " + secretWord);
    }

    scanner.close();
  }

  @SuppressWarnings("java:S2119")
  private static String getRandomWord(String fileName) throws IOException {
    List<String> linesList = Files.readAllLines(Path.of(fileName));

    String[] words = linesList.toArray(new String[0]);

    Random random = new Random();
    int index = random.nextInt(words.length);

    String theWord = words[index];
    return theWord.toUpperCase();
  }

  private static boolean contains(char[] gameBoard, char emptyPlaceHolder) {
    for (char c : gameBoard) {
      if (c == emptyPlaceHolder) {
        return true;
      }
    }
    return false;
  }
}

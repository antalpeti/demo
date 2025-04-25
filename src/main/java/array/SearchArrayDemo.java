package array;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SearchArrayDemo {

  @SuppressWarnings("java:S106")
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int size = getValidatedInput(scanner, "What size array do you want? ", true);
    int[] myDataArray = new int[size];

    populateArray(scanner, myDataArray);

    int searchKey = getValidatedInput(scanner, "What number do you want to search for: ", false);

    Arrays.sort(myDataArray);
    int index = Arrays.binarySearch(myDataArray, searchKey);

    displaySearchResult(searchKey, index);

    scanner.close();
  }

  @SuppressWarnings("java:S106")
  private static int getValidatedInput(Scanner scanner, String prompt, boolean positiveOnly) {
    int input = 0;
    while (true) {
      System.out.print(prompt);
      try {
        input = scanner.nextInt();
        if (!positiveOnly || input > 0) {
          break;
        } else {
          System.out.println("Please enter a positive integer.");
        }
      } catch (InputMismatchException e) {
        System.out.println("Invalid input. Please enter an integer.");
        scanner.next(); // Clear invalid input
      }
    }
    return input;
  }

  private static void populateArray(Scanner scanner, int[] array) {
    for (int i = 0; i < array.length; i++) {
      array[i] = getValidatedInput(scanner, "Enter number " + (i + 1) + ": ", false);
    }
  }

  @SuppressWarnings("java:S106")
  private static void displaySearchResult(int searchKey, int index) {
    if (index >= 0) {
      System.out.println("We found the number: " + searchKey + " at index: " + index);
    } else {
      System.out.println("We did not find the number: " + searchKey);
    }
  }
}

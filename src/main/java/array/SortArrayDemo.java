package array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SortArrayDemo {

  @SuppressWarnings("java:S106")
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int size = 0;

    // Validate array size input
    while (true) {
      System.out.print("What size array do you want? ");
      try {
        size = scanner.nextInt();
        if (size > 0) {
          break;
        } else {
          System.out.println("Please enter a positive integer.");
        }
      } catch (InputMismatchException e) {
        System.out.println("Invalid input. Please enter a positive integer.");
        scanner.next(); // Clear invalid input
      }
    }

    int[] myDataArray = new int[size];

    // Validate array elements input
    for (int i = 0; i < myDataArray.length; i++) {
      while (true) {
        System.out.print("Enter number " + (i + 1) + ": ");
        try {
          myDataArray[i] = scanner.nextInt();
          break;
        } catch (InputMismatchException e) {
          System.out.println("Invalid input. Please enter an integer.");
          scanner.next(); // Clear invalid input
        }
      }
    }

    System.out.println();

    System.out.println("BEFORE sorting:");
    displayData(myDataArray);

    System.out.println();

    Arrays.sort(myDataArray);

    System.out.println("AFTER sorting (ascending):");
    displayData(myDataArray);

    System.out.println();

    Integer[] myDataArrayDescending = Arrays.stream(myDataArray).boxed().toArray(Integer[]::new);
    Arrays.sort(myDataArrayDescending, Comparator.reverseOrder());

    System.out.println("AFTER sorting (descending):");
    displayData(Arrays.stream(myDataArrayDescending).mapToInt(Integer::intValue).toArray());

    scanner.close();
  }

  @SuppressWarnings("java:S106")
  private static void displayData(int[] myDataArray) {
    for (int myData : myDataArray) {
      System.out.println(myData);
    }
  }

}

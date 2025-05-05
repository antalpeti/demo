package array;

import java.util.Scanner;

public class MultiplicationTableDemo {

  @SuppressWarnings("java:S106")
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("How many rows? ");
    int numRows = scanner.nextInt();

    System.out.print("How many columns? ");
    int numColumns = scanner.nextInt();

    int[][] table = new int[numRows][numColumns];

    for (int row = 0; row < numRows; row++) {
      for (int column = 0; column < numColumns; column++) {
        table[row][column] = (row + 1) * (column + 1);
      }
    }

    System.out.println();

    for (int row = 0; row < numRows; row++) {
      for (int column = 0; column < numColumns; column++) {
        System.out.printf("%4d ", table[row][column]);
      }
      System.out.println();
    }

    scanner.close();
  }

}

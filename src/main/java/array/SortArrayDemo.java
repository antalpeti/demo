package array;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayDemo {

  @SuppressWarnings("java:S106")
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("What size array do you want? ");
    int size = scanner.nextInt();

    int[] myDataArray = new int[size];
    for (int i = 0; i < myDataArray.length; i++) {
      System.out.print("Enter number " + (i + 1) + ": ");
      myDataArray[i] = scanner.nextInt();
    }

    System.out.println();

    System.out.println("BEFORE sorting:");
    displayData(myDataArray);

    System.out.println();

    Arrays.sort(myDataArray);

    System.out.println("AFTER sorting:");
    displayData(myDataArray);

    scanner.close();
  }

  @SuppressWarnings("java:S106")
  private static void displayData(int[] myDataArray) {
    for (int myData : myDataArray) {
      System.out.println(myData);
    }
  }

}

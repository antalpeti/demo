package array;

import java.util.Arrays;
import java.util.Scanner;

public class FillArrayDemo {

  @SuppressWarnings("java:S106")
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("What size array do you want? ");
    int size = scanner.nextInt();

    System.out.print("What number do you want to fill the array with? ");
    int theNumber = scanner.nextInt();

    int[] myDataArray = new int[size];
    Arrays.fill(myDataArray, theNumber);

    System.out.println();

    for (int myData : myDataArray) {
      System.out.println(myData);
    }

    scanner.close();
  }

}

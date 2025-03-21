package demo;

import java.util.Scanner;

public class SwitchMonthsAndQuarters {

  @SuppressWarnings({"java:S106"})
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter month number (1-12): ");
    int theMonth = scanner.nextInt();

    System.out.println("Month: " + theMonth);

    switch (theMonth) {
      case 1, 2, 3:
        System.out.println("Q1");
        break;
      case 4, 5, 6:
        System.out.println("Q2");
        break;
      case 7, 8, 9:
        System.out.println("Q3");
        break;
      case 10, 11, 12:
        System.out.println("Q4");
        break;
      default:
        System.out.println("Invalid month.");
    }

    scanner.close();
  }
}

package demo;

import java.util.Scanner;

public class StringInputDemo {

  @SuppressWarnings("java:S106")
  public static void main(String[] args) {

    // Create a Scanner object to read input from the console
    Scanner scanner = new Scanner(System.in);

    // Prompt the user to enter their favorite color
    System.out.println("What is your favorite color?");

    // Read the user's input for their favorite color
    String theColor = scanner.nextLine();

    // Prompt the user to enter their hobby
    System.out.println("What is your hobby?");

    // Read the user's input for their hobby
    String theHobby = scanner.nextLine();

    // Display the user's favorite color
    System.out.println("Your favorite color is " + theColor);

    // Display the user's hobby
    System.out.println("Your hobby is " + theHobby);

    // Close the Scanner object to free up resources
    scanner.close();
  }
}

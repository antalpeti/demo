package loop;

import java.util.Scanner;

public class WhileLoopDemo {

  @SuppressWarnings("java:S106")
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    boolean done = false;

    while (!done) {
      System.out.println("Hello World!");

      System.out.println("Are we done? (Y/N)");
      String userInput = scanner.nextLine();

      if (userInput.equalsIgnoreCase("Y")) {
        done = true;
      }
      System.out.println();
    }

    scanner.close();
  }

}

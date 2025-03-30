package loop;

import java.util.Scanner;

public class WhileLoopDemo {

  @SuppressWarnings("java:S106")
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    boolean done = false;

//    whileLoop(done, scanner);
    doWhile(scanner, done);

    scanner.close();
  }

  private static void doWhile(Scanner scanner, boolean done) {
    do {
      System.out.println("Hello World!");

      System.out.println("Are we done? (Y/N)");
      String userInput = scanner.nextLine();

      if (userInput.equalsIgnoreCase("Y")) {
        done = true;
      }
      System.out.println();
    } while (!done);
  }

  private static void whileLoop(boolean done, Scanner scanner) {
    while (!done) {
      System.out.println("Hello World!");

      System.out.println("Are we done? (Y/N)");
      String userInput = scanner.nextLine();

      if (userInput.equalsIgnoreCase("Y")) {
        done = true;
      }
      System.out.println();
    }
  }

}

package demo;

import java.util.Scanner;

public class EnumDemo {

  @SuppressWarnings("java:S106")
  public static void main(String[] args) {

    ComputerType computerType = null;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter computer type (smartphone, tablet, laptop, desktop): ");
    String userInput = scanner.nextLine().trim().toUpperCase();

    try {
      computerType = ComputerType.valueOf(userInput);
      System.out.println("You selected: " + computerType);
    } catch (IllegalArgumentException e) {
      System.out.println("Invalid computer type entered: " + userInput);
      System.exit(1);
    } finally {
      scanner.close();
    }

    String description = switch (computerType) {
      case ComputerType.SMARTPHONE -> "Smartphones offer computing power in your hand.";
      case ComputerType.TABLET -> "Tablets are lightweight for browsing and light tasks.";
      case ComputerType.LAPTOP -> "Laptops are portable for work on the go.";
      case ComputerType.DESKTOP -> "Desktops excel in gaming and work related tasks.";
      default -> "Unknown computer type.";
    };

    System.out.println(description);
  }
}

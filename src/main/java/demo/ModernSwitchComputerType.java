package demo;

import java.util.Scanner;

public class ModernSwitchComputerType {

  @SuppressWarnings("java:S106")
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter computer type (smartphone, tablet, laptop, desktop): ");
    String computerType = scanner.nextLine().toLowerCase();

    switch (computerType) {
      case "smartphone" -> System.out.println("Smartphones offer computing power in your hand.");
      case "tablet" -> System.out.println("Tablets are lightweight for browsing and light tasks.");
      case "laptop" -> System.out.println("Laptops are portable for work on the go.");
      case "desktop" -> System.out.println("Desktops excel in gaming and work related tasks.");
      default -> System.out.println("Unknown computer type.");
    }

    scanner.close();
  }

}

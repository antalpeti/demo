package demo;

import java.util.Scanner;

@SuppressWarnings("java:S106")
public class ModernSwitchComputerType {

  @SuppressWarnings({"java:S125"})
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter computer type (smartphone, tablet, laptop, desktop): ");
    String computerType = scanner.nextLine().toLowerCase();

//    switchWithoutReturnValue(computerType);
    switchWithReturnValue(computerType);

    scanner.close();
  }

  @SuppressWarnings("java:S1144")
  private static void switchWithoutReturnValue(String computerType) {
    switch (computerType) {
      case "smartphone" -> System.out.println("Smartphones offer computing power in your hand.");
      case "tablet" -> System.out.println("Tablets are lightweight for browsing and light tasks.");
      case "laptop" -> System.out.println("Laptops are portable for work on the go.");
      case "desktop" -> System.out.println("Desktops excel in gaming and work related tasks.");
      default -> System.out.println("Unknown computer type.");
    }
  }

  private static void switchWithReturnValue(String computerType) {
    String description = switch (computerType) {
      case "smartphone" -> "Smartphones offer computing power in your hand.";
      case "tablet" -> "Tablets are lightweight for browsing and light tasks.";
      case "laptop" -> "Laptops are portable for work on the go.";
      case "desktop" -> "Desktops excel in gaming and work related tasks.";
      default -> "Unknown computer type.";
    };
    System.out.println(description);
  }

}

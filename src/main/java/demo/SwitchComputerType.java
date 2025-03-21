package demo;

import java.util.Scanner;

public class SwitchComputerType {

  @SuppressWarnings("java:S106")
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter computer type (smartphone, tablet, laptop, desktop): ");
    String computerType = scanner.nextLine();
    computerType = computerType.toLowerCase();
    switch (computerType) {
      case "smartphone":
        System.out.println("Smartphones offer computing power in your hand.");
        break;
      case "tablet":
        System.out.println("Tablets are light-weight for browsing and light tasks.");
        break;
      case "laptop":
        System.out.println("Laptops are portable for work on the go.");
        break;
      case "desktop":
        System.out.println("Desktops excel in gaming and work related tasks.");
        break;
      default:
        System.out.println("Unknown computer type.");
    }

    scanner.close();
  }
}

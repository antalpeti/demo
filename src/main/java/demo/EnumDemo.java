package demo;

public class EnumDemo {

  @SuppressWarnings("java:S106")
  public static void main(String[] args) {

    ComputerType computerType = ComputerType.TABLET;

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

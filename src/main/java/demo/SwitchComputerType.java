package demo;

public class SwitchComputerType {

  @SuppressWarnings("java:S106")
  public static void main(String[] args) {
    String computerType = "laptop";

    switch (computerType) {
      case "smartphone":
        System.out.println("Smartphones offer computing power in your hand.");
        break;
      case "tablet":
        System.out.println("Tablets are light-weight for browsing and light tasks.");
        break;
      case "laptop":
        System.out.println("You selected Laptop");
        break;
      case "desktop":
        System.out.println("You selected Desktop");
        break;
      default:
        System.out.println("Unknown computer type.");
    }
  }
}

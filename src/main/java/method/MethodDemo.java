package method;

public class MethodDemo {

  public static void main(String[] args) {
    displayGreetings();
  }

  @SuppressWarnings("java:S106")
  static void displayGreetings() {
    System.out.println("Hello World!");
    System.out.println("Welcome, welcome!");
    System.out.println("Please make yourself at home.");
  }
}

package method;

public class MethodDemo {

  @SuppressWarnings("java:S125")
  public static void main(String[] args) {
    displayGreetings(3);
  }

  @SuppressWarnings("java:S106")
  static void displayGreetings(int count) {
    for (int i = 0; i < count; i++) {
      displayGreetings();

      System.out.println();
    }
  }

  @SuppressWarnings("java:S106")
  static void displayGreetings() {
    System.out.println("Hello World!");
    System.out.println("Welcome, welcome!");
    System.out.println("Please make yourself at home.");
  }
}

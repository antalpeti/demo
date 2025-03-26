package loop;

public class ForLoopDemo {

  public static final String COUNTER = "Counter: ";

  @SuppressWarnings("java:S106")
  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      System.out.println("Hello World!");
    }

    for (int i = 1; i <= 5; i++) {
      System.out.println(COUNTER + i);
    }

    for (int i = 0; i < 20; i = i + 5) {
      System.out.println(COUNTER + i);
    }

    for (int i = 5; i >= 0; i--) {
      System.out.println(COUNTER + i);
    }
  }
}

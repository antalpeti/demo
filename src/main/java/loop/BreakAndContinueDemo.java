package loop;

public class BreakAndContinueDemo {

  @SuppressWarnings("java:S106")
  public static void main(String[] args) {

    for (int i = 1; i <= 10; i++) {
      if (i == 5) {
        System.out.println("Breaking at " + i);
        break;
      }
      System.out.println("Counter: " + i);
    }

    System.out.println();

    for (int i = 1; i <= 10; i++) {
      if (i == 5) {
        System.out.println("Skipping " + i);
        continue;
      }
      System.out.println("Counter: " + i);
    }
  }

}

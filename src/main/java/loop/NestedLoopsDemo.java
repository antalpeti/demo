package loop;

public class NestedLoopsDemo {

  @SuppressWarnings("java:S106")
  public static void main(String[] args) {
    for (int number = 1; number <= 10; number++) {
      for (int row = 1; row <= number; row++) {
        for (int column = 1; column <= number; column++) {
          System.out.print(row * column + "\t");
        }
        System.out.println();
      }
      System.out.println();
    }
  }
}

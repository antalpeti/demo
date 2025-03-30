package loop;

public class NestedLoopsDemo {

  @SuppressWarnings("java:S106")
  public static void main(String[] args) {
    //5x5 multiplication table
    for (int row = 1; row <= 5; row++) {
      for (int column = 1; column <= 5; column++) {
        System.out.print(row * column + "\t");
      }
      System.out.println();
    }
  }
}

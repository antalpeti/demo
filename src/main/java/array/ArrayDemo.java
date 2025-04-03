package array;

public class ArrayDemo {

  @SuppressWarnings("java:S106")
  public static void main(String[] args) {
    String[] colors = {"Red", "Green", "Blue", "Yellow"};

    System.out.println("Contents of the array:");
    System.out.println(colors[0]);
    System.out.println(colors[1]);
    System.out.println(colors[2]);
    System.out.println(colors[3]);

    System.out.println();

    System.out.println("Length of the array: " + colors.length);

    System.out.println();

    System.out.println("Looping through the array - Version 1:");

    for (int i = 0; i < colors.length; i++) {
      System.out.println(colors[i]);
    }

    System.out.println();

    System.out.println("Looping through the array - Version 2:");

    for (String color : colors) {
      System.out.println(color);
    }
  }
}

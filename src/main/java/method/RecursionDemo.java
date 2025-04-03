package method;

public class RecursionDemo {

  @SuppressWarnings("java:S106")
  public static void main(String[] args) {
    int value = 5;
    int result = factorial(value);
    System.out.println("The factorial of " + value + " is " + result);
  }

  static int factorial(int number) {
    if (number == 0 || number == 1) {
      return 1;
    }
    return number * factorial(number - 1);
  }
}

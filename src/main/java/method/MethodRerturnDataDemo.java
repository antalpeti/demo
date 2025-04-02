package method;

public class MethodRerturnDataDemo {

  @SuppressWarnings("java:S106")
  public static void main(String[] args) {
    int value = 5;
    int output = summation(value);
    System.out.println("The summation of " + value + " is " + output);
  }

  static int summation(int number) {
    int result = 0;
    for (int i = 1; i <= number; i++) {
      result += i;
    }
    return result;
  }
}

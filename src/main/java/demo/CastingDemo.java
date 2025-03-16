package demo;

public class CastingDemo {

  @SuppressWarnings("java:S106")
  public static void main(String[] args) {

    // convert double to int
    double theDouble = 123.456;
    int theInt = (int) theDouble;

    System.out.println("The double variable is " + theDouble);
    System.out.println("The int variable is " + theInt);

    // convert float to byte
    float theFloat = 123.456f;
    byte theByte = (byte) theFloat;
    System.out.println("The float variable is " + theFloat);
    System.out.println("The byte variable is " + theByte);

    // convert int to char
    int theInt2 = 65;
    char theChar = (char) theInt2;
    System.out.println("The int variable is " + theInt2);
    System.out.println("The char variable is " + theChar);
  }
}

package demo;

public class PrimitiveDataType {

  @SuppressWarnings({"java:S106", "java:S1192"})
  public static void main(String[] args) {

    // Declare and initialize primitive data types
    byte theByte = 127;
    short theShort = 32767;
    int theInt = 2147483647;
    long theLong = 9223372036854775807L;
    float theFloat = 3.4028235E38f;
    double theDouble = 1.7976931348623157E308;
    char theChar = 'A';
    boolean theBoolean = true;

    // Display the values of the primitive data types
    System.out.println("The byte value is " + theByte);
    System.out.println("The short value is " + theShort);
    System.out.println("The int value is " + theInt);
    System.out.println("The long value is " + theLong);
    System.out.println("The float value is " + theFloat);
    System.out.println("The double value is " + theDouble);
    System.out.println("The char value is " + theChar);
    System.out.println("The boolean value is " + theBoolean);

    // Display the minimum and maximum values of the primitive data type
    System.out.println("byte: min value = " + Byte.MIN_VALUE + ", max value = " + Byte.MAX_VALUE);
    System.out.println("short: min value = " + Short.MIN_VALUE + ", max value = " + Short.MAX_VALUE);
    System.out.println("int: min value = " + Integer.MIN_VALUE + ", max value = " + Integer.MAX_VALUE);
    System.out.println("long: min value = " + Long.MIN_VALUE + ", max value = " + Long.MAX_VALUE);
    System.out.println("float: min value = " + Float.MIN_VALUE + ", max value = " + Float.MAX_VALUE);
    System.out.println("double: min value = " + Double.MIN_VALUE + ", max value = " + Double.MAX_VALUE);
    System.out.println("char: min value = " + (int) Character.MIN_VALUE + ", max value = " + (int) Character.MAX_VALUE);
    System.out.println("boolean: no min or max value");

    float interestRate = 7.95f;
    double prizeWinning = 9982342452.45;
    System.out.println("Interest Rate: " + interestRate);
    System.out.println("Prize Winning: " + prizeWinning);
    String formattedInterestRate = String.format("%.2f", interestRate);
    System.out.println("Formatted Interest Rate: " + formattedInterestRate);
    String formattedPrizeWinning = String.format("%.2f", prizeWinning);
    System.out.println("Formatted Prize Winning: " + formattedPrizeWinning);

    char stage = 'Q';
    boolean alive = true;
    boolean found = false;

    System.out.println("Stage: " + stage);
    System.out.println("Alive: " + alive);
    System.out.println("Found: " + found);

    double gradeExam1 = 87.5;
    double gradeExam2 = 100.0;
    double gradeExam3 = 66.50;

    double averageGrade = (gradeExam1 + gradeExam2 + gradeExam3) / 3;
    System.out.println("Exam 1 Grade: " + gradeExam1);
    System.out.println("Exam 2 Grade: " + gradeExam2);
    System.out.println("Exam 3 Grade: " + gradeExam3);
    System.out.println("Average Grade: " + averageGrade);
    String formattedAverageGrade = String.format("%.2f", averageGrade);
    System.out.println("Formatted Average Grade: " + formattedAverageGrade);

  }
}

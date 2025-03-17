package demo;

public class CastingDemo {

  @SuppressWarnings("java:S106")
  public static void main(String[] args) {

    // convert double to int
    double theDoubleGradeAvg = 123.456;
    int theIntGradeAvg = (int) theDoubleGradeAvg;

    System.out.println("theDoubleGradeAvg=" + theDoubleGradeAvg);
    System.out.println("theIntGradeAvg=" + theIntGradeAvg);

    // convert float to byte
    float theFloatDistance = 123.456f;
    byte theByteDistance = (byte) theFloatDistance;
    System.out.println("theFloatDistance=" + theFloatDistance);
    System.out.println("theByteDistance=" + theByteDistance);

    // convert int to char
    int theCharacterCode = 65;
    char theChar = (char) theCharacterCode;
    System.out.println("theCharacterCode=" + theCharacterCode);
    System.out.println("theChar=" + theChar);

    //convert String to int
    String theStringCount = "123";
    int theIntCount = Integer.parseInt(theStringCount);
    System.out.println("theStringCount=" + theStringCount);
    System.out.println("theIntCount=" + theIntCount);
  }
}

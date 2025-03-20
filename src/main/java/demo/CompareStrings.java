package demo;

public class CompareStrings {

  @SuppressWarnings({"java:S106", "java:S4973", "java:S2129", "java:S1192"})
  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = "Hello";
    boolean result1 = (s1 == s2);

    System.out.println("s1: " + s1);
    System.out.println("s2: " + s2);
    System.out.println("s1 == s2: " + result1);
    System.out.println();

    String s3 = new String("Hello");
    boolean result2 = (s1 == s3);

    System.out.println("s1: " + s1);
    System.out.println("s3: " + s3);
    System.out.println("s1 == s3: " + result2);
    System.out.println();

    System.out.println("s3: " + s3);
    boolean result3 = s1.equals(s3);
    System.out.println("s1.equals(s3): " + result3);
    System.out.println();

    String s4 = "hello";
    boolean result4 = s3.equalsIgnoreCase(s4);
    System.out.println("s4: " + s4);
    System.out.println("s3.equalsIgnoreCase(s4): " + result4);
    System.out.println();
  }
}

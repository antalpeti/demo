package demo;

public class Demo {

  @SuppressWarnings("all")
  public static void main(String[] args) {
    var message1 = "Hello World!";
    var message2 = "Hello World of Java!";
    var message3 = "Hello World Again!";
    System.out.println(message1);
    System.out.println(message2);
    System.out.println(message3);
    var extra = "I love to code!";
    System.out.println(message1 + " " + extra);

    System.out.println("Length of " + message1 + " is " + message1.length());
    System.out.println("Upper case version of " + message1 + " is " + message1.toUpperCase());
    System.out.println("Lower case version of " + message1 + " is " + message1.toLowerCase());
  }

}

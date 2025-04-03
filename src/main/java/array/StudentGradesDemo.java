package array;

import java.util.Scanner;

public class StudentGradesDemo {

  @SuppressWarnings("java:S106")
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("How many grades do you want to enter? ");
    int numberOfGrades = scanner.nextInt();

    System.out.println();
    double[] userInputGrades = new double[numberOfGrades];

    for (int i = 0; i < userInputGrades.length; i++) {
      System.out.print("Enter grade number " + (i + 1) + ": ");
      userInputGrades[i] = scanner.nextDouble();
    }

    System.out.println();

    for (double userInputGrade : userInputGrades) {
      System.out.println(userInputGrade);
    }

    scanner.close();
  }

}

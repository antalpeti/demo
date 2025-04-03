package array;

import java.util.Scanner;

public class ComputeGradeAverageDemo {

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

    System.out.println();

    double gradeAverage = computeGradeAverage(userInputGrades);
    System.out.println("Grade average: " + gradeAverage);

    scanner.close();
  }

  private static double computeGradeAverage(double[] userInputGrades) {
    double sum = 0;
    for (double userInputGrade : userInputGrades) {
      sum += userInputGrade;
    }

    return sum / userInputGrades.length;
  }

}

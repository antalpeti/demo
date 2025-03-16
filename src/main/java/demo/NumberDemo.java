package demo;

import java.util.Scanner;

public class NumberDemo {

  @SuppressWarnings("java:S106")
  public static void main(String[] args) {
    double gradeExam1 = 87.5;
    double gradeExam2 = 100.0;
    double gradeExam3 = 66.50;

    double gradeAverage = (gradeExam1 + gradeExam2 + gradeExam3) / 3;
    System.out.println("Grade exam 1: " + gradeExam1);
    System.out.println("Grade exam 2: " + gradeExam2);
    System.out.println("Grade exam 3: " + gradeExam3);
    System.out.println("Grade average: " + gradeAverage);

    String formattedGradeAverage = String.format("%.2f", gradeAverage);
    System.out.println("Formatted Grade Average: " + formattedGradeAverage);

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter grade exam 1: ");
    double gradeExam1Input = scanner.nextDouble();
    System.out.print("Enter grade exam 2: ");
    double gradeExam2Input = scanner.nextDouble();
    System.out.print("Enter grade exam 3: ");
    double gradeExam3Input = scanner.nextDouble();

    double gradeAverageInput = (gradeExam1Input + gradeExam2Input + gradeExam3Input) / 3;
    System.out.println("Grade exam 1: " + gradeExam1Input);
    System.out.println("Grade exam 2: " + gradeExam2Input);
    System.out.println("Grade exam 3: " + gradeExam3Input);
    System.out.println("Grade average: " + gradeAverageInput);
    System.out.println("Formatted Grade Average: " + String.format("%.2f", gradeAverageInput));

    scanner.close();
  }
}

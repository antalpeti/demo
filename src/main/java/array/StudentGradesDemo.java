package array;

public class StudentGradesDemo {

  @SuppressWarnings("java:S106")
  public static void main(String[] args) {
    double[] grades = new double[3];

    grades[0] = 85.5;
    grades[1] = 90.0;
    grades[2] = 78.5;

    System.out.println("Contents of the array:");
    for (double grade : grades) {
      System.out.println(grade);
    }
  }

}

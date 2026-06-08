import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        double[] grades = new double[n];

        double total = 0;
        int passCount = 0;
        int failCount = 0;

        for (int i = 0; i < n; i++) {

            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter Name: ");
            names[i] = sc.nextLine();

            System.out.print("Enter Grade: ");
            grades[i] = sc.nextDouble();
            sc.nextLine();

            total += grades[i];

            if (grades[i] >= 35) {
                passCount++;
            } else {
                failCount++;
            }
        }

        double highest = grades[0];
        double lowest = grades[0];
        String topper = names[0];

        for (int i = 1; i < n; i++) {

            if (grades[i] > highest) {
                highest = grades[i];
                topper = names[i];
            }

            if (grades[i] < lowest) {
                lowest = grades[i];
            }
        }

        double average = total / n;

        System.out.println("\n===== STUDENT REPORT =====");

        for (int i = 0; i < n; i++) {

            String grade;

            if (grades[i] >= 90) {
                grade = "A";
            } else if (grades[i] >= 80) {
                grade = "B";
            } else if (grades[i] >= 70) {
                grade = "C";
            } else if (grades[i] >= 35) {
                grade = "D";
            } else {
                grade = "F";
            }

            System.out.println(names[i] + " : " + grades[i] + " | Grade " + grade);
        }

        System.out.println("\nAverage Score : " + average);
        System.out.println("Highest Score : " + highest);
        System.out.println("Lowest Score  : " + lowest);
        System.out.println("Topper        : " + topper);
        System.out.println("Pass Students : " + passCount);
        System.out.println("Fail Students : " + failCount);

        sc.close();
    }
}
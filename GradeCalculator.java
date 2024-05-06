import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks obtained in each subject (out of 100):");
        int totalMarks = 0;
        int noOfSubjects;
        do {
            System.out.print("Enter the number of subjects: ");
            noOfSubjects = sc.nextInt();
        } while (noOfSubjects <= 0);

        int[] marks = new int[noOfSubjects];
        for (int i = 0; i < noOfSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            totalMarks += marks[i];
        }

        double averagePercentage = (double) totalMarks / noOfSubjects;

        char g;
        if (averagePercentage >= 90 && averagePercentage<=100) {
            g = 'A';
        } else if (averagePercentage >= 80 && averagePercentage <90) {
            g = 'B';
        } else if (averagePercentage >= 70 && averagePercentage <80) {
            g = 'C';
        } else if (averagePercentage >= 60 && averagePercentage <70) {
            g = 'D';
        } else if (averagePercentage >= 50 && averagePercentage <60) {
            g = 'E';
        } else {
            g = 'F';
        }

        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage);
        System.out.println("Grade: " + g);

        sc.close();
    }
}

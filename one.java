import java.util.Scanner;

public class one {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String studentName;
        int subjectCount;
        int totalMarks = 0;
        double averageMarks;

        System.out.print("Enter student name: ");
        studentName = input.nextLine();

        System.out.print("Enter number of subjects: ");
        subjectCount = input.nextInt();

        for (int i = 1; i <= subjectCount; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = input.nextInt();
            totalMarks = totalMarks + marks;
        }

        averageMarks = (double) totalMarks / subjectCount;

        System.out.println("Student Name: " + studentName);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);

        input.close();
    }
}
import java.util.Scanner;

public class StudentTotalMarks {

    public static void main(String[] args) {
        // Input details for 5 students
        Student[] students = new Student[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            students[i] = inputStudentDetails();
        }

        // Display total marks for each student
        System.out.println("\nTotal Marks for Each Student:");
        for (Student student : students) {
            System.out.println(student.getName() + " (Register Number: " + student.getRegisterNumber() +
                    ") - Total Marks: " + student.calculateTotalMarks());
        }
    }

    private static Student inputStudentDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter register number: ");
        int registerNumber = scanner.nextInt();

        System.out.print("Enter mark 1: ");
        int mark1 = scanner.nextInt();

        System.out.print("Enter mark 2: ");
        int mark2 = scanner.nextInt();

        System.out.print("Enter mark 3: ");
        int mark3 = scanner.nextInt();

        return new Student(name, registerNumber, mark1, mark2, mark3);
    }
}

class Student {
    private String name;
    private int registerNumber;
    private int mark1;
    private int mark2;
    private int mark3;

    public Student(String name, int registerNumber, int mark1, int mark2, int mark3) {
        this.name = name;
        this.registerNumber = registerNumber;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public String getName() {
        return name;
    }

    public int getRegisterNumber() {
        return registerNumber;
    }

    public int calculateTotalMarks() {
        return mark1 + mark2 + mark3;
    }
}

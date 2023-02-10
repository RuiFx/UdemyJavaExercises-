import Entities.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Enter the student name:");
        student.name = sc.nextLine();

        System.out.print("Enter the grade (0 to 35) of first quarter: ");
        student.firstQuarter = sc.nextDouble();

        System.out.print("Enter the grade (0 to 35) of second quarter: ");
        student.secondQuarter = sc.nextDouble();

        System.out.print("Enter the grade (0 to 30) of third quarter: ");
        student.thirdQuarter = sc.nextDouble();

        student.FinalGrade();
        student.Qualification();

        sc.close();
    }
}
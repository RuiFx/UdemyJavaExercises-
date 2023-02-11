package Evaluation;

import Evaluation.Enteties.Students;

import java.util.Scanner;

public class Evaluation {
    public static void main(String[] args) {

        String name;
        double firstGrade, secondGrade;

        Scanner sc = new Scanner(System.in);

        System.out.println("How many students you want to enter?");
        int n = sc.nextInt();

        Students[] students = new Students[n];

        for (int i = 0; i < students.length; i++){
            System.out.println("Enter the name, first and second grade of " + (i+1) + " student");
            sc.nextLine();
            name = sc.nextLine();
            firstGrade = sc.nextDouble();
            secondGrade = sc.nextDouble();
            students[i] = new Students(name, firstGrade, secondGrade);
        }

        System.out.println("Approved students: ");

        for (int i =0; i<students.length; i++){
            if(students[i].getAverageGrade() >= 6.0){
                System.out.printf("%s%n",students[i].getName());
            }
        }
    }
}

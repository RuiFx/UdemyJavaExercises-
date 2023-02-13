package PersonalData;

import PersonalData.Enteties.Person;

import java.util.Scanner;

public class PersonalData {
    public static void main(String[] args) {

        char gender;
        double height, taller, shorter, sumFemaleHeight, femaleAverageHeight;
        int numberMans, numberWomen;

        Scanner sc = new Scanner(System.in);

        System.out.println("How many persons you want to register?");

        int n = sc.nextInt();

        Person[] persons = new Person[n];

        System.out.println("Enter the gender an height ");

        for (int i = 0; i < persons.length; i++) {
            System.out.printf("Enter the gender an height of person %d: %n", i + 1);
            System.out.printf("Height: ");
            height = sc.nextDouble();
            System.out.print("Gender: ");
            gender = sc.next().charAt(0);
            persons[i] = new Person(gender, height);
        }

        shorter = persons[0].getHeight();
        taller = persons[0].getHeight();

        for (int i = 1; i < persons.length; i++) {
            if (persons[i].getHeight() < shorter) {
                shorter = persons[i].getHeight();
            }
            if (persons[i].getHeight() > taller) {
                taller = persons[i].getHeight();
            }
        }

        sumFemaleHeight = 0.00;
        femaleAverageHeight = 0.00;
        numberWomen = 0;
        numberMans = 0;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getGender() == 'F') {
                numberWomen++;
                numberMans = persons.length - numberWomen;
                sumFemaleHeight += persons[i].getHeight();
                femaleAverageHeight = sumFemaleHeight / numberWomen;
            }
        }
        System.out.printf("The shorter have: %.2fmt%n", shorter);
        System.out.printf("The taller have: %.2fmt%n", taller);
        System.out.printf("Average female height: %.2fmt%n", femaleAverageHeight);
        System.out.printf("This list have %d mans.", numberMans);
    }
}

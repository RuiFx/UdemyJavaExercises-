package Heights;

import Heights.Enteties.Person;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String name;
        int age, underSixteenPersons;
        double height, avgHeight, percentageUnderSixteen;
        Person person = new Person();

        Scanner sc = new Scanner(System.in);
        System.out.println("How many persons you want to register? ");

        int n = sc.nextInt();

        Person[] personsList = new Person[n];


        for (int i = 0; i < personsList.length; i++) {
            System.out.print("Enter the name: ");
            name = sc.next();
            System.out.print("Enter the age: ");
            age = sc.nextInt();
            System.out.print("Enter the height: ");
            height = sc.nextDouble();
            personsList[i] = new Person(name, age, height);
        }

        avgHeight = 0.0;
        for (int i = 0; i < personsList.length; i++) {
            avgHeight += personsList[i].getHeight() / personsList.length;
        }
        System.out.printf("The average height is %.2f mt%n", avgHeight);

        underSixteenPersons = 0;
        percentageUnderSixteen = 0.00;

        for (int i = 0; i < personsList.length;++i){
            if (personsList[i].getAge() < 16){
                underSixteenPersons ++;
            }
            percentageUnderSixteen = (double)underSixteenPersons * 100 / personsList.length;
        }

        System.out.printf("Percentage of kids under 16yo: %.1f%s%n", percentageUnderSixteen, "\u0025");

        System.out.print("Kids under 16yo: ");

        for (int i = 0; i < personsList.length;++i){
            if (personsList[i].getAge() < 16){
                    System.out.printf("%s%n", personsList[i].getName());
            }
        }

        sc.close();
    }
}

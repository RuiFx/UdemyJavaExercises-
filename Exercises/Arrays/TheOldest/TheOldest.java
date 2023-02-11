package TheOldest;

import TheOldest.Enteties.Person;

import java.util.Scanner;

public class TheOldest {
    public static void main(String[] args) {

        String name;
        int age, oldestAge, oldestPosition;
        Scanner sc = new Scanner(System.in);

        System.out.println("How many elements will have your array?");

        int n = sc.nextInt();
        Person[] personsList = new Person[n];

        for (int i = 0 ; i < personsList.length; i++){
            System.out.println("Enter the info of " + (i + 1) + " person");
            System.out.print("Name: ");
            name = sc.next();
            System.out.print("Age: ");
            age = sc.nextInt();
            personsList[i] = new Person(name, age);
        }

        oldestAge = personsList[0].getAge();
        oldestPosition = 0;
        for (int i = 0; i< personsList.length; i++){
            if (personsList[i].getAge() > oldestAge){
                oldestAge = personsList[i].getAge();
                oldestPosition = i;
            }
        }

        System.out.printf("The oldest is %s", personsList[oldestPosition].getName());
        sc.close();
    }
}

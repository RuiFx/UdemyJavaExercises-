import Enteties.Students;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name, email;
        int roomID;
        Scanner sc = new Scanner(System.in);

        Students[] rent = new Students[10];

        System.out.println("How many rooms will be rented?");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            name = sc.nextLine();
            System.out.print("e-mail: ");
            email=sc.next();
            System.out.print("Room: ");
            roomID = sc.nextInt();
            rent[roomID-1] = new Students(name, email); //Register at array index eg: room 1 = arrayIndex = 0
        }

        System.out.println("Busy rooms:");
        for (int i =0 ; i< 10; i++){
            if (rent[i] != null) {
                System.out.printf("%d: %s, %s%n", i+1, rent[i].getName(), rent[i].getEmail()); //Read at array index eg: arrayIndex 0 = room = 1
            }
        }

        sc.close();
    }
}
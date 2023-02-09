package BasicFunctionsJava;

import java.util.Scanner;

public class SplitFunction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Insert your full name: ");
        String fullName = sc.nextLine();

        String[] names = fullName.split(" ");

        String firstName = names[0];
        String lastName = names[names.length - 1];
        System.out.printf("Hi %s %s", firstName, lastName);
    }
}

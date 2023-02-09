package RepetitiveStructure;

import java.util.Scanner;

public class whileStructure {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insert numbers to sum...\nWhen you finish, insert zero!");

        int number = sc.nextInt();
        int sum = 0;

        while (number != 0){
            sum += number;
            number = sc.nextInt();
        }
        System.out.printf("And the sum of the numbers that you insert are %d", sum);

        sc.close();
    }
}

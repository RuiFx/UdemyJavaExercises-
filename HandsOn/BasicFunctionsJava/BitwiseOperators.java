package BasicFunctionsJava;

import java.util.Scanner;

public class BitwiseOperators {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insert the number to compare bit at bit: ");

        int x = sc.nextInt();
        int mask = 0b100000;

        if ((x & mask) != 0 ){
            System.out.println("The 6th bit is true!");
        } else {
            System.out.println("The 6th bit is false");
        }

        sc.close();
    }
}

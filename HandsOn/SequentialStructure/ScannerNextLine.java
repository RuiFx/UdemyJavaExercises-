package SequentialStructure;

import java.util.Scanner;

public class ScannerNextLine {
    public static void main(String[] args) {

        System.out.println("Let's try the nextLine()\nWrite something:");
        Scanner sc = new Scanner(System.in);

        int number;
        String word1, word2, word3;

        number = sc.nextInt(); //ATENTION: Word1 will assume line break after enter when you insert number, to solve the problem, you need to put a sc.nextLine() after nextInt
        sc.nextLine();
        word1 = sc.nextLine();
        word2 = sc.nextLine();
        word3 = sc.nextLine();

        System.out.println("You wrote: \n"
                + number + " "
                + word1 + " "
                + word2 + " "
                + word3);

        sc.close();
    }
}

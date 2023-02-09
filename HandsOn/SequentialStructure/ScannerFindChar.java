package SequentialStructure;

import java.util.Scanner;

public class ScannerFindChar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Let's know what is your name's first letter" + "\nWhat's your name? ");

        char scannerFindLetter;
        scannerFindLetter = sc.next().charAt(0);

        System.out.println("The first letter of your name is " + scannerFindLetter);

        sc.close();
    }
}

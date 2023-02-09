package SequentialStructure;

public class ScannerString {
    public static void main(String[] args) {

        System.out.println("Let's try the scanner function" + "\nWrite something: ");

        java.util.Scanner sc = new java.util.Scanner(System.in);

        String scannerString;
        scannerString = sc.next();

        System.out.println("You wrote " + scannerString);

        sc.close();
    }
}

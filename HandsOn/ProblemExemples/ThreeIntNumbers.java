package ProblemExemples;

import java.util.Scanner;

public class ThreeIntNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insert 3 numbers: ");

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int higher = max(n1, n2, n3);

        ShowResult(higher);
        sc.close();
    }

    public static int max(int a, int b, int c) {
        int aux;
        if (a > b && a > c) {
            aux = a;
        } else if (b > c) {
            aux = b;
        } else {
            aux = c;
        }
        return aux;
    }

    public static void ShowResult(int value){
        System.out.printf("The higher is %d%n", value);
    }
}

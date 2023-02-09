import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        System.out.println("Insert the number to sum:");
        Scanner scInt = new Scanner(System.in);

        int n1, n2, result;
        n1 = scInt.nextInt();
        scInt.nextLine();
        n2 = scInt.nextInt();
        result = n1+n2;

        System.out.println(n1 + "+" + n2 + "=" + result);

        scInt.close();

    }
}
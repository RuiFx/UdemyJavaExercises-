import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        System.out.println("Insert four numbers\nIt will be calculated the difference between the first plus second and third plus fourth");

        Scanner numbers = new Scanner(System.in);

        double n1, n2, n3, n4, result;
        n1 = numbers.nextInt();
        numbers.nextLine();
        n2 = numbers.nextInt();
        numbers.nextLine();
        n3 = numbers.nextInt();
        numbers.nextLine();
        n4 = numbers.nextInt();

        result = (n1*n2)-(n3*n4);
        System.out.println("The result is " + result);

        numbers.close();
    }
}

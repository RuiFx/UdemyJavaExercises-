import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {

        System.out.println("Insert tree numbers");

        double n1, n2, n3, pi, triangle, circle, trapezoid, square, rectangle;

        Scanner numbers = new Scanner(System.in);

        n1 = numbers.nextDouble();
        numbers.nextLine();
        n2 = numbers.nextDouble();
        numbers.nextLine();
        n3 = numbers.nextDouble();
        numbers.nextLine();
        pi = 3.14159;

        triangle = (n1 * n3) / 2;
        circle = pi * Math.pow(n3, 2);
        trapezoid = ((n1 + n2) * n3) / 2;
        square = Math.pow(n2, n2);
        rectangle = n1 * n2;

        System.out.println("With this numbers, was calculated the next areas:");
        System.out.printf("%nTriangle: %.3f", triangle);
        System.out.printf("%nCircle: %.3f", circle);
        System.out.printf("%nTrapezoid: %.3f", trapezoid);
        System.out.printf("%nSquare: %.3f", square);
        System.out.printf("%nRectangle: %.3f", rectangle);

        numbers.close();
    }
}

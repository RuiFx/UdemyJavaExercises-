import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        System.out.println("Insert the radius of your circle:");

        Scanner radius = new Scanner(System.in);

        double r, pi, cArea;
        r = radius.nextDouble();
        pi = 3.14159;
        cArea = pi * Math.pow(r, 2);

        System.out.println("The formula for calculate the circle area is: a=\u03C0.r2\nThe area of your circle is " + cArea);

        radius.close();
    }
}

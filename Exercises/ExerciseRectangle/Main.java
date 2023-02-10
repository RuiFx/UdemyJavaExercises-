import Entities.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter the width and height of your rectangle");

        System.out.print("Width: ");
        rectangle.width = sc.nextDouble();

        System.out.print("Height: ");
        rectangle.height = sc.nextDouble();

        rectangle.Area();
        rectangle.Perimeter();
        rectangle.Diagonal();

        sc.close();
    }
}
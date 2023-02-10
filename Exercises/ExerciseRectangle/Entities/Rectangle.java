package Entities;

public class Rectangle {

    public double width;
    public double height;

    public double Area() {
        double area = width * height;
        System.out.printf("The area of your rectangle is %.2fcm\u00B2%n", area);
        return area;
    }

    public double Perimeter() {
        double perimeter = (width * 2) + (height * 2);
        System.out.printf("The perimeter of your rectangle is %.2fcm%n", perimeter);
        return perimeter;
    }

    public double Diagonal() {
        double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
        System.out.printf("The diagonal of your rectangle is %.2fcm%n", diagonal);
        return diagonal;
    }
}

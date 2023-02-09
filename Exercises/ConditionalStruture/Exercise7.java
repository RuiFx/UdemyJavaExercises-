import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {

        double x;
        double y;

        Scanner sc = new Scanner(System.in);

        System.out.println("Insert X coordinate");
        x = sc.nextDouble();

        sc.nextLine();
        System.out.println("Insert Y coordinate");
        y = sc.nextDouble();

        if (x == 0.0 && y == 0.0) {
            System.out.println("You're in origin!");
        } else if (x == 0) {
            System.out.println("You're on X axis!");
        } else if (y == 0){
            System.out.println("you're on Y axis");
        } else if (x > 0 && y > 0){
            System.out.println("You're in first quarter!");
        } else if (x < 0 && y > 0){
            System.out.println("You're in second quarter!");
        } else if (x < 0 && y < 0){
            System.out.println("You're in third quarter!");
        } else {
            System.out.println("You're in fourth quarter!");
        }
    }
}

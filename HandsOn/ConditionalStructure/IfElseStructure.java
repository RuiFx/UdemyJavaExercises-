package ConditionalStructure;

import java.util.Scanner;

public class IfElseStructure {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int hora;

        System.out.println("What time is it?");
        hora = sc.nextInt();

        if(hora >= 12 && hora <= 19) {
            System.out.println("Good afternoon");
        } else if (hora < 7 || hora > 19 ) {
            System.out.println("Good evening");
        } else {
            System.out.println("Good morning");
        }

        sc.close();
    }
}

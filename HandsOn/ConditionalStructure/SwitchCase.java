package ConditionalStructure;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the number of the weekday");

        int day = sc.nextInt();
        String weekDay;

        switch (day){
            case 1:
                weekDay = "Sunday";
                break;
            case 2:
                weekDay = "Monday";
                break;
            case 3:
                weekDay = "Thursday";
                break;
            case 4:
                weekDay = "Wednesday";
                break;
            case 5:
                weekDay = "Tuesday";
                break;
            case 6:
                weekDay = "Friday";
                break;
            case 7:
                weekDay = "Saturday";
                break;
            default:
                weekDay = "No day have that number";
        }
        System.out.printf("You are on %s", weekDay);

        sc.close();
    }
}

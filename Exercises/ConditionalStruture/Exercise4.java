import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int start, end, duration;
        String hour;

        start = sc.nextInt();
        end = sc.nextInt();

        if (!((start < 0 || start > 23) || (end < 0 || end > 23))) {
            if (start < end) {
                duration = end - start;
                if (duration == 1) {
                    hour = "hour";
                } else {
                    hour = "hours";
                }
                System.out.println("You played for " + duration + " " + hour);
            } else if (end < start) {
                duration = end - start + 24;
                if (duration == 1) {
                    hour = "hour";
                } else {
                    hour = "hours";
                }
                System.out.println("You played for " + duration + " " + hour);
            } else {
                System.out.println("You played for 24 hours");
            }
        } else {
            System.out.println("Your START and END time should be higher than 0 and less than 23");
        }
    }
}

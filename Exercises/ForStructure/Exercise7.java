import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insert the number to count and calculate each power");

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int a = i;
            int b = i * i;
            int c = i * i * i;
            System.out.println(a + " | " + b + " | " + c);
        }
        sc.close();
    }
}

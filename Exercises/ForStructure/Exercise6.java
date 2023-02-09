import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insert the number to know is divisors");
        int n = sc.nextInt();

        System.out.printf("The divisors of %d are: %n", n);
        for (int i = 1; i <= n; i++){
            if (n%i == 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}

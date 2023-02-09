import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a number between 1 and 1000 and I'll show you only the odd numbers");

        int n = sc.nextInt();

        for (int i = 0; i <= n; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
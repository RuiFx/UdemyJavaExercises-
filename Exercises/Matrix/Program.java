import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of lines of your matrix: ");
        int ln = sc.nextInt();

        System.out.print("Enter the number of columns of your matrix: ");
        int col = sc.nextInt();

        int[][] matrix = new int[ln][col];

        System.out.println("Enter the values of your matrix");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("### Let's find your number ###");

        System.out.print("Enter the number to localize: ");

        int number = sc.nextInt();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == number) {

                    System.out.printf("%nThe number %d is on Line [%d] and Column [%d]%n", number, i, j);


                    if (j < matrix[i].length - 1) {
                        System.out.printf("At right of %d is %d%n", number, matrix[i][j + 1]);
                    }
                    if (j > 0) {
                        System.out.printf("At left of %d is %d%n", number, matrix[i][j - 1]);
                    }
                    if (i < matrix.length-1) {
                        System.out.printf("At bottom of %d is %d%n", number, matrix[i + 1][j]);
                    }
                    if (i > 0) {
                        System.out.printf("Over the %d is %d%n", number, matrix[i - 1][j]);
                    }
                }
            }
        }

        sc.close();

    }
}
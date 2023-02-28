
import java.util.Scanner;

public class NumberTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d x %d = %d%n", n, i, n * i);
        }
    }
}

import java.util.Scanner;

public class SeedNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        scanner.close();
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit == 0 || n % digit != 0) {
                System.out.println(n + " is not a seed number.");
                return;
            }
            temp /= 10;
        }
        System.out.println(n + " is a seed number.");
    }
}

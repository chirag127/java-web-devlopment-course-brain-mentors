import java.util.Scanner;

public class LuckyNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        scanner.close();
        int sumOfSquares = 0;
        int digitPosition = 0;
        int temp = n;
        while (temp > 0) {
            digitPosition++;
            int digit = temp % 10;
            temp /= 10;
            if (digitPosition % 2 == 0) {
                sumOfSquares += digit * digit;
            }
        }
        if (sumOfSquares % 9 == 0) {
            System.out.println(n + " is a lucky number.");
        } else {
            System.out.println(n + " is not a lucky number.");
        }
    }
}

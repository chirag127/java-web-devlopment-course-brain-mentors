import java.util.Scanner;

public class DivisibleByDigitSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        scanner.close();
        int digitSum = 0;
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            digitSum += digit;
            temp /= 10;
        }
        if (digitSum == 0) {
            System.out.println("The sum of digits is 0. Cannot perform division.");
        } else if (n % digitSum == 0) {
            System.out.println(n + " is divisible by the sum of its digits.");
        } else {
            System.out.println(n + " is not divisible by the sum of its digits.");
        }

    }

}

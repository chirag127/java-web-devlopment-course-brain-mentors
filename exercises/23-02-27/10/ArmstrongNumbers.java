import java.util.Scanner;

public class ArmstrongNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int numDigits = (int) Math.log10(i) + 1;
            int temp = i;
            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, numDigits);
                temp /= 10;
            }
            if (sum == i) {
                System.out.println(i + " is an Armstrong number.");
            }
        }
    }
}


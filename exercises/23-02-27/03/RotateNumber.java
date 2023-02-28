import java.util.Scanner;

public class RotateNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        System.out.print("Enter the number of digits to rotate: ");
        int k = scanner.nextInt();
        scanner.close();
        int numDigits = (int) Math.log10(n) + 1;
        k %= numDigits;
        int factor = (int) Math.pow(10, k);
        int rotatedNum = n / factor + (n % factor) * (int) Math.pow(10, numDigits - k);
        System.out.println("The rotated number is: " + rotatedNum);
    }
}

import java.util.Scanner;

public class PrintDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int num = scanner.nextInt();

        int temp = num;

        while (temp > 0) {

            int digit = temp % 10;

            System.out.println(digit);

            temp /= 10;

        }

    }

}


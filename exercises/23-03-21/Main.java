import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please select your language");

        System.out.println("1. हिंदी \n2. English");
        int choice = scanner.nextInt();

        Locale locale = Locale.US;
        if (choice == 1) {
            locale = new Locale("hi", "IN");
        }
        else if (choice == 2) {
            locale = Locale.US;
        }
        else {
            System.out.println("Invalid choice");
            System.exit(0);
        }

        ResourceBundle bundle = ResourceBundle.getBundle("Messages", locale);

        System.out.println(bundle.getString("messageToCreateNewEmployee"));
        System.out.println(bundle.getString("enterTheId"));


        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println(bundle.getString("askName"));
        String name = scanner.nextLine();

        System.out.println(bundle.getString("askBaseSalary"));
        double baseSalary = scanner.nextDouble();

        Employee employee = new Employee(id, name, baseSalary, locale);
        employee.printDetails();

        scanner.close();
    }
}
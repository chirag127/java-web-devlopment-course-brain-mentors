import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.ResourceBundle;

public class Employee {
    private double baseSalary;
    private String name;
    private String joinDate;
    private int id;
    private double netSalary;
    private Locale locale;

    private void updateNetSalary() {
        NetSalary netSalaryCalculator = new NetSalary();
        this.netSalary = netSalaryCalculator.computeNetSalary(baseSalary);
    }

    private void setJoiningDate() {
        ResourceBundle bundle = ResourceBundle.getBundle("config", Locale.US);
        String dateFormat = bundle.getString("dateFormat");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(dateFormat);
        LocalDateTime now = LocalDateTime.now();
        this.joinDate = dtf.format(now);
    }

    Employee(int id, String name, double baseSalary, Locale locale) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
        this.locale = locale;
        updateNetSalary();
        setJoiningDate();
    }

    public String getName() {
        return name;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
        updateNetSalary();
    }

    public void printDetails() {
        ResourceBundle bundle = ResourceBundle.getBundle("Messages", locale);

        System.out.println(bundle.getString("id") + ": " + id);
        System.out.println(bundle.getString("name") + ": " + name);
        System.out.println(bundle.getString("joiningDate") + ": " + joinDate);

        NumberFormat formatter = NumberFormat.getCurrencyInstance(this.locale);
        String currency = formatter.format(this.netSalary);
        System.out.println(bundle.getString("netSalary") + ": " + currency);
    }
}
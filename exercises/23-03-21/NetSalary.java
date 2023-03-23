import java.util.Locale;
import java.util.ResourceBundle;
public class NetSalary {
    public double computeNetSalary(Double salary) {
        double netSalary = salary;
        ResourceBundle bundle = ResourceBundle.getBundle("config", Locale.US);


        String houseRentAllowance = bundle.getString("houseRentAllowance");
        String dearnessAllowance = bundle.getString("dearnessAllowance");
        String entertainmentAllowance = bundle.getString("entertainmentAllowance");
        String medicalAllowance = bundle.getString("medicalAllowance");
        String employeesProvidentFund = bundle.getString("providentFund");


        houseRentAllowance = houseRentAllowance.substring(0, houseRentAllowance.length() - 1);
        dearnessAllowance = dearnessAllowance.substring(0, dearnessAllowance.length() - 1);
        entertainmentAllowance = entertainmentAllowance.substring(0, entertainmentAllowance.length() - 1);
        medicalAllowance = medicalAllowance.substring(0, medicalAllowance.length() - 1);
        employeesProvidentFund = employeesProvidentFund.substring(0, employeesProvidentFund.length() - 1);

        int houseRentAllowancePercent = Integer.parseInt(houseRentAllowance);
        int dearnessAllowancePercent = Integer.parseInt(dearnessAllowance);
        int entertainmentAllowancePercent = Integer.parseInt(entertainmentAllowance);
        int medicalAllowancePercent = Integer.parseInt(medicalAllowance);
        int employeesProvidentFundPercent = Integer.parseInt(employeesProvidentFund);



        houseRentAllowance = (int) (salary * houseRentAllowancePercent / 100.0);

        dearnessAllowance = (int) (salary * dearnessAllowancePercent / 100.0);

        entertainmentAllowance = (int) (salary * entertainmentAllowancePercent / 100.0);

        medicalAllowance = (int) (salary * medicalAllowancePercent / 100.0);

        // Deduct Employees' Provident Fund
        employeesProvidentFund = (int) (salary * employeesProvidentFundPercent / 100.0);

        netSalary = salary + (houseRentAllowance + dearnessAllowance + entertainmentAllowance + medicalAllowance + employeesProvidentFund);


        

        // Deduct Employees' Provident Fund
        netSalary -= (salary * employeesProvidentFundPercent) / 100.0;

        if (netSalary >= 7000000) {
            netSalary -= (netSalary * 10.0) / 100.0;
        } else if (netSalary >= 1000000) {
            netSalary -= (netSalary * 30.0) / 100.0;
        }
        return netSalary;
    }
}
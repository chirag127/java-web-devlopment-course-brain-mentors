import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AgeCalculator {
    public static void main(String[] args) {
        String dobString = args[0];
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dob = null;
        try {
            dob = dateFormat.parse(dobString);
        } catch (ParseException e) {
            System.err.println("Invalid date format. Please enter the date in dd/MM/yyyy format.");
            return;
        }

        Calendar cal = Calendar.getInstance();
        cal.setTime(dob);
        int birthYear = cal.get(Calendar.YEAR);
        int birthMonth = cal.get(Calendar.MONTH) + 1; // Add 1 because Calendar.MONTH is zero-based
        int birthDay = cal.get(Calendar.DAY_OF_MONTH);

        cal.setTime(new Date()); // Set the calendar object to the current date
        int currentYear = cal.get(Calendar.YEAR);
        int currentMonth = cal.get(Calendar.MONTH) + 1;
        int currentDay = cal.get(Calendar.DAY_OF_MONTH);

        int age = currentYear - birthYear;
        if (currentMonth < birthMonth || (currentMonth == birthMonth && currentDay < birthDay)) {
            age--;
        }

        System.out.println("Age is: " + age);
    }
}

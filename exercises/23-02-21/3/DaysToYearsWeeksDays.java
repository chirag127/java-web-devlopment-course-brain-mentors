public class DaysToYearsWeeksDays {
    public static void main(String[] args) {
        int days = Integer.parseInt(args[0]);
        int years = days / 365;
        int weeks = (days % 365) / 7;
        int remainingDays = days - (years * 365) - (weeks * 7);
        System.out.println(days + " days = " + years + " years, " + weeks + " weeks, and " + remainingDays + " days");
    }
}

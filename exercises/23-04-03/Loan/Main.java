
abstract class Loan {
    private double principal;
    private double rate;
    private int time;

    public Loan(double principal, double rate, int time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    public double getPrincipal() {
        return principal;
    }

    public double getRate() {
        return rate;
    }

    public int getTime() {
        return time;
    }

    public abstract double calculateInterest();
}

class HomeLoan extends Loan {
    public HomeLoan(double principal, double rate, int time) {
        super(principal, rate, time);
    }

    @Override
    public double calculateInterest() {
        return getPrincipal() * getRate() * getTime() / 100;
    }
}

class AutoLoan extends Loan {
    public AutoLoan(double principal, double rate, int time) {
        super(principal, rate, time);
    }

    @Override
    public double calculateInterest() {
        return getPrincipal() * getRate() * getTime() * 2 / 100;
    }
}

class PersonalLoan extends Loan {
    public PersonalLoan(double principal, double rate, int time) {
        super(principal, rate, time);
    }

    @Override
    public double calculateInterest() {
        return getPrincipal() * getRate() * getTime() * 3 / 100;
    }
}

class TermLoan extends Loan {
    public TermLoan(double principal, double rate, int time) {
        super(principal, rate, time);
    }

    @Override
    public double calculateInterest() {
        return getPrincipal() * getRate() * getTime() * 4 / 100;
    }
}

public class Main {
    public static void main(String[] args) {
        // Upcasting
        Loan loan1 = new HomeLoan(10000.0, 5.0, 2);
        Loan loan2 = new AutoLoan(15000.0, 6.0, 3);

        System.out.println("Interest on loan1 (Home Loan): " + loan1.calculateInterest());
        System.out.println("Interest on loan2 (Auto Loan): " + loan2.calculateInterest());

        // Downcasting
        Loan loan3 = new PersonalLoan(20000.0, 7.0, 4);
        PersonalLoan pl = (PersonalLoan) loan3;
        System.out.println("Interest on loan3 (Personal Loan): " + loan3.calculateInterest());
        System.out.println("Interest on pl: " + pl.calculateInterest());

        // Incorrect downcasting will result in ClassCastException
        // TermLoan tl = (TermLoan) loan2; // Throws ClassCastException
    }
}

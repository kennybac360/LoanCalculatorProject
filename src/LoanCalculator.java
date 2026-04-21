public class LoanCalculator {
    private double loanAmount;
    private double annualInterestRate;
    private int years;

    public LoanCalculator(double loanAmount, double annualInterestRate, int years) {
        this.loanAmount = loanAmount;
        this.annualInterestRate = annualInterestRate;
        this.years = years;
    }

    public void printLoanSummary() {
        double monthlyRate = PaymentCalculator.calculateMonthlyInterestRate(annualInterestRate);
        int totalMonths = PaymentCalculator.calculateTotalMonths(years);
        double monthlyPayment = PaymentCalculator.calculateMonthlyPayment(loanAmount, annualInterestRate, years);

        System.out.printf("Loan Amount: $%.2f%n", loanAmount);
        System.out.printf("Annual Interest Rate: %.2f%%%n", annualInterestRate);
        System.out.printf("Monthly Interest Rate: %.4f%n", monthlyRate);
        System.out.printf("Years: %d%n", years);
        System.out.printf("Months: %d%n", totalMonths);
        System.out.printf("Monthly Payment: $%.2f%n", monthlyPayment);
    }

    public LoanResult calculateNoExtraPayment() {
        double monthlyPayment = PaymentCalculator.calculateMonthlyPayment(loanAmount, annualInterestRate, years);

        // TODO: Call simulation logic for no extra payment
        return LoanSimulation.simulateLoan(loanAmount, annualInterestRate, monthlyPayment, 0.0, false);
    }

    public LoanResult calculateFirstMonthExtraPayment(double extraPayment) {
        double monthlyPayment = PaymentCalculator.calculateMonthlyPayment(loanAmount, annualInterestRate, years);

        // TODO: Call simulation logic where extra payment applies only in month 1
        return LoanSimulation.simulateLoan(loanAmount, annualInterestRate, monthlyPayment, extraPayment, true);
    }

    public LoanResult calculateMonthlyExtraPayment(double extraPayment) {
        double monthlyPayment = PaymentCalculator.calculateMonthlyPayment(loanAmount, annualInterestRate, years);

        // TODO: Call simulation logic where extra payment applies every month
        return LoanSimulation.simulateLoanEveryMonth(loanAmount, annualInterestRate, monthlyPayment, extraPayment);
    }
}
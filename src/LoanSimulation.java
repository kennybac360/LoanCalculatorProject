public class LoanSimulation {

    public static LoanResult simulateLoan(double loanAmount, double annualInterestRate,
                                          double monthlyPayment, double extraPayment,
                                          boolean firstMonthOnly) {

        double balance = loanAmount;
        double monthlyRate = PaymentCalculator.calculateMonthlyInterestRate(annualInterestRate);
        double totalInterestPaid = 0.0;
        int totalMonths = 0;

        // TODO:
        // 1. Use a while loop to simulate month-by-month repayment
        // 2. Add monthly interest
        // 3. Apply payment
        // 4. Apply extra payment only if firstMonthOnly is true and it is month 1
        // 5. Track total interest paid
        // 6. Track number of months
        // 7. Handle final payment correctly

        double originalInterest = 0.0; // TODO: replace with actual original interest if needed
        double interestSaved = originalInterest - totalInterestPaid;

        return new LoanResult(originalInterest, totalInterestPaid, interestSaved, totalMonths);
    }

    public static LoanResult simulateLoanEveryMonth(double loanAmount, double annualInterestRate,
                                                    double monthlyPayment, double extraPayment) {

        double balance = loanAmount;
        double monthlyRate = PaymentCalculator.calculateMonthlyInterestRate(annualInterestRate);
        double totalInterestPaid = 0.0;
        int totalMonths = 0;

        // TODO:
        // 1. Use a while loop
        // 2. Add interest each month
        // 3. Subtract monthly payment + extra payment
        // 4. Track interest and months
        // 5. Handle final payment correctly

        double originalInterest = 0.0; // TODO: replace with actual original interest if needed
        double interestSaved = originalInterest - totalInterestPaid;

        return new LoanResult(originalInterest, totalInterestPaid, interestSaved, totalMonths);
    }
}
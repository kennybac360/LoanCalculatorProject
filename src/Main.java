public class Main {
    public static void main(String[] args) {
        // Test Case 1
        double loanAmount1 = 20000.0;
        double annualInterestRate1 = 5.0;
        int years1 = 4;
        double extraPayment1 = 1000.0;

        System.out.println("=== Loan 1 ===");
        runLoanScenarios(loanAmount1, annualInterestRate1, years1, extraPayment1);

        System.out.println();

        // Test Case 2
        double loanAmount2 = 300000.0;
        double annualInterestRate2 = 5.0;
        int years2 = 30;
        double extraPayment2 = 1000.0;

        System.out.println("=== Loan 2 ===");
        runLoanScenarios(loanAmount2, annualInterestRate2, years2, extraPayment2);
    }

    public static void runLoanScenarios(double loanAmount, double annualInterestRate, int years, double extraPayment) {
        LoanCalculator calculator = new LoanCalculator(loanAmount, annualInterestRate, years);

        calculator.printLoanSummary();

        System.out.println("\n--- Scenario 1: No Extra Payment ---");
        LoanResult noExtraResult = calculator.calculateNoExtraPayment();

        System.out.println("\n--- Scenario 2: Extra Payment First Month Only ---");
        LoanResult firstMonthExtraResult = calculator.calculateFirstMonthExtraPayment(extraPayment);

        System.out.println("\n--- Scenario 3: Extra Payment Every Month ---");
        LoanResult monthlyExtraResult = calculator.calculateMonthlyExtraPayment(extraPayment);

        printScenarioResult("No Extra Payment", noExtraResult);
        printScenarioResult("First Month Extra Payment", firstMonthExtraResult);
        printScenarioResult("Monthly Extra Payment", monthlyExtraResult);
    }

    public static void printScenarioResult(String scenarioName, LoanResult result) {
        System.out.println("\n" + scenarioName);
        System.out.printf("Original Interest: $%.2f%n", result.getOriginalInterest());
        System.out.printf("Current Interest: $%.2f%n", result.getCurrentInterest());
        System.out.printf("Interest Saved: $%.2f%n", result.getInterestSaved());
        System.out.printf("Total Months: %d%n", result.getTotalMonths());
    }
}
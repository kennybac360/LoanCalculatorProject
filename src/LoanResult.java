public class LoanResult {
    private double originalInterest;
    private double currentInterest;
    private double interestSaved;
    private int totalMonths;

    public LoanResult(double originalInterest, double currentInterest, double interestSaved, int totalMonths) {
        this.originalInterest = originalInterest;
        this.currentInterest = currentInterest;
        this.interestSaved = interestSaved;
        this.totalMonths = totalMonths;
    }

    public double getOriginalInterest() {
        return originalInterest;
    }

    public double getCurrentInterest() {
        return currentInterest;
    }

    public double getInterestSaved() {
        return interestSaved;
    }

    public int getTotalMonths() {
        return totalMonths;
    }
}
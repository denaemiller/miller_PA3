public class SavingsAccount {
    private double savingsBalance;
    private static double annualInterestRate = 0.04;

    public void setSavingsBalance(double newBalance){
        savingsBalance = newBalance;

    }

    public void equalsBalance(double equalBal){
        savingsBalance = equalBal;

    }

    public static void modifyInterestRate (double newInterest) {
        annualInterestRate = newInterest;

    }

    public double printBalance() {
        return savingsBalance;
    }

    public double printInterest() {

        return annualInterestRate;
    }
}

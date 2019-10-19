public class P2 {
    public static double calculateMonthlyInterest(double balance, double rate){
        balance = balance + ((balance * rate) / 12);


        System.out.printf("Months new balance for saver1: %.2f", balance);
        System.out.println();
        System.out.println();

        return balance;

    }

    public static double calculateMonthlyInterest2(double balance, double rate){
        balance = balance + ((balance * rate) / 12);


        System.out.printf("Months new balance for saver2: %.2f", balance);
        System.out.println();
        System.out.println();

        return balance;

    }



//---------------------------------------------------------------------------------------------------------------------






    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();

        //setting the balance for both savers
        saver1.setSavingsBalance(2000.00);
        saver2.setSavingsBalance(3000.00);

        for(int i = 0; i < 12; i++)
        {
            saver1.equalsBalance(calculateMonthlyInterest(saver1.printBalance(), saver1.printInterest()));
            saver2.equalsBalance(calculateMonthlyInterest2(saver2.printBalance(), saver2.printInterest()));
        }

        double saverBalance1 = saver1.printBalance();
        double saverBalance2 = saver2.printBalance();

        System.out.printf("The saver1 balance after 12 months(0.04 Interest Rate)): $%.2f", saverBalance1);
        System.out.println();
        System.out.printf("The saver2 balance after 12 months(0.04 Interest Rate)): $%.2f", saverBalance2);
        System.out.println();
        System.out.println();

        //setting the new interest rate
        saver1.modifyInterestRate(0.05);
        saver2.modifyInterestRate(0.05);

        //next months interest rate at 5%
        saver1.equalsBalance(calculateMonthlyInterest(saver1.printBalance(), saver1.printInterest()));
        saver2.equalsBalance(calculateMonthlyInterest2(saver2.printBalance(), saver2.printInterest()));

        saverBalance1 = saver1.printBalance();
        saverBalance2 = saver2.printBalance();

        //printing the new balance
        System.out.printf("The saver1 balance after one more month(0.05 Interest Rate)): $%.2f", saverBalance1);
        System.out.println();
        System.out.printf("The saver2 balance after one more months(0.05 Interest Rate)): $%.2f", saverBalance2);
        System.out.println();
        System.out.println();

    }
}

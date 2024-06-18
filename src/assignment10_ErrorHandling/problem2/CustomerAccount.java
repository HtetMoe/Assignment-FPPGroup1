package assignment10_ErrorHandling.problem2;

public class CustomerAccount {
    String cus_name;
    String acc_No;
    Double balance;

    public CustomerAccount(String cus_name, String acc_No, Double balance) {
        this.cus_name = cus_name;
        this.acc_No = acc_No;
        this.balance = balance;
    }

    //deposit
    public boolean deposit(double inputAmount) {
        if (inputAmount <= 0)
            return false;

        balance = balance + inputAmount;
        return true;
    }

    //withdraw
    public boolean withdraw(double inputAmount) throws InsufficientFundsException, MinimumBalanceException {
        if (inputAmount <= 0) return false;

        if (inputAmount > balance)
            throw new InsufficientFundsException("Exception! -> your Withdraw amount exceeds the current balance.");

        if (balance - inputAmount < 100)
            throw new MinimumBalanceException("Exception! -> your Balance cannot be below $100 after withdrawal.");

        balance -= inputAmount; // deduct from balance
        return true;
    }

    //current balance
    public double getBalance() {
        return balance;
    }
}

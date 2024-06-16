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
    public boolean deposit(double amount) {
        if (amount <= 0)
            return false;
        balance = balance + amount;
        return true;
    }

    //withdraw
    public boolean withdraw(double amount) throws InsufficientFundsException, MinimumBalanceException {
        if (amount <= 0) return false;

        if (amount > balance)
            throw new InsufficientFundsException("Exception! -> your Withdraw amount exceeds the current balance.");

        if (balance - amount < 100)
            throw new MinimumBalanceException("Exception! -> your Balance cannot be below $100 after withdrawal.");

        balance -= amount; // deduct from balance
        return true;
    }

    //current balance
    public double getBalance() {
        return balance;
    }
}

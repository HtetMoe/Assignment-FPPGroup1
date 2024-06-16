package assignment10_ErrorHandling.problem2;

public class TestCustomerAccount {
    public static void main(String[] args) {
        CustomerAccount account = new CustomerAccount("Moe", "123456789", 500.0);

        //deposit
        if (account.deposit(200.0))
            System.out.println("Deposit successful! -> Current balance: " + account.getBalance());
        else
            System.out.println("Deposit failed.");

        //withdrawal
        try {
            if (account.withdraw(300.0))
                System.out.println("Withdrawal successful. Current balance: " + account.getBalance());
        } catch (InsufficientFundsException | MinimumBalanceException e) {
            System.out.println(e.getMessage());
        }

        //test withdrawal with insufficient funds
        try {
            if (account.withdraw(1000.0))
                System.out.println("Withdrawal successful. Current balance: " + account.getBalance());
        } catch (InsufficientFundsException | MinimumBalanceException e) {
            System.out.println(e.getMessage());
        }

        //test withdrawal with below $100
        try {
            if (account.withdraw(450.0))
                System.out.println("Withdrawal successful. Current balance: " + account.getBalance());
        } catch (InsufficientFundsException | MinimumBalanceException e) {
            System.out.println(e.getMessage());
        }

    }
}

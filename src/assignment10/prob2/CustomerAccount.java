package assignment10.prob2;

public class CustomerAccount {
    private String customerName;
    private double balance;
    private int accountNumber;

    public CustomerAccount(String customerName, double balance, int accountNumber) {
        this.customerName = customerName;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
    public String getCustomerName() {
        return customerName;
    }
    public double getBalance() {
        return balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public boolean deposit(double amount) {
        if (amount < 0)
            return false;
        balance += amount;
        return true;
    }
    public boolean withdraw(double amount) {
        if (amount <= balance){
            balance -= amount;
            return true;
        }
        return false;
    }

}

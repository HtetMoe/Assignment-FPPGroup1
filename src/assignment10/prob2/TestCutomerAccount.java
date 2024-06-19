package assignment10.prob2;

public class TestCutomerAccount {

    public static class DepositFailException extends Exception {
        public DepositFailException() {
            super("Deposit failed");
        }
    }
    private static class WithdrawFailException extends Exception {
        public WithdrawFailException() {
            super("Withdraw failed");
        }
    }

    public static void main(String[] args)  {
        CustomerAccount ca = new CustomerAccount("John", 300.0, 1);
        try{
            if (ca.deposit(100) == false)
                throw new DepositFailException();
            if (ca.withdraw(200.0) == false)
                throw new WithdrawFailException();
        }catch (DepositFailException | WithdrawFailException e){
            System.out.println(e.getMessage());
        }
    }
}

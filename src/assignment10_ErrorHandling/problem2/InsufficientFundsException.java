package assignment10_ErrorHandling.problem2;

// Exception -> when withdraw amount exceeds the balance
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

package assignment10_ErrorHandling.problem2;

//Exception -> when the balance reaches below $100
public class MinimumBalanceException extends Exception{
    public MinimumBalanceException(String message) {
        super(message);
    }
}

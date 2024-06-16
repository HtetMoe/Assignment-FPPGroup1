package assignment10_ErrorHandling.problem3;

public class EmptyQueueException extends Exception{
    public EmptyQueueException(String message) {
        super(message);
    }
}

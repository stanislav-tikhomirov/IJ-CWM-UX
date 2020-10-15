package Assertion;

public class AssertionFailure extends RuntimeException {
    public AssertionFailure() {
    }

    public AssertionFailure(String message) {
        super(message);
    }
}

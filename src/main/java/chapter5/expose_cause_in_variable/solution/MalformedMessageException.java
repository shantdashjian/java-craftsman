package chapter5.expose_cause_in_variable.solution;

public final class MalformedMessageException extends IllegalArgumentException {
    final String raw;

    public MalformedMessageException(String message, String raw) {
        super(String.format("%s in '%s'", message, raw));
        this.raw = raw;
    }

    public MalformedMessageException(String message, String raw, Throwable cause) {
        super(String.format("%s in '%s'", message, raw), cause);
        this.raw = raw;
    }
}

package chapter5.expose_cause_in_variable.solution;

public class TransmissionParser {
    static Transmission parse(String rawMessage) {
        if (rawMessage != null
                && rawMessage.length() != Transmission.MESSAGE_LENGTH) {
            throw new MalformedMessageException(
                    String.format("Expected %d, but got %d characters'",
                            Transmission.MESSAGE_LENGTH, rawMessage.length()),
                    rawMessage
            );
        }

        String rawId = rawMessage.substring(0, Transmission.ID_LENGTH);
        String rawContent = rawMessage.substring(Transmission.ID_LENGTH);
        try {
            int id = Integer.parseInt(rawId);
            String content = rawContent.trim();
            return new Transmission(id, content);
        } catch (NumberFormatException e) {
            throw new MalformedMessageException(
                    String.format("Expected number, but got '%s'", rawId),
                    rawMessage, e
            );
        }
    }
}

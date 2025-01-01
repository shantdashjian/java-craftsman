package chapter5.explain_cause_in_message.solution;

public class TransmissionParser {
    static Transmission parse(String rawMessage) {
        if (rawMessage != null
                && rawMessage.length() != Transmission.MESSAGE_LENGTH) {
            throw new IllegalArgumentException(
                    String.format("Expected %d, but got %d characters in '%s'",
                            Transmission.MESSAGE_LENGTH, rawMessage.length(),
                            rawMessage)
            );
        }

        String rawId = rawMessage.substring(0, Transmission.ID_LENGTH);
        String rawContent = rawMessage.substring(Transmission.ID_LENGTH);
        try {
            int id = Integer.parseInt(rawId);
            String content = rawContent.trim();
            return new Transmission(id, content);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(
                    String.format("Expected number, but got '%s' in '%s'",
                            rawId, rawMessage)
            );
        }
    }
}

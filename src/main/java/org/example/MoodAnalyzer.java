package org.example;



public class MoodAnalyzer {
    private String message;

    public MoodAnalyzer() {
    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyzeMood() throws CustomMoodException {
        // UC2: handle null or empty message
        validateMessage();

        return this.message.contains("Sad") ? "SAD" : "HAPPY";
    }

    private void validateMessage() throws CustomMoodException {
        if (this.message == null) {
            throw new CustomMoodException(MoodErrorType.NULL, "Invalid input: message is null");
        } else if (this.message.isEmpty()) {
            throw new CustomMoodException(MoodErrorType.EMPTY, "Invalid input: message is empty");
        }
    }
}

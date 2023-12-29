package org.example;

public class CustomMoodException extends Exception {
    // UC3: different exception types
    private MoodErrorType type;

    public CustomMoodException(MoodErrorType type, String message) {
        super(message);
        this.type = type;
    }

    public MoodErrorType getType() {
        return this.type;
    }
}
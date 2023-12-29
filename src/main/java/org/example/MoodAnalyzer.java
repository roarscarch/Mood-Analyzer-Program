package org.example;

public class MoodAnalyzer {
    private String message;

    public MoodAnalyzer() {
    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyzeMood() {
        try {

            if (this.message == null || this.message.isEmpty()) {
                throw new NullPointerException("Invalid Mood: Message is null or empty");
            }

            return this.message.contains("Sad") ? "SAD" : "HAPPY";
        } catch (NullPointerException exception) {
            return "HAPPY";
        }
    }
}

package org.example;

public class Main {
    public static void main(String[] args) throws CustomMoodException {
        System.out.println("Welcome to mood analyzer.");

        // Creating mood analyzer objects
        MoodAnalyzer analyzer1 = new MoodAnalyzer("I am in Sad Mood");
        MoodAnalyzer analyzer2 = new MoodAnalyzer("I am in Any Mood");
        MoodAnalyzer analyzer3 = new MoodAnalyzer(null);
        MoodAnalyzer analyzer4 = new MoodAnalyzer("");

        // checking moods
        try {
            System.out.println("Mood is " + analyzer1.analyzeMood());
        } catch (CustomMoodException exception) {
            System.out.println(exception.getMessage());
        }

        try {
            System.out.println("Mood is " + analyzer2.analyzeMood());
        } catch (CustomMoodException exception) {
            System.out.println(exception.getMessage());
        }

        try {
            System.out.println("Mood is " + analyzer3.analyzeMood());
        } catch (CustomMoodException exception) {
            System.out.println(exception.getMessage());
        }

        try {
            System.out.println("Mood is " + analyzer4.analyzeMood());
        } catch (CustomMoodException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
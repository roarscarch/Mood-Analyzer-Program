package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to mood analyzer.");

        // Creating mood analyzer objects
        MoodAnalyzer analyzer1 = new MoodAnalyzer("I am in Sad Mood");
        MoodAnalyzer analyzer2 = new MoodAnalyzer("I am in Any Mood");
        MoodAnalyzer analyzer3 = new MoodAnalyzer("Feeling positive and energetic!");
        MoodAnalyzer analyzer4 = new MoodAnalyzer("I can't decide how I feel right now.");
        MoodAnalyzer analyzer5 = new MoodAnalyzer("Feeling relaxed and content.");

        // checking moods
        System.out.println("Mood is " + analyzer1.analyzeMood());
        System.out.println("Mood is " + analyzer2.analyzeMood());
        System.out.println("Mood is " + analyzer3.analyzeMood());
        System.out.println("Mood is " + analyzer4.analyzeMood());
        System.out.println("Mood is " + analyzer5.analyzeMood());
    }
}

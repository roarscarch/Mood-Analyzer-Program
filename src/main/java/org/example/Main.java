package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to mood analyzer.");

        
        MoodAnalyzer analyzer1 = new MoodAnalyzer("I am in a Happy Mood");

        try {
            System.out.println("Mood is " + analyzer1.analyzeMood());
        } catch (CustomMoodException exception) {
            System.out.println(exception.getMessage());
        }

     
        MoodAnalyzer analyzer2 = new MoodAnalyzer("I am feeling okay");

        try {
            System.out.println("Mood is " + analyzer2.analyzeMood());
        } catch (CustomMoodException exception) {
            System.out.println(exception.getMessage());
        }

       
        MoodAnalyzer analyzer3 = new MoodAnalyzer("Feeling SAD today");

        try {
            System.out.println("Mood is " + analyzer3.analyzeMood());
        } catch (CustomMoodException exception) {
            System.out.println(exception.getMessage());
        }

       
        MoodAnalyzer analyzer4 = new MoodAnalyzer(null);

        try {
            System.out.println("Mood is " + analyzer4.analyzeMood());
        } catch (CustomMoodException exception) {
            System.out.println(exception.getMessage());
        }

       
        MoodAnalyzer analyzer5 = new MoodAnalyzer("");

        try {
            System.out.println("Mood is " + analyzer5.analyzeMood());
        } catch (CustomMoodException exception) {
            System.out.println(exception.getMessage());
        }
    }
}

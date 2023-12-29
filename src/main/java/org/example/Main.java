package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to mood analyzer.");

        MoodAnalyzer analyzer = new MoodAnalyzer();

        System.out.println("Mood is " + analyzer.analyzeMood("I am feeling happy today!"));


        System.out.println("Mood is " + analyzer.analyzeMood("Life is tough, feeling down."));


        System.out.println("Mood is " + analyzer.analyzeMood("Just another day, nothing special."));


        System.out.println("Mood is " + analyzer.analyzeMood(""));


        System.out.println("Mood is " + analyzer.analyzeMood("Excited and nervous about the upcoming event Sad."));


        System.out.println("Mood is " + analyzer.analyzeMood("I AM CONFUSED."));


        System.out.println("Mood is " + analyzer.analyzeMood("   Indifferent   "));
    }
}

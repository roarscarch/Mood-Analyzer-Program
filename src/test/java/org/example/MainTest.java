package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import org.example.MoodAnalyzer;

public class MainTest {

    @Test
    public void testSadMood() {
        MoodAnalyzer analyzer = new MoodAnalyzer("I am in a Sad Mood");
        assertEquals("SAD", analyzer.analyzeMood());
    }


    @Test
    public void testHappyMood() {
        MoodAnalyzer analyzer = new MoodAnalyzer("I am in Any Mood");
        assertEquals("HAPPY", analyzer.analyzeMood());
    }


    @Test
    public void testNullMoodMessage() {
        MoodAnalyzer analyzer = new MoodAnalyzer(null);
        assertEquals("HAPPY", analyzer.analyzeMood());
    }
}
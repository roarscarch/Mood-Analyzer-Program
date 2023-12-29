package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;



public class MainTest {
    @Test
    public void testSadMood() {
        MoodAnalyzer analyzer = new MoodAnalyzer();
        assertEquals("SAD", analyzer.analyzeMood("I am Sad Mood"));
    }


    @Test
    public void testHappyMood() {
        MoodAnalyzer analyzer = new MoodAnalyzer();
        assertEquals("HAPPY", analyzer.analyzeMood("I am  Mood"));
    }
}
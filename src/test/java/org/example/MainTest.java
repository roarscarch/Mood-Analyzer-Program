package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testSadMood() throws CustomMoodException {
        MoodAnalyzer analyzer = new MoodAnalyzer("I am in a Sad Mood");
        assertEquals("SAD", analyzer.analyzeMood());
    }


    @Test
    public void testHappyMood() throws CustomMoodException {
        MoodAnalyzer analyzer = new MoodAnalyzer("I am in Any Mood");
        assertEquals("HAPPY", analyzer.analyzeMood());
    }


    @Test
    public void testNullMoodMessage() {
        MoodAnalyzer analyzer = new MoodAnalyzer(null);
        try {
            analyzer.analyzeMood();
            fail("Expected MoodAnalysisException of NULL type");
        } catch (CustomMoodException exception) {
            assertEquals(MoodErrorType.NULL, exception.getType());
        }
    }

    // TC 3.2: testing for empty mood message
    @Test
    public void testEmptyMoodMessage() {
        MoodAnalyzer analyzer = new MoodAnalyzer("");
        try {
            analyzer.analyzeMood();
            fail("Expected MoodAnalysisException of EMPTY type");
        } catch (CustomMoodException exception) {
            assertEquals(MoodErrorType.EMPTY, exception.getType());
        }
    }
}
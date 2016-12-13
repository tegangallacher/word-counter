package com.example.user.word_count_lab;
import org.junit.*;
import static org.junit.Assert.*;
/**
 * Created by user on 13/12/2016.
 */
public class WordCountTest {
    WordCount words;

    @Before
    public void before() {
        words = new WordCount();
    }

    @Test
    public void addStringToArray() {
        words.add("Help me I do not understand");
        assertNotNull(words.getWords());;
    }

    @Test
    public void testWordCanBeSplit() {
        words.addSentenceToBeSplit("Help me I do not understand");
        assertEquals(6, words.getWordCount());
    }


}

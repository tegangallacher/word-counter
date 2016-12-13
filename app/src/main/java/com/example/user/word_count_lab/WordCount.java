package com.example.user.word_count_lab;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by user on 13/12/2016.
 */
public class WordCount {

    private ArrayList<String> words;

    public WordCount() {
        this.words = new ArrayList<String>();
    }

    public WordCount(ArrayList<String> words) {
        this.words = new ArrayList<String>(words);
    }

    public int getWordCount() {
        return words.size();
    }

    public ArrayList<String> getWords() {
        return new ArrayList<String>(this.words);
    }

    public void add(String userInput) {
        words.add(userInput);
    }

    public void addSentenceToBeSplit(String userInput) {
        String[] array = userInput.split(" ");
        for (String word : array) {
            words.add(word);
        }
    }




}


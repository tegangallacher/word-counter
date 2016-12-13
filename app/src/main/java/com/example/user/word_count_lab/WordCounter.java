package com.example.user.word_count_lab;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by user on 13/12/2016.
 */
public class WordCounter extends AppCompatActivity {
    EditText sentenceEditText;
    Button countButton;
    TextView countedWords;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sentenceEditText = (EditText)findViewById(R.id.sentence_text);
        countButton = (Button)findViewById(R.id.count_button);
        countedWords = (TextView) findViewById(R.id.number_of_words_text);

        countButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String sentence = sentenceEditText.getText().toString();
                WordCount words = new WordCount();
                words.addSentenceToBeSplit(sentence);
                words.getWordCount();
                String newWords = Integer.toString(words.getWordCount());
                countedWords.setText(newWords);
            }

        });
    }

}

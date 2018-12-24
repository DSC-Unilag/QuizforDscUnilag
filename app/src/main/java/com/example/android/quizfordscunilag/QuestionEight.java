package com.example.android.quizfordscunilag;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public class QuestionEight extends AppCompatActivity {
    ToggleButton tog_eight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_eight);
        getSupportActionBar().setTitle("Question 8");
        tog_eight = findViewById(R.id.tog_eight);
    }

    public void next(View v) {
        if (tog_eight.isChecked()) {
            TextView text = findViewById(R.id.msg_eight);
            text.setText(R.string.correct);
            text.setVisibility(View.VISIBLE);
            Score.setScore(8, true);
        } else {
            TextView text = findViewById(R.id.msg_eight);
            text.setText(R.string.wrong);
            text.setVisibility(View.VISIBLE);
            Score.setScore(8, false);
        }
        Intent i = new Intent(this, QuestionNine.class);
        int score = Score.getmScore(8);
        startActivity(i);
    }

    public void previous(View v) {
        Intent i = new Intent(this, QuestionSeven.class);
        startActivity(i);
        finish();
    }
}

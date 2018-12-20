package com.example.android.quizfordscunilag;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class QuestionFive extends AppCompatActivity {
    int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_five);
    }

    public void next(View v) {
        RadioButton ansFive = findViewById(R.id.ans5);
        if (ansFive.isChecked()) {
            TextView text = findViewById(R.id.msg_five);
            text.setText(R.string.correct);
            text.setVisibility(View.VISIBLE);
            Score.setScore(5, true);
        } else {
            TextView text = findViewById(R.id.msg_five);
            text.setText(R.string.wrong);
            text.setVisibility(View.VISIBLE);
            Score.setScore(5, false);
        }
        Intent i = new Intent(this, QuestionSix.class);
        int score = Score.getmScore(5);
        String scoreString = " " + score;
        Toast.makeText(QuestionFive.this, scoreString, Toast.LENGTH_LONG).show();
        startActivity(i);
    }

    public void previous(View v) {
        Intent i = new Intent(this, QuestionFour.class);
        startActivity(i);
        finish();
    }
}

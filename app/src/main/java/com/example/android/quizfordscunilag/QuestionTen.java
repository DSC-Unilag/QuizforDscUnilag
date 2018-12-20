package com.example.android.quizfordscunilag;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class QuestionTen extends AppCompatActivity {
    RadioButton ans_ten;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_ten);
        ans_ten = findViewById(R.id.ans_ten);
    }

    public void submit(View v) {
        if (ans_ten.isChecked()) {
            TextView text = findViewById(R.id.msg_ten);
            text.setText(R.string.correct);
            text.setVisibility(View.VISIBLE);
            Score.setScore(10, true);
        } else {
            TextView text = findViewById(R.id.msg_ten);
            text.setText(R.string.wrong);
            text.setVisibility(View.VISIBLE);
            Score.setScore(10, false);
        }
        int score = Score.getmScore(10);
        String scoreString = " " + score;
        Toast.makeText(QuestionTen.this, scoreString, Toast.LENGTH_LONG).show();
    }

    public void reset(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        finish();
    }

    public void previous(View v) {
        Intent i = new Intent(this, QuestionNine.class);
        startActivity(i);
        finish();
    }
}

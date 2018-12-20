package com.example.android.quizfordscunilag;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class QuestionSix extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_six);
    }

    public void next(View v) {
        ToggleButton tog_six = findViewById(R.id.tog_six);
        if (tog_six.isChecked()) {
            TextView text = findViewById(R.id.msg_six);
            text.setText(R.string.correct);
            text.setVisibility(View.VISIBLE);
            Score.setScore(6, true);
        } else {
            TextView text = findViewById(R.id.msg_six);
            text.setText(R.string.wrong);
            text.setVisibility(View.VISIBLE);
            Score.setScore(6, false);
        }
        Intent i = new Intent(this, QuestionSeven.class);
        int score = Score.getmScore(6);
        String scoreString = " " + score;
        Toast.makeText(QuestionSix.this, scoreString, Toast.LENGTH_LONG).show();
        startActivity(i);
    }

    public void previous(View v) {
        Intent i = new Intent(this, QuestionFive.class);
        startActivity(i);
        finish();
    }
}

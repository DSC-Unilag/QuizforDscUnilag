package com.example.android.quizfordscunilag;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class QuestionSeven extends AppCompatActivity {
    private boolean flag = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_seven);
        getSupportActionBar().setTitle("Question 7");
        Spinner seven = findViewById(R.id.seven);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.seven, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        seven.setAdapter(adapter);
        seven.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                flag = position == 2;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void next(View v) {
        if (flag) {
            TextView text = findViewById(R.id.msg_seven);
            text.setText(R.string.correct);
            text.setVisibility(View.VISIBLE);
            Score.setScore(7, true);
        } else {
            TextView text = findViewById(R.id.msg_seven);
            text.setText(R.string.wrong);
            text.setVisibility(View.VISIBLE);
            Score.setScore(7, false);
        }
        Intent i = new Intent(this, QuestionEight.class);
        int score = Score.getmScore(7);
        startActivity(i);
    }

    public void previous(View v) {
        Intent i = new Intent(this, QuestionSix.class);
        startActivity(i);
        finish();
    }
}

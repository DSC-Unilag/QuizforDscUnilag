package com.example.android.quizfordscunilag;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextInputLayout editLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editLayout = findViewById(R.id.edit_layout);
    }

    public void startQuiz(View v) {
        if (validate()) {
            Toast.makeText(MainActivity.this, "Login Succesful", Toast.LENGTH_SHORT);
            Intent i = new Intent(MainActivity.this, QuestionOne.class);
            startActivity(i);
        }
    }

    public void tellStory(View v) {
        String url = "http://www.google.com";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public boolean validate() {
        String username = editLayout.getEditText().getText().toString().trim();
        if (username.isEmpty()) {
            editLayout.setError("Field cannot be empty");
            return false;
        } else if (username.length() > 7) {
            editLayout.setError("Length of character cannot exceed 7");
            return false;
        } else {
            editLayout.setError(null);
            editLayout.setErrorEnabled(false);
        }

        return true;
    }
}

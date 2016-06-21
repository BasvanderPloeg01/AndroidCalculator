package com.example.dennis.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button) findViewById(R.id.button11);
        e = (EditText) findViewById(R.id.editText);
    }

    public void addNumber(View v) {
        e.setText("Added number!");
    }

    public void clearEntry(View v) {
        e.setText("");
    }
}
